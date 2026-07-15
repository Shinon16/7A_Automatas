// Generated from d:/7A_Automatas/Proyecto/Expr.g4 by ANTLR 4.13.1
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
		SELECT=1, FROM=2, WHERE=3, INSERT=4, INTO=5, VALUES=6, UPDATE=7, SET=8, 
		DELETE=9, CREATE=10, TABLE=11, DATABASE=12, USE=13, GO=14, CONSTRAINT=15, 
		IDENTITY=16, ALTER=17, ADD=18, DROP=19, TOP=20, LIKE=21, IN=22, BETWEEN=23, 
		IS=24, PRIMARY=25, KEY=26, FOREIGN=27, REFERENCES=28, NOT=29, NULL=30, 
		UNIQUE=31, CHECK=32, DEFAULT=33, JOIN=34, INNER=35, LEFT=36, RIGHT=37, 
		ON=38, FOR=39, DISTINCT=40, GROUP=41, BY=42, ORDER=43, ASC=44, DESC=45, 
		AND=46, OR=47, COUNT=48, SUM=49, AVG=50, MIN=51, MAX=52, BEGIN=53, TRANSACTION=54, 
		COMMIT=55, ROLLBACK=56, PROCEDURE=57, TRIGGER=58, EXEC=59, AS=60, INT=61, 
		BIGINT=62, SMALLINT=63, TINYINT=64, BIT=65, DATE=66, DATETIME=67, DECIMAL=68, 
		VARCHAR=69, CHAR=70, TRUE=71, FALSE=72, EQ=73, NEQ=74, LT=75, GT=76, LE=77, 
		GE=78, LPAREN=79, RPAREN=80, COMA=81, PT_COMA=82, STAR=83, PUNTO=84, IDT=85, 
		NUM=86, CAD=87, LINE_COMMENT=88, BLOCK_COMMENT=89, WS=90;
	public static final int
		RULE_root = 0, RULE_statement = 1, RULE_selectStatement = 2, RULE_selectList = 3, 
		RULE_tableReference = 4, RULE_alias = 5, RULE_insertStatement = 6, RULE_updateStatement = 7, 
		RULE_assignmentList = 8, RULE_assignment = 9, RULE_deleteStatement = 10, 
		RULE_createTableStatement = 11, RULE_tableElement = 12, RULE_columnDefinition = 13, 
		RULE_identityClause = 14, RULE_nullClause = 15, RULE_dataType = 16, RULE_constraint = 17, 
		RULE_columnConstraint = 18, RULE_tableConstraint = 19, RULE_whereClause = 20, 
		RULE_joinClause = 21, RULE_groupByClause = 22, RULE_orderByClause = 23, 
		RULE_condition = 24, RULE_comparator = 25, RULE_expression = 26, RULE_aggregateFunction = 27, 
		RULE_columnList = 28, RULE_valueList = 29, RULE_value = 30, RULE_createProcedureStatement = 31, 
		RULE_createTriggerStatement = 32, RULE_beginTransactionStatement = 33, 
		RULE_commitStatement = 34, RULE_rollbackStatement = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "statement", "selectStatement", "selectList", "tableReference", 
			"alias", "insertStatement", "updateStatement", "assignmentList", "assignment", 
			"deleteStatement", "createTableStatement", "tableElement", "columnDefinition", 
			"identityClause", "nullClause", "dataType", "constraint", "columnConstraint", 
			"tableConstraint", "whereClause", "joinClause", "groupByClause", "orderByClause", 
			"condition", "comparator", "expression", "aggregateFunction", "columnList", 
			"valueList", "value", "createProcedureStatement", "createTriggerStatement", 
			"beginTransactionStatement", "commitStatement", "rollbackStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'FROM'", "'WHERE'", "'INSERT'", "'INTO'", "'VALUES'", 
			"'UPDATE'", "'SET'", "'DELETE'", "'CREATE'", "'TABLE'", "'DATABASE'", 
			"'USE'", "'GO'", "'CONSTRAINT'", "'IDENTITY'", "'ALTER'", "'ADD'", "'DROP'", 
			"'TOP'", "'LIKE'", "'IN'", "'BETWEEN'", "'IS'", "'PRIMARY'", "'KEY'", 
			"'FOREIGN'", "'REFERENCES'", "'NOT'", "'NULL'", "'UNIQUE'", "'CHECK'", 
			"'DEFAULT'", "'JOIN'", "'INNER'", "'LEFT'", "'RIGHT'", "'ON'", "'FOR'", 
			"'DISTINCT'", "'GROUP'", "'BY'", "'ORDER'", "'ASC'", "'DESC'", "'AND'", 
			"'OR'", "'COUNT'", "'SUM'", "'AVG'", "'MIN'", "'MAX'", "'BEGIN'", "'TRANSACTION'", 
			"'COMMIT'", "'ROLLBACK'", "'PROCEDURE'", "'TRIGGER'", "'EXEC'", "'AS'", 
			"'INT'", "'BIGINT'", "'SMALLINT'", "'TINYINT'", "'BIT'", "'DATE'", "'DATETIME'", 
			"'DECIMAL'", "'VARCHAR'", "'CHAR'", "'TRUE'", "'FALSE'", "'='", "'<>'", 
			"'<'", "'>'", "'<='", "'>='", "'('", "')'", "','", "';'", "'*'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "INSERT", "INTO", "VALUES", "UPDATE", 
			"SET", "DELETE", "CREATE", "TABLE", "DATABASE", "USE", "GO", "CONSTRAINT", 
			"IDENTITY", "ALTER", "ADD", "DROP", "TOP", "LIKE", "IN", "BETWEEN", "IS", 
			"PRIMARY", "KEY", "FOREIGN", "REFERENCES", "NOT", "NULL", "UNIQUE", "CHECK", 
			"DEFAULT", "JOIN", "INNER", "LEFT", "RIGHT", "ON", "FOR", "DISTINCT", 
			"GROUP", "BY", "ORDER", "ASC", "DESC", "AND", "OR", "COUNT", "SUM", "AVG", 
			"MIN", "MAX", "BEGIN", "TRANSACTION", "COMMIT", "ROLLBACK", "PROCEDURE", 
			"TRIGGER", "EXEC", "AS", "INT", "BIGINT", "SMALLINT", "TINYINT", "BIT", 
			"DATE", "DATETIME", "DECIMAL", "VARCHAR", "CHAR", "TRUE", "FALSE", "EQ", 
			"NEQ", "LT", "GT", "LE", "GE", "LPAREN", "RPAREN", "COMA", "PT_COMA", 
			"STAR", "PUNTO", "IDT", "NUM", "CAD", "LINE_COMMENT", "BLOCK_COMMENT", 
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
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 117093590311634578L) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
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
	public static class StatementContext extends ParserRuleContext {
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode PT_COMA() { return getToken(ExprParser.PT_COMA, 0); }
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public UpdateStatementContext updateStatement() {
			return getRuleContext(UpdateStatementContext.class,0);
		}
		public DeleteStatementContext deleteStatement() {
			return getRuleContext(DeleteStatementContext.class,0);
		}
		public CreateTableStatementContext createTableStatement() {
			return getRuleContext(CreateTableStatementContext.class,0);
		}
		public CreateProcedureStatementContext createProcedureStatement() {
			return getRuleContext(CreateProcedureStatementContext.class,0);
		}
		public CreateTriggerStatementContext createTriggerStatement() {
			return getRuleContext(CreateTriggerStatementContext.class,0);
		}
		public BeginTransactionStatementContext beginTransactionStatement() {
			return getRuleContext(BeginTransactionStatementContext.class,0);
		}
		public CommitStatementContext commitStatement() {
			return getRuleContext(CommitStatementContext.class,0);
		}
		public RollbackStatementContext rollbackStatement() {
			return getRuleContext(RollbackStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				selectStatement();
				setState(82);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(81);
					match(PT_COMA);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				insertStatement();
				setState(86);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(85);
					match(PT_COMA);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				updateStatement();
				setState(90);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(89);
					match(PT_COMA);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				deleteStatement();
				setState(94);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(93);
					match(PT_COMA);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(96);
				createTableStatement();
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(97);
					match(PT_COMA);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				createProcedureStatement();
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(101);
					match(PT_COMA);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				createTriggerStatement();
				setState(106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(105);
					match(PT_COMA);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				beginTransactionStatement();
				setState(110);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(109);
					match(PT_COMA);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(112);
				commitStatement();
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(113);
					match(PT_COMA);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(116);
				rollbackStatement();
				setState(118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(117);
					match(PT_COMA);
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(ExprParser.SELECT, 0); }
		public SelectListContext selectList() {
			return getRuleContext(SelectListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode DISTINCT() { return getToken(ExprParser.DISTINCT, 0); }
		public List<JoinClauseContext> joinClause() {
			return getRuleContexts(JoinClauseContext.class);
		}
		public JoinClauseContext joinClause(int i) {
			return getRuleContext(JoinClauseContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(SELECT);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(123);
				match(DISTINCT);
				}
			}

			setState(126);
			selectList();
			setState(127);
			match(FROM);
			setState(128);
			tableReference();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) {
				{
				{
				setState(129);
				joinClause();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(135);
				whereClause();
				}
			}

			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(138);
				groupByClause();
				}
			}

			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(141);
				orderByClause();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectListContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(ExprParser.STAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public SelectListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectList; }
	}

	public final SelectListContext selectList() throws RecognitionException {
		SelectListContext _localctx = new SelectListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectList);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(STAR);
				}
				break;
			case NULL:
			case COUNT:
			case SUM:
			case AVG:
			case MIN:
			case MAX:
			case TRUE:
			case FALSE:
			case IDT:
			case NUM:
			case CAD:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				expression();
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(146);
					match(COMA);
					setState(147);
					expression();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableReferenceContext extends ParserRuleContext {
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public TableReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableReference; }
	}

	public final TableReferenceContext tableReference() throws RecognitionException {
		TableReferenceContext _localctx = new TableReferenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tableReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(IDT);
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
	public static class AliasContext extends ParserRuleContext {
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IDT);
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
	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(ExprParser.INTO, 0); }
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(ExprParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ExprParser.LPAREN, i);
		}
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ExprParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ExprParser.RPAREN, i);
		}
		public TerminalNode VALUES() { return getToken(ExprParser.VALUES, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_insertStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(INSERT);
			setState(160);
			match(INTO);
			setState(161);
			tableReference();
			setState(162);
			match(LPAREN);
			setState(163);
			columnList();
			setState(164);
			match(RPAREN);
			setState(165);
			match(VALUES);
			setState(166);
			match(LPAREN);
			setState(167);
			valueList();
			setState(168);
			match(RPAREN);
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
	public static class UpdateStatementContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(ExprParser.UPDATE, 0); }
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public TerminalNode SET() { return getToken(ExprParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateStatement; }
	}

	public final UpdateStatementContext updateStatement() throws RecognitionException {
		UpdateStatementContext _localctx = new UpdateStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_updateStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(UPDATE);
			setState(171);
			tableReference();
			setState(172);
			match(SET);
			setState(173);
			assignmentList();
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(174);
				whereClause();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			assignment();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(178);
				match(COMA);
				setState(179);
				assignment();
				}
				}
				setState(184);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IDT);
			setState(186);
			match(EQ);
			setState(187);
			value();
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
	public static class DeleteStatementContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(ExprParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(ExprParser.FROM, 0); }
		public TableReferenceContext tableReference() {
			return getRuleContext(TableReferenceContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteStatement; }
	}

	public final DeleteStatementContext deleteStatement() throws RecognitionException {
		DeleteStatementContext _localctx = new DeleteStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_deleteStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(DELETE);
			setState(190);
			match(FROM);
			setState(191);
			tableReference();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(192);
				whereClause();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTableStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(ExprParser.TABLE, 0); }
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public CreateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStatement; }
	}

	public final CreateTableStatementContext createTableStatement() throws RecognitionException {
		CreateTableStatementContext _localctx = new CreateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(CREATE);
			setState(196);
			match(TABLE);
			setState(197);
			match(IDT);
			setState(198);
			match(LPAREN);
			setState(199);
			tableElement();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(200);
				match(COMA);
				setState(201);
				tableElement();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(RPAREN);
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
	public static class TableElementContext extends ParserRuleContext {
		public ColumnDefinitionContext columnDefinition() {
			return getRuleContext(ColumnDefinitionContext.class,0);
		}
		public TableConstraintContext tableConstraint() {
			return getRuleContext(TableConstraintContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tableElement);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDT:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				columnDefinition();
				}
				break;
			case CONSTRAINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				tableConstraint();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnDefinitionContext extends ParserRuleContext {
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public IdentityClauseContext identityClause() {
			return getRuleContext(IdentityClauseContext.class,0);
		}
		public NullClauseContext nullClause() {
			return getRuleContext(NullClauseContext.class,0);
		}
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public ColumnDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDefinition; }
	}

	public final ColumnDefinitionContext columnDefinition() throws RecognitionException {
		ColumnDefinitionContext _localctx = new ColumnDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_columnDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(IDT);
			setState(214);
			dataType();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTITY) {
				{
				setState(215);
				identityClause();
				}
			}

			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(218);
				nullClause();
				}
				break;
			}
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15737028608L) != 0)) {
				{
				{
				setState(221);
				constraint();
				}
				}
				setState(226);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentityClauseContext extends ParserRuleContext {
		public TerminalNode IDENTITY() { return getToken(ExprParser.IDENTITY, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public TerminalNode COMA() { return getToken(ExprParser.COMA, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public IdentityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identityClause; }
	}

	public final IdentityClauseContext identityClause() throws RecognitionException {
		IdentityClauseContext _localctx = new IdentityClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identityClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IDENTITY);
			setState(228);
			match(LPAREN);
			setState(229);
			match(NUM);
			setState(230);
			match(COMA);
			setState(231);
			match(NUM);
			setState(232);
			match(RPAREN);
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
	public static class NullClauseContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public NullClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullClause; }
	}

	public final NullClauseContext nullClause() throws RecognitionException {
		NullClauseContext _localctx = new NullClauseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nullClause);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(NULL);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(NOT);
				setState(236);
				match(NULL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public TerminalNode BIGINT() { return getToken(ExprParser.BIGINT, 0); }
		public TerminalNode SMALLINT() { return getToken(ExprParser.SMALLINT, 0); }
		public TerminalNode TINYINT() { return getToken(ExprParser.TINYINT, 0); }
		public TerminalNode BIT() { return getToken(ExprParser.BIT, 0); }
		public TerminalNode DATE() { return getToken(ExprParser.DATE, 0); }
		public TerminalNode DATETIME() { return getToken(ExprParser.DATETIME, 0); }
		public TerminalNode VARCHAR() { return getToken(ExprParser.VARCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public TerminalNode CHAR() { return getToken(ExprParser.CHAR, 0); }
		public TerminalNode DECIMAL() { return getToken(ExprParser.DECIMAL, 0); }
		public TerminalNode COMA() { return getToken(ExprParser.COMA, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dataType);
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				match(INT);
				}
				break;
			case BIGINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(240);
				match(BIGINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(SMALLINT);
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(TINYINT);
				}
				break;
			case BIT:
				enterOuterAlt(_localctx, 5);
				{
				setState(243);
				match(BIT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				match(DATE);
				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				match(DATETIME);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 8);
				{
				setState(246);
				match(VARCHAR);
				setState(247);
				match(LPAREN);
				setState(248);
				match(NUM);
				setState(249);
				match(RPAREN);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 9);
				{
				setState(250);
				match(CHAR);
				setState(251);
				match(LPAREN);
				setState(252);
				match(NUM);
				setState(253);
				match(RPAREN);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 10);
				{
				setState(254);
				match(DECIMAL);
				setState(255);
				match(LPAREN);
				setState(256);
				match(NUM);
				setState(257);
				match(COMA);
				setState(258);
				match(NUM);
				setState(259);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public TerminalNode FOREIGN() { return getToken(ExprParser.FOREIGN, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ExprParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ExprParser.LPAREN, i);
		}
		public List<TerminalNode> IDT() { return getTokens(ExprParser.IDT); }
		public TerminalNode IDT(int i) {
			return getToken(ExprParser.IDT, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ExprParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ExprParser.RPAREN, i);
		}
		public TerminalNode REFERENCES() { return getToken(ExprParser.REFERENCES, 0); }
		public TerminalNode NOT() { return getToken(ExprParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public TerminalNode DEFAULT() { return getToken(ExprParser.DEFAULT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(ExprParser.CHECK, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constraint);
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(PRIMARY);
				setState(263);
				match(KEY);
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(FOREIGN);
				setState(265);
				match(KEY);
				setState(266);
				match(LPAREN);
				setState(267);
				match(IDT);
				setState(268);
				match(RPAREN);
				setState(269);
				match(REFERENCES);
				setState(270);
				match(IDT);
				setState(271);
				match(LPAREN);
				setState(272);
				match(IDT);
				setState(273);
				match(RPAREN);
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(NOT);
				setState(275);
				match(NULL);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(UNIQUE);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				match(DEFAULT);
				setState(278);
				value();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 6);
				{
				setState(279);
				match(CHECK);
				setState(280);
				match(LPAREN);
				setState(281);
				condition();
				setState(282);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnConstraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public TerminalNode UNIQUE() { return getToken(ExprParser.UNIQUE, 0); }
		public TerminalNode DEFAULT() { return getToken(ExprParser.DEFAULT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CHECK() { return getToken(ExprParser.CHECK, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public ColumnConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnConstraint; }
	}

	public final ColumnConstraintContext columnConstraint() throws RecognitionException {
		ColumnConstraintContext _localctx = new ColumnConstraintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_columnConstraint);
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRIMARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				match(PRIMARY);
				setState(287);
				match(KEY);
				}
				break;
			case UNIQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(UNIQUE);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				match(DEFAULT);
				setState(290);
				value();
				}
				break;
			case CHECK:
				enterOuterAlt(_localctx, 4);
				{
				setState(291);
				match(CHECK);
				setState(292);
				match(LPAREN);
				setState(293);
				condition();
				setState(294);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TableConstraintContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(ExprParser.CONSTRAINT, 0); }
		public List<TerminalNode> IDT() { return getTokens(ExprParser.IDT); }
		public TerminalNode IDT(int i) {
			return getToken(ExprParser.IDT, i);
		}
		public TerminalNode PRIMARY() { return getToken(ExprParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(ExprParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ExprParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ExprParser.LPAREN, i);
		}
		public List<ColumnListContext> columnList() {
			return getRuleContexts(ColumnListContext.class);
		}
		public ColumnListContext columnList(int i) {
			return getRuleContext(ColumnListContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ExprParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ExprParser.RPAREN, i);
		}
		public TerminalNode FOREIGN() { return getToken(ExprParser.FOREIGN, 0); }
		public TerminalNode REFERENCES() { return getToken(ExprParser.REFERENCES, 0); }
		public TableConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableConstraint; }
	}

	public final TableConstraintContext tableConstraint() throws RecognitionException {
		TableConstraintContext _localctx = new TableConstraintContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tableConstraint);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(CONSTRAINT);
				setState(299);
				match(IDT);
				setState(300);
				match(PRIMARY);
				setState(301);
				match(KEY);
				setState(302);
				match(LPAREN);
				setState(303);
				columnList();
				setState(304);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				match(CONSTRAINT);
				setState(307);
				match(IDT);
				setState(308);
				match(FOREIGN);
				setState(309);
				match(KEY);
				setState(310);
				match(LPAREN);
				setState(311);
				columnList();
				setState(312);
				match(RPAREN);
				setState(313);
				match(REFERENCES);
				setState(314);
				match(IDT);
				setState(315);
				match(LPAREN);
				setState(316);
				columnList();
				setState(317);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ExprParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(WHERE);
			setState(322);
			condition();
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
	public static class JoinClauseContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(ExprParser.JOIN, 0); }
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode INNER() { return getToken(ExprParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(ExprParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(ExprParser.RIGHT, 0); }
		public JoinClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinClause; }
	}

	public final JoinClauseContext joinClause() throws RecognitionException {
		JoinClauseContext _localctx = new JoinClauseContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_joinClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) {
				{
				setState(324);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 240518168576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(327);
			match(JOIN);
			setState(328);
			match(IDT);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDT) {
				{
				setState(329);
				alias();
				}
			}

			setState(332);
			match(ON);
			setState(333);
			condition();
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
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(ExprParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(ExprParser.BY, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_groupByClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(GROUP);
			setState(336);
			match(BY);
			setState(337);
			columnList();
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
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(ExprParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(ExprParser.BY, 0); }
		public ColumnListContext columnList() {
			return getRuleContext(ColumnListContext.class,0);
		}
		public TerminalNode ASC() { return getToken(ExprParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(ExprParser.DESC, 0); }
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(ORDER);
			setState(340);
			match(BY);
			setState(341);
			columnList();
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(342);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
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
	public static class ConditionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ComparatorContext> comparator() {
			return getRuleContexts(ComparatorContext.class);
		}
		public ComparatorContext comparator(int i) {
			return getRuleContext(ComparatorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ExprParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(ExprParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(ExprParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ExprParser.OR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			expression();
			setState(346);
			comparator();
			setState(347);
			expression();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(348);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(349);
				expression();
				setState(350);
				comparator();
				setState(351);
				expression();
				}
				}
				setState(357);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(ExprParser.EQ, 0); }
		public TerminalNode LT() { return getToken(ExprParser.LT, 0); }
		public TerminalNode GT() { return getToken(ExprParser.GT, 0); }
		public TerminalNode LE() { return getToken(ExprParser.LE, 0); }
		public TerminalNode GE() { return getToken(ExprParser.GE, 0); }
		public TerminalNode NEQ() { return getToken(ExprParser.NEQ, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 63L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<TerminalNode> IDT() { return getTokens(ExprParser.IDT); }
		public TerminalNode IDT(int i) {
			return getToken(ExprParser.IDT, i);
		}
		public TerminalNode PUNTO() { return getToken(ExprParser.PUNTO, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		try {
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				match(IDT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				match(IDT);
				setState(362);
				match(PUNTO);
				setState(363);
				match(IDT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				aggregateFunction();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateFunctionContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(ExprParser.COUNT, 0); }
		public TerminalNode LPAREN() { return getToken(ExprParser.LPAREN, 0); }
		public TerminalNode STAR() { return getToken(ExprParser.STAR, 0); }
		public TerminalNode RPAREN() { return getToken(ExprParser.RPAREN, 0); }
		public TerminalNode SUM() { return getToken(ExprParser.SUM, 0); }
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public TerminalNode AVG() { return getToken(ExprParser.AVG, 0); }
		public TerminalNode MIN() { return getToken(ExprParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(ExprParser.MAX, 0); }
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aggregateFunction);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COUNT:
				enterOuterAlt(_localctx, 1);
				{
				setState(368);
				match(COUNT);
				setState(369);
				match(LPAREN);
				setState(370);
				match(STAR);
				setState(371);
				match(RPAREN);
				}
				break;
			case SUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(SUM);
				setState(373);
				match(LPAREN);
				setState(374);
				match(IDT);
				setState(375);
				match(RPAREN);
				}
				break;
			case AVG:
				enterOuterAlt(_localctx, 3);
				{
				setState(376);
				match(AVG);
				setState(377);
				match(LPAREN);
				setState(378);
				match(IDT);
				setState(379);
				match(RPAREN);
				}
				break;
			case MIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(380);
				match(MIN);
				setState(381);
				match(LPAREN);
				setState(382);
				match(IDT);
				setState(383);
				match(RPAREN);
				}
				break;
			case MAX:
				enterOuterAlt(_localctx, 5);
				{
				setState(384);
				match(MAX);
				setState(385);
				match(LPAREN);
				setState(386);
				match(IDT);
				setState(387);
				match(RPAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnListContext extends ParserRuleContext {
		public List<TerminalNode> IDT() { return getTokens(ExprParser.IDT); }
		public TerminalNode IDT(int i) {
			return getToken(ExprParser.IDT, i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ColumnListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnList; }
	}

	public final ColumnListContext columnList() throws RecognitionException {
		ColumnListContext _localctx = new ColumnListContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_columnList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(IDT);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(391);
				match(COMA);
				setState(392);
				match(IDT);
				}
				}
				setState(397);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueListContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(ExprParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(ExprParser.COMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			value();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(399);
				match(COMA);
				setState(400);
				value();
				}
				}
				setState(405);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(ExprParser.NUM, 0); }
		public TerminalNode CAD() { return getToken(ExprParser.CAD, 0); }
		public TerminalNode NULL() { return getToken(ExprParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(ExprParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ExprParser.FALSE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 216179379183550465L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateProcedureStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(ExprParser.PROCEDURE, 0); }
		public TerminalNode IDT() { return getToken(ExprParser.IDT, 0); }
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CreateProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createProcedureStatement; }
	}

	public final CreateProcedureStatementContext createProcedureStatement() throws RecognitionException {
		CreateProcedureStatementContext _localctx = new CreateProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_createProcedureStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(CREATE);
			setState(409);
			match(PROCEDURE);
			setState(410);
			match(IDT);
			setState(411);
			match(AS);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(412);
					statement();
					}
					} 
				}
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateTriggerStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(ExprParser.CREATE, 0); }
		public TerminalNode TRIGGER() { return getToken(ExprParser.TRIGGER, 0); }
		public List<TerminalNode> IDT() { return getTokens(ExprParser.IDT); }
		public TerminalNode IDT(int i) {
			return getToken(ExprParser.IDT, i);
		}
		public TerminalNode ON() { return getToken(ExprParser.ON, 0); }
		public TerminalNode FOR() { return getToken(ExprParser.FOR, 0); }
		public TerminalNode INSERT() { return getToken(ExprParser.INSERT, 0); }
		public TerminalNode AS() { return getToken(ExprParser.AS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CreateTriggerStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTriggerStatement; }
	}

	public final CreateTriggerStatementContext createTriggerStatement() throws RecognitionException {
		CreateTriggerStatementContext _localctx = new CreateTriggerStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_createTriggerStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(CREATE);
			setState(419);
			match(TRIGGER);
			setState(420);
			match(IDT);
			setState(421);
			match(ON);
			setState(422);
			match(IDT);
			setState(423);
			match(FOR);
			setState(424);
			match(INSERT);
			setState(425);
			match(AS);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(426);
					statement();
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BeginTransactionStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(ExprParser.BEGIN, 0); }
		public TerminalNode TRANSACTION() { return getToken(ExprParser.TRANSACTION, 0); }
		public BeginTransactionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginTransactionStatement; }
	}

	public final BeginTransactionStatementContext beginTransactionStatement() throws RecognitionException {
		BeginTransactionStatementContext _localctx = new BeginTransactionStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_beginTransactionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(BEGIN);
			setState(433);
			match(TRANSACTION);
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
	public static class CommitStatementContext extends ParserRuleContext {
		public TerminalNode COMMIT() { return getToken(ExprParser.COMMIT, 0); }
		public CommitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commitStatement; }
	}

	public final CommitStatementContext commitStatement() throws RecognitionException {
		CommitStatementContext _localctx = new CommitStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_commitStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(COMMIT);
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
	public static class RollbackStatementContext extends ParserRuleContext {
		public TerminalNode ROLLBACK() { return getToken(ExprParser.ROLLBACK, 0); }
		public RollbackStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollbackStatement; }
	}

	public final RollbackStatementContext rollbackStatement() throws RecognitionException {
		RollbackStatementContext _localctx = new RollbackStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rollbackStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(ROLLBACK);
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
		"\u0004\u0001Z\u01b8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000M\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001S\b\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001W\b\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001[\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001_\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001c\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"g\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001o\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001s\b\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001w\b\u0001\u0003\u0001y\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0003\u0002}\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002\u0083\b\u0002\n\u0002\f\u0002\u0086\t\u0002"+
		"\u0001\u0002\u0003\u0002\u0089\b\u0002\u0001\u0002\u0003\u0002\u008c\b"+
		"\u0002\u0001\u0002\u0003\u0002\u008f\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003\u0095\b\u0003\n\u0003\f\u0003\u0098\t\u0003"+
		"\u0003\u0003\u009a\b\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b0\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0005\b\u00b5\b\b\n\b\f\b\u00b8\t\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c2\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00cb\b\u000b\n\u000b\f\u000b\u00ce\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0003\f\u00d4\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0003\r\u00d9\b\r\u0001\r\u0003\r\u00dc\b\r\u0001\r\u0005\r\u00df\b\r"+
		"\n\r\f\r\u00e2\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003"+
		"\u000f\u00ee\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0105"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u011d"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0129"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0140\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0003\u0015\u0146\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u014b\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0158\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u0162\b\u0018\n\u0018\f\u0018\u0165\t\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u016f\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0185\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u018a\b\u001c\n\u001c\f\u001c\u018d\t\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u0192\b\u001d\n\u001d\f\u001d\u0195\t\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u019e\b\u001f\n\u001f\f\u001f\u01a1\t\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u01ac\b \n "+
		"\f \u01af\t \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0000\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0005\u0001\u0000"+
		"#%\u0001\u0000,-\u0001\u0000./\u0001\u0000IN\u0003\u0000\u001e\u001eG"+
		"HVW\u01d8\u0000K\u0001\u0000\u0000\u0000\u0002x\u0001\u0000\u0000\u0000"+
		"\u0004z\u0001\u0000\u0000\u0000\u0006\u0099\u0001\u0000\u0000\u0000\b"+
		"\u009b\u0001\u0000\u0000\u0000\n\u009d\u0001\u0000\u0000\u0000\f\u009f"+
		"\u0001\u0000\u0000\u0000\u000e\u00aa\u0001\u0000\u0000\u0000\u0010\u00b1"+
		"\u0001\u0000\u0000\u0000\u0012\u00b9\u0001\u0000\u0000\u0000\u0014\u00bd"+
		"\u0001\u0000\u0000\u0000\u0016\u00c3\u0001\u0000\u0000\u0000\u0018\u00d3"+
		"\u0001\u0000\u0000\u0000\u001a\u00d5\u0001\u0000\u0000\u0000\u001c\u00e3"+
		"\u0001\u0000\u0000\u0000\u001e\u00ed\u0001\u0000\u0000\u0000 \u0104\u0001"+
		"\u0000\u0000\u0000\"\u011c\u0001\u0000\u0000\u0000$\u0128\u0001\u0000"+
		"\u0000\u0000&\u013f\u0001\u0000\u0000\u0000(\u0141\u0001\u0000\u0000\u0000"+
		"*\u0145\u0001\u0000\u0000\u0000,\u014f\u0001\u0000\u0000\u0000.\u0153"+
		"\u0001\u0000\u0000\u00000\u0159\u0001\u0000\u0000\u00002\u0166\u0001\u0000"+
		"\u0000\u00004\u016e\u0001\u0000\u0000\u00006\u0184\u0001\u0000\u0000\u0000"+
		"8\u0186\u0001\u0000\u0000\u0000:\u018e\u0001\u0000\u0000\u0000<\u0196"+
		"\u0001\u0000\u0000\u0000>\u0198\u0001\u0000\u0000\u0000@\u01a2\u0001\u0000"+
		"\u0000\u0000B\u01b0\u0001\u0000\u0000\u0000D\u01b3\u0001\u0000\u0000\u0000"+
		"F\u01b5\u0001\u0000\u0000\u0000HJ\u0003\u0002\u0001\u0000IH\u0001\u0000"+
		"\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"NO\u0005\u0000\u0000\u0001O\u0001\u0001\u0000\u0000\u0000PR\u0003\u0004"+
		"\u0002\u0000QS\u0005R\u0000\u0000RQ\u0001\u0000\u0000\u0000RS\u0001\u0000"+
		"\u0000\u0000Sy\u0001\u0000\u0000\u0000TV\u0003\f\u0006\u0000UW\u0005R"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000Wy\u0001"+
		"\u0000\u0000\u0000XZ\u0003\u000e\u0007\u0000Y[\u0005R\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[y\u0001\u0000\u0000\u0000"+
		"\\^\u0003\u0014\n\u0000]_\u0005R\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_y\u0001\u0000\u0000\u0000`b\u0003\u0016\u000b"+
		"\u0000ac\u0005R\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000"+
		"\u0000cy\u0001\u0000\u0000\u0000df\u0003>\u001f\u0000eg\u0005R\u0000\u0000"+
		"fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gy\u0001\u0000\u0000"+
		"\u0000hj\u0003@ \u0000ik\u0005R\u0000\u0000ji\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000ky\u0001\u0000\u0000\u0000ln\u0003B!\u0000m"+
		"o\u0005R\u0000\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000"+
		"oy\u0001\u0000\u0000\u0000pr\u0003D\"\u0000qs\u0005R\u0000\u0000rq\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sy\u0001\u0000\u0000\u0000"+
		"tv\u0003F#\u0000uw\u0005R\u0000\u0000vu\u0001\u0000\u0000\u0000vw\u0001"+
		"\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xP\u0001\u0000\u0000\u0000"+
		"xT\u0001\u0000\u0000\u0000xX\u0001\u0000\u0000\u0000x\\\u0001\u0000\u0000"+
		"\u0000x`\u0001\u0000\u0000\u0000xd\u0001\u0000\u0000\u0000xh\u0001\u0000"+
		"\u0000\u0000xl\u0001\u0000\u0000\u0000xp\u0001\u0000\u0000\u0000xt\u0001"+
		"\u0000\u0000\u0000y\u0003\u0001\u0000\u0000\u0000z|\u0005\u0001\u0000"+
		"\u0000{}\u0005(\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0003\u0006\u0003\u0000\u007f"+
		"\u0080\u0005\u0002\u0000\u0000\u0080\u0084\u0003\b\u0004\u0000\u0081\u0083"+
		"\u0003*\u0015\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083\u0086\u0001"+
		"\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0087\u0089\u0003(\u0014\u0000\u0088\u0087\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000"+
		"\u0000\u0000\u008a\u008c\u0003,\u0016\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u008f\u0003.\u0017\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0005\u0001\u0000\u0000\u0000"+
		"\u0090\u009a\u0005S\u0000\u0000\u0091\u0096\u00034\u001a\u0000\u0092\u0093"+
		"\u0005Q\u0000\u0000\u0093\u0095\u00034\u001a\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u0090\u0001\u0000"+
		"\u0000\u0000\u0099\u0091\u0001\u0000\u0000\u0000\u009a\u0007\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0005U\u0000\u0000\u009c\t\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005U\u0000\u0000\u009e\u000b\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\u0004\u0000\u0000\u00a0\u00a1\u0005\u0005\u0000\u0000"+
		"\u00a1\u00a2\u0003\b\u0004\u0000\u00a2\u00a3\u0005O\u0000\u0000\u00a3"+
		"\u00a4\u00038\u001c\u0000\u00a4\u00a5\u0005P\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0006\u0000\u0000\u00a6\u00a7\u0005O\u0000\u0000\u00a7\u00a8\u0003:\u001d"+
		"\u0000\u00a8\u00a9\u0005P\u0000\u0000\u00a9\r\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0005\u0007\u0000\u0000\u00ab\u00ac\u0003\b\u0004\u0000\u00ac"+
		"\u00ad\u0005\b\u0000\u0000\u00ad\u00af\u0003\u0010\b\u0000\u00ae\u00b0"+
		"\u0003(\u0014\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b0\u000f\u0001\u0000\u0000\u0000\u00b1\u00b6\u0003"+
		"\u0012\t\u0000\u00b2\u00b3\u0005Q\u0000\u0000\u00b3\u00b5\u0003\u0012"+
		"\t\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b7\u0011\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005U\u0000\u0000\u00ba\u00bb\u0005I\u0000\u0000\u00bb"+
		"\u00bc\u0003<\u001e\u0000\u00bc\u0013\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0005\t\u0000\u0000\u00be\u00bf\u0005\u0002\u0000\u0000\u00bf\u00c1\u0003"+
		"\b\u0004\u0000\u00c0\u00c2\u0003(\u0014\u0000\u00c1\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u0015\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005\n\u0000\u0000\u00c4\u00c5\u0005\u000b\u0000"+
		"\u0000\u00c5\u00c6\u0005U\u0000\u0000\u00c6\u00c7\u0005O\u0000\u0000\u00c7"+
		"\u00cc\u0003\u0018\f\u0000\u00c8\u00c9\u0005Q\u0000\u0000\u00c9\u00cb"+
		"\u0003\u0018\f\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0005P\u0000\u0000\u00d0\u0017\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d4\u0003\u001a\r\u0000\u00d2\u00d4\u0003&\u0013"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u0019\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005U\u0000\u0000"+
		"\u00d6\u00d8\u0003 \u0010\u0000\u00d7\u00d9\u0003\u001c\u000e\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000\u0000\u00d9"+
		"\u00db\u0001\u0000\u0000\u0000\u00da\u00dc\u0003\u001e\u000f\u0000\u00db"+
		"\u00da\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc"+
		"\u00e0\u0001\u0000\u0000\u0000\u00dd\u00df\u0003\"\u0011\u0000\u00de\u00dd"+
		"\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000\u00e0\u00de"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u001b"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0005\u0010\u0000\u0000\u00e4\u00e5\u0005O\u0000\u0000\u00e5\u00e6\u0005"+
		"V\u0000\u0000\u00e6\u00e7\u0005Q\u0000\u0000\u00e7\u00e8\u0005V\u0000"+
		"\u0000\u00e8\u00e9\u0005P\u0000\u0000\u00e9\u001d\u0001\u0000\u0000\u0000"+
		"\u00ea\u00ee\u0005\u001e\u0000\u0000\u00eb\u00ec\u0005\u001d\u0000\u0000"+
		"\u00ec\u00ee\u0005\u001e\u0000\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u001f\u0001\u0000\u0000\u0000"+
		"\u00ef\u0105\u0005=\u0000\u0000\u00f0\u0105\u0005>\u0000\u0000\u00f1\u0105"+
		"\u0005?\u0000\u0000\u00f2\u0105\u0005@\u0000\u0000\u00f3\u0105\u0005A"+
		"\u0000\u0000\u00f4\u0105\u0005B\u0000\u0000\u00f5\u0105\u0005C\u0000\u0000"+
		"\u00f6\u00f7\u0005E\u0000\u0000\u00f7\u00f8\u0005O\u0000\u0000\u00f8\u00f9"+
		"\u0005V\u0000\u0000\u00f9\u0105\u0005P\u0000\u0000\u00fa\u00fb\u0005F"+
		"\u0000\u0000\u00fb\u00fc\u0005O\u0000\u0000\u00fc\u00fd\u0005V\u0000\u0000"+
		"\u00fd\u0105\u0005P\u0000\u0000\u00fe\u00ff\u0005D\u0000\u0000\u00ff\u0100"+
		"\u0005O\u0000\u0000\u0100\u0101\u0005V\u0000\u0000\u0101\u0102\u0005Q"+
		"\u0000\u0000\u0102\u0103\u0005V\u0000\u0000\u0103\u0105\u0005P\u0000\u0000"+
		"\u0104\u00ef\u0001\u0000\u0000\u0000\u0104\u00f0\u0001\u0000\u0000\u0000"+
		"\u0104\u00f1\u0001\u0000\u0000\u0000\u0104\u00f2\u0001\u0000\u0000\u0000"+
		"\u0104\u00f3\u0001\u0000\u0000\u0000\u0104\u00f4\u0001\u0000\u0000\u0000"+
		"\u0104\u00f5\u0001\u0000\u0000\u0000\u0104\u00f6\u0001\u0000\u0000\u0000"+
		"\u0104\u00fa\u0001\u0000\u0000\u0000\u0104\u00fe\u0001\u0000\u0000\u0000"+
		"\u0105!\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0019\u0000\u0000\u0107"+
		"\u011d\u0005\u001a\u0000\u0000\u0108\u0109\u0005\u001b\u0000\u0000\u0109"+
		"\u010a\u0005\u001a\u0000\u0000\u010a\u010b\u0005O\u0000\u0000\u010b\u010c"+
		"\u0005U\u0000\u0000\u010c\u010d\u0005P\u0000\u0000\u010d\u010e\u0005\u001c"+
		"\u0000\u0000\u010e\u010f\u0005U\u0000\u0000\u010f\u0110\u0005O\u0000\u0000"+
		"\u0110\u0111\u0005U\u0000\u0000\u0111\u011d\u0005P\u0000\u0000\u0112\u0113"+
		"\u0005\u001d\u0000\u0000\u0113\u011d\u0005\u001e\u0000\u0000\u0114\u011d"+
		"\u0005\u001f\u0000\u0000\u0115\u0116\u0005!\u0000\u0000\u0116\u011d\u0003"+
		"<\u001e\u0000\u0117\u0118\u0005 \u0000\u0000\u0118\u0119\u0005O\u0000"+
		"\u0000\u0119\u011a\u00030\u0018\u0000\u011a\u011b\u0005P\u0000\u0000\u011b"+
		"\u011d\u0001\u0000\u0000\u0000\u011c\u0106\u0001\u0000\u0000\u0000\u011c"+
		"\u0108\u0001\u0000\u0000\u0000\u011c\u0112\u0001\u0000\u0000\u0000\u011c"+
		"\u0114\u0001\u0000\u0000\u0000\u011c\u0115\u0001\u0000\u0000\u0000\u011c"+
		"\u0117\u0001\u0000\u0000\u0000\u011d#\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0005\u0019\u0000\u0000\u011f\u0129\u0005\u001a\u0000\u0000\u0120\u0129"+
		"\u0005\u001f\u0000\u0000\u0121\u0122\u0005!\u0000\u0000\u0122\u0129\u0003"+
		"<\u001e\u0000\u0123\u0124\u0005 \u0000\u0000\u0124\u0125\u0005O\u0000"+
		"\u0000\u0125\u0126\u00030\u0018\u0000\u0126\u0127\u0005P\u0000\u0000\u0127"+
		"\u0129\u0001\u0000\u0000\u0000\u0128\u011e\u0001\u0000\u0000\u0000\u0128"+
		"\u0120\u0001\u0000\u0000\u0000\u0128\u0121\u0001\u0000\u0000\u0000\u0128"+
		"\u0123\u0001\u0000\u0000\u0000\u0129%\u0001\u0000\u0000\u0000\u012a\u012b"+
		"\u0005\u000f\u0000\u0000\u012b\u012c\u0005U\u0000\u0000\u012c\u012d\u0005"+
		"\u0019\u0000\u0000\u012d\u012e\u0005\u001a\u0000\u0000\u012e\u012f\u0005"+
		"O\u0000\u0000\u012f\u0130\u00038\u001c\u0000\u0130\u0131\u0005P\u0000"+
		"\u0000\u0131\u0140\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u000f\u0000"+
		"\u0000\u0133\u0134\u0005U\u0000\u0000\u0134\u0135\u0005\u001b\u0000\u0000"+
		"\u0135\u0136\u0005\u001a\u0000\u0000\u0136\u0137\u0005O\u0000\u0000\u0137"+
		"\u0138\u00038\u001c\u0000\u0138\u0139\u0005P\u0000\u0000\u0139\u013a\u0005"+
		"\u001c\u0000\u0000\u013a\u013b\u0005U\u0000\u0000\u013b\u013c\u0005O\u0000"+
		"\u0000\u013c\u013d\u00038\u001c\u0000\u013d\u013e\u0005P\u0000\u0000\u013e"+
		"\u0140\u0001\u0000\u0000\u0000\u013f\u012a\u0001\u0000\u0000\u0000\u013f"+
		"\u0132\u0001\u0000\u0000\u0000\u0140\'\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0005\u0003\u0000\u0000\u0142\u0143\u00030\u0018\u0000\u0143)\u0001\u0000"+
		"\u0000\u0000\u0144\u0146\u0007\u0000\u0000\u0000\u0145\u0144\u0001\u0000"+
		"\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0005\"\u0000\u0000\u0148\u014a\u0005U\u0000"+
		"\u0000\u0149\u014b\u0003\n\u0005\u0000\u014a\u0149\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0005&\u0000\u0000\u014d\u014e\u00030\u0018\u0000\u014e+"+
		"\u0001\u0000\u0000\u0000\u014f\u0150\u0005)\u0000\u0000\u0150\u0151\u0005"+
		"*\u0000\u0000\u0151\u0152\u00038\u001c\u0000\u0152-\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0005+\u0000\u0000\u0154\u0155\u0005*\u0000\u0000\u0155"+
		"\u0157\u00038\u001c\u0000\u0156\u0158\u0007\u0001\u0000\u0000\u0157\u0156"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158/\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u00034\u001a\u0000\u015a\u015b\u00032\u0019"+
		"\u0000\u015b\u0163\u00034\u001a\u0000\u015c\u015d\u0007\u0002\u0000\u0000"+
		"\u015d\u015e\u00034\u001a\u0000\u015e\u015f\u00032\u0019\u0000\u015f\u0160"+
		"\u00034\u001a\u0000\u0160\u0162\u0001\u0000\u0000\u0000\u0161\u015c\u0001"+
		"\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u01641\u0001\u0000"+
		"\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0167\u0007\u0003"+
		"\u0000\u0000\u01673\u0001\u0000\u0000\u0000\u0168\u016f\u0005U\u0000\u0000"+
		"\u0169\u016a\u0005U\u0000\u0000\u016a\u016b\u0005T\u0000\u0000\u016b\u016f"+
		"\u0005U\u0000\u0000\u016c\u016f\u0003<\u001e\u0000\u016d\u016f\u00036"+
		"\u001b\u0000\u016e\u0168\u0001\u0000\u0000\u0000\u016e\u0169\u0001\u0000"+
		"\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016d\u0001\u0000"+
		"\u0000\u0000\u016f5\u0001\u0000\u0000\u0000\u0170\u0171\u00050\u0000\u0000"+
		"\u0171\u0172\u0005O\u0000\u0000\u0172\u0173\u0005S\u0000\u0000\u0173\u0185"+
		"\u0005P\u0000\u0000\u0174\u0175\u00051\u0000\u0000\u0175\u0176\u0005O"+
		"\u0000\u0000\u0176\u0177\u0005U\u0000\u0000\u0177\u0185\u0005P\u0000\u0000"+
		"\u0178\u0179\u00052\u0000\u0000\u0179\u017a\u0005O\u0000\u0000\u017a\u017b"+
		"\u0005U\u0000\u0000\u017b\u0185\u0005P\u0000\u0000\u017c\u017d\u00053"+
		"\u0000\u0000\u017d\u017e\u0005O\u0000\u0000\u017e\u017f\u0005U\u0000\u0000"+
		"\u017f\u0185\u0005P\u0000\u0000\u0180\u0181\u00054\u0000\u0000\u0181\u0182"+
		"\u0005O\u0000\u0000\u0182\u0183\u0005U\u0000\u0000\u0183\u0185\u0005P"+
		"\u0000\u0000\u0184\u0170\u0001\u0000\u0000\u0000\u0184\u0174\u0001\u0000"+
		"\u0000\u0000\u0184\u0178\u0001\u0000\u0000\u0000\u0184\u017c\u0001\u0000"+
		"\u0000\u0000\u0184\u0180\u0001\u0000\u0000\u0000\u01857\u0001\u0000\u0000"+
		"\u0000\u0186\u018b\u0005U\u0000\u0000\u0187\u0188\u0005Q\u0000\u0000\u0188"+
		"\u018a\u0005U\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018d"+
		"\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c9\u0001\u0000\u0000\u0000\u018d\u018b\u0001"+
		"\u0000\u0000\u0000\u018e\u0193\u0003<\u001e\u0000\u018f\u0190\u0005Q\u0000"+
		"\u0000\u0190\u0192\u0003<\u001e\u0000\u0191\u018f\u0001\u0000\u0000\u0000"+
		"\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0001\u0000\u0000\u0000\u0194;\u0001\u0000\u0000\u0000\u0195"+
		"\u0193\u0001\u0000\u0000\u0000\u0196\u0197\u0007\u0004\u0000\u0000\u0197"+
		"=\u0001\u0000\u0000\u0000\u0198\u0199\u0005\n\u0000\u0000\u0199\u019a"+
		"\u00059\u0000\u0000\u019a\u019b\u0005U\u0000\u0000\u019b\u019f\u0005<"+
		"\u0000\u0000\u019c\u019e\u0003\u0002\u0001\u0000\u019d\u019c\u0001\u0000"+
		"\u0000\u0000\u019e\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0?\u0001\u0000\u0000"+
		"\u0000\u01a1\u019f\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005\n\u0000\u0000"+
		"\u01a3\u01a4\u0005:\u0000\u0000\u01a4\u01a5\u0005U\u0000\u0000\u01a5\u01a6"+
		"\u0005&\u0000\u0000\u01a6\u01a7\u0005U\u0000\u0000\u01a7\u01a8\u0005\'"+
		"\u0000\u0000\u01a8\u01a9\u0005\u0004\u0000\u0000\u01a9\u01ad\u0005<\u0000"+
		"\u0000\u01aa\u01ac\u0003\u0002\u0001\u0000\u01ab\u01aa\u0001\u0000\u0000"+
		"\u0000\u01ac\u01af\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01aeA\u0001\u0000\u0000\u0000"+
		"\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b1\u00055\u0000\u0000\u01b1"+
		"\u01b2\u00056\u0000\u0000\u01b2C\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005"+
		"7\u0000\u0000\u01b4E\u0001\u0000\u0000\u0000\u01b5\u01b6\u00058\u0000"+
		"\u0000\u01b6G\u0001\u0000\u0000\u0000*KRVZ^bfjnrvx|\u0084\u0088\u008b"+
		"\u008e\u0096\u0099\u00af\u00b6\u00c1\u00cc\u00d3\u00d8\u00db\u00e0\u00ed"+
		"\u0104\u011c\u0128\u013f\u0145\u014a\u0157\u0163\u016e\u0184\u018b\u0193"+
		"\u019f\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}