// Generated from E:/Downloads/Start_TextGameEngine/TextGameEngine/src/GameMap.g4 by ANTLR 4.13.1
package gamemap_grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class GameMapLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, NEWLINE=12, INT=13, WORD=14, WS=15, OPEN=16, CLOSE=17, 
		BLOCK_OPEN=18, BLOCK_CLOSE=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "NEWLINE", "INT", "WORD", "WS", "OPEN", "CLOSE", "BLOCK_OPEN", 
			"BLOCK_CLOSE"
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


	public GameMapLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "GameMap.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0013\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0003\u000b"+
		"_\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0004"+
		"\ff\b\f\u000b\f\f\fg\u0001\r\u0004\rk\b\r\u000b\r\f\rl\u0001\u000e\u0004"+
		"\u000ep\b\u000e\u000b\u000e\f\u000eq\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011"+
		"|\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0081\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u0085\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000"+
		"\u0003\u0001\u000009\u0003\u000009AZaz\u0002\u0000\t\t  \u0091\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001"+
		"\'\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000\u0000\u00051\u0001"+
		"\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t<\u0001\u0000\u0000"+
		"\u0000\u000b@\u0001\u0000\u0000\u0000\rE\u0001\u0000\u0000\u0000\u000f"+
		"L\u0001\u0000\u0000\u0000\u0011R\u0001\u0000\u0000\u0000\u0013W\u0001"+
		"\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000\u0000\u0017^\u0001\u0000\u0000"+
		"\u0000\u0019e\u0001\u0000\u0000\u0000\u001bj\u0001\u0000\u0000\u0000\u001d"+
		"o\u0001\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000!w\u0001\u0000"+
		"\u0000\u0000#{\u0001\u0000\u0000\u0000%\u0084\u0001\u0000\u0000\u0000"+
		"\'(\u0005R\u0000\u0000()\u0005O\u0000\u0000)*\u0005O\u0000\u0000*+\u0005"+
		"M\u0000\u0000+\u0002\u0001\u0000\u0000\u0000,-\u0005D\u0000\u0000-.\u0005"+
		"O\u0000\u0000./\u0005O\u0000\u0000/0\u0005R\u0000\u00000\u0004\u0001\u0000"+
		"\u0000\u000012\u0005M\u0000\u000023\u0005O\u0000\u000034\u0005N\u0000"+
		"\u000045\u0005S\u0000\u000056\u0005T\u0000\u000067\u0005E\u0000\u0000"+
		"78\u0005R\u0000\u00008\u0006\u0001\u0000\u0000\u00009:\u0005h\u0000\u0000"+
		":;\u0005p\u0000\u0000;\b\u0001\u0000\u0000\u0000<=\u0005d\u0000\u0000"+
		"=>\u0005m\u0000\u0000>?\u0005g\u0000\u0000?\n\u0001\u0000\u0000\u0000"+
		"@A\u0005p\u0000\u0000AB\u0005r\u0000\u0000BC\u0005o\u0000\u0000CD\u0005"+
		"b\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005l\u0000\u0000FG\u0005"+
		"o\u0000\u0000GH\u0005c\u0000\u0000HI\u0005k\u0000\u0000IJ\u0005e\u0000"+
		"\u0000JK\u0005d\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LM\u0005f\u0000"+
		"\u0000MN\u0005i\u0000\u0000NO\u0005n\u0000\u0000OP\u0005a\u0000\u0000"+
		"PQ\u0005l\u0000\u0000Q\u0010\u0001\u0000\u0000\u0000RS\u0005I\u0000\u0000"+
		"ST\u0005T\u0000\u0000TU\u0005E\u0000\u0000UV\u0005M\u0000\u0000V\u0012"+
		"\u0001\u0000\u0000\u0000WX\u0005T\u0000\u0000XY\u0005C\u0000\u0000Y\u0014"+
		"\u0001\u0000\u0000\u0000Z[\u0005W\u0000\u0000[\\\u0005C\u0000\u0000\\"+
		"\u0016\u0001\u0000\u0000\u0000]_\u0005\r\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0005\n\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bc\u0006\u000b\u0000\u0000c\u0018\u0001"+
		"\u0000\u0000\u0000df\u0007\u0000\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000h\u001a\u0001\u0000\u0000\u0000ik\u0007\u0001\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"lm\u0001\u0000\u0000\u0000m\u001c\u0001\u0000\u0000\u0000np\u0007\u0002"+
		"\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qo\u0001"+
		"\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"st\u0006\u000e\u0000\u0000t\u001e\u0001\u0000\u0000\u0000uv\u0005{\u0000"+
		"\u0000v \u0001\u0000\u0000\u0000wx\u0005}\u0000\u0000x\"\u0001\u0000\u0000"+
		"\u0000y|\u0003\u001d\u000e\u0000z|\u0003\u0017\u000b\u0000{y\u0001\u0000"+
		"\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u0080\u0003\u001f\u000f\u0000~\u0081\u0003\u001d\u000e"+
		"\u0000\u007f\u0081\u0003\u0017\u000b\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081$\u0001\u0000\u0000\u0000\u0082\u0085\u0003\u001d\u000e\u0000\u0083"+
		"\u0085\u0003\u0017\u000b\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0003!\u0010\u0000\u0087&\u0001"+
		"\u0000\u0000\u0000\b\u0000^glq{\u0080\u0084\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}