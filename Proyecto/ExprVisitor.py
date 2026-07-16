# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete generic visitor for a parse tree produced by ExprParser.

class ExprVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ExprParser#root.
    def visitRoot(self, ctx:ExprParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#statement.
    def visitStatement(self, ctx:ExprParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#selectStatement.
    def visitSelectStatement(self, ctx:ExprParser.SelectStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#selectList.
    def visitSelectList(self, ctx:ExprParser.SelectListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#tableReference.
    def visitTableReference(self, ctx:ExprParser.TableReferenceContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#alias.
    def visitAlias(self, ctx:ExprParser.AliasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#insertStatement.
    def visitInsertStatement(self, ctx:ExprParser.InsertStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#updateStatement.
    def visitUpdateStatement(self, ctx:ExprParser.UpdateStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#assignmentList.
    def visitAssignmentList(self, ctx:ExprParser.AssignmentListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#assignment.
    def visitAssignment(self, ctx:ExprParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#deleteStatement.
    def visitDeleteStatement(self, ctx:ExprParser.DeleteStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#createTableStatement.
    def visitCreateTableStatement(self, ctx:ExprParser.CreateTableStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#tableElement.
    def visitTableElement(self, ctx:ExprParser.TableElementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#columnDefinition.
    def visitColumnDefinition(self, ctx:ExprParser.ColumnDefinitionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#identityClause.
    def visitIdentityClause(self, ctx:ExprParser.IdentityClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#nullClause.
    def visitNullClause(self, ctx:ExprParser.NullClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#dataType.
    def visitDataType(self, ctx:ExprParser.DataTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#constraint.
    def visitConstraint(self, ctx:ExprParser.ConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#columnConstraint.
    def visitColumnConstraint(self, ctx:ExprParser.ColumnConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#tableConstraint.
    def visitTableConstraint(self, ctx:ExprParser.TableConstraintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#whereClause.
    def visitWhereClause(self, ctx:ExprParser.WhereClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#joinClause.
    def visitJoinClause(self, ctx:ExprParser.JoinClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#groupByClause.
    def visitGroupByClause(self, ctx:ExprParser.GroupByClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#orderByClause.
    def visitOrderByClause(self, ctx:ExprParser.OrderByClauseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#condition.
    def visitCondition(self, ctx:ExprParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#comparator.
    def visitComparator(self, ctx:ExprParser.ComparatorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#expression.
    def visitExpression(self, ctx:ExprParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#aggregateFunction.
    def visitAggregateFunction(self, ctx:ExprParser.AggregateFunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#columnList.
    def visitColumnList(self, ctx:ExprParser.ColumnListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#valueList.
    def visitValueList(self, ctx:ExprParser.ValueListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#value.
    def visitValue(self, ctx:ExprParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#createProcedureStatement.
    def visitCreateProcedureStatement(self, ctx:ExprParser.CreateProcedureStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#createTriggerStatement.
    def visitCreateTriggerStatement(self, ctx:ExprParser.CreateTriggerStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#beginTransactionStatement.
    def visitBeginTransactionStatement(self, ctx:ExprParser.BeginTransactionStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#commitStatement.
    def visitCommitStatement(self, ctx:ExprParser.CommitStatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#rollbackStatement.
    def visitRollbackStatement(self, ctx:ExprParser.RollbackStatementContext):
        return self.visitChildren(ctx)



del ExprParser