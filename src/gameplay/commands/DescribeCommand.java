package gameplay.commands;

import gameplay.*;
import util.StringUtil;

public final class DescribeCommand implements PlayerCommand {
    @Override
    public CommandResult execute(Player player, World world) {
        Room room = world.getCurrentRoom();
        Inventory pickups = room.getPickupsInRoom();
        Room[] connectingRooms = room.getConnectingRooms();

        return new CommandResult("""
                You are currently in %s.
                
                The room has %d item(s) scattered across the room:
                %s
                The room has %d door(s), each distinctly labelled:
                %s
                """,
                room.getDescription(),
                pickups.getItems().length,
                StringUtil.list((i) -> "- " + i.getDescription() + " (" + i.toString() + ")", pickups.getItems()),
                connectingRooms.length,
                StringUtil.list((r) -> "- " + r.getDescription(), connectingRooms));
    }

    @Override
    public PlayMode getPlayMode() {
        return PlayMode.EXPLORE;
    }
}