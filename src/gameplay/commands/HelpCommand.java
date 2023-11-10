package gameplay.commands;

import gameplay.PlayMode;
import gameplay.Player;
import gameplay.PlayerCommand;
import gameplay.World;

/**
 * Class defining Help Command.
 * @author Filip Jerkovic 20122575
 */
public class HelpCommand implements PlayerCommand {
    @Override
    public CommandResult execute(Player player, World world) {
        if(world.getMode() == PlayMode.EXPLORE) {
            return new CommandResult(true, """
                    Commands (Explore):
                    - door <n> : Opens door labeled n and enter the room.
                    - pickup <item> : Pick up an item in room and add to inventory.
                    - exit : Search room to find exit.
                    - describe : Describes the room, list pickups on the floor and number of doors available.
                    - admire <valuable> : Admire a valuable pickup in the inventory to increase confidence. The valuable may only be used once to increase confidence, but is not removed from the player's inventory.
                    - eat <food> : Eats a food pickup in the inventory to increase health points. Once eaten, the food is removed from the player's inventory.
                    - stats : Display player health and confidence points and inventory.
                    - wield <weapon> : Player wields weapon from inventory for battle.
                    - wield fistsoffury : Player wields fists of fury (does not appear in inventory).
                    - open <chest> : Opens a treasure or war chest in the inventory. The contents of the chest is placed in the player's inventory and the chest removed.
                    - combine <item> <item> : Combines two items to form a new item.
                    - repair : Repairs the currently equipped weapon.
                    - help : Displays commands in this mode.
                    """);
        } else if(world.getMode() == PlayMode.BATTLE) {
            return new CommandResult(true, """
                    Commands (Battle):
                    - attack : Attacks the monster in the room using the wielded weapon.
                    - wield <weapon> : Player wields weapon from inventory for battle.
                    - wield fistsoffury : Player wields fists of fury (does not appear in inventory).
                    - help : Displays commands in this mode.
                    """);
        }

        return new CommandResult(false, "Invalid mode, no commands available.");
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.BOTH;
    }
}
