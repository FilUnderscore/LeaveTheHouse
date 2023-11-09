package gameplay.commands;

import consumable.Valuable;
import gameplay.*;

public class AdmireCommand implements PlayerCommand {
    private final String valuableName;

    public AdmireCommand(String valuableName) {
        this.valuableName = valuableName;
    }

    @Override
    public CommandResult execute(Player player, World world) {
        Pickup pickup = player.getInventory().select(this.valuableName);

        if(pickup == null)
            return new CommandResult("You try to admire a %s, but realize you don't have any.", this.valuableName);

        if(!(pickup instanceof Valuable valuable))
            return new CommandResult("You try to admire a %s, but realize it is not valuable.", pickup.getDescription());

        if(valuable.isConsumed())
            return new CommandResult("You try to admire your %s, but realize you have already admired it and gotten no additional value out of it.", valuable.getDescription());

        return new CommandResult(() -> player.admire(valuable), "You admire your %s, gaining %d confidence points.", valuable.getDescription(), valuable.getValue());
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.EXPLORE;
    }
}
