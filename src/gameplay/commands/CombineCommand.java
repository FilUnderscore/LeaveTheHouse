package gameplay.commands;

import gameplay.*;

public class CombineCommand implements PlayerCommand {
    private final String itemOneName, itemTwoName;

    public CombineCommand(String itemOneName, String itemTwoName) {
        this.itemOneName = itemOneName;
        this.itemTwoName = itemTwoName;
    }

    @Override
    public CommandResult execute(Player player, World world) {
        Pickup<?> itemOne = player.getInventory().select(this.itemOneName);
        Pickup<?> itemTwo = player.getInventory().select(this.itemTwoName);

        if(itemOne == null)
            return new CommandResult("You searched your pockets for a %s to combine with something else, but couldn't find it.", this.itemOneName);

        if(itemTwo == null)
            return new CommandResult("You searched your pockets for a %s to combine with something else, but couldn't find it.", this.itemTwoName);

        Pickup combined = itemOne.combine(itemTwo);

        if(combined == null)
            return new CommandResult("You tried to combine a %s and a %s, but nothing happened.", itemOne.getDescription(), itemTwo.getDescription());

        player.getInventory().remove(itemOne);
        player.getInventory().remove(itemTwo);

        return new CommandResult(() -> player.getInventory().add(combined), "You combined the %s and %s to make a %s.", itemOne.getDescription(), itemTwo.getDescription(), combined.getDescription());
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.EXPLORE;
    }
}
