// Generated from D:/UBC/CPSC410/cpsc410_project1_team1/src/parser\HtmlLexer.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HtmlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TITLE_START=1, THEME_START=2, SECTION_START=3, ITEM_START=4, LOC_SEP=5, 
		COST_SEP=6, DECI_SEP=7, ITEM_SEP=8, NAME=9, EMAIL=10, AT_SEP=11, WS=12, 
		NUM=13, WS_NUM=14, TEXT=15, WS_TEXT=16, PATH=17, WS_PATH=18;
	public static final int
		NUM_MODE=1, TEXT_MODE=2, PATH_MODE=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "NUM_MODE", "TEXT_MODE", "PATH_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TITLE_START", "THEME_START", "SECTION_START", "ITEM_START", "LOC_SEP", 
			"COST_SEP", "DECI_SEP", "ITEM_SEP", "NAME", "EMAIL", "AT_SEP", "WS", 
			"NUM", "WS_NUM", "TEXT", "WS_TEXT", "PATH", "WS_PATH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TITLE:'", "'THEME:'", "'SECTION:'", "'ITEM:'", "'from'", "'cost'", 
			"'.'", "'|'", "'NAME:'", "'EMAIL:'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TITLE_START", "THEME_START", "SECTION_START", "ITEM_START", "LOC_SEP", 
			"COST_SEP", "DECI_SEP", "ITEM_SEP", "NAME", "EMAIL", "AT_SEP", "WS", 
			"NUM", "WS_NUM", "TEXT", "WS_TEXT", "PATH", "WS_PATH"
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


	public HtmlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HtmlLexer.g4"; }

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
		"\u0004\u0000\u0012\u00a9\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff"+
		"\uffff\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bz\b\u000b\u000b\u000b\f\u000b{\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0004\f\u0081\b\f\u000b\f\f\f\u0082\u0001\f\u0001\f\u0001\r\u0004"+
		"\r\u0088\b\r\u000b\r\f\r\u0089\u0001\r\u0001\r\u0001\u000e\u0004\u000e"+
		"\u008f\b\u000e\u000b\u000e\f\u000e\u0090\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0004\u000f\u0096\b\u000f\u000b\u000f\f\u000f\u0097\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010\u009d\b\u0010\u000b\u0010\f\u0010"+
		"\u009e\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011\u00a4\b\u0011\u000b"+
		"\u0011\f\u0011\u00a5\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0004\u0001"+
		"\u0006\u0002\b\u0003\n\u0004\f\u0005\u000e\u0006\u0010\u0007\u0012\b\u0014"+
		"\t\u0016\n\u0018\u000b\u001a\f\u001c\r\u001e\u000e \u000f\"\u0010$\u0011"+
		"&\u0012\u0004\u0000\u0001\u0002\u0003\u0004\u0003\u0000\n\n\r\r  \u0001"+
		"\u000009\u0003\u000009AZaz\u0006\u0000.:AZ\\\\__az~~\u00ac\u0000\u0004"+
		"\u0001\u0000\u0000\u0000\u0000\u0006\u0001\u0000\u0000\u0000\u0000\b\u0001"+
		"\u0000\u0000\u0000\u0000\n\u0001\u0000\u0000\u0000\u0000\f\u0001\u0000"+
		"\u0000\u0000\u0000\u000e\u0001\u0000\u0000\u0000\u0000\u0010\u0001\u0000"+
		"\u0000\u0000\u0000\u0012\u0001\u0000\u0000\u0000\u0000\u0014\u0001\u0000"+
		"\u0000\u0000\u0000\u0016\u0001\u0000\u0000\u0000\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0000\u001a\u0001\u0000\u0000\u0000\u0001\u001c\u0001\u0000"+
		"\u0000\u0000\u0001\u001e\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000"+
		"\u0000\u0002\"\u0001\u0000\u0000\u0000\u0003$\u0001\u0000\u0000\u0000"+
		"\u0003&\u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u00061"+
		"\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\nE\u0001\u0000\u0000"+
		"\u0000\fM\u0001\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010"+
		"[\u0001\u0000\u0000\u0000\u0012_\u0001\u0000\u0000\u0000\u0014c\u0001"+
		"\u0000\u0000\u0000\u0016k\u0001\u0000\u0000\u0000\u0018t\u0001\u0000\u0000"+
		"\u0000\u001ay\u0001\u0000\u0000\u0000\u001c\u0080\u0001\u0000\u0000\u0000"+
		"\u001e\u0087\u0001\u0000\u0000\u0000 \u008e\u0001\u0000\u0000\u0000\""+
		"\u0095\u0001\u0000\u0000\u0000$\u009c\u0001\u0000\u0000\u0000&\u00a3\u0001"+
		"\u0000\u0000\u0000()\u0005T\u0000\u0000)*\u0005I\u0000\u0000*+\u0005T"+
		"\u0000\u0000+,\u0005L\u0000\u0000,-\u0005E\u0000\u0000-.\u0005:\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/0\u0006\u0000\u0000\u00000\u0005\u0001"+
		"\u0000\u0000\u000012\u0005T\u0000\u000023\u0005H\u0000\u000034\u0005E"+
		"\u0000\u000045\u0005M\u0000\u000056\u0005E\u0000\u000067\u0005:\u0000"+
		"\u000078\u0001\u0000\u0000\u000089\u0006\u0001\u0000\u00009\u0007\u0001"+
		"\u0000\u0000\u0000:;\u0005S\u0000\u0000;<\u0005E\u0000\u0000<=\u0005C"+
		"\u0000\u0000=>\u0005T\u0000\u0000>?\u0005I\u0000\u0000?@\u0005O\u0000"+
		"\u0000@A\u0005N\u0000\u0000AB\u0005:\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CD\u0006\u0002\u0000\u0000D\t\u0001\u0000\u0000\u0000EF\u0005I\u0000\u0000"+
		"FG\u0005T\u0000\u0000GH\u0005E\u0000\u0000HI\u0005M\u0000\u0000IJ\u0005"+
		":\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0006\u0003\u0000\u0000L\u000b"+
		"\u0001\u0000\u0000\u0000MN\u0005f\u0000\u0000NO\u0005r\u0000\u0000OP\u0005"+
		"o\u0000\u0000PQ\u0005m\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0006\u0004"+
		"\u0001\u0000S\r\u0001\u0000\u0000\u0000TU\u0005c\u0000\u0000UV\u0005o"+
		"\u0000\u0000VW\u0005s\u0000\u0000WX\u0005t\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000YZ\u0006\u0005\u0002\u0000Z\u000f\u0001\u0000\u0000\u0000[\\\u0005"+
		".\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0006\u0006\u0000\u0000^\u0011"+
		"\u0001\u0000\u0000\u0000_`\u0005|\u0000\u0000`a\u0001\u0000\u0000\u0000"+
		"ab\u0006\u0007\u0000\u0000b\u0013\u0001\u0000\u0000\u0000cd\u0005N\u0000"+
		"\u0000de\u0005A\u0000\u0000ef\u0005M\u0000\u0000fg\u0005E\u0000\u0000"+
		"gh\u0005:\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0006\b\u0000\u0000"+
		"j\u0015\u0001\u0000\u0000\u0000kl\u0005E\u0000\u0000lm\u0005M\u0000\u0000"+
		"mn\u0005A\u0000\u0000no\u0005I\u0000\u0000op\u0005L\u0000\u0000pq\u0005"+
		":\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0006\t\u0000\u0000s\u0017\u0001"+
		"\u0000\u0000\u0000tu\u0005@\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0006"+
		"\n\u0000\u0000w\u0019\u0001\u0000\u0000\u0000xz\u0007\u0000\u0000\u0000"+
		"yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}~\u0006\u000b"+
		"\u0003\u0000~\u001b\u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0001\u0000"+
		"\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0006\f\u0004\u0000"+
		"\u0085\u001d\u0001\u0000\u0000\u0000\u0086\u0088\u0007\u0000\u0000\u0000"+
		"\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c\u0006\r\u0003\u0000\u008c"+
		"\u001f\u0001\u0000\u0000\u0000\u008d\u008f\u0007\u0002\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091"+
		"\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0006\u000e\u0004\u0000\u0093"+
		"!\u0001\u0000\u0000\u0000\u0094\u0096\u0007\u0000\u0000\u0000\u0095\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0095"+
		"\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0006\u000f\u0003\u0000\u009a#\u0001"+
		"\u0000\u0000\u0000\u009b\u009d\u0007\u0003\u0000\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0006\u0010\u0004\u0000\u00a1%\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a4\u0007\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0006\u0011\u0003\u0000\u00a8\'\u0001\u0000\u0000"+
		"\u0000\u000b\u0000\u0001\u0002\u0003{\u0082\u0089\u0090\u0097\u009e\u00a5"+
		"\u0005\u0002\u0002\u0000\u0002\u0003\u0000\u0002\u0001\u0000\u0000\u0001"+
		"\u0000\u0002\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}