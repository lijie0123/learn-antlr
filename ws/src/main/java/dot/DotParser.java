// Generated from Dot.g4 by ANTLR 4.9.2
package dot;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DotParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		STRICT=10, NODE=11, EDGE=12, SUBGRAPH=13, GRAPH=14, DIGRAPH=15, ID=16, 
		STRING=17, NUMBER=18, HTMLSTRING=19, ONELINE_COMMENT=20, MULTILINE_COMMENT=21, 
		COMMA=22, WS=23;
	public static final int
		RULE_graph = 0, RULE_stmt_list = 1, RULE_stmt = 2, RULE_attr_stmt = 3, 
		RULE_attr_list = 4, RULE_a_list = 5, RULE_node_stmt = 6, RULE_node_id = 7, 
		RULE_edge_stmt = 8, RULE_edgeRHS = 9, RULE_edgeop = 10, RULE_subgraph = 11, 
		RULE_port = 12, RULE_id = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"graph", "stmt_list", "stmt", "attr_stmt", "attr_list", "a_list", "node_stmt", 
			"node_id", "edge_stmt", "edgeRHS", "edgeop", "subgraph", "port", "id"
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

	@Override
	public String getGrammarFileName() { return "Dot.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DotParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class GraphContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(DotParser.EOF, 0); }
		public TerminalNode GRAPH() { return getToken(DotParser.GRAPH, 0); }
		public TerminalNode DIGRAPH() { return getToken(DotParser.DIGRAPH, 0); }
		public TerminalNode STRICT() { return getToken(DotParser.STRICT, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitGraph(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRICT) {
				{
				setState(28);
				match(STRICT);
				}
			}

			setState(31);
			_la = _input.LA(1);
			if ( !(_la==GRAPH || _la==DIGRAPH) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << HTMLSTRING))) != 0)) {
				{
				setState(32);
				id();
				}
			}

			setState(35);
			match(T__0);
			setState(36);
			stmt_list();
			setState(37);
			match(T__1);
			setState(38);
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

	public static class Stmt_listContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterStmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitStmt_list(this);
		}
	}

	public final Stmt_listContext stmt_list() throws RecognitionException {
		Stmt_listContext _localctx = new Stmt_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NODE) | (1L << EDGE) | (1L << SUBGRAPH) | (1L << GRAPH) | (1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << HTMLSTRING))) != 0)) {
				{
				{
				setState(40);
				stmt();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(41);
					match(T__2);
					}
				}

				}
				}
				setState(48);
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
		public Node_stmtContext node_stmt() {
			return getRuleContext(Node_stmtContext.class,0);
		}
		public Edge_stmtContext edge_stmt() {
			return getRuleContext(Edge_stmtContext.class,0);
		}
		public Attr_stmtContext attr_stmt() {
			return getRuleContext(Attr_stmtContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				node_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				edge_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				attr_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				id();
				setState(53);
				match(T__3);
				setState(54);
				id();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(56);
				subgraph();
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

	public static class Attr_stmtContext extends ParserRuleContext {
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public TerminalNode GRAPH() { return getToken(DotParser.GRAPH, 0); }
		public TerminalNode NODE() { return getToken(DotParser.NODE, 0); }
		public TerminalNode EDGE() { return getToken(DotParser.EDGE, 0); }
		public Attr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterAttr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitAttr_stmt(this);
		}
	}

	public final Attr_stmtContext attr_stmt() throws RecognitionException {
		Attr_stmtContext _localctx = new Attr_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_attr_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NODE) | (1L << EDGE) | (1L << GRAPH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(60);
			attr_list();
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

	public static class Attr_listContext extends ParserRuleContext {
		public List<A_listContext> a_list() {
			return getRuleContexts(A_listContext.class);
		}
		public A_listContext a_list(int i) {
			return getRuleContext(A_listContext.class,i);
		}
		public Attr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterAttr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitAttr_list(this);
		}
	}

	public final Attr_listContext attr_list() throws RecognitionException {
		Attr_listContext _localctx = new Attr_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				match(T__4);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << HTMLSTRING))) != 0)) {
					{
					setState(63);
					a_list();
					}
				}

				setState(66);
				match(T__5);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__4 );
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

	public static class A_listContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(DotParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(DotParser.COMMA, i);
		}
		public A_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterA_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitA_list(this);
		}
	}

	public final A_listContext a_list() throws RecognitionException {
		A_listContext _localctx = new A_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_a_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				id();
				setState(72);
				match(T__3);
				setState(73);
				id();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2 || _la==COMMA) {
					{
					setState(74);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==COMMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << HTMLSTRING))) != 0) );
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

	public static class Node_stmtContext extends ParserRuleContext {
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Node_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterNode_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitNode_stmt(this);
		}
	}

	public final Node_stmtContext node_stmt() throws RecognitionException {
		Node_stmtContext _localctx = new Node_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_node_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			node_id();
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(82);
				attr_list();
				}
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

	public static class Node_idContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public Node_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterNode_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitNode_id(this);
		}
	}

	public final Node_idContext node_id() throws RecognitionException {
		Node_idContext _localctx = new Node_idContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_node_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			id();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(86);
				port();
				}
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

	public static class Edge_stmtContext extends ParserRuleContext {
		public EdgeRHSContext edgeRHS() {
			return getRuleContext(EdgeRHSContext.class,0);
		}
		public Node_idContext node_id() {
			return getRuleContext(Node_idContext.class,0);
		}
		public SubgraphContext subgraph() {
			return getRuleContext(SubgraphContext.class,0);
		}
		public Attr_listContext attr_list() {
			return getRuleContext(Attr_listContext.class,0);
		}
		public Edge_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterEdge_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitEdge_stmt(this);
		}
	}

	public final Edge_stmtContext edge_stmt() throws RecognitionException {
		Edge_stmtContext _localctx = new Edge_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_edge_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case STRING:
			case NUMBER:
			case HTMLSTRING:
				{
				setState(89);
				node_id();
				}
				break;
			case T__0:
			case SUBGRAPH:
				{
				setState(90);
				subgraph();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			edgeRHS();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(94);
				attr_list();
				}
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

	public static class EdgeRHSContext extends ParserRuleContext {
		public List<EdgeopContext> edgeop() {
			return getRuleContexts(EdgeopContext.class);
		}
		public EdgeopContext edgeop(int i) {
			return getRuleContext(EdgeopContext.class,i);
		}
		public List<Node_idContext> node_id() {
			return getRuleContexts(Node_idContext.class);
		}
		public Node_idContext node_id(int i) {
			return getRuleContext(Node_idContext.class,i);
		}
		public List<SubgraphContext> subgraph() {
			return getRuleContexts(SubgraphContext.class);
		}
		public SubgraphContext subgraph(int i) {
			return getRuleContext(SubgraphContext.class,i);
		}
		public EdgeRHSContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeRHS; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterEdgeRHS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitEdgeRHS(this);
		}
	}

	public final EdgeRHSContext edgeRHS() throws RecognitionException {
		EdgeRHSContext _localctx = new EdgeRHSContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_edgeRHS);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				edgeop();
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case STRING:
				case NUMBER:
				case HTMLSTRING:
					{
					setState(98);
					node_id();
					}
					break;
				case T__0:
				case SUBGRAPH:
					{
					setState(99);
					subgraph();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 || _la==T__7 );
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

	public static class EdgeopContext extends ParserRuleContext {
		public EdgeopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterEdgeop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitEdgeop(this);
		}
	}

	public final EdgeopContext edgeop() throws RecognitionException {
		EdgeopContext _localctx = new EdgeopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_edgeop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class SubgraphContext extends ParserRuleContext {
		public Stmt_listContext stmt_list() {
			return getRuleContext(Stmt_listContext.class,0);
		}
		public TerminalNode SUBGRAPH() { return getToken(DotParser.SUBGRAPH, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public SubgraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subgraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterSubgraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitSubgraph(this);
		}
	}

	public final SubgraphContext subgraph() throws RecognitionException {
		SubgraphContext _localctx = new SubgraphContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_subgraph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SUBGRAPH) {
				{
				setState(108);
				match(SUBGRAPH);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << HTMLSTRING))) != 0)) {
					{
					setState(109);
					id();
					}
				}

				}
			}

			setState(114);
			match(T__0);
			setState(115);
			stmt_list();
			setState(116);
			match(T__1);
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

	public static class PortContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitPort(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__8);
			setState(119);
			id();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(120);
				match(T__8);
				setState(121);
				id();
				}
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(DotParser.ID, 0); }
		public TerminalNode STRING() { return getToken(DotParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DotParser.NUMBER, 0); }
		public TerminalNode HTMLSTRING() { return getToken(DotParser.HTMLSTRING, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DotListener ) ((DotListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << STRING) | (1L << NUMBER) | (1L << HTMLSTRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u0081\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\5\2 \n\2\3\2\3\2\5\2$\n"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\5\3-\n\3\7\3/\n\3\f\3\16\3\62\13\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\6\3\6\5\6C\n\6\3\6"+
		"\6\6F\n\6\r\6\16\6G\3\7\3\7\3\7\3\7\5\7N\n\7\6\7P\n\7\r\7\16\7Q\3\b\3"+
		"\b\5\bV\n\b\3\t\3\t\5\tZ\n\t\3\n\3\n\5\n^\n\n\3\n\3\n\5\nb\n\n\3\13\3"+
		"\13\3\13\5\13g\n\13\6\13i\n\13\r\13\16\13j\3\f\3\f\3\r\3\r\5\rq\n\r\5"+
		"\rs\n\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16}\n\16\3\17\3\17\3\17"+
		"\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\7\3\2\20\21\4\2\r\16\20"+
		"\20\4\2\5\5\30\30\3\2\t\n\3\2\22\25\2\u0087\2\37\3\2\2\2\4\60\3\2\2\2"+
		"\6;\3\2\2\2\b=\3\2\2\2\nE\3\2\2\2\fO\3\2\2\2\16S\3\2\2\2\20W\3\2\2\2\22"+
		"]\3\2\2\2\24h\3\2\2\2\26l\3\2\2\2\30r\3\2\2\2\32x\3\2\2\2\34~\3\2\2\2"+
		"\36 \7\f\2\2\37\36\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!#\t\2\2\2\"$\5\34\17"+
		"\2#\"\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\3\2\2&\'\5\4\3\2\'(\7\4\2\2()\7"+
		"\2\2\3)\3\3\2\2\2*,\5\6\4\2+-\7\5\2\2,+\3\2\2\2,-\3\2\2\2-/\3\2\2\2.*"+
		"\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60\3\2"+
		"\2\2\63<\5\16\b\2\64<\5\22\n\2\65<\5\b\5\2\66\67\5\34\17\2\678\7\6\2\2"+
		"89\5\34\17\29<\3\2\2\2:<\5\30\r\2;\63\3\2\2\2;\64\3\2\2\2;\65\3\2\2\2"+
		";\66\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=>\t\3\2\2>?\5\n\6\2?\t\3\2\2\2@B\7\7"+
		"\2\2AC\5\f\7\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\7\b\2\2E@\3\2\2\2FG\3\2"+
		"\2\2GE\3\2\2\2GH\3\2\2\2H\13\3\2\2\2IJ\5\34\17\2JK\7\6\2\2KM\5\34\17\2"+
		"LN\t\4\2\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OI\3\2\2\2PQ\3\2\2\2QO\3\2\2\2"+
		"QR\3\2\2\2R\r\3\2\2\2SU\5\20\t\2TV\5\n\6\2UT\3\2\2\2UV\3\2\2\2V\17\3\2"+
		"\2\2WY\5\34\17\2XZ\5\32\16\2YX\3\2\2\2YZ\3\2\2\2Z\21\3\2\2\2[^\5\20\t"+
		"\2\\^\5\30\r\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_a\5\24\13\2`b\5\n\6\2a`"+
		"\3\2\2\2ab\3\2\2\2b\23\3\2\2\2cf\5\26\f\2dg\5\20\t\2eg\5\30\r\2fd\3\2"+
		"\2\2fe\3\2\2\2gi\3\2\2\2hc\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\25\3"+
		"\2\2\2lm\t\5\2\2m\27\3\2\2\2np\7\17\2\2oq\5\34\17\2po\3\2\2\2pq\3\2\2"+
		"\2qs\3\2\2\2rn\3\2\2\2rs\3\2\2\2st\3\2\2\2tu\7\3\2\2uv\5\4\3\2vw\7\4\2"+
		"\2w\31\3\2\2\2xy\7\13\2\2y|\5\34\17\2z{\7\13\2\2{}\5\34\17\2|z\3\2\2\2"+
		"|}\3\2\2\2}\33\3\2\2\2~\177\t\6\2\2\177\35\3\2\2\2\24\37#,\60;BGMQUY]"+
		"afjpr|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}