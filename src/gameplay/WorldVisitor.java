package gameplay;

import gamemap_grammar.GameMapBaseVisitor;
import gamemap_grammar.GameMapParser;

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

    private final class ItemVisit implements Visit {
        private final String name;
        private final int dmgLo, dmgHi;

        public ItemVisit(String name, int dmgLo, int dmgHi) {
            this.name = name;
            this.dmgLo = dmgLo;
            this.dmgHi = dmgHi;
        }
    }

    private final class RoomVisit implements Visit {
        private final String roomName;
        private final List<DoorVisit> doors = new ArrayList<>();
        private final List<ItemVisit> items = new ArrayList<>();

        public RoomVisit(String roomName) {
            this.roomName = roomName;
        }

        public void addDoor(DoorVisit door) {
            this.doors.add(door);
        }

        public void addItem(ItemVisit item) { this.items.add(item); }
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
            roomVisit.addDoor(door);
        }

        for(GameMapParser.ItemContext itemCtx : itemsCtx) {
            ItemVisit item = (ItemVisit) this.visit(itemCtx);
            roomVisit.addItem(item);
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
                room.getPickupsInRoom().add(new Wieldable(visit.name, visit.dmgLo, visit.dmgHi));
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
        GameMapParser.Dmg_hiloContext itemDmgHiLo = ctx.dmg_hilo(0);

        int itemDmgLo = Integer.parseInt(itemDmgHiLo.INT(0).getText());
        int itemDmgHi = Integer.parseInt(itemDmgHiLo.INT(1).getText());

        return new ItemVisit(itemName, itemDmgLo, itemDmgHi);
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
