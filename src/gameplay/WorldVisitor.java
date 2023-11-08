package gameplay;

import consumable.food.Bread;
import consumable.food.Mead;
import consumable.food.RoastBoar;
import gamemap_grammar.GameMapBaseVisitor;
import gamemap_grammar.GameMapParser;
import wieldables.Axe;
import wieldables.Sword;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WorldVisitor extends GameMapBaseVisitor<WorldVisitor.Visit> {
    public interface Visit {

    }

    private final class DoorVisit implements Visit
    {
        private final String targetRoom;

        public DoorVisit(String targetRoom) {
            this.targetRoom = targetRoom;
        }
    }

    private static Map<String, Class<? extends Pickup>> ITEM_MAP = new HashMap<>() {{
        // Wieldables
        put("axe", Axe.class);
        put("sword", Sword.class);

        // Food
        put("mead", Mead.class);
        put("roastboar", RoastBoar.class);
        put("bread", Bread.class);
    }};

    private final class ItemVisit implements Visit {
        private final String itemName;

        public ItemVisit(String itemName) {
            this.itemName = itemName;
        }
    }

    private final class RoomVisit implements Visit {
        private final String roomName;
        private final List<DoorVisit> doors = new ArrayList<>();
        private final List<ItemVisit> items = new ArrayList<>();

        public RoomVisit(String roomName) {
            this.roomName = roomName;
        }
    }

    public WorldVisitor()
    {

    }

    @Override
    public Visit visitDoor(GameMapParser.DoorContext ctx) {
        String targetRoom = ctx.WORD().getText();
        return new DoorVisit(targetRoom);
    }

    @Override
    public Visit visitRoom(GameMapParser.RoomContext ctx) {
        String roomName = ctx.WORD().getText();
        RoomVisit roomVisit = new RoomVisit(roomName);

        List<GameMapParser.DoorContext> connectingRoomsCtx = ctx.door();
        List<GameMapParser.MonsterContext> monstersCtx = ctx.monster();
        List<GameMapParser.ItemContext> itemsCtx = ctx.item();
        List<GameMapParser.TcContext> tcCtx = ctx.tc();
        List<GameMapParser.WcContext> wcCtx = ctx.wc();

        for(GameMapParser.DoorContext connectingRoom : connectingRoomsCtx) {
            DoorVisit door = (DoorVisit) this.visit(connectingRoom);
            roomVisit.doors.add(door);
        }

        for(GameMapParser.ItemContext itemCtx : itemsCtx) {
            ItemVisit item = (ItemVisit) this.visit(itemCtx);
            roomVisit.items.add(item);
        }

        return roomVisit;
    }

    @Override
    public Visit visitGamemap(GameMapParser.GamemapContext ctx) {
        List<GameMapParser.RoomContext> roomsCtx = ctx.room();
        List<RoomVisit> rooms = new ArrayList<>();

        // Register rooms

        for(GameMapParser.RoomContext roomCtx : roomsCtx) {
            RoomVisit room = (RoomVisit) this.visit(roomCtx);
            rooms.add(room);
        }

        World world = new World();
        Map<String, Room> roomMap = new HashMap<>();

        // Map rooms

        for(RoomVisit roomVisit : rooms) {
            Room room = new Room(roomVisit.roomName, new Inventory(), new Room[0]);

            world.rooms.add(room);
            roomMap.put(roomVisit.roomName, room);

            for(ItemVisit visit : roomVisit.items) {
                try {
                    room.getPickupsInRoom().add(ITEM_MAP.get(visit.itemName).getConstructor().newInstance());
                } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                         InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // Resolve rooms

        for(int i = 0; i < rooms.size(); i++) {
            RoomVisit roomVisit = rooms.get(i);
            Room room = world.rooms.get(i);
            List<Room> connectingRooms = new ArrayList<>();

            for(DoorVisit door : roomVisit.doors) {
                connectingRooms.add(roomMap.get(door.targetRoom));
            }

            room.setConnectingRooms(connectingRooms.toArray(Room[]::new));
        }

        return world;
    }

    @Override
    public Visit visitItem(GameMapParser.ItemContext ctx) {
        String itemName = ctx.WORD().getText();
        return new ItemVisit(itemName);
    }

    @Override
    public Visit visitMonster(GameMapParser.MonsterContext ctx) {
        return super.visitMonster(ctx);
    }

    @Override
    public Visit visitTc(GameMapParser.TcContext ctx) {
        return super.visitTc(ctx);
    }

    @Override
    public Visit visitWc(GameMapParser.WcContext ctx) {
        return super.visitWc(ctx);
    }
}
