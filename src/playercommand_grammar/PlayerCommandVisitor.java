// Generated from C:/Users/filje/Desktop/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PlayerCommandParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PlayerCommandVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(PlayerCommandParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(PlayerCommandParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#door}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoor(PlayerCommandParser.DoorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#pickup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPickup(PlayerCommandParser.PickupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#exit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit(PlayerCommandParser.ExitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#describe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe(PlayerCommandParser.DescribeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#admire}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdmire(PlayerCommandParser.AdmireContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#eat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEat(PlayerCommandParser.EatContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#stats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStats(PlayerCommandParser.StatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#wield}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWield(PlayerCommandParser.WieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen(PlayerCommandParser.OpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#combine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombine(PlayerCommandParser.CombineContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#repair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepair(PlayerCommandParser.RepairContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#attack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttack(PlayerCommandParser.AttackContext ctx);
	/**
	 * Visit a parse tree produced by {@link PlayerCommandParser#help}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelp(PlayerCommandParser.HelpContext ctx);
}