// Generated from MYSQLGRAMMAR.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MYSQLGRAMMARParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MYSQLGRAMMARVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(@NotNull MYSQLGRAMMARParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(@NotNull MYSQLGRAMMARParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funtionexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntionexpression(@NotNull MYSQLGRAMMARParser.FuntionexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#compound_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_operator(@NotNull MYSQLGRAMMARParser.Compound_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(@NotNull MYSQLGRAMMARParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#create_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_stmt(@NotNull MYSQLGRAMMARParser.Create_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#rollback_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollback_stmt(@NotNull MYSQLGRAMMARParser.Rollback_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(@NotNull MYSQLGRAMMARParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(@NotNull MYSQLGRAMMARParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andwhileexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndwhileexpression(@NotNull MYSQLGRAMMARParser.AndwhileexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_stmt(@NotNull MYSQLGRAMMARParser.Create_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(@NotNull MYSQLGRAMMARParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(@NotNull MYSQLGRAMMARParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(@NotNull MYSQLGRAMMARParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquexpression(@NotNull MYSQLGRAMMARParser.EquexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(@NotNull MYSQLGRAMMARParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orwhileexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrwhileexpression(@NotNull MYSQLGRAMMARParser.OrwhileexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivexpression(@NotNull MYSQLGRAMMARParser.MulDivexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(@NotNull MYSQLGRAMMARParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(@NotNull MYSQLGRAMMARParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#commit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommit_stmt(@NotNull MYSQLGRAMMARParser.Commit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(@NotNull MYSQLGRAMMARParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notexistexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotexistexpression(@NotNull MYSQLGRAMMARParser.NotexistexpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionOR}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOR(@NotNull MYSQLGRAMMARParser.ExpressionORContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_stmt(@NotNull MYSQLGRAMMARParser.Savepoint_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(@NotNull MYSQLGRAMMARParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#detach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetach_stmt(@NotNull MYSQLGRAMMARParser.Detach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(@NotNull MYSQLGRAMMARParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#release_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_stmt(@NotNull MYSQLGRAMMARParser.Release_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(@NotNull MYSQLGRAMMARParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addRestexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddRestexpression(@NotNull MYSQLGRAMMARParser.AddRestexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#begin_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_stmt(@NotNull MYSQLGRAMMARParser.Begin_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wheneventexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWheneventexpression(@NotNull MYSQLGRAMMARParser.WheneventexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(@NotNull MYSQLGRAMMARParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unitaryexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitaryexpression(@NotNull MYSQLGRAMMARParser.UnitaryexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(@NotNull MYSQLGRAMMARParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(@NotNull MYSQLGRAMMARParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(@NotNull MYSQLGRAMMARParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullcompexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullcompexpression(@NotNull MYSQLGRAMMARParser.NullcompexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(@NotNull MYSQLGRAMMARParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(@NotNull MYSQLGRAMMARParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_select_stmt(@NotNull MYSQLGRAMMARParser.Compound_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitManiexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitManiexpression(@NotNull MYSQLGRAMMARParser.BitManiexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#create_database_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_stmt(@NotNull MYSQLGRAMMARParser.Create_database_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_limited(@NotNull MYSQLGRAMMARParser.Update_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view_stmt(@NotNull MYSQLGRAMMARParser.Drop_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#raise_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_function(@NotNull MYSQLGRAMMARParser.Raise_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#analyze_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_stmt(@NotNull MYSQLGRAMMARParser.Analyze_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(@NotNull MYSQLGRAMMARParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#primary_sintax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_sintax(@NotNull MYSQLGRAMMARParser.Primary_sintaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionNumeral}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNumeral(@NotNull MYSQLGRAMMARParser.ExpressionNumeralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isornotexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsornotexpression(@NotNull MYSQLGRAMMARParser.IsornotexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(@NotNull MYSQLGRAMMARParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compnotbetweenexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompnotbetweenexpression(@NotNull MYSQLGRAMMARParser.CompnotbetweenexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(@NotNull MYSQLGRAMMARParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#use_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_stmt(@NotNull MYSQLGRAMMARParser.Use_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(@NotNull MYSQLGRAMMARParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(@NotNull MYSQLGRAMMARParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(@NotNull MYSQLGRAMMARParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(@NotNull MYSQLGRAMMARParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(@NotNull MYSQLGRAMMARParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(@NotNull MYSQLGRAMMARParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notinexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotinexpression(@NotNull MYSQLGRAMMARParser.NotinexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_stmt(@NotNull MYSQLGRAMMARParser.Vacuum_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinexpression(@NotNull MYSQLGRAMMARParser.JoinexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(@NotNull MYSQLGRAMMARParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(@NotNull MYSQLGRAMMARParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(@NotNull MYSQLGRAMMARParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_stmt(@NotNull MYSQLGRAMMARParser.Drop_trigger_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(@NotNull MYSQLGRAMMARParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenexpression(@NotNull MYSQLGRAMMARParser.ParenexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(@NotNull MYSQLGRAMMARParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(@NotNull MYSQLGRAMMARParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(@NotNull MYSQLGRAMMARParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(@NotNull MYSQLGRAMMARParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionDBTableCol}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionDBTableCol(@NotNull MYSQLGRAMMARParser.ExpressionDBTableColContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(@NotNull MYSQLGRAMMARParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(@NotNull MYSQLGRAMMARParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assustituteexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssustituteexpression(@NotNull MYSQLGRAMMARParser.AssustituteexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(@NotNull MYSQLGRAMMARParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(@NotNull MYSQLGRAMMARParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#create_view_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_stmt(@NotNull MYSQLGRAMMARParser.Create_view_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_limited(@NotNull MYSQLGRAMMARParser.Delete_stmt_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(@NotNull MYSQLGRAMMARParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(@NotNull MYSQLGRAMMARParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collationexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationexpression(@NotNull MYSQLGRAMMARParser.CollationexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_virtual_table_stmt(@NotNull MYSQLGRAMMARParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#pragma_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_stmt(@NotNull MYSQLGRAMMARParser.Pragma_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#attach_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttach_stmt(@NotNull MYSQLGRAMMARParser.Attach_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(@NotNull MYSQLGRAMMARParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull MYSQLGRAMMARParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(@NotNull MYSQLGRAMMARParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(@NotNull MYSQLGRAMMARParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#reindex_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReindex_stmt(@NotNull MYSQLGRAMMARParser.Reindex_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bindexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBindexpression(@NotNull MYSQLGRAMMARParser.BindexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(@NotNull MYSQLGRAMMARParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(@NotNull MYSQLGRAMMARParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(@NotNull MYSQLGRAMMARParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(@NotNull MYSQLGRAMMARParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparationExpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparationExpression(@NotNull MYSQLGRAMMARParser.ComparationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_select_stmt(@NotNull MYSQLGRAMMARParser.Simple_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aglomeraexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAglomeraexpression(@NotNull MYSQLGRAMMARParser.AglomeraexpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(@NotNull MYSQLGRAMMARParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index_stmt(@NotNull MYSQLGRAMMARParser.Drop_index_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(@NotNull MYSQLGRAMMARParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(@NotNull MYSQLGRAMMARParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYSQLGRAMMARParser#conflict_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_clause(@NotNull MYSQLGRAMMARParser.Conflict_clauseContext ctx);
}