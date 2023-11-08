package gameplay;

import gameplay.commands.*;
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
        return new StatsCommand();
    }

    @Override
    public PlayerCommand visitDescribe(PlayerCommandParser.DescribeContext ctx) {
        return new DescribeCommand();
    }

    @Override
    public PlayerCommand visitPickup(PlayerCommandParser.PickupContext ctx) {
        String itemName = ctx.WORD().getText();
        return new PickupCommand(itemName);
    }

    @Override
    public PlayerCommand visitEat(PlayerCommandParser.EatContext ctx) {
        String foodName = ctx.WORD().getText();
        return new EatCommand(foodName);
    }
}