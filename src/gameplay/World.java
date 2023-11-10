
package gameplay;

import gamemap_grammar.GameMapBaseVisitor;
import monsters.Monster;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import playercommand_grammar.PlayerCommandBaseVisitor;
import playercommand_grammar.PlayerCommandLexer;
import playercommand_grammar.PlayerCommandParser;
import util.StringUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Class defining World logic (mode, current room, player, etc.).
 * @author Filip Jerkovic 20122575
 */
public class World implements WorldVisitor.Visit {
    Player player = null;
    PlayMode mode = PlayMode.EXPLORE;

    Room currentRoom = null;

    List<Room> rooms = new ArrayList<>();
    boolean exit = false;

    public void play(Player player)
    {
        this.player = player;
        out("Welcome player %s", player.getDescription());

        this.setCurrentRoom(this.rooms.get(0));

        Scanner scanner = new Scanner(System.in);

        boolean gameInProgress = true;
        while (gameInProgress) {
            String input = scanner.nextLine();
            PlayerCommandLexer lexer = new PlayerCommandLexer(CharStreams.fromString(input));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            PlayerCommandParser parser = new PlayerCommandParser(tokens);
            ParseTree tree = parser.command();
            PlayerCommandVisitor visitor = new PlayerCommandVisitor();
            PlayerCommand command = visitor.visit(tree);

            if(command != null) {
                if(command.getPlayMode() != this.mode && command.getPlayMode() != PlayMode.BOTH) {
                    out("Cannot perform command '%s' in %s mode.", input, this.mode.name());
                } else {
                    PlayerCommand.CommandResult result = command.execute(player, this);
                    out(result.message);

                    if(result.success && result.action != null) {
                        result.action.execute();
                    }
                }
            } else {
                out("Unknown command '%s', type 'help' for the list of commands available.", input);
            }

            if(player.getHp() <= 0) {
                out("Game over, you died.");
                gameInProgress = false;
            } else if (currentRoom != null && currentRoom.isFinalRoom() && exit) {
                out("You won, congratulations!");
                gameInProgress = false;
            }
        }

        scanner.close();
    }

    public void out(String format, Object...args) {
        System.out.printf((format) + "%n", args);
    }

    public PlayMode getMode() {
        return this.mode;
    }

    public Room getCurrentRoom() {
        return this.currentRoom;
    }

    public void setCurrentRoom(Room room) {
        this.currentRoom = room;
        this.onEnterRoom();
    }

    public void exit() {
        this.exit = true;
    }

    private void onEnterRoom() {
        out("You entered the room %s.", this.currentRoom.getDescription());
        out("""
            The room has %d item(s) scattered across the room:
            %s
            The room has %d door(s), each distinctly labelled:
            %s
            """,
            this.currentRoom.getPickupsInRoom().getItems().length,
            StringUtil.list((i) -> "- " + i.getDescription() + " (" + i.toString() + ")", this.currentRoom.getPickupsInRoom().getItems()),
            this.currentRoom.getConnectingRooms().length,
            StringUtil.list((r) -> "- " + r.getDescription(), this.currentRoom.getConnectingRooms()));

        if(this.currentRoom.getMonsters() != null && this.currentRoom.getMonsters().length > 0) {
            boolean appear = false;

            for(Monster monster : this.currentRoom.getMonsters()) {
                if(monster.appear()) {
                    appear = true;
                    out("A %s ambushed you, blocking your path. You have no choice but to stand your ground.", monster.getDescription());
                }
            }

            if(appear)
                this.mode = PlayMode.BATTLE;
        }
    }

    public void notifyMonstersKilled() {
        out("You clear the room of monsters that once roamed from within.");
        this.mode = PlayMode.EXPLORE;
    }

    //--------------------------------------------------------

    //--------------------------------------------------------
}
