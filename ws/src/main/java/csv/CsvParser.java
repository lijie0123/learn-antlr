// Generated from Csv.g4 by ANTLR 4.9.2
package csv;
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CsvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, TEXT=2, STRING=3, COMMA=4;
	public static final int
		RULE_file = 0, RULE_hdr = 1, RULE_datium = 2, RULE_row = 3, RULE_field = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "hdr", "datium", "row", "field"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NL", "TEXT", "STRING", "COMMA"
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
	public String getGrammarFileName() { return "Csv.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CsvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public int line = 0;
		public HdrContext hdr;
		public DatiumContext datium;
		public List<DatiumContext> data = new ArrayList<DatiumContext>();
		public HdrContext hdr() {
			return getRuleContext(HdrContext.class,0);
		}
		public List<DatiumContext> datium() {
			return getRuleContexts(DatiumContext.class);
		}
		public DatiumContext datium(int i) {
			return getRuleContext(DatiumContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((FileContext)_localctx).hdr = hdr();
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NL) | (1L << TEXT) | (1L << STRING) | (1L << COMMA))) != 0)) {
				{
				{
				setState(11);
				((FileContext)_localctx).datium = datium(((FileContext)_localctx).hdr.t);
				((FileContext)_localctx).data.add(((FileContext)_localctx).datium);
				_localctx.line++;
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			    System.out.println(_localctx.line+" rows");
			    for(DatiumContext d:((FileContext)_localctx).data){
			    System.out.println("r "+d.getSourceInterval());
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

	public static class HdrContext extends ParserRuleContext {
		public List t;
		public RowContext row;
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public HdrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hdr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterHdr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitHdr(this);
		}
	}

	public final HdrContext hdr() throws RecognitionException {
		HdrContext _localctx = new HdrContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hdr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			((HdrContext)_localctx).row = row();
			((HdrContext)_localctx).t = ((HdrContext)_localctx).row.r;System.out.println("header:"+(((HdrContext)_localctx).row!=null?_input.getText(((HdrContext)_localctx).row.start,((HdrContext)_localctx).row.stop):null));
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

	public static class DatiumContext extends ParserRuleContext {
		public List<String> title;
		public Map<String, String> values;
		public String st;
		public int c = 0;
		public int rr;
		public RowContext row;
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public DatiumContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DatiumContext(ParserRuleContext parent, int invokingState, List<String> title) {
			super(parent, invokingState);
			this.title = title;
		}
		@Override public int getRuleIndex() { return RULE_datium; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterDatium(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitDatium(this);
		}
	}

	public final DatiumContext datium(List<String> title) throws RecognitionException {
		DatiumContext _localctx = new DatiumContext(_ctx, getState(), title);
		enterRule(_localctx, 4, RULE_datium);

		((DatiumContext)_localctx).values = new HashMap();

		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((DatiumContext)_localctx).row = row();

			        for(;_localctx.c<((DatiumContext)_localctx).row.r.size();_localctx.c++){
			        _localctx.values.put(_localctx.title.get(_localctx.c), ((DatiumContext)_localctx).row.r.get(_localctx.c));
			        }
			        ((DatiumContext)_localctx).st = _input.getText(_localctx.start, _input.LT(-1));
			        
			}
			_ctx.stop = _input.LT(-1);

			System.out.printf("data row contains %d: %s\n",_localctx.c, _localctx.values);

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

	public static class RowContext extends ParserRuleContext {
		public List<String> r;
		public FieldContext field;
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public TerminalNode NL() { return getToken(CsvParser.NL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CsvParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CsvParser.COMMA, i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_row);

		((RowContext)_localctx).r = new ArrayList();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			((RowContext)_localctx).field = field();
			_localctx.r.add((((RowContext)_localctx).field!=null?_input.getText(((RowContext)_localctx).field.start,((RowContext)_localctx).field.stop):null));
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(29);
				match(COMMA);
				setState(30);
				((RowContext)_localctx).field = field();
				_localctx.r.add((((RowContext)_localctx).field!=null?_input.getText(((RowContext)_localctx).field.start,((RowContext)_localctx).field.stop):null));
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
			match(NL);
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

	public static class FieldContext extends ParserRuleContext {
		public Token TEXT;
		public TerminalNode TEXT() { return getToken(CsvParser.TEXT, 0); }
		public TerminalNode STRING() { return getToken(CsvParser.STRING, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((FieldContext)_localctx).TEXT = match(TEXT);
				System.out.println(((FieldContext)_localctx).TEXT.getText());
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(STRING);
				}
				break;
			case NL:
			case COMMA:
				enterOuterAlt(_localctx, 3);
				{
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\61\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5$\n\5\f"+
		"\5\16\5\'\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6/\n\6\3\6\2\2\7\2\4\6\b\n\2"+
		"\2\2/\2\f\3\2\2\2\4\27\3\2\2\2\6\32\3\2\2\2\b\35\3\2\2\2\n.\3\2\2\2\f"+
		"\22\5\4\3\2\r\16\5\6\4\2\16\17\b\2\1\2\17\21\3\2\2\2\20\r\3\2\2\2\21\24"+
		"\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2\24\22\3\2\2\2\25\26"+
		"\b\2\1\2\26\3\3\2\2\2\27\30\5\b\5\2\30\31\b\3\1\2\31\5\3\2\2\2\32\33\5"+
		"\b\5\2\33\34\b\4\1\2\34\7\3\2\2\2\35\36\5\n\6\2\36%\b\5\1\2\37 \7\6\2"+
		"\2 !\5\n\6\2!\"\b\5\1\2\"$\3\2\2\2#\37\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&"+
		"\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\3\2\2)\t\3\2\2\2*+\7\4\2\2+/\b\6\1\2"+
		",/\7\5\2\2-/\3\2\2\2.*\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\13\3\2\2\2\5\22%.";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}