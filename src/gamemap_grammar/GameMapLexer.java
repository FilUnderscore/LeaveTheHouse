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
		NEWLINE=10, INT=11, WORD=12, WS=13, OPEN=14, CLOSE=15, BLOCK_OPEN=16, 
		BLOCK_CLOSE=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"NEWLINE", "INT", "WORD", "WS", "OPEN", "CLOSE", "BLOCK_OPEN", "BLOCK_CLOSE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ROOM'", "'DOOR'", "'MONSTER'", "'hp'", "'dmg'", "'prob'", "'ITEM'", 
			"'TC'", "'WC'", null, null, null, null, "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"INT", "WORD", "WS", "OPEN", "CLOSE", "BLOCK_OPEN", "BLOCK_CLOSE"
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
		"\u0004\u0000\u0011w\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0003\tN\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0004\nU\b\n\u000b\n\f\nV\u0001\u000b\u0004\u000bZ\b\u000b"+
		"\u000b\u000b\f\u000b[\u0001\f\u0004\f_\b\f\u000b\f\f\f`\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003"+
		"\u000fk\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000fp\b\u000f"+
		"\u0001\u0010\u0001\u0010\u0003\u0010t\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\u0003\u0001"+
		"\u000009\u0003\u000009AZaz\u0002\u0000\t\t  \u0080\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0001"+
		"#\u0001\u0000\u0000\u0000\u0003(\u0001\u0000\u0000\u0000\u0005-\u0001"+
		"\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000"+
		"\u0000\u000b<\u0001\u0000\u0000\u0000\rA\u0001\u0000\u0000\u0000\u000f"+
		"F\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000\u0000\u0013M\u0001"+
		"\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017Y\u0001\u0000\u0000"+
		"\u0000\u0019^\u0001\u0000\u0000\u0000\u001bd\u0001\u0000\u0000\u0000\u001d"+
		"f\u0001\u0000\u0000\u0000\u001fj\u0001\u0000\u0000\u0000!s\u0001\u0000"+
		"\u0000\u0000#$\u0005R\u0000\u0000$%\u0005O\u0000\u0000%&\u0005O\u0000"+
		"\u0000&\'\u0005M\u0000\u0000\'\u0002\u0001\u0000\u0000\u0000()\u0005D"+
		"\u0000\u0000)*\u0005O\u0000\u0000*+\u0005O\u0000\u0000+,\u0005R\u0000"+
		"\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005M\u0000\u0000./\u0005O\u0000"+
		"\u0000/0\u0005N\u0000\u000001\u0005S\u0000\u000012\u0005T\u0000\u0000"+
		"23\u0005E\u0000\u000034\u0005R\u0000\u00004\u0006\u0001\u0000\u0000\u0000"+
		"56\u0005h\u0000\u000067\u0005p\u0000\u00007\b\u0001\u0000\u0000\u0000"+
		"89\u0005d\u0000\u00009:\u0005m\u0000\u0000:;\u0005g\u0000\u0000;\n\u0001"+
		"\u0000\u0000\u0000<=\u0005p\u0000\u0000=>\u0005r\u0000\u0000>?\u0005o"+
		"\u0000\u0000?@\u0005b\u0000\u0000@\f\u0001\u0000\u0000\u0000AB\u0005I"+
		"\u0000\u0000BC\u0005T\u0000\u0000CD\u0005E\u0000\u0000DE\u0005M\u0000"+
		"\u0000E\u000e\u0001\u0000\u0000\u0000FG\u0005T\u0000\u0000GH\u0005C\u0000"+
		"\u0000H\u0010\u0001\u0000\u0000\u0000IJ\u0005W\u0000\u0000JK\u0005C\u0000"+
		"\u0000K\u0012\u0001\u0000\u0000\u0000LN\u0005\r\u0000\u0000ML\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0005"+
		"\n\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0006\t\u0000\u0000R\u0014"+
		"\u0001\u0000\u0000\u0000SU\u0007\u0000\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000W\u0016\u0001\u0000\u0000\u0000XZ\u0007\u0001\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\\u0018\u0001\u0000\u0000\u0000]_\u0007"+
		"\u0002\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bc\u0006\f\u0000\u0000c\u001a\u0001\u0000\u0000\u0000de\u0005{\u0000"+
		"\u0000e\u001c\u0001\u0000\u0000\u0000fg\u0005}\u0000\u0000g\u001e\u0001"+
		"\u0000\u0000\u0000hk\u0003\u0019\f\u0000ik\u0003\u0013\t\u0000jh\u0001"+
		"\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lo\u0003\u001b\r\u0000mp\u0003\u0019\f\u0000"+
		"np\u0003\u0013\t\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000p \u0001\u0000\u0000\u0000qt\u0003\u0019\f\u0000"+
		"rt\u0003\u0013\t\u0000sq\u0001\u0000\u0000\u0000sr\u0001\u0000\u0000\u0000"+
		"st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0003\u001d\u000e"+
		"\u0000v\"\u0001\u0000\u0000\u0000\b\u0000MV[`jos\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}