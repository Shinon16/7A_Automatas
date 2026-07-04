// Generated from d:/7A_Automatas/Competencia2/Ejercicio15/Expr.g4 by ANTLR 4.13.1
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
		NMAP=1, SS=2, SUDO=3, TCPDUMP=4, CURL=5, DIG=6, JOURNALCTL=7, GREP=8, 
		UFW=9, DENY=10, FROM=11, MX=12, TODAY=13, OP=14, IP=15, NUM=16, CADENA=17, 
		RUTA=18, ID=19, ASIG=20, COMA=21, MAS=22, MAYOR_IGUAL=23, PUNTO=24, PUNTO_COMA=25, 
		PAR_IZQ=26, PAR_DER=27, LLAVE_IZQ=28, LLAVE_DER=29, COR_IZQ=30, COR_DER=31, 
		ASTERISCO=32, WS=33;
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
			null, "'nmap'", "'ss'", "'sudo'", "'tcpdump'", "'curl'", "'dig'", "'journalctl'", 
			"'grep'", "'ufw'", "'deny'", "'from'", "'MX'", "'today'", null, null, 
			null, null, null, null, "'='", "','", "'+'", "'>='", "'.'", "';'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NMAP", "SS", "SUDO", "TCPDUMP", "CURL", "DIG", "JOURNALCTL", "GREP", 
			"UFW", "DENY", "FROM", "MX", "TODAY", "OP", "IP", "NUM", "CADENA", "RUTA", 
			"ID", "ASIG", "COMA", "MAS", "MAYOR_IGUAL", "PUNTO", "PUNTO_COMA", "PAR_IZQ", 
			"PAR_DER", "LLAVE_IZQ", "LLAVE_DER", "COR_IZQ", "COR_DER", "ASTERISCO", 
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
		public List<TerminalNode> NMAP() { return getTokens(ExprParser.NMAP); }
		public TerminalNode NMAP(int i) {
			return getToken(ExprParser.NMAP, i);
		}
		public List<TerminalNode> SS() { return getTokens(ExprParser.SS); }
		public TerminalNode SS(int i) {
			return getToken(ExprParser.SS, i);
		}
		public List<TerminalNode> SUDO() { return getTokens(ExprParser.SUDO); }
		public TerminalNode SUDO(int i) {
			return getToken(ExprParser.SUDO, i);
		}
		public List<TerminalNode> TCPDUMP() { return getTokens(ExprParser.TCPDUMP); }
		public TerminalNode TCPDUMP(int i) {
			return getToken(ExprParser.TCPDUMP, i);
		}
		public List<TerminalNode> CURL() { return getTokens(ExprParser.CURL); }
		public TerminalNode CURL(int i) {
			return getToken(ExprParser.CURL, i);
		}
		public List<TerminalNode> DIG() { return getTokens(ExprParser.DIG); }
		public TerminalNode DIG(int i) {
			return getToken(ExprParser.DIG, i);
		}
		public List<TerminalNode> JOURNALCTL() { return getTokens(ExprParser.JOURNALCTL); }
		public TerminalNode JOURNALCTL(int i) {
			return getToken(ExprParser.JOURNALCTL, i);
		}
		public List<TerminalNode> GREP() { return getTokens(ExprParser.GREP); }
		public TerminalNode GREP(int i) {
			return getToken(ExprParser.GREP, i);
		}
		public List<TerminalNode> UFW() { return getTokens(ExprParser.UFW); }
		public TerminalNode UFW(int i) {
			return getToken(ExprParser.UFW, i);
		}
		public List<TerminalNode> DENY() { return getTokens(ExprParser.DENY); }
		public TerminalNode DENY(int i) {
			return getToken(ExprParser.DENY, i);
		}
		public List<TerminalNode> FROM() { return getTokens(ExprParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(ExprParser.FROM, i);
		}
		public List<TerminalNode> MX() { return getTokens(ExprParser.MX); }
		public TerminalNode MX(int i) {
			return getToken(ExprParser.MX, i);
		}
		public List<TerminalNode> TODAY() { return getTokens(ExprParser.TODAY); }
		public TerminalNode TODAY(int i) {
			return getToken(ExprParser.TODAY, i);
		}
		public List<TerminalNode> OP() { return getTokens(ExprParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(ExprParser.OP, i);
		}
		public List<TerminalNode> IP() { return getTokens(ExprParser.IP); }
		public TerminalNode IP(int i) {
			return getToken(ExprParser.IP, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(ExprParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(ExprParser.CADENA, i);
		}
		public List<TerminalNode> RUTA() { return getTokens(ExprParser.RUTA); }
		public TerminalNode RUTA(int i) {
			return getToken(ExprParser.RUTA, i);
		}
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1048574L) != 0)) {
				{
				{
				setState(7);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1048574L) != 0)) ) {
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
		"\u0004\u0001!\u000e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u0001\t\b\u0001\n\u0001"+
		"\f\u0001\f\t\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0001"+
		"\u0001\u0000\u0001\u0013\f\u0000\u0004\u0001\u0000\u0000\u0000\u0002\n"+
		"\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000\u0005\u0006"+
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