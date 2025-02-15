// Generated from babycino\MiniJava.g4 by ANTLR 4.9.1
package babycino;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, INT=37, IDENT=38, ALPHA=39, 
		ALNUM=40, WS=41, COMMENT=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"T__33", "T__34", "T__35", "INT", "IDENT", "ALPHA", "ALNUM", "WS", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
			"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "','", "'return'", 
			"'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
			"'='", "'.'", "'length'", "'!'", "'*'", "'+'", "'-'", "'<'", "'>='", 
			"'&&'", "'true'", "'false'", "'this'", "'new'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "INT", "IDENT", "ALPHA", "ALNUM", "WS", "COMMENT"
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


	public MiniJavaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u011b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3"+
		"%\3%\3&\6&\u00f9\n&\r&\16&\u00fa\3\'\3\'\7\'\u00ff\n\'\f\'\16\'\u0102"+
		"\13\'\3(\3(\3)\3)\5)\u0108\n)\3*\6*\u010b\n*\r*\16*\u010c\3*\3*\3+\3+"+
		"\3+\3+\7+\u0115\n+\f+\16+\u0118\13+\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,\3\2\6\3\2\62;\5\2C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u011f"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\3W\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\tf\3\2\2\2\13m\3\2\2\2\rr\3"+
		"\2\2\2\17w\3\2\2\2\21y\3\2\2\2\23\u0080\3\2\2\2\25\u0082\3\2\2\2\27\u0084"+
		"\3\2\2\2\31\u0086\3\2\2\2\33\u0088\3\2\2\2\35\u0090\3\2\2\2\37\u0092\3"+
		"\2\2\2!\u0094\3\2\2\2#\u009b\3\2\2\2%\u009f\3\2\2\2\'\u00a7\3\2\2\2)\u00aa"+
		"\3\2\2\2+\u00af\3\2\2\2-\u00b5\3\2\2\2/\u00c8\3\2\2\2\61\u00ca\3\2\2\2"+
		"\63\u00cc\3\2\2\2\65\u00d3\3\2\2\2\67\u00d5\3\2\2\29\u00d7\3\2\2\2;\u00d9"+
		"\3\2\2\2=\u00db\3\2\2\2?\u00dd\3\2\2\2A\u00e0\3\2\2\2C\u00e3\3\2\2\2E"+
		"\u00e8\3\2\2\2G\u00ee\3\2\2\2I\u00f3\3\2\2\2K\u00f8\3\2\2\2M\u00fc\3\2"+
		"\2\2O\u0103\3\2\2\2Q\u0107\3\2\2\2S\u010a\3\2\2\2U\u0110\3\2\2\2WX\7e"+
		"\2\2XY\7n\2\2YZ\7c\2\2Z[\7u\2\2[\\\7u\2\2\\\4\3\2\2\2]^\7}\2\2^\6\3\2"+
		"\2\2_`\7r\2\2`a\7w\2\2ab\7d\2\2bc\7n\2\2cd\7k\2\2de\7e\2\2e\b\3\2\2\2"+
		"fg\7u\2\2gh\7v\2\2hi\7c\2\2ij\7v\2\2jk\7k\2\2kl\7e\2\2l\n\3\2\2\2mn\7"+
		"x\2\2no\7q\2\2op\7k\2\2pq\7f\2\2q\f\3\2\2\2rs\7o\2\2st\7c\2\2tu\7k\2\2"+
		"uv\7p\2\2v\16\3\2\2\2wx\7*\2\2x\20\3\2\2\2yz\7U\2\2z{\7v\2\2{|\7t\2\2"+
		"|}\7k\2\2}~\7p\2\2~\177\7i\2\2\177\22\3\2\2\2\u0080\u0081\7]\2\2\u0081"+
		"\24\3\2\2\2\u0082\u0083\7_\2\2\u0083\26\3\2\2\2\u0084\u0085\7+\2\2\u0085"+
		"\30\3\2\2\2\u0086\u0087\7\177\2\2\u0087\32\3\2\2\2\u0088\u0089\7g\2\2"+
		"\u0089\u008a\7z\2\2\u008a\u008b\7v\2\2\u008b\u008c\7g\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7f\2\2\u008e\u008f\7u\2\2\u008f\34\3\2\2\2\u0090\u0091"+
		"\7=\2\2\u0091\36\3\2\2\2\u0092\u0093\7.\2\2\u0093 \3\2\2\2\u0094\u0095"+
		"\7t\2\2\u0095\u0096\7g\2\2\u0096\u0097\7v\2\2\u0097\u0098\7w\2\2\u0098"+
		"\u0099\7t\2\2\u0099\u009a\7p\2\2\u009a\"\3\2\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7v\2\2\u009e$\3\2\2\2\u009f\u00a0\7d\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4\u00a5\7c\2\2\u00a5\u00a6\7p\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7k\2"+
		"\2\u00a8\u00a9\7h\2\2\u00a9(\3\2\2\2\u00aa\u00ab\7g\2\2\u00ab\u00ac\7"+
		"n\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7g\2\2\u00ae*\3\2\2\2\u00af\u00b0"+
		"\7y\2\2\u00b0\u00b1\7j\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7n\2\2\u00b3"+
		"\u00b4\7g\2\2\u00b4,\3\2\2\2\u00b5\u00b6\7U\2\2\u00b6\u00b7\7{\2\2\u00b7"+
		"\u00b8\7u\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7o\2\2"+
		"\u00bb\u00bc\7\60\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7w\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7\60\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2\7t\2\2\u00c2"+
		"\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4\u00c5\7v\2\2\u00c5\u00c6\7n\2\2"+
		"\u00c6\u00c7\7p\2\2\u00c7.\3\2\2\2\u00c8\u00c9\7?\2\2\u00c9\60\3\2\2\2"+
		"\u00ca\u00cb\7\60\2\2\u00cb\62\3\2\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7i\2\2\u00d0\u00d1\7v\2\2\u00d1"+
		"\u00d2\7j\2\2\u00d2\64\3\2\2\2\u00d3\u00d4\7#\2\2\u00d4\66\3\2\2\2\u00d5"+
		"\u00d6\7,\2\2\u00d68\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8:\3\2\2\2\u00d9\u00da"+
		"\7/\2\2\u00da<\3\2\2\2\u00db\u00dc\7>\2\2\u00dc>\3\2\2\2\u00dd\u00de\7"+
		"@\2\2\u00de\u00df\7?\2\2\u00df@\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1\u00e2"+
		"\7(\2\2\u00e2B\3\2\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7t\2\2\u00e5\u00e6"+
		"\7w\2\2\u00e6\u00e7\7g\2\2\u00e7D\3\2\2\2\u00e8\u00e9\7h\2\2\u00e9\u00ea"+
		"\7c\2\2\u00ea\u00eb\7n\2\2\u00eb\u00ec\7u\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"F\3\2\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7j\2\2\u00f0\u00f1\7k\2\2\u00f1"+
		"\u00f2\7u\2\2\u00f2H\3\2\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7g\2\2\u00f5"+
		"\u00f6\7y\2\2\u00f6J\3\2\2\2\u00f7\u00f9\t\2\2\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fbL\3\2\2\2"+
		"\u00fc\u0100\5O(\2\u00fd\u00ff\5Q)\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3"+
		"\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101N\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0104\t\3\2\2\u0104P\3\2\2\2\u0105\u0108\5O(\2\u0106\u0108"+
		"\t\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108R\3\2\2\2\u0109"+
		"\u010b\t\4\2\2\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\b*\2\2\u010f"+
		"T\3\2\2\2\u0110\u0111\7\61\2\2\u0111\u0112\7\61\2\2\u0112\u0116\3\2\2"+
		"\2\u0113\u0115\n\5\2\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119"+
		"\u011a\b+\2\2\u011aV\3\2\2\2\b\2\u00fa\u0100\u0107\u010c\u0116\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}