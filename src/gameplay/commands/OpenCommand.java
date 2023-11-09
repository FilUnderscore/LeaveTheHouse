package gameplay.commands;

import gameplay.*;
import openable.Openable;
import opener.Opener;
import util.StringUtil;

public class OpenCommand implements PlayerCommand {
    private final String chestName;

    public OpenCommand(String chestName) {
        this.chestName = chestName;
    }

    @Override
    public CommandResult execute(Player player, World world) {
        Pickup pickup = player.getInventory().select(this.chestName);

        if(pickup == null)
            return new CommandResult("You searched your pockets for a %s, but could not find one.", this.chestName);

        if(!(pickup instanceof Openable openable))
            return new CommandResult("You tried to open a %s, but could not.", pickup.getDescription());

        Pickup key = player.getInventory().select("key");

        if(key == null)
            key = player.getInventory().select("lockpick");

        if(openable.isLocked() && key == null)
            return new CommandResult("You tried to open a %s but realized it was locked, and you don't have the key.", openable.getDescription());

        if(openable.isLocked()) {
            openable.unlockWith((Opener) key);
            player.getInventory().remove(key);
        }

        for(Pickup item : openable.getContents().getItems()) {
            player.getInventory().add(item);
        }

        player.getInventory().remove(openable);

        return new CommandResult(true, """
                You opened a %s and found the following inside:
                %s
                """,
                openable.getDescription(),
                StringUtil.list((item) -> "- " + item.getDescription() + " (" + item.toString() + ")", openable.getContents().getItems()));
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.EXPLORE;
    }
}
