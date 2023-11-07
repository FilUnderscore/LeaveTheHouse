
package gameplay;

import gamemap_grammar.GameMapBaseVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import playercommand_grammar.PlayerCommandBaseVisitor;
import playercommand_grammar.PlayerCommandLexer;
import playercommand_grammar.PlayerCommandParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class World implements WorldVisitor.Visit {
    Player player = null;
    PlayMode mode = PlayMode.EXPLORE;

    Room currentRoom = null;

    List<Room> rooms = new ArrayList<>();

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
        }
    }

    private void out(String format, Object...args) {
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

    private void onEnterRoom() {
        out("You entered the room %s.", this.currentRoom.getDescription());
    }

    //--------------------------------------------------------

    //--------------------------------------------------------
}
