// Generated from rlang.g4 by ANTLR 4.9.2
package rlang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class rlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, STRING=43, NL=44, USER_OP=45, 
		ID=46, NUMBER=47, WS=48;
	public static final int
		RULE_prog = 0, RULE_stmtList = 1, RULE_stmt = 2, RULE_expr = 3, RULE_exprList = 4, 
		RULE_formList = 5, RULE_form = 6, RULE_subList = 7, RULE_sub = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stmtList", "stmt", "expr", "exprList", "formList", "form", "subList", 
			"sub"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'<-'", "'='", "'<<-'", "'[['", "']'", "'['", "'::'", "':::'", 
			"'$'", "'@'", "'^'", "'+'", "'-'", "':'", "'*'", "'/'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='", "'!'", "'&'", "'&&'", "'|'", "'||'", 
			"'~'", "'->'", "'->>'", "':='", "'{'", "'}'", "'if'", "'('", "')'", "'else'", 
			"'function'", "','", "'...'", "'NULL'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "STRING", "NL", "USER_OP", 
			"ID", "NUMBER", "WS"
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
	public String getGrammarFileName() { return "rlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public rlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public StmtListContext stmtList() {
			return getRuleContext(StmtListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(rlangParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			stmtList();
			setState(19);
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

	public static class StmtListContext extends ParserRuleContext {
		public List<TerminalNode> NL() { return getTokens(rlangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(rlangParser.NL, i);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).enterStmtList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).exitStmtList(this);
		}
	}

	public final StmtListContext stmtList() throws RecognitionException {
		StmtListContext _localctx = new StmtListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmtList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__12) | (1L << T__13) | (1L << T__23) | (1L << T__28) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << NL) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__23) | (1L << T__28) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					setState(21);
					stmt();
					}
				}

				setState(24);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(rlangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		int _la;
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				match(ID);
				setState(31);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(32);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				expr(0);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FormListContext formList() {
			return getRuleContext(FormListContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(rlangParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(rlangParser.ID, 0); }
		public TerminalNode USER_OP() { return getToken(rlangParser.USER_OP, 0); }
		public SubListContext subList() {
			return getRuleContext(SubListContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
				{
				setState(37);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(38);
				expr(19);
				}
				break;
			case T__23:
				{
				setState(39);
				match(T__23);
				setState(40);
				expr(12);
				}
				break;
			case T__28:
				{
				setState(41);
				match(T__28);
				setState(42);
				expr(9);
				}
				break;
			case T__32:
				{
				setState(43);
				match(T__32);
				setState(44);
				exprList();
				setState(45);
				match(T__33);
				}
				break;
			case T__34:
				{
				setState(47);
				match(T__34);
				setState(48);
				match(T__35);
				setState(49);
				expr(0);
				setState(50);
				match(T__36);
				setState(51);
				expr(0);
				setState(54);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(52);
					match(T__37);
					setState(53);
					expr(0);
					}
					break;
				}
				}
				break;
			case T__38:
				{
				setState(56);
				match(T__38);
				setState(57);
				match(T__35);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__40 || _la==ID) {
					{
					setState(58);
					formList();
					}
				}

				setState(61);
				match(T__36);
				setState(62);
				expr(4);
				}
				break;
			case NUMBER:
				{
				setState(63);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(64);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(122);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(68);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(69);
						expr(23);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(71);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==T__10) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(72);
						expr(22);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(73);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(74);
						match(T__11);
						setState(75);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(76);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(77);
						match(T__14);
						setState(78);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(79);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(80);
						match(USER_OP);
						setState(81);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(82);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(83);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(84);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(86);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==T__13) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(87);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(89);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(90);
						expr(15);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(92);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(93);
						expr(14);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(95);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						expr(12);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(98);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						expr(11);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(101);
						match(T__28);
						setState(102);
						expr(9);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(104);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						expr(8);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(107);
						match(T__4);
						setState(108);
						subList();
						setState(109);
						match(T__5);
						setState(110);
						match(T__5);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(113);
						match(T__6);
						setState(114);
						subList();
						setState(115);
						match(T__5);
						}
						break;
					case 16:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(118);
						match(T__35);
						setState(119);
						subList();
						setState(120);
						match(T__36);
						}
						break;
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(rlangParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(rlangParser.NL, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__23) | (1L << T__28) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << ID) | (1L << NUMBER))) != 0)) {
				{
				setState(127);
				expr(0);
				}
			}

			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==NL) {
				{
				{
				setState(130);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==NL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(131);
				expr(0);
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormListContext extends ParserRuleContext {
		public List<FormContext> form() {
			return getRuleContexts(FormContext.class);
		}
		public FormContext form(int i) {
			return getRuleContext(FormContext.class,i);
		}
		public FormListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).enterFormList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).exitFormList(this);
		}
	}

	public final FormListContext formList() throws RecognitionException {
		FormListContext _localctx = new FormListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_formList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			form();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(138);
				match(T__39);
				setState(139);
				form();
				}
				}
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class FormContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(rlangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).exitForm(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_form);
		int _la;
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(ID);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(146);
					match(T__2);
					setState(147);
					expr(0);
					}
				}

				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__40);
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

	public static class SubListContext extends ParserRuleContext {
		public List<SubContext> sub() {
			return getRuleContexts(SubContext.class);
		}
		public SubContext sub(int i) {
			return getRuleContext(SubContext.class,i);
		}
		public SubListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).enterSubList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).exitSubList(this);
		}
	}

	public final SubListContext subList() throws RecognitionException {
		SubListContext _localctx = new SubListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_subList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			sub();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__39) {
				{
				{
				setState(154);
				match(T__39);
				setState(155);
				sub();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SubContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(rlangParser.ID, 0); }
		public TerminalNode STRING() { return getToken(rlangParser.STRING, 0); }
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof rlangListener ) ((rlangListener)listener).exitSub(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sub);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				match(ID);
				setState(163);
				match(T__2);
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__23) | (1L << T__28) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					setState(164);
					expr(0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(STRING);
				setState(168);
				match(T__2);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__23) | (1L << T__28) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					setState(169);
					expr(0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(172);
				match(T__41);
				setState(173);
				match(T__2);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__23) | (1L << T__28) | (1L << T__32) | (1L << T__34) | (1L << T__38) | (1L << ID) | (1L << NUMBER))) != 0)) {
					{
					setState(174);
					expr(0);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(T__40);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 24);
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u00b7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\3\5\3\31\n\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\3\4"+
		"\5\4%\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\59\n\5\3\5\3\5\3\5\5\5>\n\5\3\5\3\5\3\5\3\5\5\5D\n\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\6\5\6\u0083\n\6\3\6\3\6\7\6\u0087"+
		"\n\6\f\6\16\6\u008a\13\6\3\7\3\7\3\7\7\7\u008f\n\7\f\7\16\7\u0092\13\7"+
		"\3\b\3\b\3\b\5\b\u0097\n\b\3\b\5\b\u009a\n\b\3\t\3\t\3\t\7\t\u009f\n\t"+
		"\f\t\16\t\u00a2\13\t\3\n\3\n\3\n\3\n\5\n\u00a8\n\n\3\n\3\n\3\n\5\n\u00ad"+
		"\n\n\3\n\3\n\3\n\5\n\u00b2\n\n\3\n\5\n\u00b5\n\n\3\n\2\3\b\13\2\4\6\b"+
		"\n\f\16\20\22\2\r\4\2\3\3..\3\2\4\6\3\2\17\20\3\2\n\13\3\2\f\r\3\2\22"+
		"\23\3\2\24\27\3\2\30\31\3\2\33\34\3\2\35\36\3\2 \"\2\u00d6\2\24\3\2\2"+
		"\2\4\35\3\2\2\2\6$\3\2\2\2\bC\3\2\2\2\n\u0082\3\2\2\2\f\u008b\3\2\2\2"+
		"\16\u0099\3\2\2\2\20\u009b\3\2\2\2\22\u00b4\3\2\2\2\24\25\5\4\3\2\25\26"+
		"\7\2\2\3\26\3\3\2\2\2\27\31\5\6\4\2\30\27\3\2\2\2\30\31\3\2\2\2\31\32"+
		"\3\2\2\2\32\34\t\2\2\2\33\30\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\5\3\2\2\2\37\35\3\2\2\2 !\7\60\2\2!\"\t\3\2\2\"%\5\b\5\2#"+
		"%\5\b\5\2$ \3\2\2\2$#\3\2\2\2%\7\3\2\2\2&\'\b\5\1\2\'(\t\4\2\2(D\5\b\5"+
		"\25)*\7\32\2\2*D\5\b\5\16+,\7\37\2\2,D\5\b\5\13-.\7#\2\2./\5\n\6\2/\60"+
		"\7$\2\2\60D\3\2\2\2\61\62\7%\2\2\62\63\7&\2\2\63\64\5\b\5\2\64\65\7\'"+
		"\2\2\658\5\b\5\2\66\67\7(\2\2\679\5\b\5\28\66\3\2\2\289\3\2\2\29D\3\2"+
		"\2\2:;\7)\2\2;=\7&\2\2<>\5\f\7\2=<\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\'\2"+
		"\2@D\5\b\5\6AD\7\61\2\2BD\7\60\2\2C&\3\2\2\2C)\3\2\2\2C+\3\2\2\2C-\3\2"+
		"\2\2C\61\3\2\2\2C:\3\2\2\2CA\3\2\2\2CB\3\2\2\2D~\3\2\2\2EF\f\30\2\2FG"+
		"\t\5\2\2G}\5\b\5\31HI\f\27\2\2IJ\t\6\2\2J}\5\b\5\30KL\f\26\2\2LM\7\16"+
		"\2\2M}\5\b\5\26NO\f\24\2\2OP\7\21\2\2P}\5\b\5\25QR\f\23\2\2RS\7/\2\2S"+
		"}\5\b\5\24TU\f\22\2\2UV\t\7\2\2V}\5\b\5\23WX\f\21\2\2XY\t\4\2\2Y}\5\b"+
		"\5\22Z[\f\20\2\2[\\\t\b\2\2\\}\5\b\5\21]^\f\17\2\2^_\t\t\2\2_}\5\b\5\20"+
		"`a\f\r\2\2ab\t\n\2\2b}\5\b\5\16cd\f\f\2\2de\t\13\2\2e}\5\b\5\rfg\f\n\2"+
		"\2gh\7\37\2\2h}\5\b\5\13ij\f\t\2\2jk\t\f\2\2k}\5\b\5\nlm\f\32\2\2mn\7"+
		"\7\2\2no\5\20\t\2op\7\b\2\2pq\7\b\2\2q}\3\2\2\2rs\f\31\2\2st\7\t\2\2t"+
		"u\5\20\t\2uv\7\b\2\2v}\3\2\2\2wx\f\5\2\2xy\7&\2\2yz\5\20\t\2z{\7\'\2\2"+
		"{}\3\2\2\2|E\3\2\2\2|H\3\2\2\2|K\3\2\2\2|N\3\2\2\2|Q\3\2\2\2|T\3\2\2\2"+
		"|W\3\2\2\2|Z\3\2\2\2|]\3\2\2\2|`\3\2\2\2|c\3\2\2\2|f\3\2\2\2|i\3\2\2\2"+
		"|l\3\2\2\2|r\3\2\2\2|w\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177"+
		"\t\3\2\2\2\u0080~\3\2\2\2\u0081\u0083\5\b\5\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0088\3\2\2\2\u0084\u0085\t\2\2\2\u0085\u0087\5\b"+
		"\5\2\u0086\u0084\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\13\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u0090\5\16\b"+
		"\2\u008c\u008d\7*\2\2\u008d\u008f\5\16\b\2\u008e\u008c\3\2\2\2\u008f\u0092"+
		"\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\r\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0096\7\60\2\2\u0094\u0095\7\5\2\2\u0095\u0097\5"+
		"\b\5\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u009a\7+\2\2\u0099\u0093\3\2\2\2\u0099\u0098\3\2\2\2\u009a\17\3\2\2\2"+
		"\u009b\u00a0\5\22\n\2\u009c\u009d\7*\2\2\u009d\u009f\5\22\n\2\u009e\u009c"+
		"\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\21\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00b5\5\b\5\2\u00a4\u00a5\7\60\2"+
		"\2\u00a5\u00a7\7\5\2\2\u00a6\u00a8\5\b\5\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00b5\3\2\2\2\u00a9\u00aa\7-\2\2\u00aa\u00ac\7\5\2\2\u00ab"+
		"\u00ad\5\b\5\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b5\3\2"+
		"\2\2\u00ae\u00af\7,\2\2\u00af\u00b1\7\5\2\2\u00b0\u00b2\5\b\5\2\u00b1"+
		"\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5\7+"+
		"\2\2\u00b4\u00a3\3\2\2\2\u00b4\u00a4\3\2\2\2\u00b4\u00a9\3\2\2\2\u00b4"+
		"\u00ae\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\23\3\2\2\2\24\30\35$8=C|~\u0082"+
		"\u0088\u0090\u0096\u0099\u00a0\u00a7\u00ac\u00b1\u00b4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}