# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#root.
    def enterRoot(self, ctx:ExprParser.RootContext):
        pass

    # Exit a parse tree produced by ExprParser#root.
    def exitRoot(self, ctx:ExprParser.RootContext):
        pass


    # Enter a parse tree produced by ExprParser#statement.
    def enterStatement(self, ctx:ExprParser.StatementContext):
        pass

    # Exit a parse tree produced by ExprParser#statement.
    def exitStatement(self, ctx:ExprParser.StatementContext):
        pass


    # Enter a parse tree produced by ExprParser#selectStatement.
    def enterSelectStatement(self, ctx:ExprParser.SelectStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#selectStatement.
    def exitSelectStatement(self, ctx:ExprParser.SelectStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#selectList.
    def enterSelectList(self, ctx:ExprParser.SelectListContext):
        pass

    # Exit a parse tree produced by ExprParser#selectList.
    def exitSelectList(self, ctx:ExprParser.SelectListContext):
        pass


    # Enter a parse tree produced by ExprParser#tableReference.
    def enterTableReference(self, ctx:ExprParser.TableReferenceContext):
        pass

    # Exit a parse tree produced by ExprParser#tableReference.
    def exitTableReference(self, ctx:ExprParser.TableReferenceContext):
        pass


    # Enter a parse tree produced by ExprParser#alias.
    def enterAlias(self, ctx:ExprParser.AliasContext):
        pass

    # Exit a parse tree produced by ExprParser#alias.
    def exitAlias(self, ctx:ExprParser.AliasContext):
        pass


    # Enter a parse tree produced by ExprParser#insertStatement.
    def enterInsertStatement(self, ctx:ExprParser.InsertStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#insertStatement.
    def exitInsertStatement(self, ctx:ExprParser.InsertStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#updateStatement.
    def enterUpdateStatement(self, ctx:ExprParser.UpdateStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#updateStatement.
    def exitUpdateStatement(self, ctx:ExprParser.UpdateStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#assignmentList.
    def enterAssignmentList(self, ctx:ExprParser.AssignmentListContext):
        pass

    # Exit a parse tree produced by ExprParser#assignmentList.
    def exitAssignmentList(self, ctx:ExprParser.AssignmentListContext):
        pass


    # Enter a parse tree produced by ExprParser#assignment.
    def enterAssignment(self, ctx:ExprParser.AssignmentContext):
        pass

    # Exit a parse tree produced by ExprParser#assignment.
    def exitAssignment(self, ctx:ExprParser.AssignmentContext):
        pass


    # Enter a parse tree produced by ExprParser#deleteStatement.
    def enterDeleteStatement(self, ctx:ExprParser.DeleteStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#deleteStatement.
    def exitDeleteStatement(self, ctx:ExprParser.DeleteStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#createTableStatement.
    def enterCreateTableStatement(self, ctx:ExprParser.CreateTableStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#createTableStatement.
    def exitCreateTableStatement(self, ctx:ExprParser.CreateTableStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#tableElement.
    def enterTableElement(self, ctx:ExprParser.TableElementContext):
        pass

    # Exit a parse tree produced by ExprParser#tableElement.
    def exitTableElement(self, ctx:ExprParser.TableElementContext):
        pass


    # Enter a parse tree produced by ExprParser#columnDefinition.
    def enterColumnDefinition(self, ctx:ExprParser.ColumnDefinitionContext):
        pass

    # Exit a parse tree produced by ExprParser#columnDefinition.
    def exitColumnDefinition(self, ctx:ExprParser.ColumnDefinitionContext):
        pass


    # Enter a parse tree produced by ExprParser#identityClause.
    def enterIdentityClause(self, ctx:ExprParser.IdentityClauseContext):
        pass

    # Exit a parse tree produced by ExprParser#identityClause.
    def exitIdentityClause(self, ctx:ExprParser.IdentityClauseContext):
        pass


    # Enter a parse tree produced by ExprParser#nullClause.
    def enterNullClause(self, ctx:ExprParser.NullClauseContext):
        pass

    # Exit a parse tree produced by ExprParser#nullClause.
    def exitNullClause(self, ctx:ExprParser.NullClauseContext):
        pass


    # Enter a parse tree produced by ExprParser#dataType.
    def enterDataType(self, ctx:ExprParser.DataTypeContext):
        pass

    # Exit a parse tree produced by ExprParser#dataType.
    def exitDataType(self, ctx:ExprParser.DataTypeContext):
        pass


    # Enter a parse tree produced by ExprParser#constraint.
    def enterConstraint(self, ctx:ExprParser.ConstraintContext):
        pass

    # Exit a parse tree produced by ExprParser#constraint.
    def exitConstraint(self, ctx:ExprParser.ConstraintContext):
        pass


    # Enter a parse tree produced by ExprParser#columnConstraint.
    def enterColumnConstraint(self, ctx:ExprParser.ColumnConstraintContext):
        pass

    # Exit a parse tree produced by ExprParser#columnConstraint.
    def exitColumnConstraint(self, ctx:ExprParser.ColumnConstraintContext):
        pass


    # Enter a parse tree produced by ExprParser#tableConstraint.
    def enterTableConstraint(self, ctx:ExprParser.TableConstraintContext):
        pass

    # Exit a parse tree produced by ExprParser#tableConstraint.
    def exitTableConstraint(self, ctx:ExprParser.TableConstraintContext):
        pass


    # Enter a parse tree produced by ExprParser#whereClause.
    def enterWhereClause(self, ctx:ExprParser.WhereClauseContext):
        pass

    # Exit a parse tree produced by ExprParser#whereClause.
    def exitWhereClause(self, ctx:ExprParser.WhereClauseContext):
        pass


    # Enter a parse tree produced by ExprParser#joinClause.
    def enterJoinClause(self, ctx:ExprParser.JoinClauseContext):
        pass

    # Exit a parse tree produced by ExprParser#joinClause.
    def exitJoinClause(self, ctx:ExprParser.JoinClauseContext):
        pass


    # Enter a parse tree produced by ExprParser#groupByClause.
    def enterGroupByClause(self, ctx:ExprParser.GroupByClauseContext):
        pass

    # Exit a parse tree produced by ExprParser#groupByClause.
    def exitGroupByClause(self, ctx:ExprParser.GroupByClauseContext):
        pass


    # Enter a parse tree produced by ExprParser#orderByClause.
    def enterOrderByClause(self, ctx:ExprParser.OrderByClauseContext):
        pass

    # Exit a parse tree produced by ExprParser#orderByClause.
    def exitOrderByClause(self, ctx:ExprParser.OrderByClauseContext):
        pass


    # Enter a parse tree produced by ExprParser#condition.
    def enterCondition(self, ctx:ExprParser.ConditionContext):
        pass

    # Exit a parse tree produced by ExprParser#condition.
    def exitCondition(self, ctx:ExprParser.ConditionContext):
        pass


    # Enter a parse tree produced by ExprParser#comparator.
    def enterComparator(self, ctx:ExprParser.ComparatorContext):
        pass

    # Exit a parse tree produced by ExprParser#comparator.
    def exitComparator(self, ctx:ExprParser.ComparatorContext):
        pass


    # Enter a parse tree produced by ExprParser#expression.
    def enterExpression(self, ctx:ExprParser.ExpressionContext):
        pass

    # Exit a parse tree produced by ExprParser#expression.
    def exitExpression(self, ctx:ExprParser.ExpressionContext):
        pass


    # Enter a parse tree produced by ExprParser#aggregateFunction.
    def enterAggregateFunction(self, ctx:ExprParser.AggregateFunctionContext):
        pass

    # Exit a parse tree produced by ExprParser#aggregateFunction.
    def exitAggregateFunction(self, ctx:ExprParser.AggregateFunctionContext):
        pass


    # Enter a parse tree produced by ExprParser#columnList.
    def enterColumnList(self, ctx:ExprParser.ColumnListContext):
        pass

    # Exit a parse tree produced by ExprParser#columnList.
    def exitColumnList(self, ctx:ExprParser.ColumnListContext):
        pass


    # Enter a parse tree produced by ExprParser#valueList.
    def enterValueList(self, ctx:ExprParser.ValueListContext):
        pass

    # Exit a parse tree produced by ExprParser#valueList.
    def exitValueList(self, ctx:ExprParser.ValueListContext):
        pass


    # Enter a parse tree produced by ExprParser#value.
    def enterValue(self, ctx:ExprParser.ValueContext):
        pass

    # Exit a parse tree produced by ExprParser#value.
    def exitValue(self, ctx:ExprParser.ValueContext):
        pass


    # Enter a parse tree produced by ExprParser#createProcedureStatement.
    def enterCreateProcedureStatement(self, ctx:ExprParser.CreateProcedureStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#createProcedureStatement.
    def exitCreateProcedureStatement(self, ctx:ExprParser.CreateProcedureStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#createTriggerStatement.
    def enterCreateTriggerStatement(self, ctx:ExprParser.CreateTriggerStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#createTriggerStatement.
    def exitCreateTriggerStatement(self, ctx:ExprParser.CreateTriggerStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#beginTransactionStatement.
    def enterBeginTransactionStatement(self, ctx:ExprParser.BeginTransactionStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#beginTransactionStatement.
    def exitBeginTransactionStatement(self, ctx:ExprParser.BeginTransactionStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#commitStatement.
    def enterCommitStatement(self, ctx:ExprParser.CommitStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#commitStatement.
    def exitCommitStatement(self, ctx:ExprParser.CommitStatementContext):
        pass


    # Enter a parse tree produced by ExprParser#rollbackStatement.
    def enterRollbackStatement(self, ctx:ExprParser.RollbackStatementContext):
        pass

    # Exit a parse tree produced by ExprParser#rollbackStatement.
    def exitRollbackStatement(self, ctx:ExprParser.RollbackStatementContext):
        pass



del ExprParser