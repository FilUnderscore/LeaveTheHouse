package gameplay.commands;

import gameplay.*;

/**
 * Class defining Pickup Command.
 * @author Filip Jerkovic 20122575
 */
public class PickupCommand implements PlayerCommand {
    private final String itemName;

    public PickupCommand(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public CommandResult execute(Player player, World world) {
        Room room = world.getCurrentRoom();

        if(room == null)
            return new CommandResult("Invalid room.");

        Pickup pickup = room.getPickupsInRoom().select(this.itemName);

        if(pickup == null)
            return new CommandResult("You searched the room but couldn't find an %s anywhere.", this.itemName);

        return new CommandResult(() -> {
            player.getInventory().add(pickup);
            room.getPickupsInRoom().remove(pickup);
        }, "You pickup the %s and place it in your pocket.", pickup.getDescription());
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.EXPLORE;
    }
}
