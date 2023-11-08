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
        Pickup itemOne = player.getInventory().select(this.itemOneName);
        Pickup itemTwo = player.getInventory().select(this.itemTwoName);

        

        return null;
    }

    @Override
    public PlayMode getPlayMode() {
        return null;
    }
}
