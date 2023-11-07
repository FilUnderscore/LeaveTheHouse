package gameplay;

import gameplay.commands.DescribeCommand;
import gameplay.commands.HelpCommand;
import gameplay.commands.VisitDoorCommand;
import playercommand_grammar.PlayerCommandBaseVisitor;
import playercommand_grammar.PlayerCommandParser;

public class PlayerCommandVisitor extends PlayerCommandBaseVisitor<PlayerCommand>
{
    @Override
    public PlayerCommand visitDoor(PlayerCommandParser.DoorContext ctx) {
        String door = ctx.WORD().getText();
        return new VisitDoorCommand(door);
    }

    @Override
    public PlayerCommand visitHelp(PlayerCommandParser.HelpContext ctx) {
        return new HelpCommand();
    }

    @Override
    public PlayerCommand visitStats(PlayerCommandParser.StatsContext ctx) {
        return super.visitStats(ctx);
    }

    @Override
    public PlayerCommand visitDescribe(PlayerCommandParser.DescribeContext ctx) {
        return new DescribeCommand();
    }
}