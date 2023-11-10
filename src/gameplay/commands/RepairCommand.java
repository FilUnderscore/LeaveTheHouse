package gameplay.commands;

import consumable.RepairKit;
import gameplay.*;

/**
 * Class defining Repair Command.
 * @author Filip Jerkovic 20122575
 */
public class RepairCommand implements PlayerCommand {
    @Override
    public CommandResult execute(Player player, World world) {
        Pickup pickup = player.getInventory().select("repairkit");

        if(pickup == null)
            return new CommandResult("You reached for the repair kit in your pocket, however you couldn't find it.");

        if(player.getWeapon() == null)
            return new CommandResult("You went to pull out your weapon but realized you don't have anything equipped.");

        if(!(pickup instanceof RepairKit repairKit))
            return new CommandResult("You reached for the %s, but realized you can't use it to repair your %s.", pickup.getDescription(), player.getWeapon().getDescription());

        if(repairKit.isConsumed())
            return new CommandResult("You reached for the repair kit in your pocket, but realized its already been used up.");

        player.getWeapon().repair(3);
        repairKit.consume();

        return new CommandResult(true, "You reached for the repair kit in your pocket, using it to repair your %s.", player.getWeapon().getDescription());
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.EXPLORE;
    }
}
