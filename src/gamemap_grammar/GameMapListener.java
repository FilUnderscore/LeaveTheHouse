// Generated from E:/Downloads/Start_TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GameMapParser}.
 */
public interface GameMapListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 */
	void enterGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#gamemap}.
	 * @param ctx the parse tree
	 */
	void exitGamemap(GameMapParser.GamemapContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#room}.
	 * @param ctx the parse tree
	 */
	void enterRoom(GameMapParser.RoomContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#room}.
	 * @param ctx the parse tree
	 */
	void exitRoom(GameMapParser.RoomContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#door}.
	 * @param ctx the parse tree
	 */
	void enterDoor(GameMapParser.DoorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#door}.
	 * @param ctx the parse tree
	 */
	void exitDoor(GameMapParser.DoorContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 */
	void enterMonster(GameMapParser.MonsterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#monster}.
	 * @param ctx the parse tree
	 */
	void exitMonster(GameMapParser.MonsterContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#hp}.
	 * @param ctx the parse tree
	 */
	void enterHp(GameMapParser.HpContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#hp}.
	 * @param ctx the parse tree
	 */
	void exitHp(GameMapParser.HpContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#dmg}.
	 * @param ctx the parse tree
	 */
	void enterDmg(GameMapParser.DmgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#dmg}.
	 * @param ctx the parse tree
	 */
	void exitDmg(GameMapParser.DmgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#dmg_hilo}.
	 * @param ctx the parse tree
	 */
	void enterDmg_hilo(GameMapParser.Dmg_hiloContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#dmg_hilo}.
	 * @param ctx the parse tree
	 */
	void exitDmg_hilo(GameMapParser.Dmg_hiloContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(GameMapParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(GameMapParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#tc}.
	 * @param ctx the parse tree
	 */
	void enterTc(GameMapParser.TcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#tc}.
	 * @param ctx the parse tree
	 */
	void exitTc(GameMapParser.TcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GameMapParser#wc}.
	 * @param ctx the parse tree
	 */
	void enterWc(GameMapParser.WcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GameMapParser#wc}.
	 * @param ctx the parse tree
	 */
	void exitWc(GameMapParser.WcContext ctx);
}