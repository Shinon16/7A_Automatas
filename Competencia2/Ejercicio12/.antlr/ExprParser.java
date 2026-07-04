// Generated from d:/7A_Automatas/Competencia2/Ejercicio12/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, INT=5, STRING=6, IF=7, NUM=8, CADENA=9, 
		ID=10, IGUAL=11, MAS=12, MAYOR_IGUAL=13, PUNTO=14, PUNTO_COMA=15, PAR_IZQ=16, 
		PAR_DER=17, LLAVE_IZQ=18, LLAVE_DER=19, COR_IZQ=20, COR_DER=21, WS=22;
	public static final int
		RULE_root = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", "'void'", "'int'", "'String'", 
			"'if'", null, null, null, "'='", "'+'", "'>='", "'.'", "';'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "INT", "STRING", "IF", "NUM", 
			"CADENA", "ID", "IGUAL", "MAS", "MAYOR_IGUAL", "PUNTO", "PUNTO_COMA", 
			"PAR_IZQ", "PAR_DER", "LLAVE_IZQ", "LLAVE_DER", "COR_IZQ", "COR_DER", 
			"WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expr();
			setState(5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> PUBLIC() { return getTokens(ExprParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(ExprParser.PUBLIC, i);
		}
		public List<TerminalNode> CLASS() { return getTokens(ExprParser.CLASS); }
		public TerminalNode CLASS(int i) {
			return getToken(ExprParser.CLASS, i);
		}
		public List<TerminalNode> STATIC() { return getTokens(ExprParser.STATIC); }
		public TerminalNode STATIC(int i) {
			return getToken(ExprParser.STATIC, i);
		}
		public List<TerminalNode> VOID() { return getTokens(ExprParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(ExprParser.VOID, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExprParser.INT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ExprParser.STRING, i);
		}
		public List<TerminalNode> IF() { return getTokens(ExprParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(ExprParser.IF, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(ExprParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(ExprParser.CADENA, i);
		}
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(ExprParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(ExprParser.IGUAL, i);
		}
		public List<TerminalNode> MAS() { return getTokens(ExprParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(ExprParser.MAS, i);
		}
		public List<TerminalNode> MAYOR_IGUAL() { return getTokens(ExprParser.MAYOR_IGUAL); }
		public TerminalNode MAYOR_IGUAL(int i) {
			return getToken(ExprParser.MAYOR_IGUAL, i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(ExprParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(ExprParser.PUNTO, i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(ExprParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(ExprParser.PUNTO_COMA, i);
		}
		public List<TerminalNode> PAR_IZQ() { return getTokens(ExprParser.PAR_IZQ); }
		public TerminalNode PAR_IZQ(int i) {
			return getToken(ExprParser.PAR_IZQ, i);
		}
		public List<TerminalNode> PAR_DER() { return getTokens(ExprParser.PAR_DER); }
		public TerminalNode PAR_DER(int i) {
			return getToken(ExprParser.PAR_DER, i);
		}
		public List<TerminalNode> LLAVE_IZQ() { return getTokens(ExprParser.LLAVE_IZQ); }
		public TerminalNode LLAVE_IZQ(int i) {
			return getToken(ExprParser.LLAVE_IZQ, i);
		}
		public List<TerminalNode> LLAVE_DER() { return getTokens(ExprParser.LLAVE_DER); }
		public TerminalNode LLAVE_DER(int i) {
			return getToken(ExprParser.LLAVE_DER, i);
		}
		public List<TerminalNode> COR_IZQ() { return getTokens(ExprParser.COR_IZQ); }
		public TerminalNode COR_IZQ(int i) {
			return getToken(ExprParser.COR_IZQ, i);
		}
		public List<TerminalNode> COR_DER() { return getTokens(ExprParser.COR_DER); }
		public TerminalNode COR_DER(int i) {
			return getToken(ExprParser.COR_DER, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4194302L) != 0)) {
				{
				{
				setState(7);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4194302L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(12);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u000e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\t\b\u0001"+
		"\n\u0001\f\u0001\f\t\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000"+
		"\u0001\u0001\u0000\u0001\u0015\f\u0000\u0004\u0001\u0000\u0000\u0000\u0002"+
		"\n\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000\u0005\u0006"+
		"\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000\u0000\u0007\t\u0007"+
		"\u0000\u0000\u0000\b\u0007\u0001\u0000\u0000\u0000\t\f\u0001\u0000\u0000"+
		"\u0000\n\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000\u0000\u000b"+
		"\u0003\u0001\u0000\u0000\u0000\f\n\u0001\u0000\u0000\u0000\u0001\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}