// Generated from E:/Downloads/Start_TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GameMapParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GameMapVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#room}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoom(GameMapParser.RoomContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#door}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoor(GameMapParser.DoorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonster(GameMapParser.MonsterContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#hp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHp(GameMapParser.HpContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#dmg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmg(GameMapParser.DmgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#dmg_hilo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmg_hilo(GameMapParser.Dmg_hiloContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#prob}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProb(GameMapParser.ProbContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(GameMapParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#tc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTc(GameMapParser.TcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GameMapParser#wc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWc(GameMapParser.WcContext ctx);
}