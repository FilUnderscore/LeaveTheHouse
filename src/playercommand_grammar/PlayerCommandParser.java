// Generated from E:/Downloads/Start_TextGameEngine/TextGameEngine/src/PlayerCommand.g4 by ANTLR 4.13.1
package playercommand_grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlayerCommandParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NEWLINE=12, WORD=13, WS=14;
	public static final int
		RULE_input = 0, RULE_command = 1, RULE_door = 2, RULE_pickup = 3, RULE_exit = 4, 
		RULE_describe = 5, RULE_admire = 6, RULE_eat = 7, RULE_stats = 8, RULE_wield = 9, 
		RULE_open = 10, RULE_attack = 11, RULE_help = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "command", "door", "pickup", "exit", "describe", "admire", "eat", 
			"stats", "wield", "open", "attack", "help"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'door'", "'pickup'", "'exit'", "'describe'", "'admire'", "'eat'", 
			"'stats'", "'wield'", "'open'", "'attack'", "'help'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NEWLINE", "WORD", "WS"
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
	public String getGrammarFileName() { return "PlayerCommand.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlayerCommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PlayerCommandParser.NEWLINE, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			command();
			setState(27);
			match(NEWLINE);
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
	public static class CommandContext extends ParserRuleContext {
		public DoorContext door() {
			return getRuleContext(DoorContext.class,0);
		}
		public PickupContext pickup() {
			return getRuleContext(PickupContext.class,0);
		}
		public ExitContext exit() {
			return getRuleContext(ExitContext.class,0);
		}
		public DescribeContext describe() {
			return getRuleContext(DescribeContext.class,0);
		}
		public AdmireContext admire() {
			return getRuleContext(AdmireContext.class,0);
		}
		public EatContext eat() {
			return getRuleContext(EatContext.class,0);
		}
		public StatsContext stats() {
			return getRuleContext(StatsContext.class,0);
		}
		public WieldContext wield() {
			return getRuleContext(WieldContext.class,0);
		}
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public AttackContext attack() {
			return getRuleContext(AttackContext.class,0);
		}
		public HelpContext help() {
			return getRuleContext(HelpContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(29);
				door();
				}
				break;
			case T__1:
				{
				setState(30);
				pickup();
				}
				break;
			case T__2:
				{
				setState(31);
				exit();
				}
				break;
			case T__3:
				{
				setState(32);
				describe();
				}
				break;
			case T__4:
				{
				setState(33);
				admire();
				}
				break;
			case T__5:
				{
				setState(34);
				eat();
				}
				break;
			case T__6:
				{
				setState(35);
				stats();
				}
				break;
			case T__7:
				{
				setState(36);
				wield();
				}
				break;
			case T__8:
				{
				setState(37);
				open();
				}
				break;
			case T__9:
				{
				setState(38);
				attack();
				}
				break;
			case T__10:
				{
				setState(39);
				help();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public DoorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_door; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterDoor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitDoor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitDoor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoorContext door() throws RecognitionException {
		DoorContext _localctx = new DoorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_door);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__0);
			setState(43);
			match(WORD);
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
	public static class PickupContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public PickupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pickup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterPickup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitPickup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitPickup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PickupContext pickup() throws RecognitionException {
		PickupContext _localctx = new PickupContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pickup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__1);
			setState(46);
			match(WORD);
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
	public static class ExitContext extends ParserRuleContext {
		public ExitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterExit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitExit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitExit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExitContext exit() throws RecognitionException {
		ExitContext _localctx = new ExitContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__2);
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
	public static class DescribeContext extends ParserRuleContext {
		public DescribeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterDescribe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitDescribe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitDescribe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeContext describe() throws RecognitionException {
		DescribeContext _localctx = new DescribeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_describe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__3);
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
	public static class AdmireContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public AdmireContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_admire; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterAdmire(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitAdmire(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitAdmire(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdmireContext admire() throws RecognitionException {
		AdmireContext _localctx = new AdmireContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_admire);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(T__4);
			setState(53);
			match(WORD);
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
	public static class EatContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public EatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterEat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitEat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitEat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EatContext eat() throws RecognitionException {
		EatContext _localctx = new EatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__5);
			setState(56);
			match(WORD);
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
	public static class StatsContext extends ParserRuleContext {
		public StatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterStats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitStats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitStats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatsContext stats() throws RecognitionException {
		StatsContext _localctx = new StatsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stats);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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
	public static class WieldContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public WieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wield; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterWield(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitWield(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitWield(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WieldContext wield() throws RecognitionException {
		WieldContext _localctx = new WieldContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_wield);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__7);
			setState(61);
			match(WORD);
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
	public static class OpenContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(PlayerCommandParser.WORD, 0); }
		public OpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenContext open() throws RecognitionException {
		OpenContext _localctx = new OpenContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__8);
			setState(64);
			match(WORD);
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
	public static class AttackContext extends ParserRuleContext {
		public AttackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attack; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterAttack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitAttack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitAttack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttackContext attack() throws RecognitionException {
		AttackContext _localctx = new AttackContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attack);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__9);
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
	public static class HelpContext extends ParserRuleContext {
		public HelpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_help; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).enterHelp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlayerCommandListener ) ((PlayerCommandListener)listener).exitHelp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PlayerCommandVisitor ) return ((PlayerCommandVisitor<? extends T>)visitor).visitHelp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HelpContext help() throws RecognitionException {
		HelpContext _localctx = new HelpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_help);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__10);
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
		"\u0004\u0001\u000eG\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u0000\u0000C\u0000\u001a\u0001\u0000\u0000\u0000\u0002(\u0001"+
		"\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000"+
		"\u0000\b0\u0001\u0000\u0000\u0000\n2\u0001\u0000\u0000\u0000\f4\u0001"+
		"\u0000\u0000\u0000\u000e7\u0001\u0000\u0000\u0000\u0010:\u0001\u0000\u0000"+
		"\u0000\u0012<\u0001\u0000\u0000\u0000\u0014?\u0001\u0000\u0000\u0000\u0016"+
		"B\u0001\u0000\u0000\u0000\u0018D\u0001\u0000\u0000\u0000\u001a\u001b\u0003"+
		"\u0002\u0001\u0000\u001b\u001c\u0005\f\u0000\u0000\u001c\u0001\u0001\u0000"+
		"\u0000\u0000\u001d)\u0003\u0004\u0002\u0000\u001e)\u0003\u0006\u0003\u0000"+
		"\u001f)\u0003\b\u0004\u0000 )\u0003\n\u0005\u0000!)\u0003\f\u0006\u0000"+
		"\")\u0003\u000e\u0007\u0000#)\u0003\u0010\b\u0000$)\u0003\u0012\t\u0000"+
		"%)\u0003\u0014\n\u0000&)\u0003\u0016\u000b\u0000\')\u0003\u0018\f\u0000"+
		"(\u001d\u0001\u0000\u0000\u0000(\u001e\u0001\u0000\u0000\u0000(\u001f"+
		"\u0001\u0000\u0000\u0000( \u0001\u0000\u0000\u0000(!\u0001\u0000\u0000"+
		"\u0000(\"\u0001\u0000\u0000\u0000(#\u0001\u0000\u0000\u0000($\u0001\u0000"+
		"\u0000\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001"+
		"\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000*+\u0005\u0001\u0000"+
		"\u0000+,\u0005\r\u0000\u0000,\u0005\u0001\u0000\u0000\u0000-.\u0005\u0002"+
		"\u0000\u0000./\u0005\r\u0000\u0000/\u0007\u0001\u0000\u0000\u000001\u0005"+
		"\u0003\u0000\u00001\t\u0001\u0000\u0000\u000023\u0005\u0004\u0000\u0000"+
		"3\u000b\u0001\u0000\u0000\u000045\u0005\u0005\u0000\u000056\u0005\r\u0000"+
		"\u00006\r\u0001\u0000\u0000\u000078\u0005\u0006\u0000\u000089\u0005\r"+
		"\u0000\u00009\u000f\u0001\u0000\u0000\u0000:;\u0005\u0007\u0000\u0000"+
		";\u0011\u0001\u0000\u0000\u0000<=\u0005\b\u0000\u0000=>\u0005\r\u0000"+
		"\u0000>\u0013\u0001\u0000\u0000\u0000?@\u0005\t\u0000\u0000@A\u0005\r"+
		"\u0000\u0000A\u0015\u0001\u0000\u0000\u0000BC\u0005\n\u0000\u0000C\u0017"+
		"\u0001\u0000\u0000\u0000DE\u0005\u000b\u0000\u0000E\u0019\u0001\u0000"+
		"\u0000\u0000\u0001(";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}