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

    @Override
    public PlayerCommand visitCombine(PlayerCommandParser.CombineContext ctx) {
        String itemNameOne = ctx.WORD(0).getText();
        String itemNameTwo = ctx.WORD(1).getText();

        return new CombineCommand(itemNameOne, itemNameTwo);
    }

    @Override
    public PlayerCommand visitAttack(PlayerCommandParser.AttackContext ctx) {
        return new AttackCommand();
    }

    @Override
    public PlayerCommand visitWield(PlayerCommandParser.WieldContext ctx) {
        String weaponName = ctx.WORD().getText();
        return new WieldCommand(weaponName);
    }

    @Override
    public PlayerCommand visitAdmire(PlayerCommandParser.AdmireContext ctx) {
        String valuableName = ctx.WORD().getText();
        return new AdmireCommand(valuableName);
    }

    @Override
    public PlayerCommand visitOpen(PlayerCommandParser.OpenContext ctx) {
        String chestName = ctx.WORD().getText();
        return new OpenCommand(chestName);
    }
}