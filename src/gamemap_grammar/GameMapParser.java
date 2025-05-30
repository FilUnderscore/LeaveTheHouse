// Generated from E:/Downloads/Start_TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GameMapParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NEWLINE=12, INT=13, WORD=14, WS=15, OPEN=16, CLOSE=17, 
		BLOCK_OPEN=18, BLOCK_CLOSE=19;
	public static final int
		RULE_gamemap = 0, RULE_room = 1, RULE_door = 2, RULE_monster = 3, RULE_hp = 4, 
		RULE_dmg = 5, RULE_dmg_hilo = 6, RULE_prob = 7, RULE_locked = 8, RULE_final = 9, 
		RULE_item = 10, RULE_tc = 11, RULE_wc = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"gamemap", "room", "door", "monster", "hp", "dmg", "dmg_hilo", "prob", 
			"locked", "final", "item", "tc", "wc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ROOM'", "'DOOR'", "'MONSTER'", "'hp'", "'dmg'", "'prob'", "'locked'", 
			"'final'", "'ITEM'", "'TC'", "'WC'", null, null, null, null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NEWLINE", "INT", "WORD", "WS", "OPEN", "CLOSE", "BLOCK_OPEN", "BLOCK_CLOSE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GameMap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GameMapParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GamemapContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GameMapParser.EOF, 0); }
		public List<RoomContext> room() {
			return getRuleContexts(RoomContext.class);
		}
		public RoomContext room(int i) {
			return getRuleContext(RoomContext.class,i);
		}
		public GamemapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gamemap; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterGamemap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitGamemap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitGamemap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GamemapContext gamemap() throws RecognitionException {
		GamemapContext _localctx = new GamemapContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gamemap);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(26);
				room();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RoomContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GameMapParser.WORD, 0); }
		public TerminalNode BLOCK_OPEN() { return getToken(GameMapParser.BLOCK_OPEN, 0); }
		public TerminalNode BLOCK_CLOSE() { return getToken(GameMapParser.BLOCK_CLOSE, 0); }
		public List<DoorContext> door() {
			return getRuleContexts(DoorContext.class);
		}
		public DoorContext door(int i) {
			return getRuleContext(DoorContext.class,i);
		}
		public List<MonsterContext> monster() {
			return getRuleContexts(MonsterContext.class);
		}
		public MonsterContext monster(int i) {
			return getRuleContext(MonsterContext.class,i);
		}
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<TcContext> tc() {
			return getRuleContexts(TcContext.class);
		}
		public TcContext tc(int i) {
			return getRuleContext(TcContext.class,i);
		}
		public List<WcContext> wc() {
			return getRuleContexts(WcContext.class);
		}
		public WcContext wc(int i) {
			return getRuleContext(WcContext.class,i);
		}
		public List<FinalContext> final_() {
			return getRuleContexts(FinalContext.class);
		}
		public FinalContext final_(int i) {
			return getRuleContext(FinalContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GameMapParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GameMapParser.NEWLINE, i);
		}
		public RoomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_room; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterRoom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitRoom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitRoom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoomContext room() throws RecognitionException {
		RoomContext _localctx = new RoomContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_room);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(34);
			match(T__0);
			setState(35);
			match(WORD);
			setState(36);
			match(BLOCK_OPEN);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3852L) != 0)) {
				{
				{
				setState(43);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(37);
					door();
					}
					break;
				case T__2:
					{
					setState(38);
					monster();
					}
					break;
				case T__8:
					{
					setState(39);
					item();
					}
					break;
				case T__9:
					{
					setState(40);
					tc();
					}
					break;
				case T__10:
					{
					setState(41);
					wc();
					}
					break;
				case T__7:
					{
					setState(42);
					final_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(45);
					match(NEWLINE);
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(BLOCK_CLOSE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DoorContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GameMapParser.WORD, 0); }
		public DoorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_door; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterDoor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitDoor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitDoor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoorContext door() throws RecognitionException {
		DoorContext _localctx = new DoorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_door);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(58);
			match(T__1);
			setState(59);
			match(WORD);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MonsterContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GameMapParser.WORD, 0); }
		public TerminalNode BLOCK_OPEN() { return getToken(GameMapParser.BLOCK_OPEN, 0); }
		public TerminalNode BLOCK_CLOSE() { return getToken(GameMapParser.BLOCK_CLOSE, 0); }
		public List<HpContext> hp() {
			return getRuleContexts(HpContext.class);
		}
		public HpContext hp(int i) {
			return getRuleContext(HpContext.class,i);
		}
		public List<DmgContext> dmg() {
			return getRuleContexts(DmgContext.class);
		}
		public DmgContext dmg(int i) {
			return getRuleContext(DmgContext.class,i);
		}
		public List<ProbContext> prob() {
			return getRuleContexts(ProbContext.class);
		}
		public ProbContext prob(int i) {
			return getRuleContext(ProbContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GameMapParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GameMapParser.NEWLINE, i);
		}
		public MonsterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterMonster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitMonster(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitMonster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonsterContext monster() throws RecognitionException {
		MonsterContext _localctx = new MonsterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_monster);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(61);
			match(T__2);
			setState(62);
			match(WORD);
			setState(63);
			match(BLOCK_OPEN);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 112L) != 0)) {
				{
				{
				setState(67);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
					{
					setState(64);
					hp();
					}
					break;
				case T__4:
					{
					setState(65);
					dmg();
					}
					break;
				case T__5:
					{
					setState(66);
					prob();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(69);
					match(NEWLINE);
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(BLOCK_CLOSE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HpContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GameMapParser.INT, 0); }
		public HpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterHp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitHp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitHp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HpContext hp() throws RecognitionException {
		HpContext _localctx = new HpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__3);
			setState(83);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DmgContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GameMapParser.INT, 0); }
		public DmgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterDmg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitDmg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitDmg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmgContext dmg() throws RecognitionException {
		DmgContext _localctx = new DmgContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dmg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__4);
			setState(86);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Dmg_hiloContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(GameMapParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(GameMapParser.INT, i);
		}
		public Dmg_hiloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmg_hilo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterDmg_hilo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitDmg_hilo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitDmg_hilo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dmg_hiloContext dmg_hilo() throws RecognitionException {
		Dmg_hiloContext _localctx = new Dmg_hiloContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dmg_hilo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__4);
			setState(89);
			match(INT);
			setState(90);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProbContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GameMapParser.INT, 0); }
		public ProbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterProb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitProb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitProb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbContext prob() throws RecognitionException {
		ProbContext _localctx = new ProbContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_prob);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__5);
			setState(93);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LockedContext extends ParserRuleContext {
		public LockedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locked; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterLocked(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitLocked(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitLocked(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LockedContext locked() throws RecognitionException {
		LockedContext _localctx = new LockedContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_locked);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinalContext extends ParserRuleContext {
		public FinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_final; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterFinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitFinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitFinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FinalContext final_() throws RecognitionException {
		FinalContext _localctx = new FinalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_final);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ItemContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GameMapParser.WORD, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(99);
			match(T__8);
			setState(100);
			match(WORD);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TcContext extends ParserRuleContext {
		public TerminalNode BLOCK_OPEN() { return getToken(GameMapParser.BLOCK_OPEN, 0); }
		public TerminalNode BLOCK_CLOSE() { return getToken(GameMapParser.BLOCK_CLOSE, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<LockedContext> locked() {
			return getRuleContexts(LockedContext.class);
		}
		public LockedContext locked(int i) {
			return getRuleContext(LockedContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GameMapParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GameMapParser.NEWLINE, i);
		}
		public TcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterTc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitTc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitTc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TcContext tc() throws RecognitionException {
		TcContext _localctx = new TcContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(102);
			match(T__9);
			setState(103);
			match(BLOCK_OPEN);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__8) {
				{
				{
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(104);
					item();
					}
					break;
				case T__6:
					{
					setState(105);
					locked();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(108);
					match(NEWLINE);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(BLOCK_CLOSE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WcContext extends ParserRuleContext {
		public TerminalNode BLOCK_OPEN() { return getToken(GameMapParser.BLOCK_OPEN, 0); }
		public TerminalNode BLOCK_CLOSE() { return getToken(GameMapParser.BLOCK_CLOSE, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public List<LockedContext> locked() {
			return getRuleContexts(LockedContext.class);
		}
		public LockedContext locked(int i) {
			return getRuleContext(LockedContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(GameMapParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(GameMapParser.NEWLINE, i);
		}
		public WcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).enterWc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GameMapListener ) ((GameMapListener)listener).exitWc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GameMapVisitor ) return ((GameMapVisitor<? extends T>)visitor).visitWc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WcContext wc() throws RecognitionException {
		WcContext _localctx = new WcContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(121);
			match(T__10);
			setState(122);
			match(BLOCK_OPEN);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6 || _la==T__8) {
				{
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(123);
					item();
					}
					break;
				case T__6:
					{
					setState(124);
					locked();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(127);
					match(NEWLINE);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(BLOCK_CLOSE);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0013\u008d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000"+
		"\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001,\b\u0001\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u0001"+
		"2\t\u0001\u0005\u00014\b\u0001\n\u0001\f\u00017\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003D\b\u0003\u0001"+
		"\u0003\u0005\u0003G\b\u0003\n\u0003\f\u0003J\t\u0003\u0005\u0003L\b\u0003"+
		"\n\u0003\f\u0003O\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000bk\b\u000b\u0001\u000b\u0005\u000bn\b\u000b"+
		"\n\u000b\f\u000bq\t\u000b\u0005\u000bs\b\u000b\n\u000b\f\u000bv\t\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f~\b\f"+
		"\u0001\f\u0005\f\u0081\b\f\n\f\f\f\u0084\t\f\u0005\f\u0086\b\f\n\f\f\f"+
		"\u0089\t\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0000\u0091\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004:\u0001"+
		"\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\bR\u0001\u0000\u0000"+
		"\u0000\nU\u0001\u0000\u0000\u0000\fX\u0001\u0000\u0000\u0000\u000e\\\u0001"+
		"\u0000\u0000\u0000\u0010_\u0001\u0000\u0000\u0000\u0012a\u0001\u0000\u0000"+
		"\u0000\u0014c\u0001\u0000\u0000\u0000\u0016f\u0001\u0000\u0000\u0000\u0018"+
		"y\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001"+
		"\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000 !\u0005\u0000\u0000"+
		"\u0001!\u0001\u0001\u0000\u0000\u0000\"#\u0005\u0001\u0000\u0000#$\u0005"+
		"\u000e\u0000\u0000$5\u0005\u0012\u0000\u0000%,\u0003\u0004\u0002\u0000"+
		"&,\u0003\u0006\u0003\u0000\',\u0003\u0014\n\u0000(,\u0003\u0016\u000b"+
		"\u0000),\u0003\u0018\f\u0000*,\u0003\u0012\t\u0000+%\u0001\u0000\u0000"+
		"\u0000+&\u0001\u0000\u0000\u0000+\'\u0001\u0000\u0000\u0000+(\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+*\u0001\u0000\u0000\u0000,0\u0001"+
		"\u0000\u0000\u0000-/\u0005\f\u0000\u0000.-\u0001\u0000\u0000\u0000/2\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"14\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u00003+\u0001\u0000\u0000"+
		"\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u000068\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000089\u0005"+
		"\u0013\u0000\u00009\u0003\u0001\u0000\u0000\u0000:;\u0005\u0002\u0000"+
		"\u0000;<\u0005\u000e\u0000\u0000<\u0005\u0001\u0000\u0000\u0000=>\u0005"+
		"\u0003\u0000\u0000>?\u0005\u000e\u0000\u0000?M\u0005\u0012\u0000\u0000"+
		"@D\u0003\b\u0004\u0000AD\u0003\n\u0005\u0000BD\u0003\u000e\u0007\u0000"+
		"C@\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000"+
		"\u0000DH\u0001\u0000\u0000\u0000EG\u0005\f\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KC\u0001"+
		"\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000PQ\u0005\u0013\u0000\u0000Q\u0007\u0001\u0000\u0000\u0000RS\u0005"+
		"\u0004\u0000\u0000ST\u0005\r\u0000\u0000T\t\u0001\u0000\u0000\u0000UV"+
		"\u0005\u0005\u0000\u0000VW\u0005\r\u0000\u0000W\u000b\u0001\u0000\u0000"+
		"\u0000XY\u0005\u0005\u0000\u0000YZ\u0005\r\u0000\u0000Z[\u0005\r\u0000"+
		"\u0000[\r\u0001\u0000\u0000\u0000\\]\u0005\u0006\u0000\u0000]^\u0005\r"+
		"\u0000\u0000^\u000f\u0001\u0000\u0000\u0000_`\u0005\u0007\u0000\u0000"+
		"`\u0011\u0001\u0000\u0000\u0000ab\u0005\b\u0000\u0000b\u0013\u0001\u0000"+
		"\u0000\u0000cd\u0005\t\u0000\u0000de\u0005\u000e\u0000\u0000e\u0015\u0001"+
		"\u0000\u0000\u0000fg\u0005\n\u0000\u0000gt\u0005\u0012\u0000\u0000hk\u0003"+
		"\u0014\n\u0000ik\u0003\u0010\b\u0000jh\u0001\u0000\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000ko\u0001\u0000\u0000\u0000ln\u0005\f\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rj\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000wx\u0005\u0013\u0000\u0000x\u0017\u0001\u0000\u0000"+
		"\u0000yz\u0005\u000b\u0000\u0000z\u0087\u0005\u0012\u0000\u0000{~\u0003"+
		"\u0014\n\u0000|~\u0003\u0010\b\u0000}{\u0001\u0000\u0000\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u0082\u0001\u0000\u0000\u0000\u007f\u0081\u0005\f"+
		"\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000"+
		"\u0000\u0000\u0085}\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005\u0013\u0000\u0000\u008b\u0019\u0001\u0000\u0000"+
		"\u0000\r\u001d+05CHMjot}\u0082\u0087";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}