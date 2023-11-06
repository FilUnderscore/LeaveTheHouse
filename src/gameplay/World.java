
package gameplay;

import gamemap_grammar.GameMapBaseVisitor;

import java.util.List;

public class World extends GameMapBaseVisitor {
    public enum PlayMode {battle, explore;}

    Player player;
    PlayMode mode;

    List<Room> rooms;

    //--------------------------------------------------------
    public void onEnterRoom()
	{

	}
    //--------------------------------------------------------
    public void play(Player player)
    {
        this.player = player;
        System.out.println("Welcome player " + player);

        System.out.println(player);
        this.onEnterRoom();

        boolean gameInProgress = true;
        while (gameInProgress) {
            switch (this.mode) {
                case explore:
                    //processExploreUserInput();
                    break;
                case battle:
                    //processBattleUserInput();
                    break;
            }

        }
    }
    //--------------------------------------------------------

    //--------------------------------------------------------
}
