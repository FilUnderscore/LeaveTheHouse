package gameplay.commands;

import consumable.Food;
import gameplay.*;

public class EatCommand implements PlayerCommand {
    private final String foodName;

    public EatCommand(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public CommandResult execute(Player player, World world) {
        Pickup pickup = player.getInventory().select(this.foodName);

        if(pickup == null)
            return new CommandResult("You tried to reach for the %s, before remembering you don't have one.", this.foodName);

        if(!(pickup instanceof Food food))
            return new CommandResult("You tried to eat the %s, however you realized that it's not edible.", pickup.getDescription());

        return new CommandResult(() -> player.consume(food), "You eat the %s, replenishing %d health.", food.getDescription(), food.getHp());
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.EXPLORE;
    }
}
