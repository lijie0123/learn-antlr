// Generated from Dot.g4 by ANTLR 4.9.2
package dot;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DotLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRICT=10, NODE=11, EDGE=12, SUBGRAPH=13, GRAPH=14, DIGRAPH=15, ID=16, 
		STRING=17, NUMBER=18, HTMLSTRING=19, ONELINE_COMMENT=20, MULTILINE_COMMENT=21, 
		COMMA=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"STRICT", "NODE", "EDGE", "SUBGRAPH", "GRAPH", "DIGRAPH", "ID", "STRING", 
			"NUMBER", "HTMLSTRING", "ALPHABET", "DIGIT", "ONELINE_COMMENT", "MULTILINE_COMMENT", 
			"COMMA", "WS", "NL"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'['", "']'", "'->'", "'--'", "':'", 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "STRICT", 
			"NODE", "EDGE", "SUBGRAPH", "GRAPH", "DIGRAPH", "ID", "STRING", "NUMBER", 
			"HTMLSTRING", "ONELINE_COMMENT", "MULTILINE_COMMENT", "COMMA", "WS"
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


	public DotLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Dot.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00d2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\6\21v\n\21\r\21\16\21w\3\22\3\22\3\22\3\22\7"+
		"\22~\n\22\f\22\16\22\u0081\13\22\3\22\3\22\3\23\3\23\6\23\u0087\n\23\r"+
		"\23\16\23\u0088\3\23\5\23\u008c\n\23\3\23\6\23\u008f\n\23\r\23\16\23\u0090"+
		"\3\23\3\23\6\23\u0095\n\23\r\23\16\23\u0096\5\23\u0099\n\23\5\23\u009b"+
		"\n\23\3\24\3\24\3\24\7\24\u00a0\n\24\f\24\16\24\u00a3\13\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u00ad\n\27\f\27\16\27\u00b0\13\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u00ba\n\30\f\30\16\30\u00bd"+
		"\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\5\33\u00cd\n\33\3\33\3\33\5\33\u00d1\n\33\6\177\u00a1\u00ae\u00bb"+
		"\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\2+\2-\26/\27\61\30\63\31\65\2\3\2\25\4\2U"+
		"Uuu\4\2VVvv\4\2TTtt\4\2KKkk\4\2EEee\4\2PPpp\4\2QQqq\4\2FFff\4\2GGgg\4"+
		"\2IIii\4\2WWww\4\2DDdd\4\2CCcc\4\2RRrr\4\2JJjj\4\2>>@@\6\2C\\aac|\u0082"+
		"\u0101\3\2\62;\5\2\13\f\17\17\"\"\2\u00de\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\67\3\2\2\2\59\3\2\2"+
		"\2\7;\3\2\2\2\t=\3\2\2\2\13?\3\2\2\2\rA\3\2\2\2\17C\3\2\2\2\21F\3\2\2"+
		"\2\23I\3\2\2\2\25K\3\2\2\2\27R\3\2\2\2\31V\3\2\2\2\33[\3\2\2\2\35d\3\2"+
		"\2\2\37j\3\2\2\2!r\3\2\2\2#y\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u00a6"+
		"\3\2\2\2+\u00a8\3\2\2\2-\u00aa\3\2\2\2/\u00b5\3\2\2\2\61\u00c3\3\2\2\2"+
		"\63\u00c7\3\2\2\2\65\u00d0\3\2\2\2\678\7}\2\28\4\3\2\2\29:\7\177\2\2:"+
		"\6\3\2\2\2;<\7=\2\2<\b\3\2\2\2=>\7?\2\2>\n\3\2\2\2?@\7]\2\2@\f\3\2\2\2"+
		"AB\7_\2\2B\16\3\2\2\2CD\7/\2\2DE\7@\2\2E\20\3\2\2\2FG\7/\2\2GH\7/\2\2"+
		"H\22\3\2\2\2IJ\7<\2\2J\24\3\2\2\2KL\t\2\2\2LM\t\3\2\2MN\t\4\2\2NO\t\5"+
		"\2\2OP\t\6\2\2PQ\t\3\2\2Q\26\3\2\2\2RS\t\7\2\2ST\t\b\2\2TU\t\t\2\2U\30"+
		"\3\2\2\2VW\t\n\2\2WX\t\t\2\2XY\t\13\2\2YZ\t\n\2\2Z\32\3\2\2\2[\\\t\2\2"+
		"\2\\]\t\f\2\2]^\t\r\2\2^_\t\13\2\2_`\t\4\2\2`a\t\16\2\2ab\t\17\2\2bc\t"+
		"\20\2\2c\34\3\2\2\2de\t\13\2\2ef\t\4\2\2fg\t\16\2\2gh\t\17\2\2hi\t\20"+
		"\2\2i\36\3\2\2\2jk\t\t\2\2kl\t\5\2\2lm\t\13\2\2mn\t\4\2\2no\t\16\2\2o"+
		"p\t\17\2\2pq\t\20\2\2q \3\2\2\2ru\5)\25\2sv\5)\25\2tv\5+\26\2us\3\2\2"+
		"\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\"\3\2\2\2y\177\7$\2\2z{\7"+
		"^\2\2{~\7$\2\2|~\13\2\2\2}z\3\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177\u0080"+
		"\3\2\2\2\177}\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083"+
		"\7$\2\2\u0083$\3\2\2\2\u0084\u0086\7\60\2\2\u0085\u0087\5+\26\2\u0086"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2"+
		"\2\2\u0089\u009b\3\2\2\2\u008a\u008c\7/\2\2\u008b\u008a\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008f\5+\26\2\u008e\u008d\3\2"+
		"\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0098\3\2\2\2\u0092\u0094\7\60\2\2\u0093\u0095\5+\26\2\u0094\u0093\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0099\3\2\2\2\u0098\u0092\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3\2"+
		"\2\2\u009a\u0084\3\2\2\2\u009a\u008b\3\2\2\2\u009b&\3\2\2\2\u009c\u00a1"+
		"\7>\2\2\u009d\u00a0\5\'\24\2\u009e\u00a0\n\21\2\2\u009f\u009d\3\2\2\2"+
		"\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7@\2\2\u00a5"+
		"(\3\2\2\2\u00a6\u00a7\t\22\2\2\u00a7*\3\2\2\2\u00a8\u00a9\t\23\2\2\u00a9"+
		",\3\2\2\2\u00aa\u00ae\7%\2\2\u00ab\u00ad\13\2\2\2\u00ac\u00ab\3\2\2\2"+
		"\u00ad\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\5\65\33\2\u00b2\u00b3\3\2\2\2"+
		"\u00b3\u00b4\b\27\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b7"+
		"\7,\2\2\u00b7\u00bb\3\2\2\2\u00b8\u00ba\13\2\2\2\u00b9\u00b8\3\2\2\2\u00ba"+
		"\u00bd\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00be\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7,\2\2\u00bf\u00c0\7\61\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\b\30\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\7.\2"+
		"\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\31\2\2\u00c6\62\3\2\2\2\u00c7\u00c8"+
		"\t\24\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\32\2\2\u00ca\64\3\2\2\2\u00cb"+
		"\u00cd\7\17\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00d1\7\f\2\2\u00cf\u00d1\7\2\2\3\u00d0\u00cc\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\66\3\2\2\2\23\2uw}\177\u0088\u008b\u0090\u0096\u0098"+
		"\u009a\u009f\u00a1\u00ae\u00bb\u00cc\u00d0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}