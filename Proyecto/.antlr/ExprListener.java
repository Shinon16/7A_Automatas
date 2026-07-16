// Generated from c:/Users/klauf/OneDrive/Documentos/Escritorio/pruebas_7a/codigosequipo/Proyecto/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(ExprParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(ExprParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ExprParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ExprParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(ExprParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(ExprParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#selectList}.
	 * @param ctx the parse tree
	 */
	void enterSelectList(ExprParser.SelectListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#selectList}.
	 * @param ctx the parse tree
	 */
	void exitSelectList(ExprParser.SelectListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(ExprParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(ExprParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(ExprParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(ExprParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(ExprParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(ExprParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(ExprParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(ExprParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(ExprParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(ExprParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ExprParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(ExprParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(ExprParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStatement(ExprParser.CreateTableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#createTableStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStatement(ExprParser.CreateTableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void enterTableElement(ExprParser.TableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tableElement}.
	 * @param ctx the parse tree
	 */
	void exitTableElement(ExprParser.TableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(ExprParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(ExprParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#identityClause}.
	 * @param ctx the parse tree
	 */
	void enterIdentityClause(ExprParser.IdentityClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#identityClause}.
	 * @param ctx the parse tree
	 */
	void exitIdentityClause(ExprParser.IdentityClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#nullClause}.
	 * @param ctx the parse tree
	 */
	void enterNullClause(ExprParser.NullClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#nullClause}.
	 * @param ctx the parse tree
	 */
	void exitNullClause(ExprParser.NullClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(ExprParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(ExprParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(ExprParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(ExprParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterColumnConstraint(ExprParser.ColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitColumnConstraint(ExprParser.ColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterTableConstraint(ExprParser.TableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitTableConstraint(ExprParser.TableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ExprParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ExprParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(ExprParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(ExprParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(ExprParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(ExprParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(ExprParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(ExprParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ExprParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ExprParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(ExprParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(ExprParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ExprParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunction(ExprParser.AggregateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunction(ExprParser.AggregateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#columnList}.
	 * @param ctx the parse tree
	 */
	void enterColumnList(ExprParser.ColumnListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#columnList}.
	 * @param ctx the parse tree
	 */
	void exitColumnList(ExprParser.ColumnListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterValueList(ExprParser.ValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitValueList(ExprParser.ValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ExprParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ExprParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#createProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedureStatement(ExprParser.CreateProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#createProcedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedureStatement(ExprParser.CreateProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTriggerStatement(ExprParser.CreateTriggerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#createTriggerStatement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTriggerStatement(ExprParser.CreateTriggerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#beginTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterBeginTransactionStatement(ExprParser.BeginTransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#beginTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitBeginTransactionStatement(ExprParser.BeginTransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#commitStatement}.
	 * @param ctx the parse tree
	 */
	void enterCommitStatement(ExprParser.CommitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#commitStatement}.
	 * @param ctx the parse tree
	 */
	void exitCommitStatement(ExprParser.CommitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void enterRollbackStatement(ExprParser.RollbackStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void exitRollbackStatement(ExprParser.RollbackStatementContext ctx);
}