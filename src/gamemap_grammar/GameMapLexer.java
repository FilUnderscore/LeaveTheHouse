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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NEWLINE=9, 
		INT=10, WORD=11, WS=12, OPEN=13, CLOSE=14, BLOCK_OPEN=15, BLOCK_CLOSE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NEWLINE", 
			"INT", "WORD", "WS", "OPEN", "CLOSE", "BLOCK_OPEN", "BLOCK_CLOSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ROOM'", "'DOOR'", "'MONSTER'", "'hp'", "'dmg'", "'ITEM'", "'TC'", 
			"'WC'", null, null, null, null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NEWLINE", "INT", 
			"WORD", "WS", "OPEN", "CLOSE", "BLOCK_OPEN", "BLOCK_CLOSE"
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
		"\u0004\u0000\u0010p\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0003\bG\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0004\tN\b\t\u000b\t\f\tO\u0001\n\u0004\nS\b\n\u000b\n\f\n"+
		"T\u0001\u000b\u0004\u000bX\b\u000b\u000b\u000b\f\u000bY\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"d\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000ei\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0003\u000fm\b\u000f\u0001\u000f\u0001\u000f\u0000"+
		"\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0003\u0001\u000009\u0003\u0000"+
		"09AZaz\u0002\u0000\t\t  y\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000"+
		"\u0005+\u0001\u0000\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t6\u0001"+
		"\u0000\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\r?\u0001\u0000\u0000"+
		"\u0000\u000fB\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000\u0013"+
		"M\u0001\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017W\u0001"+
		"\u0000\u0000\u0000\u0019]\u0001\u0000\u0000\u0000\u001b_\u0001\u0000\u0000"+
		"\u0000\u001dc\u0001\u0000\u0000\u0000\u001fl\u0001\u0000\u0000\u0000!"+
		"\"\u0005R\u0000\u0000\"#\u0005O\u0000\u0000#$\u0005O\u0000\u0000$%\u0005"+
		"M\u0000\u0000%\u0002\u0001\u0000\u0000\u0000&\'\u0005D\u0000\u0000\'("+
		"\u0005O\u0000\u0000()\u0005O\u0000\u0000)*\u0005R\u0000\u0000*\u0004\u0001"+
		"\u0000\u0000\u0000+,\u0005M\u0000\u0000,-\u0005O\u0000\u0000-.\u0005N"+
		"\u0000\u0000./\u0005S\u0000\u0000/0\u0005T\u0000\u000001\u0005E\u0000"+
		"\u000012\u0005R\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005h\u0000"+
		"\u000045\u0005p\u0000\u00005\b\u0001\u0000\u0000\u000067\u0005d\u0000"+
		"\u000078\u0005m\u0000\u000089\u0005g\u0000\u00009\n\u0001\u0000\u0000"+
		"\u0000:;\u0005I\u0000\u0000;<\u0005T\u0000\u0000<=\u0005E\u0000\u0000"+
		"=>\u0005M\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005T\u0000\u0000"+
		"@A\u0005C\u0000\u0000A\u000e\u0001\u0000\u0000\u0000BC\u0005W\u0000\u0000"+
		"CD\u0005C\u0000\u0000D\u0010\u0001\u0000\u0000\u0000EG\u0005\r\u0000\u0000"+
		"FE\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0005\n\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0006\b\u0000"+
		"\u0000K\u0012\u0001\u0000\u0000\u0000LN\u0007\u0000\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000P\u0014\u0001\u0000\u0000\u0000QS\u0007\u0001"+
		"\u0000\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0016\u0001\u0000\u0000"+
		"\u0000VX\u0007\u0002\u0000\u0000WV\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\\\u0006\u000b\u0000\u0000\\\u0018\u0001\u0000\u0000"+
		"\u0000]^\u0005{\u0000\u0000^\u001a\u0001\u0000\u0000\u0000_`\u0005}\u0000"+
		"\u0000`\u001c\u0001\u0000\u0000\u0000ad\u0003\u0017\u000b\u0000bd\u0003"+
		"\u0011\b\u0000ca\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000eh\u0003\u0019\f\u0000fi\u0003"+
		"\u0017\u000b\u0000gi\u0003\u0011\b\u0000hf\u0001\u0000\u0000\u0000hg\u0001"+
		"\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u001e\u0001\u0000\u0000"+
		"\u0000jm\u0003\u0017\u000b\u0000km\u0003\u0011\b\u0000lj\u0001\u0000\u0000"+
		"\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000no\u0003\u001b\r\u0000o \u0001\u0000\u0000\u0000\b\u0000F"+
		"OTYchl\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}