// Generated from E:/Downloads/Start_TextGameEngine/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PlayerCommandParser}.
 */
public interface PlayerCommandListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(PlayerCommandParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(PlayerCommandParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#door}.
	 * @param ctx the parse tree
	 */
	void enterDoor(PlayerCommandParser.DoorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#door}.
	 * @param ctx the parse tree
	 */
	void exitDoor(PlayerCommandParser.DoorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#pickup}.
	 * @param ctx the parse tree
	 */
	void enterPickup(PlayerCommandParser.PickupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#pickup}.
	 * @param ctx the parse tree
	 */
	void exitPickup(PlayerCommandParser.PickupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#exit}.
	 * @param ctx the parse tree
	 */
	void enterExit(PlayerCommandParser.ExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#exit}.
	 * @param ctx the parse tree
	 */
	void exitExit(PlayerCommandParser.ExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#describe}.
	 * @param ctx the parse tree
	 */
	void enterDescribe(PlayerCommandParser.DescribeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#describe}.
	 * @param ctx the parse tree
	 */
	void exitDescribe(PlayerCommandParser.DescribeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#admire}.
	 * @param ctx the parse tree
	 */
	void enterAdmire(PlayerCommandParser.AdmireContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#admire}.
	 * @param ctx the parse tree
	 */
	void exitAdmire(PlayerCommandParser.AdmireContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#eat}.
	 * @param ctx the parse tree
	 */
	void enterEat(PlayerCommandParser.EatContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#eat}.
	 * @param ctx the parse tree
	 */
	void exitEat(PlayerCommandParser.EatContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#stats}.
	 * @param ctx the parse tree
	 */
	void enterStats(PlayerCommandParser.StatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#stats}.
	 * @param ctx the parse tree
	 */
	void exitStats(PlayerCommandParser.StatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#wield}.
	 * @param ctx the parse tree
	 */
	void enterWield(PlayerCommandParser.WieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#wield}.
	 * @param ctx the parse tree
	 */
	void exitWield(PlayerCommandParser.WieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpen(PlayerCommandParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpen(PlayerCommandParser.OpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#attack}.
	 * @param ctx the parse tree
	 */
	void enterAttack(PlayerCommandParser.AttackContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#attack}.
	 * @param ctx the parse tree
	 */
	void exitAttack(PlayerCommandParser.AttackContext ctx);
	/**
	 * Enter a parse tree produced by {@link PlayerCommandParser#help}.
	 * @param ctx the parse tree
	 */
	void enterHelp(PlayerCommandParser.HelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PlayerCommandParser#help}.
	 * @param ctx the parse tree
	 */
	void exitHelp(PlayerCommandParser.HelpContext ctx);
}