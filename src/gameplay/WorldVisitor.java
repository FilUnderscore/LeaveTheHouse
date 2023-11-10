package gameplay;

import consumable.RepairKit;
import consumable.food.Bread;
import consumable.food.Mead;
import consumable.food.RoastBoar;
import consumable.valuable.*;
import gamemap_grammar.GameMapBaseVisitor;
import gamemap_grammar.GameMapParser;
import monsters.*;
import openable.Openable;
import openable.TreasureChest;
import openable.WarChest;
import opener.Key;
import opener.LockPick;
import wieldables.Axe;
import wieldables.Katana;
import wieldables.Stick;
import wieldables.Sword;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class defining Game Map interpretation logic.
 * @author Filip Jerkovic 20122575
 */
public class WorldVisitor extends GameMapBaseVisitor<WorldVisitor.Visit> {
    public interface Visit {

    }

    private static final class DoorVisit implements Visit
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
        put("katana", Katana.class);
        put("stick", Stick.class);

        // Food
        put("mead", Mead.class);
        put("roastboar", RoastBoar.class);
        put("bread", Bread.class);

        // Valuables
        put("honeybag", HoneyBag.class);
        put("ring", Ring.class);
        put("chalice", Chalice.class);
        put("coin", Coin.class);
        put("goldbars", GoldBars.class);
        put("jewel", Jewel.class);
        put("mobile", Mobile.class);

        // Openers
        put("key", Key.class);
        put("lockpick", LockPick.class);

        put("repairkit", RepairKit.class);
    }};

    private static Map<String, Class<? extends Monster>> MONSTER_MAP = new HashMap<>() {{
       put("zombie", Zombie.class);
       put("ogre", Ogre.class);
       put("dragon", Dragon.class);
       put("dingo", Dingo.class);
       put("ghost", Ghost.class);
    }};

    private static final class ItemVisit implements Visit {
        private final String itemName;

        public ItemVisit(String itemName) {
            this.itemName = itemName;
        }
    }

    private static final class ChestVisit implements Visit {
        public enum ChestType {
            WarChest,
            TreasureChest;
        }

        private final ChestType type;
        private final boolean locked;
        private List<ItemVisit> items = new ArrayList<>();

        public ChestVisit(ChestType type, boolean locked) {
            this.type = type;
            this.locked = locked;
        }
    }

    private static final class MonsterVisit implements Visit {
        private final String monsterName;
        private final int hp, dmg, probability;

        public MonsterVisit(String monsterName, int hp, int dmg, int probability) {
            this.monsterName = monsterName;
            this.hp = hp;
            this.dmg = dmg;
            this.probability = probability;
        }
    }

    private final class RoomVisit implements Visit {
        private final String roomName;
        private final List<DoorVisit> doors = new ArrayList<>();
        private final List<ItemVisit> items = new ArrayList<>();
        private final List<MonsterVisit> monsters = new ArrayList<>();
        private final List<ChestVisit> chests = new ArrayList<>();

        private boolean isFinal = false;

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
        List<GameMapParser.TcContext> tcsCtx = ctx.tc();
        List<GameMapParser.WcContext> wcsCtx = ctx.wc();

        for(GameMapParser.DoorContext connectingRoom : connectingRoomsCtx) {
            DoorVisit door = (DoorVisit) this.visit(connectingRoom);
            roomVisit.doors.add(door);
        }

        for(GameMapParser.ItemContext itemCtx : itemsCtx) {
            ItemVisit item = (ItemVisit) this.visit(itemCtx);
            roomVisit.items.add(item);
        }

        for(GameMapParser.MonsterContext monsterCtx : monstersCtx) {
            MonsterVisit monster = (MonsterVisit) this.visit(monsterCtx);
            roomVisit.monsters.add(monster);
        }

        for(GameMapParser.TcContext tcCtx : tcsCtx) {
            ChestVisit chest = (ChestVisit) this.visit(tcCtx);
            roomVisit.chests.add(chest);
        }

        for(GameMapParser.WcContext wcCtx : wcsCtx) {
            ChestVisit chest = (ChestVisit) this.visit(wcCtx);
            roomVisit.chests.add(chest);
        }

        roomVisit.isFinal = ctx.final_() != null && !ctx.final_().isEmpty();

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

            Monster[] monsters = new Monster[roomVisit.monsters.size()];

            int i = 0;
            for(MonsterVisit visit : roomVisit.monsters) {
                try {
                    monsters[i++] = MONSTER_MAP.get(visit.monsterName).getConstructor(int.class, int.class, int.class).newInstance(visit.hp, visit.dmg, visit.probability);
                } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                         InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }

            room.setMonsters(monsters);

            for(ChestVisit visit : roomVisit.chests) {
                Openable openable = null;

                switch(visit.type) {
                    case WarChest:
                        openable = new WarChest(visit.locked);
                        break;
                    case TreasureChest:
                        openable = new TreasureChest(visit.locked);
                        break;
                    default:
                        continue;
                }

                for(ItemVisit item : visit.items) {
                    try {
                        openable.getContents().add(ITEM_MAP.get(item.itemName).getConstructor().newInstance());
                    } catch (InstantiationException | IllegalAccessException | NoSuchMethodException |
                             InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }

                room.getPickupsInRoom().add(openable);
            }

            room.setFinalRoom(roomVisit.isFinal);
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
        String monsterName = ctx.WORD().getText();
        int hp = Integer.parseInt(ctx.hp(0).INT().getText());
        int dmg = Integer.parseInt(ctx.dmg(0).INT().getText());
        int prob = Integer.parseInt(ctx.prob(0).INT().getText());

        return new MonsterVisit(monsterName, hp, dmg, prob);
    }

    @Override
    public Visit visitTc(GameMapParser.TcContext ctx) {
        boolean locked = ctx.locked() != null && !ctx.locked().isEmpty();
        ChestVisit chest = new ChestVisit(ChestVisit.ChestType.TreasureChest, locked);

        for(GameMapParser.ItemContext itemCtx : ctx.item()) {
            ItemVisit item = (ItemVisit) this.visit(itemCtx);
            chest.items.add(item);
        }

        return chest;
    }

    @Override
    public Visit visitWc(GameMapParser.WcContext ctx) {
        boolean locked = ctx.locked() != null && !ctx.locked().isEmpty();
        ChestVisit chest = new ChestVisit(ChestVisit.ChestType.WarChest, locked);

        for(GameMapParser.ItemContext itemCtx : ctx.item()) {
            ItemVisit item = (ItemVisit) this.visit(itemCtx);
            chest.items.add(item);
        }

        return chest;
    }
}
