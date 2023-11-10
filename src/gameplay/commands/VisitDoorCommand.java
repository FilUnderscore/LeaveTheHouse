package gameplay.commands;

import gameplay.*;

/**
 * Class defining Visit Door Command.
 * @author Filip Jerkovic 20122575
 */
public final class VisitDoorCommand implements PlayerCommand {
    private final String door;

    public VisitDoorCommand(String door) {
        this.door = door;
    }

    @Override
    public CommandResult execute(Player player, World world) {
        Room room = world.getCurrentRoom().getConnectingRoom(this.door);

        if(room == null) {
            return new CommandResult("There is no door named %s!", this.door);
        } else {
            return new CommandResult(() -> world.setCurrentRoom(room),"You walk through the door labelled %s.", this.door);
        }
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.EXPLORE;
    }
}
