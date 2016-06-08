// Generated from MYSQLGRAMMAR.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MYSQLGRAMMARParser}.
 */
public interface MYSQLGRAMMARListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(@NotNull MYSQLGRAMMARParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(@NotNull MYSQLGRAMMARParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(@NotNull MYSQLGRAMMARParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(@NotNull MYSQLGRAMMARParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funtionexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuntionexpression(@NotNull MYSQLGRAMMARParser.FuntionexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funtionexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuntionexpression(@NotNull MYSQLGRAMMARParser.FuntionexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void enterCompound_operator(@NotNull MYSQLGRAMMARParser.Compound_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#compound_operator}.
	 * @param ctx the parse tree
	 */
	void exitCompound_operator(@NotNull MYSQLGRAMMARParser.Compound_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(@NotNull MYSQLGRAMMARParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(@NotNull MYSQLGRAMMARParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_stmt(@NotNull MYSQLGRAMMARParser.Create_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#create_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_stmt(@NotNull MYSQLGRAMMARParser.Create_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRollback_stmt(@NotNull MYSQLGRAMMARParser.Rollback_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#rollback_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRollback_stmt(@NotNull MYSQLGRAMMARParser.Rollback_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(@NotNull MYSQLGRAMMARParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(@NotNull MYSQLGRAMMARParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(@NotNull MYSQLGRAMMARParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(@NotNull MYSQLGRAMMARParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andwhileexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndwhileexpression(@NotNull MYSQLGRAMMARParser.AndwhileexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andwhileexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndwhileexpression(@NotNull MYSQLGRAMMARParser.AndwhileexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_stmt(@NotNull MYSQLGRAMMARParser.Create_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#create_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_stmt(@NotNull MYSQLGRAMMARParser.Create_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(@NotNull MYSQLGRAMMARParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(@NotNull MYSQLGRAMMARParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(@NotNull MYSQLGRAMMARParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(@NotNull MYSQLGRAMMARParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(@NotNull MYSQLGRAMMARParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(@NotNull MYSQLGRAMMARParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEquexpression(@NotNull MYSQLGRAMMARParser.EquexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEquexpression(@NotNull MYSQLGRAMMARParser.EquexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(@NotNull MYSQLGRAMMARParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(@NotNull MYSQLGRAMMARParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orwhileexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrwhileexpression(@NotNull MYSQLGRAMMARParser.OrwhileexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orwhileexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrwhileexpression(@NotNull MYSQLGRAMMARParser.OrwhileexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivexpression(@NotNull MYSQLGRAMMARParser.MulDivexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivexpression(@NotNull MYSQLGRAMMARParser.MulDivexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(@NotNull MYSQLGRAMMARParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(@NotNull MYSQLGRAMMARParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(@NotNull MYSQLGRAMMARParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(@NotNull MYSQLGRAMMARParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCommit_stmt(@NotNull MYSQLGRAMMARParser.Commit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#commit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCommit_stmt(@NotNull MYSQLGRAMMARParser.Commit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(@NotNull MYSQLGRAMMARParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(@NotNull MYSQLGRAMMARParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notexistexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotexistexpression(@NotNull MYSQLGRAMMARParser.NotexistexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notexistexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotexistexpression(@NotNull MYSQLGRAMMARParser.NotexistexpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionOR}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOR(@NotNull MYSQLGRAMMARParser.ExpressionORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionOR}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOR(@NotNull MYSQLGRAMMARParser.ExpressionORContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_stmt(@NotNull MYSQLGRAMMARParser.Savepoint_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#savepoint_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_stmt(@NotNull MYSQLGRAMMARParser.Savepoint_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(@NotNull MYSQLGRAMMARParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(@NotNull MYSQLGRAMMARParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDetach_stmt(@NotNull MYSQLGRAMMARParser.Detach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#detach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDetach_stmt(@NotNull MYSQLGRAMMARParser.Detach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(@NotNull MYSQLGRAMMARParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(@NotNull MYSQLGRAMMARParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void enterRelease_stmt(@NotNull MYSQLGRAMMARParser.Release_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#release_stmt}.
	 * @param ctx the parse tree
	 */
	void exitRelease_stmt(@NotNull MYSQLGRAMMARParser.Release_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(@NotNull MYSQLGRAMMARParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(@NotNull MYSQLGRAMMARParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addRestexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddRestexpression(@NotNull MYSQLGRAMMARParser.AddRestexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addRestexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddRestexpression(@NotNull MYSQLGRAMMARParser.AddRestexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void enterBegin_stmt(@NotNull MYSQLGRAMMARParser.Begin_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#begin_stmt}.
	 * @param ctx the parse tree
	 */
	void exitBegin_stmt(@NotNull MYSQLGRAMMARParser.Begin_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wheneventexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWheneventexpression(@NotNull MYSQLGRAMMARParser.WheneventexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wheneventexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWheneventexpression(@NotNull MYSQLGRAMMARParser.WheneventexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(@NotNull MYSQLGRAMMARParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(@NotNull MYSQLGRAMMARParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unitaryexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnitaryexpression(@NotNull MYSQLGRAMMARParser.UnitaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unitaryexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnitaryexpression(@NotNull MYSQLGRAMMARParser.UnitaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(@NotNull MYSQLGRAMMARParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(@NotNull MYSQLGRAMMARParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(@NotNull MYSQLGRAMMARParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(@NotNull MYSQLGRAMMARParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(@NotNull MYSQLGRAMMARParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(@NotNull MYSQLGRAMMARParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullcompexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNullcompexpression(@NotNull MYSQLGRAMMARParser.NullcompexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullcompexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNullcompexpression(@NotNull MYSQLGRAMMARParser.NullcompexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(@NotNull MYSQLGRAMMARParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(@NotNull MYSQLGRAMMARParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(@NotNull MYSQLGRAMMARParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(@NotNull MYSQLGRAMMARParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompound_select_stmt(@NotNull MYSQLGRAMMARParser.Compound_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#compound_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompound_select_stmt(@NotNull MYSQLGRAMMARParser.Compound_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitManiexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitManiexpression(@NotNull MYSQLGRAMMARParser.BitManiexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitManiexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitManiexpression(@NotNull MYSQLGRAMMARParser.BitManiexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_stmt(@NotNull MYSQLGRAMMARParser.Create_database_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#create_database_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_stmt(@NotNull MYSQLGRAMMARParser.Create_database_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_limited(@NotNull MYSQLGRAMMARParser.Update_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#update_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_limited(@NotNull MYSQLGRAMMARParser.Update_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view_stmt(@NotNull MYSQLGRAMMARParser.Drop_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#drop_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view_stmt(@NotNull MYSQLGRAMMARParser.Drop_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void enterRaise_function(@NotNull MYSQLGRAMMARParser.Raise_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#raise_function}.
	 * @param ctx the parse tree
	 */
	void exitRaise_function(@NotNull MYSQLGRAMMARParser.Raise_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_stmt(@NotNull MYSQLGRAMMARParser.Analyze_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#analyze_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_stmt(@NotNull MYSQLGRAMMARParser.Analyze_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(@NotNull MYSQLGRAMMARParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(@NotNull MYSQLGRAMMARParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#primary_sintax}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_sintax(@NotNull MYSQLGRAMMARParser.Primary_sintaxContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#primary_sintax}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_sintax(@NotNull MYSQLGRAMMARParser.Primary_sintaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionNumeral}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNumeral(@NotNull MYSQLGRAMMARParser.ExpressionNumeralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionNumeral}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNumeral(@NotNull MYSQLGRAMMARParser.ExpressionNumeralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isornotexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIsornotexpression(@NotNull MYSQLGRAMMARParser.IsornotexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isornotexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIsornotexpression(@NotNull MYSQLGRAMMARParser.IsornotexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(@NotNull MYSQLGRAMMARParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(@NotNull MYSQLGRAMMARParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compnotbetweenexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompnotbetweenexpression(@NotNull MYSQLGRAMMARParser.CompnotbetweenexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compnotbetweenexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompnotbetweenexpression(@NotNull MYSQLGRAMMARParser.CompnotbetweenexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(@NotNull MYSQLGRAMMARParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(@NotNull MYSQLGRAMMARParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUse_stmt(@NotNull MYSQLGRAMMARParser.Use_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#use_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUse_stmt(@NotNull MYSQLGRAMMARParser.Use_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(@NotNull MYSQLGRAMMARParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(@NotNull MYSQLGRAMMARParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(@NotNull MYSQLGRAMMARParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(@NotNull MYSQLGRAMMARParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(@NotNull MYSQLGRAMMARParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(@NotNull MYSQLGRAMMARParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(@NotNull MYSQLGRAMMARParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(@NotNull MYSQLGRAMMARParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(@NotNull MYSQLGRAMMARParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(@NotNull MYSQLGRAMMARParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(@NotNull MYSQLGRAMMARParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(@NotNull MYSQLGRAMMARParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notinexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotinexpression(@NotNull MYSQLGRAMMARParser.NotinexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notinexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotinexpression(@NotNull MYSQLGRAMMARParser.NotinexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_stmt(@NotNull MYSQLGRAMMARParser.Vacuum_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#vacuum_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_stmt(@NotNull MYSQLGRAMMARParser.Vacuum_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterJoinexpression(@NotNull MYSQLGRAMMARParser.JoinexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitJoinexpression(@NotNull MYSQLGRAMMARParser.JoinexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(@NotNull MYSQLGRAMMARParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(@NotNull MYSQLGRAMMARParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(@NotNull MYSQLGRAMMARParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(@NotNull MYSQLGRAMMARParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(@NotNull MYSQLGRAMMARParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(@NotNull MYSQLGRAMMARParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_stmt(@NotNull MYSQLGRAMMARParser.Drop_trigger_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#drop_trigger_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_stmt(@NotNull MYSQLGRAMMARParser.Drop_trigger_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(@NotNull MYSQLGRAMMARParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(@NotNull MYSQLGRAMMARParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenexpression(@NotNull MYSQLGRAMMARParser.ParenexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenexpression(@NotNull MYSQLGRAMMARParser.ParenexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(@NotNull MYSQLGRAMMARParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(@NotNull MYSQLGRAMMARParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(@NotNull MYSQLGRAMMARParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(@NotNull MYSQLGRAMMARParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(@NotNull MYSQLGRAMMARParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(@NotNull MYSQLGRAMMARParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(@NotNull MYSQLGRAMMARParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(@NotNull MYSQLGRAMMARParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionDBTableCol}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpressionDBTableCol(@NotNull MYSQLGRAMMARParser.ExpressionDBTableColContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionDBTableCol}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpressionDBTableCol(@NotNull MYSQLGRAMMARParser.ExpressionDBTableColContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(@NotNull MYSQLGRAMMARParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(@NotNull MYSQLGRAMMARParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(@NotNull MYSQLGRAMMARParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(@NotNull MYSQLGRAMMARParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assustituteexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssustituteexpression(@NotNull MYSQLGRAMMARParser.AssustituteexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assustituteexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssustituteexpression(@NotNull MYSQLGRAMMARParser.AssustituteexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(@NotNull MYSQLGRAMMARParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(@NotNull MYSQLGRAMMARParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(@NotNull MYSQLGRAMMARParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(@NotNull MYSQLGRAMMARParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_stmt(@NotNull MYSQLGRAMMARParser.Create_view_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#create_view_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_stmt(@NotNull MYSQLGRAMMARParser.Create_view_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_limited(@NotNull MYSQLGRAMMARParser.Delete_stmt_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#delete_stmt_limited}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_limited(@NotNull MYSQLGRAMMARParser.Delete_stmt_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(@NotNull MYSQLGRAMMARParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(@NotNull MYSQLGRAMMARParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(@NotNull MYSQLGRAMMARParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(@NotNull MYSQLGRAMMARParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collationexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCollationexpression(@NotNull MYSQLGRAMMARParser.CollationexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collationexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCollationexpression(@NotNull MYSQLGRAMMARParser.CollationexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_virtual_table_stmt(@NotNull MYSQLGRAMMARParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#create_virtual_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_virtual_table_stmt(@NotNull MYSQLGRAMMARParser.Create_virtual_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPragma_stmt(@NotNull MYSQLGRAMMARParser.Pragma_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#pragma_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPragma_stmt(@NotNull MYSQLGRAMMARParser.Pragma_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAttach_stmt(@NotNull MYSQLGRAMMARParser.Attach_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#attach_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAttach_stmt(@NotNull MYSQLGRAMMARParser.Attach_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(@NotNull MYSQLGRAMMARParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(@NotNull MYSQLGRAMMARParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(@NotNull MYSQLGRAMMARParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(@NotNull MYSQLGRAMMARParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(@NotNull MYSQLGRAMMARParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(@NotNull MYSQLGRAMMARParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(@NotNull MYSQLGRAMMARParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(@NotNull MYSQLGRAMMARParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReindex_stmt(@NotNull MYSQLGRAMMARParser.Reindex_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#reindex_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReindex_stmt(@NotNull MYSQLGRAMMARParser.Reindex_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bindexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBindexpression(@NotNull MYSQLGRAMMARParser.BindexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bindexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBindexpression(@NotNull MYSQLGRAMMARParser.BindexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(@NotNull MYSQLGRAMMARParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(@NotNull MYSQLGRAMMARParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(@NotNull MYSQLGRAMMARParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(@NotNull MYSQLGRAMMARParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(@NotNull MYSQLGRAMMARParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(@NotNull MYSQLGRAMMARParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(@NotNull MYSQLGRAMMARParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(@NotNull MYSQLGRAMMARParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparationExpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterComparationExpression(@NotNull MYSQLGRAMMARParser.ComparationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparationExpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitComparationExpression(@NotNull MYSQLGRAMMARParser.ComparationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_select_stmt(@NotNull MYSQLGRAMMARParser.Simple_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#simple_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_select_stmt(@NotNull MYSQLGRAMMARParser.Simple_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aglomeraexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAglomeraexpression(@NotNull MYSQLGRAMMARParser.AglomeraexpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aglomeraexpression}
	 * labeled alternative in {@link MYSQLGRAMMARParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAglomeraexpression(@NotNull MYSQLGRAMMARParser.AglomeraexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(@NotNull MYSQLGRAMMARParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(@NotNull MYSQLGRAMMARParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index_stmt(@NotNull MYSQLGRAMMARParser.Drop_index_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#drop_index_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index_stmt(@NotNull MYSQLGRAMMARParser.Drop_index_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(@NotNull MYSQLGRAMMARParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(@NotNull MYSQLGRAMMARParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(@NotNull MYSQLGRAMMARParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(@NotNull MYSQLGRAMMARParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYSQLGRAMMARParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void enterConflict_clause(@NotNull MYSQLGRAMMARParser.Conflict_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYSQLGRAMMARParser#conflict_clause}.
	 * @param ctx the parse tree
	 */
	void exitConflict_clause(@NotNull MYSQLGRAMMARParser.Conflict_clauseContext ctx);
}