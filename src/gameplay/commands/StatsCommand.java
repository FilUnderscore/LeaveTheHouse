package gameplay.commands;

import gameplay.PlayMode;
import gameplay.Player;
import gameplay.PlayerCommand;
import gameplay.World;
import util.StringUtil;

public class StatsCommand implements PlayerCommand {
    @Override
    public CommandResult execute(Player player, World world) {
        return new CommandResult(true,"""
                %s
                HP: %d / 100, Confidence: %d / 100
                
                Currently carrying %d items in your pockets:
                %s
                """,
                player.getDescription(),
                player.getHp(),
                player.getConfidence(),
                player.getInventory().getItems().length,
                StringUtil.list((item) -> "- " + item.getDescription(), player.getInventory().getItems()));
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.EXPLORE;
    }
}
