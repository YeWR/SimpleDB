package Parser;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SDBVisitor implements SQLiteVisitor {
    @Override
    public Object visitParse(SQLiteParser.ParseContext ctx) {
        return null;
    }

    @Override
    public Object visitError(SQLiteParser.ErrorContext ctx) {
        return null;
    }

    @Override
    public Object visitSql_stmt_list(SQLiteParser.Sql_stmt_listContext ctx) {
        return null;
    }

    @Override
    public Object visitSql_stmt(SQLiteParser.Sql_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitAlter_table_stmt(SQLiteParser.Alter_table_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitAnalyze_stmt(SQLiteParser.Analyze_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitAttach_stmt(SQLiteParser.Attach_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitBegin_stmt(SQLiteParser.Begin_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitCommit_stmt(SQLiteParser.Commit_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitCompound_select_stmt(SQLiteParser.Compound_select_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitCreate_index_stmt(SQLiteParser.Create_index_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitCreate_table_stmt(SQLiteParser.Create_table_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitCreate_trigger_stmt(SQLiteParser.Create_trigger_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitCreate_view_stmt(SQLiteParser.Create_view_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitCreate_virtual_table_stmt(SQLiteParser.Create_virtual_table_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitDelete_stmt(SQLiteParser.Delete_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitDelete_stmt_limited(SQLiteParser.Delete_stmt_limitedContext ctx) {
        return null;
    }

    @Override
    public Object visitDetach_stmt(SQLiteParser.Detach_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitDrop_index_stmt(SQLiteParser.Drop_index_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitDrop_table_stmt(SQLiteParser.Drop_table_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitDrop_trigger_stmt(SQLiteParser.Drop_trigger_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitDrop_view_stmt(SQLiteParser.Drop_view_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitFactored_select_stmt(SQLiteParser.Factored_select_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitInsert_stmt(SQLiteParser.Insert_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitPragma_stmt(SQLiteParser.Pragma_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitReindex_stmt(SQLiteParser.Reindex_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitRelease_stmt(SQLiteParser.Release_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitRollback_stmt(SQLiteParser.Rollback_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitSavepoint_stmt(SQLiteParser.Savepoint_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitSimple_select_stmt(SQLiteParser.Simple_select_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitSelect_stmt(SQLiteParser.Select_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitSelect_or_values(SQLiteParser.Select_or_valuesContext ctx) {
        return null;
    }

    @Override
    public Object visitUpdate_stmt(SQLiteParser.Update_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitUpdate_stmt_limited(SQLiteParser.Update_stmt_limitedContext ctx) {
        return null;
    }

    @Override
    public Object visitVacuum_stmt(SQLiteParser.Vacuum_stmtContext ctx) {
        return null;
    }

    @Override
    public Object visitColumn_def(SQLiteParser.Column_defContext ctx) {
        return null;
    }

    @Override
    public Object visitType_name(SQLiteParser.Type_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitColumn_constraint(SQLiteParser.Column_constraintContext ctx) {
        return null;
    }

    @Override
    public Object visitConflict_clause(SQLiteParser.Conflict_clauseContext ctx) {
        return null;
    }

    @Override
    public Object visitExpr(SQLiteParser.ExprContext ctx) {
        return null;
    }

    @Override
    public Object visitForeign_key_clause(SQLiteParser.Foreign_key_clauseContext ctx) {
        return null;
    }

    @Override
    public Object visitRaise_function(SQLiteParser.Raise_functionContext ctx) {
        return null;
    }

    @Override
    public Object visitIndexed_column(SQLiteParser.Indexed_columnContext ctx) {
        return null;
    }

    @Override
    public Object visitTable_constraint(SQLiteParser.Table_constraintContext ctx) {
        return null;
    }

    @Override
    public Object visitWith_clause(SQLiteParser.With_clauseContext ctx) {
        return null;
    }

    @Override
    public Object visitQualified_table_name(SQLiteParser.Qualified_table_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitOrdering_term(SQLiteParser.Ordering_termContext ctx) {
        return null;
    }

    @Override
    public Object visitPragma_value(SQLiteParser.Pragma_valueContext ctx) {
        return null;
    }

    @Override
    public Object visitCommon_table_expression(SQLiteParser.Common_table_expressionContext ctx) {
        return null;
    }

    @Override
    public Object visitResult_column(SQLiteParser.Result_columnContext ctx) {
        return null;
    }

    @Override
    public Object visitTable_or_subquery(SQLiteParser.Table_or_subqueryContext ctx) {
        return null;
    }

    @Override
    public Object visitJoin_clause(SQLiteParser.Join_clauseContext ctx) {
        return null;
    }

    @Override
    public Object visitJoin_operator(SQLiteParser.Join_operatorContext ctx) {
        return null;
    }

    @Override
    public Object visitJoin_constraint(SQLiteParser.Join_constraintContext ctx) {
        return null;
    }

    @Override
    public Object visitSelect_core(SQLiteParser.Select_coreContext ctx) {
        return null;
    }

    @Override
    public Object visitCompound_operator(SQLiteParser.Compound_operatorContext ctx) {
        return null;
    }

    @Override
    public Object visitCte_table_name(SQLiteParser.Cte_table_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitSigned_number(SQLiteParser.Signed_numberContext ctx) {
        return null;
    }

    @Override
    public Object visitLiteral_value(SQLiteParser.Literal_valueContext ctx) {
        return null;
    }

    @Override
    public Object visitUnary_operator(SQLiteParser.Unary_operatorContext ctx) {
        return null;
    }

    @Override
    public Object visitError_message(SQLiteParser.Error_messageContext ctx) {
        return null;
    }

    @Override
    public Object visitModule_argument(SQLiteParser.Module_argumentContext ctx) {
        return null;
    }

    @Override
    public Object visitColumn_alias(SQLiteParser.Column_aliasContext ctx) {
        return null;
    }

    @Override
    public Object visitKeyword(SQLiteParser.KeywordContext ctx) {
        return null;
    }

    @Override
    public Object visitName(SQLiteParser.NameContext ctx) {
        return null;
    }

    @Override
    public Object visitFunction_name(SQLiteParser.Function_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitDatabase_name(SQLiteParser.Database_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitTable_name(SQLiteParser.Table_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitTable_or_index_name(SQLiteParser.Table_or_index_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitNew_table_name(SQLiteParser.New_table_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitColumn_name(SQLiteParser.Column_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitCollation_name(SQLiteParser.Collation_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitForeign_table(SQLiteParser.Foreign_tableContext ctx) {
        return null;
    }

    @Override
    public Object visitIndex_name(SQLiteParser.Index_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitTrigger_name(SQLiteParser.Trigger_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitView_name(SQLiteParser.View_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitModule_name(SQLiteParser.Module_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitPragma_name(SQLiteParser.Pragma_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitSavepoint_name(SQLiteParser.Savepoint_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitTable_alias(SQLiteParser.Table_aliasContext ctx) {
        return null;
    }

    @Override
    public Object visitTransaction_name(SQLiteParser.Transaction_nameContext ctx) {
        return null;
    }

    @Override
    public Object visitAny_name(SQLiteParser.Any_nameContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
