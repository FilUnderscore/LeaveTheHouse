package gameplay.commands;

import gameplay.PlayMode;
import gameplay.Player;
import gameplay.PlayerCommand;
import gameplay.World;

/**
 * Class defining Wield Command.
 * @author Filip Jerkovic 20122575
 */
public class WieldCommand implements PlayerCommand {
    private final String itemName;

    public WieldCommand(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public CommandResult execute(Player player, World world) {
        if(!player.equip(this.itemName))
            return new CommandResult("You search your pockets for a %s but struggle to locate it.", this.itemName);

        return new CommandResult("You equip the %s.", player.getWeapon().getDescription());
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.BOTH;
    }
}
