// Generated from d:/7A_Automatas/Competencia2/Ejercicio13_SL/Expr.g4 by ANTLR 4.13.1
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
		CREATE=1, TABLE=2, SERIAL=3, PRIMARY=4, KEY=5, VARCHAR=6, NOT=7, NULL=8, 
		INTEGER=9, DATE=10, INSERT=11, INTO=12, VALUES=13, SELECT=14, FROM=15, 
		INNER=16, JOIN=17, ON=18, WHERE=19, NUM=20, CADENA=21, ID=22, ASIG=23, 
		COMA=24, MAS=25, MAYOR_IGUAL=26, PUNTO=27, PUNTO_COMA=28, PAR_IZQ=29, 
		PAR_DER=30, LLAVE_IZQ=31, LLAVE_DER=32, COR_IZQ=33, COR_DER=34, ASTERISCO=35, 
		WS=36;
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
			null, "'CREATE'", "'TABLE'", "'SERIAL'", "'PRIMARY'", "'KEY'", "'VARCHAR'", 
			"'NOT'", "'NULL'", "'INTEGER'", "'DATE'", "'INSERT'", "'INTO'", "'VALUES'", 
			"'SELECT'", "'FROM'", "'INNER'", "'JOIN'", "'ON'", "'WHERE'", null, null, 
			null, "'='", "','", "'+'", "'>='", "'.'", "';'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "TABLE", "SERIAL", "PRIMARY", "KEY", "VARCHAR", "NOT", 
			"NULL", "INTEGER", "DATE", "INSERT", "INTO", "VALUES", "SELECT", "FROM", 
			"INNER", "JOIN", "ON", "WHERE", "NUM", "CADENA", "ID", "ASIG", "COMA", 
			"MAS", "MAYOR_IGUAL", "PUNTO", "PUNTO_COMA", "PAR_IZQ", "PAR_DER", "LLAVE_IZQ", 
			"LLAVE_DER", "COR_IZQ", "COR_DER", "ASTERISCO", "WS"
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
		public List<TerminalNode> CREATE() { return getTokens(ExprParser.CREATE); }
		public TerminalNode CREATE(int i) {
			return getToken(ExprParser.CREATE, i);
		}
		public List<TerminalNode> TABLE() { return getTokens(ExprParser.TABLE); }
		public TerminalNode TABLE(int i) {
			return getToken(ExprParser.TABLE, i);
		}
		public List<TerminalNode> SERIAL() { return getTokens(ExprParser.SERIAL); }
		public TerminalNode SERIAL(int i) {
			return getToken(ExprParser.SERIAL, i);
		}
		public List<TerminalNode> PRIMARY() { return getTokens(ExprParser.PRIMARY); }
		public TerminalNode PRIMARY(int i) {
			return getToken(ExprParser.PRIMARY, i);
		}
		public List<TerminalNode> KEY() { return getTokens(ExprParser.KEY); }
		public TerminalNode KEY(int i) {
			return getToken(ExprParser.KEY, i);
		}
		public List<TerminalNode> VARCHAR() { return getTokens(ExprParser.VARCHAR); }
		public TerminalNode VARCHAR(int i) {
			return getToken(ExprParser.VARCHAR, i);
		}
		public List<TerminalNode> NOT() { return getTokens(ExprParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(ExprParser.NOT, i);
		}
		public List<TerminalNode> NULL() { return getTokens(ExprParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(ExprParser.NULL, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(ExprParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(ExprParser.INTEGER, i);
		}
		public List<TerminalNode> DATE() { return getTokens(ExprParser.DATE); }
		public TerminalNode DATE(int i) {
			return getToken(ExprParser.DATE, i);
		}
		public List<TerminalNode> INSERT() { return getTokens(ExprParser.INSERT); }
		public TerminalNode INSERT(int i) {
			return getToken(ExprParser.INSERT, i);
		}
		public List<TerminalNode> INTO() { return getTokens(ExprParser.INTO); }
		public TerminalNode INTO(int i) {
			return getToken(ExprParser.INTO, i);
		}
		public List<TerminalNode> VALUES() { return getTokens(ExprParser.VALUES); }
		public TerminalNode VALUES(int i) {
			return getToken(ExprParser.VALUES, i);
		}
		public List<TerminalNode> SELECT() { return getTokens(ExprParser.SELECT); }
		public TerminalNode SELECT(int i) {
			return getToken(ExprParser.SELECT, i);
		}
		public List<TerminalNode> FROM() { return getTokens(ExprParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(ExprParser.FROM, i);
		}
		public List<TerminalNode> INNER() { return getTokens(ExprParser.INNER); }
		public TerminalNode INNER(int i) {
			return getToken(ExprParser.INNER, i);
		}
		public List<TerminalNode> JOIN() { return getTokens(ExprParser.JOIN); }
		public TerminalNode JOIN(int i) {
			return getToken(ExprParser.JOIN, i);
		}
		public List<TerminalNode> ON() { return getTokens(ExprParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(ExprParser.ON, i);
		}
		public List<TerminalNode> WHERE() { return getTokens(ExprParser.WHERE); }
		public TerminalNode WHERE(int i) {
			return getToken(ExprParser.WHERE, i);
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
		public List<TerminalNode> ASIG() { return getTokens(ExprParser.ASIG); }
		public TerminalNode ASIG(int i) {
			return getToken(ExprParser.ASIG, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
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
		public List<TerminalNode> ASTERISCO() { return getTokens(ExprParser.ASTERISCO); }
		public TerminalNode ASTERISCO(int i) {
			return getToken(ExprParser.ASTERISCO, i);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36406558718L) != 0)) {
				{
				{
				setState(7);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 36406558718L) != 0)) ) {
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
		"\u0004\u0001$\u000e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\t\b\u0001\n\u0001"+
		"\f\u0001\f\t\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0001"+
		"\u0003\u0000\u0001\u0018\u001b\u001e##\f\u0000\u0004\u0001\u0000\u0000"+
		"\u0000\u0002\n\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000"+
		"\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000\u0000"+
		"\u0007\t\u0007\u0000\u0000\u0000\b\u0007\u0001\u0000\u0000\u0000\t\f\u0001"+
		"\u0000\u0000\u0000\n\b\u0001\u0000\u0000\u0000\n\u000b\u0001\u0000\u0000"+
		"\u0000\u000b\u0003\u0001\u0000\u0000\u0000\f\n\u0001\u0000\u0000\u0000"+
		"\u0001\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}