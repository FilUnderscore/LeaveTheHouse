package gameplay;

import gamemap_grammar.GameMapBaseVisitor;
import gamemap_grammar.GameMapParser;

import java.util.ArrayList;
import java.util.List;

public class WorldVisitor extends GameMapBaseVisitor<Entity> {
    private World world;

    public WorldVisitor()
    {
        this.world = new World();
    }

    @Override
    public Entity visitRoom(GameMapParser.RoomContext ctx) {
        String levelName = ctx.WORD().getText();

        List<GameMapParser.RoomContext> connectingRoomsCtx = ctx.room();
        List<GameMapParser.MonsterContext> monstersCtx = ctx.monster();
        List<GameMapParser.ItemContext> itemsCtx = ctx.item();
        List<GameMapParser.TcContext> tcCtx = ctx.tc();
        List<GameMapParser.WcContext> wcCtx = ctx.wc();

        List<Room> connectingRooms = new ArrayList<>();

        for(GameMapParser.RoomContext connectingRoom : connectingRoomsCtx) {
            Room room = (Room) this.visit(connectingRoom);
            connectingRooms.add(room);
        }

        return new Room(levelName, connectingRooms.toArray(Room[]::new));
    }

    @Override
    public Entity visitGamemap(GameMapParser.GamemapContext ctx) {
        List<GameMapParser.RoomContext> roomsCtx = ctx.room();

        for(GameMapParser.RoomContext roomCtx : roomsCtx) {
            Room room = (Room) this.visit(roomCtx);
            this.world.rooms.add(room);
        }

        return null;
    }

    @Override
    public Entity visitItem(GameMapParser.ItemContext ctx) {
        return super.visitItem(ctx);
    }

    @Override
    public Entity visitMonster(GameMapParser.MonsterContext ctx) {
        return super.visitMonster(ctx);
    }

    @Override
    public Entity visitTc(GameMapParser.TcContext ctx) {
        return super.visitTc(ctx);
    }

    @Override
    public Entity visitWc(GameMapParser.WcContext ctx) {
        return super.visitWc(ctx);
    }

    public World getWorld() {
        return world;
    }
}
