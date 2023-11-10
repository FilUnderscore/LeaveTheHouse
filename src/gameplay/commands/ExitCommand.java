package gameplay.commands;

import gameplay.PlayMode;
import gameplay.Player;
import gameplay.PlayerCommand;
import gameplay.World;

public class ExitCommand implements PlayerCommand {
    @Override
    public CommandResult execute(Player player, World world) {
        if(!world.getCurrentRoom().isFinalRoom()) {
            return new CommandResult("You attempt to reach for the exit, but can't find a way out.");
        }

        return new CommandResult(world::exit, "You reach for the exit, sensing victory is near.");
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.EXPLORE;
    }
}
