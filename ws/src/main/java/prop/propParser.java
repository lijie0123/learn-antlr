// Generated from prop.g4 by ANTLR 4.9.2
package prop;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class propParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQ=1, SC=2, NL=3, ID=4, WS=5;
	public static final int
		RULE_file = 0, RULE_line = 1, RULE_ass = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "line", "ass"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQ", "SC", "NL", "ID", "WS"
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
	public String getGrammarFileName() { return "prop.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public propParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public LineContext first;
		public TerminalNode EOF() { return getToken(propParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(propParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(propParser.NL, i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propListener ) ((propListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propListener ) ((propListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof propVisitor ) return ((propVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			((FileContext)_localctx).first = line();
			setState(15);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(8); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(7);
						match(NL);
						}
						}
						setState(10); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NL );
					setState(12);
					line();
					}
					} 
				}
				setState(17);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NL) {
				{
				{
				setState(18);
				match(NL);
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
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

	public static class LineContext extends ParserRuleContext {
		public Token l;
		public AssContext op;
		public Token r;
		public List<TerminalNode> ID() { return getTokens(propParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(propParser.ID, i);
		}
		public AssContext ass() {
			return getRuleContext(AssContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propListener ) ((propListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propListener ) ((propListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof propVisitor ) return ((propVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			((LineContext)_localctx).l = match(ID);
			setState(27);
			((LineContext)_localctx).op = ass();
			setState(28);
			((LineContext)_localctx).r = match(ID);
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

	public static class AssContext extends ParserRuleContext {
		public AssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass; }
	 
		public AssContext() { }
		public void copyFrom(AssContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ScContext extends AssContext {
		public TerminalNode SC() { return getToken(propParser.SC, 0); }
		public ScContext(AssContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propListener ) ((propListener)listener).enterSc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propListener ) ((propListener)listener).exitSc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof propVisitor ) return ((propVisitor<? extends T>)visitor).visitSc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqContext extends AssContext {
		public TerminalNode EQ() { return getToken(propParser.EQ, 0); }
		public EqContext(AssContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof propListener ) ((propListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof propListener ) ((propListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof propVisitor ) return ((propVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssContext ass() throws RecognitionException {
		AssContext _localctx = new AssContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ass);
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				_localctx = new EqContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(EQ);
				}
				break;
			case SC:
				_localctx = new ScContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(SC);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7%\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\6\2\13\n\2\r\2\16\2\f\3\2\7\2\20\n\2\f\2\16\2\23\13"+
		"\2\3\2\7\2\26\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4"+
		"#\n\4\3\4\2\2\5\2\4\6\2\2\2%\2\b\3\2\2\2\4\34\3\2\2\2\6\"\3\2\2\2\b\21"+
		"\5\4\3\2\t\13\7\5\2\2\n\t\3\2\2\2\13\f\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2"+
		"\r\16\3\2\2\2\16\20\5\4\3\2\17\n\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21"+
		"\22\3\2\2\2\22\27\3\2\2\2\23\21\3\2\2\2\24\26\7\5\2\2\25\24\3\2\2\2\26"+
		"\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32\3\2\2\2\31\27\3\2\2\2\32"+
		"\33\7\2\2\3\33\3\3\2\2\2\34\35\7\6\2\2\35\36\5\6\4\2\36\37\7\6\2\2\37"+
		"\5\3\2\2\2 #\7\3\2\2!#\7\4\2\2\" \3\2\2\2\"!\3\2\2\2#\7\3\2\2\2\6\f\21"+
		"\27\"";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}