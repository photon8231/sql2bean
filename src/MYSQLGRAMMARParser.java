// Generated from MYSQLGRAMMAR.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MYSQLGRAMMARParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, SCOL=2, DOT=3, OPEN_PAR=4, CLOSE_PAR=5, COMMA=6, ASSIGN=7, STAR=8, 
		PLUS=9, MINUS=10, TILDE=11, PIPE2=12, DIV=13, MOD=14, LT2=15, GT2=16, 
		AMP=17, PIPE=18, LT=19, LT_EQ=20, GT=21, GT_EQ=22, EQ=23, NOT_EQ1=24, 
		NOT_EQ2=25, K_ABORT=26, K_ACTION=27, K_ADD=28, K_AFTER=29, K_ALL=30, K_ALTER=31, 
		K_ANALYZE=32, K_AND=33, K_AS=34, K_ASC=35, K_ATTACH=36, K_AUTOINCREMENT=37, 
		K_BEFORE=38, K_BEGIN=39, K_BETWEEN=40, K_BY=41, K_CASCADE=42, K_CASE=43, 
		K_CAST=44, K_CHECK=45, K_COLLATE=46, K_COLUMN=47, K_COMMIT=48, K_COMMENT=49, 
		K_CONFLICT=50, K_CONSTRAINT=51, K_CREATE=52, K_CROSS=53, K_CURRENT_DATE=54, 
		K_CURRENT_TIME=55, K_CURRENT_TIMESTAMP=56, K_DATABASE=57, K_DEFAULT=58, 
		K_DEFERRABLE=59, K_DEFERRED=60, K_DELETE=61, K_DESC=62, K_DETACH=63, K_DISTINCT=64, 
		K_DROP=65, K_EACH=66, K_ELSE=67, K_END=68, K_ESCAPE=69, K_EXCEPT=70, K_EXCLUSIVE=71, 
		K_EXISTS=72, K_EXPLAIN=73, K_FAIL=74, K_FOR=75, K_FOREIGN=76, K_FROM=77, 
		K_FULL=78, K_GLOB=79, K_GROUP=80, K_HAVING=81, K_IF=82, K_IGNORE=83, K_IMMEDIATE=84, 
		K_IN=85, K_INDEX=86, K_INDEXED=87, K_INITIALLY=88, K_INNER=89, K_INSERT=90, 
		K_INSTEAD=91, K_INTERSECT=92, K_INTO=93, K_IS=94, K_ISNULL=95, K_JOIN=96, 
		K_KEY=97, K_LEFT=98, K_LIKE=99, K_LIMIT=100, K_MATCH=101, K_NATURAL=102, 
		K_NO=103, K_NOT=104, K_NOTNULL=105, K_NULL=106, K_OF=107, K_OFFSET=108, 
		K_ON=109, K_OR=110, K_ORDER=111, K_OUTER=112, K_PLAN=113, K_PRAGMA=114, 
		K_PRIMARY=115, K_QUERY=116, K_RAISE=117, K_RECURSIVE=118, K_REFERENCES=119, 
		K_REGEXP=120, K_REINDEX=121, K_RELEASE=122, K_RENAME=123, K_REPLACE=124, 
		K_RESTRICT=125, K_RIGHT=126, K_ROLLBACK=127, K_ROW=128, K_SAVEPOINT=129, 
		K_SELECT=130, K_SET=131, K_TABLE=132, K_TEMP=133, K_TEMPORARY=134, K_THEN=135, 
		K_TO=136, K_TRANSACTION=137, K_TRIGGER=138, K_UNION=139, K_UNIQUE=140, 
		K_UPDATE=141, K_USING=142, K_USE=143, K_VACUUM=144, K_VALUES=145, K_VIEW=146, 
		K_VIRTUAL=147, K_WHEN=148, K_WHERE=149, K_WITH=150, K_WITHOUT=151, IDENTIFIER=152, 
		NUMERIC_LITERAL=153, BIND_PARAMETER=154, STRING_LITERAL=155, BLOB_LITERAL=156, 
		SINGLE_LINE_COMMENT=157, MULTILINE_COMMENT=158, SPACES=159, UNEXPECTED_CHAR=160;
	public static final String[] tokenNames = {
		"<INVALID>", "';'", "SCOL", "'.'", "'('", "')'", "','", "'='", "'*'", 
		"'+'", "'-'", "'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", 
		"'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'<>'", "K_ABORT", "'ACTION'", 
		"'ADD'", "'AFTER'", "'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'AS'", 
		"'ASC'", "'ATTACH'", "'AUTO_INCREMENT'", "'BEFORE'", "'BEGIN'", "'BETWEEN'", 
		"'BY'", "'CASCADE'", "'CASE'", "'CAST'", "'CHECK'", "'COLLATE'", "'COLUMN'", 
		"'COMMIT'", "'COMMENT'", "'CONFLICT'", "'CONSTRAINT'", "'CREATE'", "'CROSS'", 
		"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'DATABASE'", 
		"'DEFAULT'", "'DEFERRABLE'", "'DEFERRED'", "'DELETE'", "'DESC'", "'DETACH'", 
		"'DISTINCT'", "'DROP'", "'EACH'", "'ELSE'", "'END'", "'ESCAPE'", "'EXCEPT'", 
		"'EXCLUSIVE'", "'EXISTS'", "'EXPLAIN'", "'FAIL'", "'FOR'", "'FOREIGN'", 
		"'FROM'", "'FULL'", "'GLOB'", "'GROUP'", "'HAVING'", "'IF'", "'IGNORE'", 
		"'IMMEDIATE'", "'IN'", "'INDEX'", "'INDEXED'", "'INITIALLY'", "'INNER'", 
		"'INSERT'", "'INSTEAD'", "'INTERSECT'", "'INTO'", "'IS'", "'ISNULL'", 
		"'JOIN'", "'KEY'", "'LEFT'", "'LIKE'", "'LIMIT'", "'MATCH'", "'NATURAL'", 
		"'NO'", "'NOT'", "'NOTNULL'", "'NULL'", "'OF'", "'OFFSET'", "'ON'", "'OR'", 
		"'ORDER'", "'OUTER'", "'PLAN'", "'PRAGMA'", "'PRIMARY'", "'QUERY'", "'RAISE'", 
		"'RECURSIVE'", "'REFERENCES'", "'REGEXP'", "'REINDEX'", "'RELEASE'", "'RENAME'", 
		"'REPLACE'", "'RESTRICT'", "'RIGHT'", "'ROLLBACK'", "'ROW'", "'SAVEPOINT'", 
		"'SELECT'", "'SET'", "'TABLE'", "'TEMP'", "'TEMPORARY'", "'THEN'", "'TO'", 
		"'TRANSACTION'", "'TRIGGER'", "'UNION'", "'UNIQUE'", "'UPDATE'", "'USING'", 
		"'USE'", "'VACUUM'", "'VALUES'", "'VIEW'", "'VIRTUAL'", "'WHEN'", "'WHERE'", 
		"'WITH'", "'WITHOUT'", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", 
		"STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", 
		"SPACES", "UNEXPECTED_CHAR"
	};
	public static final int
		RULE_primary_sintax = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_database_stmt = 10, RULE_use_stmt = 11, RULE_create_index_stmt = 12, 
		RULE_create_table_stmt = 13, RULE_table_constraint = 14, RULE_create_trigger_stmt = 15, 
		RULE_create_view_stmt = 16, RULE_create_virtual_table_stmt = 17, RULE_delete_stmt = 18, 
		RULE_delete_stmt_limited = 19, RULE_detach_stmt = 20, RULE_drop_index_stmt = 21, 
		RULE_drop_table_stmt = 22, RULE_drop_trigger_stmt = 23, RULE_drop_view_stmt = 24, 
		RULE_factored_select_stmt = 25, RULE_insert_stmt = 26, RULE_pragma_stmt = 27, 
		RULE_reindex_stmt = 28, RULE_release_stmt = 29, RULE_rollback_stmt = 30, 
		RULE_savepoint_stmt = 31, RULE_simple_select_stmt = 32, RULE_select_stmt = 33, 
		RULE_select_or_values = 34, RULE_update_stmt = 35, RULE_update_stmt_limited = 36, 
		RULE_vacuum_stmt = 37, RULE_column_def = 38, RULE_type_name = 39, RULE_column_constraint = 40, 
		RULE_conflict_clause = 41, RULE_expr = 42, RULE_foreign_key_clause = 43, 
		RULE_raise_function = 44, RULE_indexed_column = 45, RULE_with_clause = 46, 
		RULE_qualified_table_name = 47, RULE_ordering_term = 48, RULE_pragma_value = 49, 
		RULE_common_table_expression = 50, RULE_result_column = 51, RULE_table_or_subquery = 52, 
		RULE_join_clause = 53, RULE_join_operator = 54, RULE_join_constraint = 55, 
		RULE_select_core = 56, RULE_compound_operator = 57, RULE_cte_table_name = 58, 
		RULE_signed_number = 59, RULE_literal_value = 60, RULE_unary_operator = 61, 
		RULE_error_message = 62, RULE_module_argument = 63, RULE_column_alias = 64, 
		RULE_keyword = 65, RULE_name = 66, RULE_function_name = 67, RULE_database_name = 68, 
		RULE_table_name = 69, RULE_table_or_index_name = 70, RULE_new_table_name = 71, 
		RULE_column_name = 72, RULE_collation_name = 73, RULE_foreign_table = 74, 
		RULE_index_name = 75, RULE_trigger_name = 76, RULE_view_name = 77, RULE_module_name = 78, 
		RULE_pragma_name = 79, RULE_savepoint_name = 80, RULE_table_alias = 81, 
		RULE_transaction_name = 82, RULE_any_name = 83;
	public static final String[] ruleNames = {
		"primary_sintax", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", 
		"analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", 
		"create_database_stmt", "use_stmt", "create_index_stmt", "create_table_stmt", 
		"table_constraint", "create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
		"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
		"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "factored_select_stmt", 
		"insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", 
		"savepoint_stmt", "simple_select_stmt", "select_stmt", "select_or_values", 
		"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", "type_name", 
		"column_constraint", "conflict_clause", "expr", "foreign_key_clause", 
		"raise_function", "indexed_column", "with_clause", "qualified_table_name", 
		"ordering_term", "pragma_value", "common_table_expression", "result_column", 
		"table_or_subquery", "join_clause", "join_operator", "join_constraint", 
		"select_core", "compound_operator", "cte_table_name", "signed_number", 
		"literal_value", "unary_operator", "error_message", "module_argument", 
		"column_alias", "keyword", "name", "function_name", "database_name", "table_name", 
		"table_or_index_name", "new_table_name", "column_name", "collation_name", 
		"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
		"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name"
	};

	@Override
	public String getGrammarFileName() { return "MYSQLGRAMMAR.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MYSQLGRAMMARParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Primary_sintaxContext extends ParserRuleContext {
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public TerminalNode EOF() { return getToken(MYSQLGRAMMARParser.EOF, 0); }
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public Primary_sintaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_sintax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterPrimary_sintax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitPrimary_sintax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitPrimary_sintax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primary_sintaxContext primary_sintax() throws RecognitionException {
		Primary_sintaxContext _localctx = new Primary_sintaxContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_primary_sintax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (K_DROP - 65)) | (1L << (K_END - 65)) | (1L << (K_EXPLAIN - 65)) | (1L << (K_INSERT - 65)) | (1L << (K_PRAGMA - 65)) | (1L << (K_REINDEX - 65)) | (1L << (K_RELEASE - 65)) | (1L << (K_REPLACE - 65)) | (1L << (K_ROLLBACK - 65)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (K_SAVEPOINT - 129)) | (1L << (K_SELECT - 129)) | (1L << (K_UPDATE - 129)) | (1L << (K_USE - 129)) | (1L << (K_VACUUM - 129)) | (1L << (K_VALUES - 129)) | (1L << (K_WITH - 129)) | (1L << (UNEXPECTED_CHAR - 129)))) != 0)) {
				{
				setState(170);
				switch (_input.LA(1)) {
				case T__0:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_USE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(168); sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(169); error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(175); match(EOF);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(MYSQLGRAMMARParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); ((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
			     System.out.println("error encontrado en la sintaxis" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null) +" " );
			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
			   
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

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(180); match(T__0);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186); sql_stmt();
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(188); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(187); match(T__0);
						}
						}
						setState(190); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==T__0 );
					setState(192); sql_stmt();
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(198); match(T__0);
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Sql_stmtContext extends ParserRuleContext {
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_PLAN() { return getToken(MYSQLGRAMMARParser.K_PLAN, 0); }
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Use_stmtContext use_stmt() {
			return getRuleContext(Use_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(MYSQLGRAMMARParser.K_EXPLAIN, 0); }
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public TerminalNode K_QUERY() { return getToken(MYSQLGRAMMARParser.K_QUERY, 0); }
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(204); match(K_EXPLAIN);
				setState(207);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(205); match(K_QUERY);
					setState(206); match(K_PLAN);
					}
				}

				}
			}

			setState(243);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(211); alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(212); analyze_stmt();
				}
				break;
			case 3:
				{
				setState(213); attach_stmt();
				}
				break;
			case 4:
				{
				setState(214); begin_stmt();
				}
				break;
			case 5:
				{
				setState(215); commit_stmt();
				}
				break;
			case 6:
				{
				setState(216); compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(217); create_database_stmt();
				}
				break;
			case 8:
				{
				setState(218); create_index_stmt();
				}
				break;
			case 9:
				{
				setState(219); create_table_stmt();
				}
				break;
			case 10:
				{
				setState(220); create_trigger_stmt();
				}
				break;
			case 11:
				{
				setState(221); create_view_stmt();
				}
				break;
			case 12:
				{
				setState(222); create_virtual_table_stmt();
				}
				break;
			case 13:
				{
				setState(223); delete_stmt();
				}
				break;
			case 14:
				{
				setState(224); delete_stmt_limited();
				}
				break;
			case 15:
				{
				setState(225); detach_stmt();
				}
				break;
			case 16:
				{
				setState(226); use_stmt();
				}
				break;
			case 17:
				{
				setState(227); drop_index_stmt();
				}
				break;
			case 18:
				{
				setState(228); drop_table_stmt();
				}
				break;
			case 19:
				{
				setState(229); drop_trigger_stmt();
				}
				break;
			case 20:
				{
				setState(230); drop_view_stmt();
				}
				break;
			case 21:
				{
				setState(231); factored_select_stmt();
				}
				break;
			case 22:
				{
				setState(232); insert_stmt();
				}
				break;
			case 23:
				{
				setState(233); pragma_stmt();
				}
				break;
			case 24:
				{
				setState(234); reindex_stmt();
				}
				break;
			case 25:
				{
				setState(235); release_stmt();
				}
				break;
			case 26:
				{
				setState(236); rollback_stmt();
				}
				break;
			case 27:
				{
				setState(237); savepoint_stmt();
				}
				break;
			case 28:
				{
				setState(238); simple_select_stmt();
				}
				break;
			case 29:
				{
				setState(239); select_stmt();
				}
				break;
			case 30:
				{
				setState(240); update_stmt();
				}
				break;
			case 31:
				{
				setState(241); update_stmt_limited();
				}
				break;
			case 32:
				{
				setState(242); vacuum_stmt();
				}
				break;
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

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(MYSQLGRAMMARParser.K_ADD, 0); }
		public TerminalNode K_ALTER() { return getToken(MYSQLGRAMMARParser.K_ALTER, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(MYSQLGRAMMARParser.K_RENAME, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TABLE() { return getToken(MYSQLGRAMMARParser.K_TABLE, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public TerminalNode K_COLUMN() { return getToken(MYSQLGRAMMARParser.K_COLUMN, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_TO() { return getToken(MYSQLGRAMMARParser.K_TO, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(K_ALTER);
			setState(246); match(K_TABLE);
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(247); database_name();
				setState(248); match(DOT);
				}
				break;
			}
			setState(252); table_name();
			setState(261);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(253); match(K_RENAME);
				setState(254); match(K_TO);
				setState(255); new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(256); match(K_ADD);
				setState(258);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(257); match(K_COLUMN);
					}
					break;
				}
				setState(260); column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Analyze_stmtContext extends ParserRuleContext {
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_ANALYZE() { return getToken(MYSQLGRAMMARParser.K_ANALYZE, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(K_ANALYZE);
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(264); database_name();
				}
				break;
			case 2:
				{
				setState(265); table_or_index_name();
				}
				break;
			case 3:
				{
				setState(266); database_name();
				setState(267); match(DOT);
				setState(268); table_or_index_name();
				}
				break;
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

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DATABASE() { return getToken(MYSQLGRAMMARParser.K_DATABASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(MYSQLGRAMMARParser.K_AS, 0); }
		public TerminalNode K_ATTACH() { return getToken(MYSQLGRAMMARParser.K_ATTACH, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); match(K_ATTACH);
			setState(274);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(273); match(K_DATABASE);
				}
				break;
			}
			setState(276); expr(0);
			setState(277); match(K_AS);
			setState(278); database_name();
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

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_EXCLUSIVE() { return getToken(MYSQLGRAMMARParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(MYSQLGRAMMARParser.K_IMMEDIATE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(MYSQLGRAMMARParser.K_DEFERRED, 0); }
		public TerminalNode K_BEGIN() { return getToken(MYSQLGRAMMARParser.K_BEGIN, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_TRANSACTION() { return getToken(MYSQLGRAMMARParser.K_TRANSACTION, 0); }
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); match(K_BEGIN);
			setState(282);
			_la = _input.LA(1);
			if (((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) {
				{
				setState(281);
				_la = _input.LA(1);
				if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & ((1L << (K_DEFERRED - 60)) | (1L << (K_EXCLUSIVE - 60)) | (1L << (K_IMMEDIATE - 60)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(288);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(284); match(K_TRANSACTION);
				setState(286);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(285); transaction_name();
					}
					break;
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

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(MYSQLGRAMMARParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(MYSQLGRAMMARParser.K_END, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_TRANSACTION() { return getToken(MYSQLGRAMMARParser.K_TRANSACTION, 0); }
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(295);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(291); match(K_TRANSACTION);
				setState(293);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(292); transaction_name();
					}
					break;
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

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(MYSQLGRAMMARParser.K_ORDER, 0); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(MYSQLGRAMMARParser.K_INTERSECT, i);
		}
		public TerminalNode K_EXCEPT(int i) {
			return getToken(MYSQLGRAMMARParser.K_EXCEPT, i);
		}
		public TerminalNode K_LIMIT() { return getToken(MYSQLGRAMMARParser.K_LIMIT, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(MYSQLGRAMMARParser.K_ALL); }
		public TerminalNode K_RECURSIVE() { return getToken(MYSQLGRAMMARParser.K_RECURSIVE, 0); }
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(MYSQLGRAMMARParser.K_INTERSECT); }
		public TerminalNode K_UNION(int i) {
			return getToken(MYSQLGRAMMARParser.K_UNION, i);
		}
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(MYSQLGRAMMARParser.K_EXCEPT); }
		public List<TerminalNode> K_UNION() { return getTokens(MYSQLGRAMMARParser.K_UNION); }
		public TerminalNode K_WITH() { return getToken(MYSQLGRAMMARParser.K_WITH, 0); }
		public TerminalNode K_ALL(int i) {
			return getToken(MYSQLGRAMMARParser.K_ALL, i);
		}
		public TerminalNode K_OFFSET() { return getToken(MYSQLGRAMMARParser.K_OFFSET, 0); }
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(297); match(K_WITH);
				setState(299);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(298); match(K_RECURSIVE);
					}
					break;
				}
				setState(301); common_table_expression();
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(302); match(COMMA);
					setState(303); common_table_expression();
					}
					}
					setState(308);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(311); select_core();
			setState(321); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(318);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(312); match(K_UNION);
					setState(314);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(313); match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(316); match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(317); match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(320); select_core();
				}
				}
				setState(323); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(335);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(325); match(K_ORDER);
				setState(326); match(K_BY);
				setState(327); ordering_term();
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(328); match(COMMA);
					setState(329); ordering_term();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(343);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(337); match(K_LIMIT);
				setState(338); expr(0);
				setState(341);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(339);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(340); expr(0);
					}
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

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode K_DATABASE() { return getToken(MYSQLGRAMMARParser.K_DATABASE, 0); }
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public TerminalNode K_CREATE() { return getToken(MYSQLGRAMMARParser.K_CREATE, 0); }
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCreate_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_database_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); match(K_CREATE);
			setState(346); match(K_DATABASE);
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(347); match(K_IF);
				setState(348); match(K_NOT);
				setState(349); match(K_EXISTS);
				}
				break;
			}
			setState(352); database_name();
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

	public static class Use_stmtContext extends ParserRuleContext {
		public TerminalNode K_USE() { return getToken(MYSQLGRAMMARParser.K_USE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Use_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterUse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitUse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitUse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_stmtContext use_stmt() throws RecognitionException {
		Use_stmtContext _localctx = new Use_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_use_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(K_USE);
			setState(355); database_name();
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_INDEX() { return getToken(MYSQLGRAMMARParser.K_INDEX, 0); }
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode K_ON() { return getToken(MYSQLGRAMMARParser.K_ON, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public TerminalNode K_CREATE() { return getToken(MYSQLGRAMMARParser.K_CREATE, 0); }
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public TerminalNode K_WHERE() { return getToken(MYSQLGRAMMARParser.K_WHERE, 0); }
		public TerminalNode K_UNIQUE() { return getToken(MYSQLGRAMMARParser.K_UNIQUE, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(K_CREATE);
			setState(359);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(358); match(K_UNIQUE);
				}
			}

			setState(361); match(K_INDEX);
			setState(365);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(362); match(K_IF);
				setState(363); match(K_NOT);
				setState(364); match(K_EXISTS);
				}
				break;
			}
			setState(370);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(367); database_name();
				setState(368); match(DOT);
				}
				break;
			}
			setState(372); index_name();
			setState(373); match(K_ON);
			setState(374); table_name();
			setState(375); match(OPEN_PAR);
			setState(376); indexed_column();
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(377); match(COMMA);
				setState(378); indexed_column();
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384); match(CLOSE_PAR);
			setState(387);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(385); match(K_WHERE);
				setState(386); expr(0);
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

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_AS() { return getToken(MYSQLGRAMMARParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public TerminalNode K_TABLE() { return getToken(MYSQLGRAMMARParser.K_TABLE, 0); }
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public TerminalNode K_CREATE() { return getToken(MYSQLGRAMMARParser.K_CREATE, 0); }
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(MYSQLGRAMMARParser.K_TEMPORARY, 0); }
		public TerminalNode K_WITHOUT() { return getToken(MYSQLGRAMMARParser.K_WITHOUT, 0); }
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(MYSQLGRAMMARParser.IDENTIFIER, 0); }
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_TEMP() { return getToken(MYSQLGRAMMARParser.K_TEMP, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(K_CREATE);
			setState(391);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(390);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(393); match(K_TABLE);
			setState(397);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(394); match(K_IF);
				setState(395); match(K_NOT);
				setState(396); match(K_EXISTS);
				}
				break;
			}
			setState(402);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(399); database_name();
				setState(400); match(DOT);
				}
				break;
			}
			setState(404); table_name();
			setState(428);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(405); match(OPEN_PAR);
				setState(406); column_def();
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(407); match(COMMA);
						setState(408); column_def();
						}
						} 
					}
					setState(413);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(414); match(COMMA);
					setState(415); table_constraint();
					}
					}
					setState(420);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(421); match(CLOSE_PAR);
				setState(424);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(422); match(K_WITHOUT);
					setState(423); match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(426); match(K_AS);
				setState(427); select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Table_constraintContext extends ParserRuleContext {
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode K_FOREIGN() { return getToken(MYSQLGRAMMARParser.K_FOREIGN, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(MYSQLGRAMMARParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(MYSQLGRAMMARParser.K_UNIQUE, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(MYSQLGRAMMARParser.K_PRIMARY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(MYSQLGRAMMARParser.K_CHECK, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(MYSQLGRAMMARParser.K_CONSTRAINT, 0); }
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(430); match(K_CONSTRAINT);
				setState(431); name();
				}
			}

			setState(476);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(437);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(434); match(K_PRIMARY);
					setState(435); match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(436); match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(439); match(OPEN_PAR);
				setState(440); indexed_column();
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(441); match(COMMA);
					setState(442); indexed_column();
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448); match(CLOSE_PAR);
				setState(449); conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(451); match(K_CHECK);
				setState(452); match(OPEN_PAR);
				setState(453); expr(0);
				setState(454); match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(456); match(K_FOREIGN);
				setState(457); match(K_KEY);
				setState(458); match(OPEN_PAR);
				setState(459); column_name();
				setState(464);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(460); match(COMMA);
					setState(461); column_name();
					}
					}
					setState(466);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(467); match(CLOSE_PAR);
				setState(468); foreign_key_clause();
				}
				break;
			case K_KEY:
				{
				setState(470); match(K_KEY);
				setState(471); table_or_index_name();
				setState(472); match(OPEN_PAR);
				setState(473); column_name();
				setState(474); match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public TerminalNode K_TRIGGER() { return getToken(MYSQLGRAMMARParser.K_TRIGGER, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_FOR() { return getToken(MYSQLGRAMMARParser.K_FOR, 0); }
		public TerminalNode K_ON() { return getToken(MYSQLGRAMMARParser.K_ON, 0); }
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public TerminalNode K_END() { return getToken(MYSQLGRAMMARParser.K_END, 0); }
		public TerminalNode K_AFTER() { return getToken(MYSQLGRAMMARParser.K_AFTER, 0); }
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public TerminalNode K_CREATE() { return getToken(MYSQLGRAMMARParser.K_CREATE, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public TerminalNode K_WHEN() { return getToken(MYSQLGRAMMARParser.K_WHEN, 0); }
		public TerminalNode K_TEMP() { return getToken(MYSQLGRAMMARParser.K_TEMP, 0); }
		public TerminalNode K_INSTEAD() { return getToken(MYSQLGRAMMARParser.K_INSTEAD, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public TerminalNode K_INSERT() { return getToken(MYSQLGRAMMARParser.K_INSERT, 0); }
		public TerminalNode K_EACH() { return getToken(MYSQLGRAMMARParser.K_EACH, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public TerminalNode K_OF(int i) {
			return getToken(MYSQLGRAMMARParser.K_OF, i);
		}
		public TerminalNode K_DELETE() { return getToken(MYSQLGRAMMARParser.K_DELETE, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(MYSQLGRAMMARParser.K_TEMPORARY, 0); }
		public TerminalNode K_ROW() { return getToken(MYSQLGRAMMARParser.K_ROW, 0); }
		public TerminalNode K_BEGIN() { return getToken(MYSQLGRAMMARParser.K_BEGIN, 0); }
		public TerminalNode K_BEFORE() { return getToken(MYSQLGRAMMARParser.K_BEFORE, 0); }
		public TerminalNode K_UPDATE() { return getToken(MYSQLGRAMMARParser.K_UPDATE, 0); }
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public List<TerminalNode> K_OF() { return getTokens(MYSQLGRAMMARParser.K_OF); }
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478); match(K_CREATE);
			setState(480);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(479);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(482); match(K_TRIGGER);
			setState(486);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(483); match(K_IF);
				setState(484); match(K_NOT);
				setState(485); match(K_EXISTS);
				}
				break;
			}
			setState(491);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(488); database_name();
				setState(489); match(DOT);
				}
				break;
			}
			setState(493); trigger_name();
			setState(498);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(494); match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(495); match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(496); match(K_INSTEAD);
				setState(497); match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(514);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(500); match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(501); match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(502); match(K_UPDATE);
				setState(512);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(503); match(K_OF);
					setState(504); column_name();
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(505); match(COMMA);
						setState(506); column_name();
						}
						}
						setState(511);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(516); match(K_ON);
			setState(520);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(517); database_name();
				setState(518); match(DOT);
				}
				break;
			}
			setState(522); table_name();
			setState(526);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(523); match(K_FOR);
				setState(524); match(K_EACH);
				setState(525); match(K_ROW);
				}
			}

			setState(530);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(528); match(K_WHEN);
				setState(529); expr(0);
				}
			}

			setState(532); match(K_BEGIN);
			setState(541); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(537);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(533); update_stmt();
					}
					break;
				case 2:
					{
					setState(534); insert_stmt();
					}
					break;
				case 3:
					{
					setState(535); delete_stmt();
					}
					break;
				case 4:
					{
					setState(536); select_stmt();
					}
					break;
				}
				setState(539); match(T__0);
				}
				}
				setState(543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_INSERT - 90)) | (1L << (K_REPLACE - 90)) | (1L << (K_SELECT - 90)) | (1L << (K_UPDATE - 90)) | (1L << (K_VALUES - 90)) | (1L << (K_WITH - 90)))) != 0) );
			setState(545); match(K_END);
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

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(MYSQLGRAMMARParser.K_AS, 0); }
		public TerminalNode K_TEMP() { return getToken(MYSQLGRAMMARParser.K_TEMP, 0); }
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public TerminalNode K_VIEW() { return getToken(MYSQLGRAMMARParser.K_VIEW, 0); }
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_CREATE() { return getToken(MYSQLGRAMMARParser.K_CREATE, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(MYSQLGRAMMARParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547); match(K_CREATE);
			setState(549);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(548);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(551); match(K_VIEW);
			setState(555);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(552); match(K_IF);
				setState(553); match(K_NOT);
				setState(554); match(K_EXISTS);
				}
				break;
			}
			setState(560);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(557); database_name();
				setState(558); match(DOT);
				}
				break;
			}
			setState(562); view_name();
			setState(563); match(K_AS);
			setState(564); select_stmt();
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

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_VIRTUAL() { return getToken(MYSQLGRAMMARParser.K_VIRTUAL, 0); }
		public TerminalNode K_USING() { return getToken(MYSQLGRAMMARParser.K_USING, 0); }
		public TerminalNode K_TABLE() { return getToken(MYSQLGRAMMARParser.K_TABLE, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public TerminalNode K_CREATE() { return getToken(MYSQLGRAMMARParser.K_CREATE, 0); }
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566); match(K_CREATE);
			setState(567); match(K_VIRTUAL);
			setState(568); match(K_TABLE);
			setState(572);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(569); match(K_IF);
				setState(570); match(K_NOT);
				setState(571); match(K_EXISTS);
				}
				break;
			}
			setState(577);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(574); database_name();
				setState(575); match(DOT);
				}
				break;
			}
			setState(579); table_name();
			setState(580); match(K_USING);
			setState(581); module_name();
			setState(593);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(582); match(OPEN_PAR);
				setState(583); module_argument();
				setState(588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(584); match(COMMA);
					setState(585); module_argument();
					}
					}
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(591); match(CLOSE_PAR);
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

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_WHERE() { return getToken(MYSQLGRAMMARParser.K_WHERE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FROM() { return getToken(MYSQLGRAMMARParser.K_FROM, 0); }
		public TerminalNode K_DELETE() { return getToken(MYSQLGRAMMARParser.K_DELETE, 0); }
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(595); with_clause();
				}
			}

			setState(598); match(K_DELETE);
			setState(599); match(K_FROM);
			setState(600); qualified_table_name();
			setState(603);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(601); match(K_WHERE);
				setState(602); expr(0);
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

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(MYSQLGRAMMARParser.K_ORDER, 0); }
		public TerminalNode K_WHERE() { return getToken(MYSQLGRAMMARParser.K_WHERE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_LIMIT() { return getToken(MYSQLGRAMMARParser.K_LIMIT, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_FROM() { return getToken(MYSQLGRAMMARParser.K_FROM, 0); }
		public TerminalNode K_DELETE() { return getToken(MYSQLGRAMMARParser.K_DELETE, 0); }
		public TerminalNode K_OFFSET() { return getToken(MYSQLGRAMMARParser.K_OFFSET, 0); }
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(605); with_clause();
				}
			}

			setState(608); match(K_DELETE);
			setState(609); match(K_FROM);
			setState(610); qualified_table_name();
			setState(613);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(611); match(K_WHERE);
				setState(612); expr(0);
				}
			}

			setState(633);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(625);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(615); match(K_ORDER);
					setState(616); match(K_BY);
					setState(617); ordering_term();
					setState(622);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(618); match(COMMA);
						setState(619); ordering_term();
						}
						}
						setState(624);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(627); match(K_LIMIT);
				setState(628); expr(0);
				setState(631);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(629);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(630); expr(0);
					}
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

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DATABASE() { return getToken(MYSQLGRAMMARParser.K_DATABASE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DETACH() { return getToken(MYSQLGRAMMARParser.K_DETACH, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635); match(K_DETACH);
			setState(637);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(636); match(K_DATABASE);
				}
				break;
			}
			setState(639); database_name();
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

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_INDEX() { return getToken(MYSQLGRAMMARParser.K_INDEX, 0); }
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public TerminalNode K_DROP() { return getToken(MYSQLGRAMMARParser.K_DROP, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641); match(K_DROP);
			setState(642); match(K_INDEX);
			setState(645);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(643); match(K_IF);
				setState(644); match(K_EXISTS);
				}
				break;
			}
			setState(650);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(647); database_name();
				setState(648); match(DOT);
				}
				break;
			}
			setState(652); index_name();
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

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public TerminalNode K_DROP() { return getToken(MYSQLGRAMMARParser.K_DROP, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_TABLE() { return getToken(MYSQLGRAMMARParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654); match(K_DROP);
			setState(655); match(K_TABLE);
			setState(658);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				{
				setState(656); match(K_IF);
				setState(657); match(K_EXISTS);
				}
				break;
			}
			setState(663);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(660); database_name();
				setState(661); match(DOT);
				}
				break;
			}
			setState(665); table_name();
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

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_TRIGGER() { return getToken(MYSQLGRAMMARParser.K_TRIGGER, 0); }
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public TerminalNode K_DROP() { return getToken(MYSQLGRAMMARParser.K_DROP, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667); match(K_DROP);
			setState(668); match(K_TRIGGER);
			setState(671);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(669); match(K_IF);
				setState(670); match(K_EXISTS);
				}
				break;
			}
			setState(676);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(673); database_name();
				setState(674); match(DOT);
				}
				break;
			}
			setState(678); trigger_name();
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

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_DROP() { return getToken(MYSQLGRAMMARParser.K_DROP, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_VIEW() { return getToken(MYSQLGRAMMARParser.K_VIEW, 0); }
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680); match(K_DROP);
			setState(681); match(K_VIEW);
			setState(684);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(682); match(K_IF);
				setState(683); match(K_EXISTS);
				}
				break;
			}
			setState(689);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(686); database_name();
				setState(687); match(DOT);
				}
				break;
			}
			setState(691); view_name();
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

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(MYSQLGRAMMARParser.K_ORDER, 0); }
		public TerminalNode K_LIMIT() { return getToken(MYSQLGRAMMARParser.K_LIMIT, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(MYSQLGRAMMARParser.K_RECURSIVE, 0); }
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(MYSQLGRAMMARParser.K_WITH, 0); }
		public TerminalNode K_OFFSET() { return getToken(MYSQLGRAMMARParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(693); match(K_WITH);
				setState(695);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(694); match(K_RECURSIVE);
					}
					break;
				}
				setState(697); common_table_expression();
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(698); match(COMMA);
					setState(699); common_table_expression();
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(707); select_core();
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(708); compound_operator();
				setState(709); select_core();
				}
				}
				setState(715);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(716); match(K_ORDER);
				setState(717); match(K_BY);
				setState(718); ordering_term();
				setState(723);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(719); match(COMMA);
					setState(720); ordering_term();
					}
					}
					setState(725);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(734);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(728); match(K_LIMIT);
				setState(729); expr(0);
				setState(732);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(730);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(731); expr(0);
					}
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

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(MYSQLGRAMMARParser.K_DEFAULT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_INSERT() { return getToken(MYSQLGRAMMARParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(MYSQLGRAMMARParser.K_REPLACE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ROLLBACK() { return getToken(MYSQLGRAMMARParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(MYSQLGRAMMARParser.K_ABORT, 0); }
		public TerminalNode K_INTO() { return getToken(MYSQLGRAMMARParser.K_INTO, 0); }
		public TerminalNode K_FAIL() { return getToken(MYSQLGRAMMARParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(MYSQLGRAMMARParser.K_IGNORE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(MYSQLGRAMMARParser.K_VALUES, 0); }
		public TerminalNode K_OR() { return getToken(MYSQLGRAMMARParser.K_OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(736); with_clause();
				}
			}

			setState(756);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(739); match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(740); match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(741); match(K_INSERT);
				setState(742); match(K_OR);
				setState(743); match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(744); match(K_INSERT);
				setState(745); match(K_OR);
				setState(746); match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(747); match(K_INSERT);
				setState(748); match(K_OR);
				setState(749); match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(750); match(K_INSERT);
				setState(751); match(K_OR);
				setState(752); match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(753); match(K_INSERT);
				setState(754); match(K_OR);
				setState(755); match(K_IGNORE);
				}
				break;
			}
			setState(758); match(K_INTO);
			setState(762);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(759); database_name();
				setState(760); match(DOT);
				}
				break;
			}
			setState(764); table_name();
			setState(776);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(765); match(OPEN_PAR);
				setState(766); column_name();
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(767); match(COMMA);
					setState(768); column_name();
					}
					}
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(774); match(CLOSE_PAR);
				}
			}

			setState(809);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(778); match(K_VALUES);
				setState(779); match(OPEN_PAR);
				setState(780); expr(0);
				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(781); match(COMMA);
					setState(782); expr(0);
					}
					}
					setState(787);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(788); match(CLOSE_PAR);
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(789); match(COMMA);
					setState(790); match(OPEN_PAR);
					setState(791); expr(0);
					setState(796);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(792); match(COMMA);
						setState(793); expr(0);
						}
						}
						setState(798);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(799); match(CLOSE_PAR);
					}
					}
					setState(805);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(806); select_stmt();
				}
				break;
			case 3:
				{
				setState(807); match(K_DEFAULT);
				setState(808); match(K_VALUES);
				}
				break;
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

	public static class Pragma_stmtContext extends ParserRuleContext {
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_PRAGMA() { return getToken(MYSQLGRAMMARParser.K_PRAGMA, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811); match(K_PRAGMA);
			setState(815);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(812); database_name();
				setState(813); match(DOT);
				}
				break;
			}
			setState(817); pragma_name();
			setState(824);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(818); match(ASSIGN);
				setState(819); pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(820); match(OPEN_PAR);
				setState(821); pragma_value();
				setState(822); match(CLOSE_PAR);
				}
				break;
			case EOF:
			case T__0:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_USE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_REINDEX() { return getToken(MYSQLGRAMMARParser.K_REINDEX, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826); match(K_REINDEX);
			setState(837);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(827); collation_name();
				}
				break;
			case 2:
				{
				setState(831);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(828); database_name();
					setState(829); match(DOT);
					}
					break;
				}
				setState(835);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(833); table_name();
					}
					break;
				case 2:
					{
					setState(834); index_name();
					}
					break;
				}
				}
				break;
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

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(MYSQLGRAMMARParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(MYSQLGRAMMARParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(839); match(K_RELEASE);
			setState(841);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(840); match(K_SAVEPOINT);
				}
				break;
			}
			setState(843); savepoint_name();
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

	public static class Rollback_stmtContext extends ParserRuleContext {
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(MYSQLGRAMMARParser.K_SAVEPOINT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(MYSQLGRAMMARParser.K_ROLLBACK, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_TRANSACTION() { return getToken(MYSQLGRAMMARParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(MYSQLGRAMMARParser.K_TO, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845); match(K_ROLLBACK);
			setState(850);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(846); match(K_TRANSACTION);
				setState(848);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(847); transaction_name();
					}
					break;
				}
				}
			}

			setState(857);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(852); match(K_TO);
				setState(854);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(853); match(K_SAVEPOINT);
					}
					break;
				}
				setState(856); savepoint_name();
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

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(MYSQLGRAMMARParser.K_SAVEPOINT, 0); }
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859); match(K_SAVEPOINT);
			setState(860); savepoint_name();
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

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(MYSQLGRAMMARParser.K_ORDER, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public TerminalNode K_LIMIT() { return getToken(MYSQLGRAMMARParser.K_LIMIT, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(MYSQLGRAMMARParser.K_RECURSIVE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(MYSQLGRAMMARParser.K_WITH, 0); }
		public TerminalNode K_OFFSET() { return getToken(MYSQLGRAMMARParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(874);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(862); match(K_WITH);
				setState(864);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(863); match(K_RECURSIVE);
					}
					break;
				}
				setState(866); common_table_expression();
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(867); match(COMMA);
					setState(868); common_table_expression();
					}
					}
					setState(873);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(876); select_core();
			setState(887);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(877); match(K_ORDER);
				setState(878); match(K_BY);
				setState(879); ordering_term();
				setState(884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(880); match(COMMA);
					setState(881); ordering_term();
					}
					}
					setState(886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(895);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(889); match(K_LIMIT);
				setState(890); expr(0);
				setState(893);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(891);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(892); expr(0);
					}
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

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(MYSQLGRAMMARParser.K_ORDER, 0); }
		public TerminalNode K_LIMIT() { return getToken(MYSQLGRAMMARParser.K_LIMIT, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(MYSQLGRAMMARParser.K_RECURSIVE, 0); }
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(MYSQLGRAMMARParser.K_WITH, 0); }
		public TerminalNode K_OFFSET() { return getToken(MYSQLGRAMMARParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(897); match(K_WITH);
				setState(899);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(898); match(K_RECURSIVE);
					}
					break;
				}
				setState(901); common_table_expression();
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(902); match(COMMA);
					setState(903); common_table_expression();
					}
					}
					setState(908);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(911); select_or_values();
			setState(917);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(912); compound_operator();
				setState(913); select_or_values();
				}
				}
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(930);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(920); match(K_ORDER);
				setState(921); match(K_BY);
				setState(922); ordering_term();
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(923); match(COMMA);
					setState(924); ordering_term();
					}
					}
					setState(929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(938);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(932); match(K_LIMIT);
				setState(933); expr(0);
				setState(936);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(934);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(935); expr(0);
					}
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

	public static class Select_or_valuesContext extends ParserRuleContext {
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public TerminalNode K_GROUP() { return getToken(MYSQLGRAMMARParser.K_GROUP, 0); }
		public TerminalNode K_ALL() { return getToken(MYSQLGRAMMARParser.K_ALL, 0); }
		public TerminalNode K_FROM() { return getToken(MYSQLGRAMMARParser.K_FROM, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public TerminalNode K_SELECT() { return getToken(MYSQLGRAMMARParser.K_SELECT, 0); }
		public TerminalNode K_WHERE() { return getToken(MYSQLGRAMMARParser.K_WHERE, 0); }
		public TerminalNode K_VALUES() { return getToken(MYSQLGRAMMARParser.K_VALUES, 0); }
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(MYSQLGRAMMARParser.K_DISTINCT, 0); }
		public TerminalNode K_HAVING() { return getToken(MYSQLGRAMMARParser.K_HAVING, 0); }
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_select_or_values);
		int _la;
		try {
			setState(1014);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(940); match(K_SELECT);
				setState(942);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(941);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(944); result_column();
				setState(949);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(945); match(COMMA);
					setState(946); result_column();
					}
					}
					setState(951);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(964);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(952); match(K_FROM);
					setState(962);
					switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
					case 1:
						{
						setState(953); table_or_subquery();
						setState(958);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(954); match(COMMA);
							setState(955); table_or_subquery();
							}
							}
							setState(960);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(961); join_clause();
						}
						break;
					}
					}
				}

				setState(968);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(966); match(K_WHERE);
					setState(967); expr(0);
					}
				}

				setState(984);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(970); match(K_GROUP);
					setState(971); match(K_BY);
					setState(972); expr(0);
					setState(977);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(973); match(COMMA);
						setState(974); expr(0);
						}
						}
						setState(979);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(982);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(980); match(K_HAVING);
						setState(981); expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(986); match(K_VALUES);
				setState(987); match(OPEN_PAR);
				setState(988); expr(0);
				setState(993);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(989); match(COMMA);
					setState(990); expr(0);
					}
					}
					setState(995);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(996); match(CLOSE_PAR);
				setState(1011);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(997); match(COMMA);
					setState(998); match(OPEN_PAR);
					setState(999); expr(0);
					setState(1004);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1000); match(COMMA);
						setState(1001); expr(0);
						}
						}
						setState(1006);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1007); match(CLOSE_PAR);
					}
					}
					setState(1013);
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

	public static class Update_stmtContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_REPLACE() { return getToken(MYSQLGRAMMARParser.K_REPLACE, 0); }
		public TerminalNode K_SET() { return getToken(MYSQLGRAMMARParser.K_SET, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ROLLBACK() { return getToken(MYSQLGRAMMARParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(MYSQLGRAMMARParser.K_ABORT, 0); }
		public TerminalNode K_IGNORE() { return getToken(MYSQLGRAMMARParser.K_IGNORE, 0); }
		public TerminalNode K_FAIL() { return getToken(MYSQLGRAMMARParser.K_FAIL, 0); }
		public TerminalNode K_WHERE() { return getToken(MYSQLGRAMMARParser.K_WHERE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_OR() { return getToken(MYSQLGRAMMARParser.K_OR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_UPDATE() { return getToken(MYSQLGRAMMARParser.K_UPDATE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1016); with_clause();
				}
			}

			setState(1019); match(K_UPDATE);
			setState(1030);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1020); match(K_OR);
				setState(1021); match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1022); match(K_OR);
				setState(1023); match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1024); match(K_OR);
				setState(1025); match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1026); match(K_OR);
				setState(1027); match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1028); match(K_OR);
				setState(1029); match(K_IGNORE);
				}
				break;
			}
			setState(1032); qualified_table_name();
			setState(1033); match(K_SET);
			setState(1034); column_name();
			setState(1035); match(ASSIGN);
			setState(1036); expr(0);
			setState(1044);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1037); match(COMMA);
				setState(1038); column_name();
				setState(1039); match(ASSIGN);
				setState(1040); expr(0);
				}
				}
				setState(1046);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1049);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1047); match(K_WHERE);
				setState(1048); expr(0);
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

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(MYSQLGRAMMARParser.K_ORDER, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_REPLACE() { return getToken(MYSQLGRAMMARParser.K_REPLACE, 0); }
		public TerminalNode K_LIMIT() { return getToken(MYSQLGRAMMARParser.K_LIMIT, 0); }
		public TerminalNode K_SET() { return getToken(MYSQLGRAMMARParser.K_SET, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_ROLLBACK() { return getToken(MYSQLGRAMMARParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(MYSQLGRAMMARParser.K_ABORT, 0); }
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_IGNORE() { return getToken(MYSQLGRAMMARParser.K_IGNORE, 0); }
		public TerminalNode K_FAIL() { return getToken(MYSQLGRAMMARParser.K_FAIL, 0); }
		public TerminalNode K_WHERE() { return getToken(MYSQLGRAMMARParser.K_WHERE, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_OR() { return getToken(MYSQLGRAMMARParser.K_OR, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_UPDATE() { return getToken(MYSQLGRAMMARParser.K_UPDATE, 0); }
		public TerminalNode K_OFFSET() { return getToken(MYSQLGRAMMARParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1051); with_clause();
				}
			}

			setState(1054); match(K_UPDATE);
			setState(1065);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1055); match(K_OR);
				setState(1056); match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1057); match(K_OR);
				setState(1058); match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1059); match(K_OR);
				setState(1060); match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1061); match(K_OR);
				setState(1062); match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1063); match(K_OR);
				setState(1064); match(K_IGNORE);
				}
				break;
			}
			setState(1067); qualified_table_name();
			setState(1068); match(K_SET);
			setState(1069); column_name();
			setState(1070); match(ASSIGN);
			setState(1071); expr(0);
			setState(1079);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1072); match(COMMA);
				setState(1073); column_name();
				setState(1074); match(ASSIGN);
				setState(1075); expr(0);
				}
				}
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1084);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1082); match(K_WHERE);
				setState(1083); expr(0);
				}
			}

			setState(1104);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1096);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1086); match(K_ORDER);
					setState(1087); match(K_BY);
					setState(1088); ordering_term();
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1089); match(COMMA);
						setState(1090); ordering_term();
						}
						}
						setState(1095);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1098); match(K_LIMIT);
				setState(1099); expr(0);
				setState(1102);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1100);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1101); expr(0);
					}
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

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(MYSQLGRAMMARParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106); match(K_VACUUM);
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

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1108); column_name();
			setState(1110);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1109); type_name();
				}
				break;
			}
			setState(1115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COMMENT) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_NOT - 104)) | (1L << (K_NULL - 104)) | (1L << (K_PRIMARY - 104)) | (1L << (K_REFERENCES - 104)) | (1L << (K_UNIQUE - 104)))) != 0)) {
				{
				{
				setState(1112); column_constraint();
				}
				}
				setState(1117);
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

	public static class Type_nameContext extends ParserRuleContext {
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118); name();
			setState(1129);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1119); match(OPEN_PAR);
				setState(1120); signed_number();
				setState(1121); match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1123); match(OPEN_PAR);
				setState(1124); signed_number();
				setState(1125); match(COMMA);
				setState(1126); signed_number();
				setState(1127); match(CLOSE_PAR);
				}
				break;
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

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(MYSQLGRAMMARParser.K_DEFAULT, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(MYSQLGRAMMARParser.STRING_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(MYSQLGRAMMARParser.K_NULL, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_KEY() { return getToken(MYSQLGRAMMARParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_UNIQUE() { return getToken(MYSQLGRAMMARParser.K_UNIQUE, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(MYSQLGRAMMARParser.K_PRIMARY, 0); }
		public TerminalNode K_ASC() { return getToken(MYSQLGRAMMARParser.K_ASC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(MYSQLGRAMMARParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_COMMENT() { return getToken(MYSQLGRAMMARParser.K_COMMENT, 0); }
		public TerminalNode K_COLLATE() { return getToken(MYSQLGRAMMARParser.K_COLLATE, 0); }
		public TerminalNode K_DESC() { return getToken(MYSQLGRAMMARParser.K_DESC, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(MYSQLGRAMMARParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CHECK() { return getToken(MYSQLGRAMMARParser.K_CHECK, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1131); match(K_CONSTRAINT);
				setState(1132); name();
				}
			}

			setState(1173);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1135); match(K_PRIMARY);
				setState(1136); match(K_KEY);
				setState(1138);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1137);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(1140); conflict_clause();
				setState(1142);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1141); match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1145);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1144); match(K_NOT);
					}
				}

				setState(1147); match(K_NULL);
				setState(1148); conflict_clause();
				setState(1150);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1149); match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_UNIQUE:
				{
				setState(1152); match(K_UNIQUE);
				setState(1153); conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1154); match(K_CHECK);
				setState(1155); match(OPEN_PAR);
				setState(1156); expr(0);
				setState(1157); match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1159); match(K_DEFAULT);
				setState(1166);
				switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
				case 1:
					{
					setState(1160); signed_number();
					}
					break;
				case 2:
					{
					setState(1161); literal_value();
					}
					break;
				case 3:
					{
					setState(1162); match(OPEN_PAR);
					setState(1163); expr(0);
					setState(1164); match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1168); match(K_COLLATE);
				setState(1169); collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1170); foreign_key_clause();
				}
				break;
			case K_COMMENT:
				{
				setState(1171); match(K_COMMENT);
				setState(1172); match(STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_CONFLICT() { return getToken(MYSQLGRAMMARParser.K_CONFLICT, 0); }
		public TerminalNode K_REPLACE() { return getToken(MYSQLGRAMMARParser.K_REPLACE, 0); }
		public TerminalNode K_ON() { return getToken(MYSQLGRAMMARParser.K_ON, 0); }
		public TerminalNode K_ABORT() { return getToken(MYSQLGRAMMARParser.K_ABORT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(MYSQLGRAMMARParser.K_ROLLBACK, 0); }
		public TerminalNode K_IGNORE() { return getToken(MYSQLGRAMMARParser.K_IGNORE, 0); }
		public TerminalNode K_FAIL() { return getToken(MYSQLGRAMMARParser.K_FAIL, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1178);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1175); match(K_ON);
				setState(1176); match(K_CONFLICT);
				setState(1177);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (K_FAIL - 74)) | (1L << (K_IGNORE - 74)) | (1L << (K_REPLACE - 74)) | (1L << (K_ROLLBACK - 74)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionDBTableColContext extends ExprContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public ExpressionDBTableColContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterExpressionDBTableCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitExpressionDBTableCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitExpressionDBTableCol(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotexistexpressionContext extends ExprContext {
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public NotexistexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterNotexistexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitNotexistexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitNotexistexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionORContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExpressionORContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterExpressionOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitExpressionOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitExpressionOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssustituteexpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(MYSQLGRAMMARParser.K_AS, 0); }
		public TerminalNode K_CAST() { return getToken(MYSQLGRAMMARParser.K_CAST, 0); }
		public AssustituteexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterAssustituteexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitAssustituteexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitAssustituteexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuntionexpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(MYSQLGRAMMARParser.K_DISTINCT, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public FuntionexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterFuntionexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitFuntionexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitFuntionexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnitaryexpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public UnitaryexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterUnitaryexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitUnitaryexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitUnitaryexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparationExpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparationExpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterComparationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitComparationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitComparationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionNumeralContext extends ExprContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public ExpressionNumeralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterExpressionNumeral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitExpressionNumeral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitExpressionNumeral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotinexpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IN() { return getToken(MYSQLGRAMMARParser.K_IN, 0); }
		public NotinexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterNotinexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitNotinexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitNotinexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EquexpressionContext extends ExprContext {
		public TerminalNode K_GLOB() { return getToken(MYSQLGRAMMARParser.K_GLOB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_REGEXP() { return getToken(MYSQLGRAMMARParser.K_REGEXP, 0); }
		public TerminalNode K_LIKE() { return getToken(MYSQLGRAMMARParser.K_LIKE, 0); }
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public TerminalNode K_MATCH() { return getToken(MYSQLGRAMMARParser.K_MATCH, 0); }
		public TerminalNode K_IN() { return getToken(MYSQLGRAMMARParser.K_IN, 0); }
		public TerminalNode K_IS() { return getToken(MYSQLGRAMMARParser.K_IS, 0); }
		public EquexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterEquexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitEquexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitEquexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsornotexpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public TerminalNode K_IS() { return getToken(MYSQLGRAMMARParser.K_IS, 0); }
		public IsornotexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterIsornotexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitIsornotexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitIsornotexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinexpressionContext extends ExprContext {
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public JoinexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterJoinexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitJoinexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitJoinexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddRestexpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddRestexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterAddRestexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitAddRestexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitAddRestexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AglomeraexpressionContext extends ExprContext {
		public TerminalNode K_GLOB() { return getToken(MYSQLGRAMMARParser.K_GLOB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_ESCAPE() { return getToken(MYSQLGRAMMARParser.K_ESCAPE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public TerminalNode K_REGEXP() { return getToken(MYSQLGRAMMARParser.K_REGEXP, 0); }
		public TerminalNode K_LIKE() { return getToken(MYSQLGRAMMARParser.K_LIKE, 0); }
		public TerminalNode K_MATCH() { return getToken(MYSQLGRAMMARParser.K_MATCH, 0); }
		public AglomeraexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterAglomeraexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitAglomeraexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitAglomeraexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompnotbetweenexpressionContext extends ExprContext {
		public TerminalNode K_BETWEEN() { return getToken(MYSQLGRAMMARParser.K_BETWEEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_AND() { return getToken(MYSQLGRAMMARParser.K_AND, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public CompnotbetweenexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCompnotbetweenexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCompnotbetweenexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCompnotbetweenexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullcompexpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_NOTNULL() { return getToken(MYSQLGRAMMARParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(MYSQLGRAMMARParser.K_NULL, 0); }
		public TerminalNode K_ISNULL() { return getToken(MYSQLGRAMMARParser.K_ISNULL, 0); }
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public NullcompexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterNullcompexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitNullcompexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitNullcompexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CollationexpressionContext extends ExprContext {
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(MYSQLGRAMMARParser.K_COLLATE, 0); }
		public CollationexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCollationexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCollationexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCollationexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrwhileexpressionContext extends ExprContext {
		public TerminalNode K_OR() { return getToken(MYSQLGRAMMARParser.K_OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrwhileexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterOrwhileexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitOrwhileexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitOrwhileexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivexpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterMulDivexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitMulDivexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitMulDivexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndwhileexpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_AND() { return getToken(MYSQLGRAMMARParser.K_AND, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndwhileexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterAndwhileexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitAndwhileexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitAndwhileexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BitManiexpressionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BitManiexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterBitManiexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitBitManiexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitBitManiexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenexpressionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterParenexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitParenexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitParenexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BindexpressionContext extends ExprContext {
		public TerminalNode BIND_PARAMETER() { return getToken(MYSQLGRAMMARParser.BIND_PARAMETER, 0); }
		public BindexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterBindexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitBindexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitBindexpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WheneventexpressionContext extends ExprContext {
		public TerminalNode K_THEN(int i) {
			return getToken(MYSQLGRAMMARParser.K_THEN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<TerminalNode> K_WHEN() { return getTokens(MYSQLGRAMMARParser.K_WHEN); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_ELSE() { return getToken(MYSQLGRAMMARParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(MYSQLGRAMMARParser.K_END, 0); }
		public List<TerminalNode> K_THEN() { return getTokens(MYSQLGRAMMARParser.K_THEN); }
		public TerminalNode K_CASE() { return getToken(MYSQLGRAMMARParser.K_CASE, 0); }
		public TerminalNode K_WHEN(int i) {
			return getToken(MYSQLGRAMMARParser.K_WHEN, i);
		}
		public WheneventexpressionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterWheneventexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitWheneventexpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitWheneventexpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				_localctx = new UnitaryexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1181); unary_operator();
				setState(1182); expr(21);
				}
				break;
			case 2:
				{
				_localctx = new ExpressionNumeralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1184); literal_value();
				}
				break;
			case 3:
				{
				_localctx = new BindexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1185); match(BIND_PARAMETER);
				}
				break;
			case 4:
				{
				_localctx = new ExpressionDBTableColContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1194);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1189);
					switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
					case 1:
						{
						setState(1186); database_name();
						setState(1187); match(DOT);
						}
						break;
					}
					setState(1191); table_name();
					setState(1192); match(DOT);
					}
					break;
				}
				setState(1196); column_name();
				}
				break;
			case 5:
				{
				_localctx = new FuntionexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1197); function_name();
				setState(1198); match(OPEN_PAR);
				setState(1211);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_USE:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1200);
					switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
					case 1:
						{
						setState(1199); match(K_DISTINCT);
						}
						break;
					}
					setState(1202); expr(0);
					setState(1207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1203); match(COMMA);
						setState(1204); expr(0);
						}
						}
						setState(1209);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1210); match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1213); match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				_localctx = new ParenexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1215); match(OPEN_PAR);
				setState(1216); expr(0);
				setState(1217); match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				_localctx = new AssustituteexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1219); match(K_CAST);
				setState(1220); match(OPEN_PAR);
				setState(1221); expr(0);
				setState(1222); match(K_AS);
				setState(1223); type_name();
				setState(1224); match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				_localctx = new NotexistexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1230);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1227);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1226); match(K_NOT);
						}
					}

					setState(1229); match(K_EXISTS);
					}
				}

				setState(1232); match(OPEN_PAR);
				setState(1233); select_stmt();
				setState(1234); match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				_localctx = new WheneventexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1236); match(K_CASE);
				setState(1238);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1237); expr(0);
					}
					break;
				}
				setState(1245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1240); match(K_WHEN);
					setState(1241); expr(0);
					setState(1242); match(K_THEN);
					setState(1243); expr(0);
					}
					}
					setState(1247); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1251);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1249); match(K_ELSE);
					setState(1250); expr(0);
					}
				}

				setState(1253); match(K_END);
				}
				break;
			case 10:
				{
				_localctx = new JoinexpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1255); raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1358);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1356);
					switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionORContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1258);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1259); match(PIPE2);
						setState(1260); expr(21);
						}
						break;
					case 2:
						{
						_localctx = new MulDivexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1261);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1262);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1263); expr(20);
						}
						break;
					case 3:
						{
						_localctx = new AddRestexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1264);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1265);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1266); expr(19);
						}
						break;
					case 4:
						{
						_localctx = new BitManiexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1267);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1268);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1269); expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ComparationExpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1270);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1271);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1272); expr(17);
						}
						break;
					case 6:
						{
						_localctx = new EquexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1273);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1286);
						switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
						case 1:
							{
							setState(1274); match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1275); match(EQ);
							}
							break;
						case 3:
							{
							setState(1276); match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1277); match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1278); match(K_IS);
							}
							break;
						case 6:
							{
							setState(1279); match(K_IS);
							setState(1280); match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1281); match(K_IN);
							}
							break;
						case 8:
							{
							setState(1282); match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1283); match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1284); match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1285); match(K_REGEXP);
							}
							break;
						}
						setState(1288); expr(16);
						}
						break;
					case 7:
						{
						_localctx = new AndwhileexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1289);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1290); match(K_AND);
						setState(1291); expr(15);
						}
						break;
					case 8:
						{
						_localctx = new OrwhileexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1292);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1293); match(K_OR);
						setState(1294); expr(14);
						}
						break;
					case 9:
						{
						_localctx = new IsornotexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1295);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1296); match(K_IS);
						setState(1298);
						switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
						case 1:
							{
							setState(1297); match(K_NOT);
							}
							break;
						}
						setState(1300); expr(7);
						}
						break;
					case 10:
						{
						_localctx = new CompnotbetweenexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1301);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1303);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1302); match(K_NOT);
							}
						}

						setState(1305); match(K_BETWEEN);
						setState(1306); expr(0);
						setState(1307); match(K_AND);
						setState(1308); expr(6);
						}
						break;
					case 11:
						{
						_localctx = new CollationexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1310);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1311); match(K_COLLATE);
						setState(1312); collation_name();
						}
						break;
					case 12:
						{
						_localctx = new AglomeraexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1313);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1315);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1314); match(K_NOT);
							}
						}

						setState(1317);
						_la = _input.LA(1);
						if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & ((1L << (K_GLOB - 79)) | (1L << (K_LIKE - 79)) | (1L << (K_MATCH - 79)) | (1L << (K_REGEXP - 79)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(1318); expr(0);
						setState(1321);
						switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
						case 1:
							{
							setState(1319); match(K_ESCAPE);
							setState(1320); expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new NullcompexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1323);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1328);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1324); match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1325); match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1326); match(K_NOT);
							setState(1327); match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new NotinexpressionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1330);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1332);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1331); match(K_NOT);
							}
						}

						setState(1334); match(K_IN);
						setState(1354);
						switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
						case 1:
							{
							setState(1335); match(OPEN_PAR);
							setState(1345);
							switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
							case 1:
								{
								setState(1336); select_stmt();
								}
								break;
							case 2:
								{
								setState(1337); expr(0);
								setState(1342);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1338); match(COMMA);
									setState(1339); expr(0);
									}
									}
									setState(1344);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1347); match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1351);
							switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
							case 1:
								{
								setState(1348); database_name();
								setState(1349); match(DOT);
								}
								break;
							}
							setState(1353); table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,184,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_IMMEDIATE() { return getToken(MYSQLGRAMMARParser.K_IMMEDIATE, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public List<TerminalNode> K_ON() { return getTokens(MYSQLGRAMMARParser.K_ON); }
		public TerminalNode K_MATCH(int i) {
			return getToken(MYSQLGRAMMARParser.K_MATCH, i);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> K_SET() { return getTokens(MYSQLGRAMMARParser.K_SET); }
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public List<TerminalNode> K_NULL() { return getTokens(MYSQLGRAMMARParser.K_NULL); }
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(MYSQLGRAMMARParser.K_UPDATE, i);
		}
		public TerminalNode K_DELETE(int i) {
			return getToken(MYSQLGRAMMARParser.K_DELETE, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(MYSQLGRAMMARParser.K_NO); }
		public List<TerminalNode> K_RESTRICT() { return getTokens(MYSQLGRAMMARParser.K_RESTRICT); }
		public TerminalNode K_DEFERRABLE() { return getToken(MYSQLGRAMMARParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_MATCH() { return getTokens(MYSQLGRAMMARParser.K_MATCH); }
		public List<TerminalNode> K_DEFAULT() { return getTokens(MYSQLGRAMMARParser.K_DEFAULT); }
		public List<TerminalNode> K_CASCADE() { return getTokens(MYSQLGRAMMARParser.K_CASCADE); }
		public TerminalNode K_ON(int i) {
			return getToken(MYSQLGRAMMARParser.K_ON, i);
		}
		public TerminalNode K_INITIALLY() { return getToken(MYSQLGRAMMARParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(MYSQLGRAMMARParser.K_DEFERRED, 0); }
		public List<TerminalNode> K_DELETE() { return getTokens(MYSQLGRAMMARParser.K_DELETE); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(MYSQLGRAMMARParser.K_ACTION); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(MYSQLGRAMMARParser.K_RESTRICT, i);
		}
		public TerminalNode K_CASCADE(int i) {
			return getToken(MYSQLGRAMMARParser.K_CASCADE, i);
		}
		public TerminalNode K_REFERENCES() { return getToken(MYSQLGRAMMARParser.K_REFERENCES, 0); }
		public TerminalNode K_NULL(int i) {
			return getToken(MYSQLGRAMMARParser.K_NULL, i);
		}
		public TerminalNode K_ACTION(int i) {
			return getToken(MYSQLGRAMMARParser.K_ACTION, i);
		}
		public TerminalNode K_SET(int i) {
			return getToken(MYSQLGRAMMARParser.K_SET, i);
		}
		public TerminalNode K_DEFAULT(int i) {
			return getToken(MYSQLGRAMMARParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(MYSQLGRAMMARParser.K_UPDATE); }
		public TerminalNode K_NO(int i) {
			return getToken(MYSQLGRAMMARParser.K_NO, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1361); match(K_REFERENCES);
			setState(1362); foreign_table();
			setState(1374);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1363); match(OPEN_PAR);
				setState(1364); column_name();
				setState(1369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1365); match(COMMA);
					setState(1366); column_name();
					}
					}
					setState(1371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1372); match(CLOSE_PAR);
				}
			}

			setState(1394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1390);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1376); match(K_ON);
					setState(1377);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(1386);
					switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
					case 1:
						{
						setState(1378); match(K_SET);
						setState(1379); match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1380); match(K_SET);
						setState(1381); match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1382); match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1383); match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1384); match(K_NO);
						setState(1385); match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1388); match(K_MATCH);
					setState(1389); name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1407);
			switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
			case 1:
				{
				setState(1398);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1397); match(K_NOT);
					}
				}

				setState(1400); match(K_DEFERRABLE);
				setState(1405);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1401); match(K_INITIALLY);
					setState(1402); match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1403); match(K_INITIALLY);
					setState(1404); match(K_IMMEDIATE);
					}
					break;
				}
				}
				break;
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

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(MYSQLGRAMMARParser.K_ABORT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(MYSQLGRAMMARParser.K_ROLLBACK, 0); }
		public TerminalNode K_RAISE() { return getToken(MYSQLGRAMMARParser.K_RAISE, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_FAIL() { return getToken(MYSQLGRAMMARParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(MYSQLGRAMMARParser.K_IGNORE, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1409); match(K_RAISE);
			setState(1410); match(OPEN_PAR);
			setState(1415);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1411); match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1412);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(1413); match(COMMA);
				setState(1414); error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1417); match(CLOSE_PAR);
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

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(MYSQLGRAMMARParser.K_ASC, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(MYSQLGRAMMARParser.K_COLLATE, 0); }
		public TerminalNode K_DESC() { return getToken(MYSQLGRAMMARParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419); column_name();
			setState(1422);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1420); match(K_COLLATE);
				setState(1421); collation_name();
				}
			}

			setState(1425);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1424);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class With_clauseContext extends ParserRuleContext {
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public TerminalNode K_AS(int i) {
			return getToken(MYSQLGRAMMARParser.K_AS, i);
		}
		public List<TerminalNode> K_AS() { return getTokens(MYSQLGRAMMARParser.K_AS); }
		public TerminalNode K_RECURSIVE() { return getToken(MYSQLGRAMMARParser.K_RECURSIVE, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public TerminalNode K_WITH() { return getToken(MYSQLGRAMMARParser.K_WITH, 0); }
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1427); match(K_WITH);
			setState(1429);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1428); match(K_RECURSIVE);
				}
				break;
			}
			setState(1431); cte_table_name();
			setState(1432); match(K_AS);
			setState(1433); match(OPEN_PAR);
			setState(1434); select_stmt();
			setState(1435); match(CLOSE_PAR);
			setState(1445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1436); match(COMMA);
				setState(1437); cte_table_name();
				setState(1438); match(K_AS);
				setState(1439); match(OPEN_PAR);
				setState(1440); select_stmt();
				setState(1441); match(CLOSE_PAR);
				}
				}
				setState(1447);
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

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public TerminalNode K_INDEXED() { return getToken(MYSQLGRAMMARParser.K_INDEXED, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				{
				setState(1448); database_name();
				setState(1449); match(DOT);
				}
				break;
			}
			setState(1453); table_name();
			setState(1459);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1454); match(K_INDEXED);
				setState(1455); match(K_BY);
				setState(1456); index_name();
				}
				break;
			case K_NOT:
				{
				setState(1457); match(K_NOT);
				setState(1458); match(K_INDEXED);
				}
				break;
			case EOF:
			case T__0:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_USE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Ordering_termContext extends ParserRuleContext {
		public TerminalNode K_ASC() { return getToken(MYSQLGRAMMARParser.K_ASC, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(MYSQLGRAMMARParser.K_COLLATE, 0); }
		public TerminalNode K_DESC() { return getToken(MYSQLGRAMMARParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461); expr(0);
			setState(1464);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1462); match(K_COLLATE);
				setState(1463); collation_name();
				}
			}

			setState(1467);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1466);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(MYSQLGRAMMARParser.STRING_LITERAL, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_pragma_value);
		try {
			setState(1472);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1469); signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1470); name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1471); match(STRING_LITERAL);
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

	public static class Common_table_expressionContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_AS() { return getToken(MYSQLGRAMMARParser.K_AS, 0); }
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1474); table_name();
			setState(1486);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1475); match(OPEN_PAR);
				setState(1476); column_name();
				setState(1481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1477); match(COMMA);
					setState(1478); column_name();
					}
					}
					setState(1483);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1484); match(CLOSE_PAR);
				}
			}

			setState(1488); match(K_AS);
			setState(1489); match(OPEN_PAR);
			setState(1490); select_stmt();
			setState(1491); match(CLOSE_PAR);
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

	public static class Result_columnContext extends ParserRuleContext {
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(MYSQLGRAMMARParser.K_AS, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_result_column);
		int _la;
		try {
			setState(1505);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493); match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1494); table_name();
				setState(1495); match(DOT);
				setState(1496); match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1498); expr(0);
				setState(1503);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1500);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1499); match(K_AS);
						}
					}

					setState(1502); column_alias();
					}
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

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public TerminalNode K_INDEXED() { return getToken(MYSQLGRAMMARParser.K_INDEXED, 0); }
		public TerminalNode K_AS() { return getToken(MYSQLGRAMMARParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_table_or_subquery);
		int _la;
		try {
			setState(1554);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1510);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1507); database_name();
					setState(1508); match(DOT);
					}
					break;
				}
				setState(1512); table_name();
				setState(1517);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1514);
					switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
					case 1:
						{
						setState(1513); match(K_AS);
						}
						break;
					}
					setState(1516); table_alias();
					}
					break;
				}
				setState(1524);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1519); match(K_INDEXED);
					setState(1520); match(K_BY);
					setState(1521); index_name();
					}
					break;
				case K_NOT:
					{
					setState(1522); match(K_NOT);
					setState(1523); match(K_INDEXED);
					}
					break;
				case EOF:
				case T__0:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_CROSS:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXCEPT:
				case K_EXPLAIN:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UNION:
				case K_UPDATE:
				case K_USING:
				case K_USE:
				case K_VACUUM:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1526); match(OPEN_PAR);
				setState(1536);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1527); table_or_subquery();
					setState(1532);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1528); match(COMMA);
						setState(1529); table_or_subquery();
						}
						}
						setState(1534);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1535); join_clause();
					}
					break;
				}
				setState(1538); match(CLOSE_PAR);
				setState(1543);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1540);
					switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
					case 1:
						{
						setState(1539); match(K_AS);
						}
						break;
					}
					setState(1542); table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1545); match(OPEN_PAR);
				setState(1546); select_stmt();
				setState(1547); match(CLOSE_PAR);
				setState(1552);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1549);
					switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
					case 1:
						{
						setState(1548); match(K_AS);
						}
						break;
					}
					setState(1551); table_alias();
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

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556); table_or_subquery();
			setState(1563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INNER - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_NATURAL - 89)))) != 0)) {
				{
				{
				setState(1557); join_operator();
				setState(1558); table_or_subquery();
				setState(1559); join_constraint();
				}
				}
				setState(1565);
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

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode K_OUTER() { return getToken(MYSQLGRAMMARParser.K_OUTER, 0); }
		public TerminalNode K_NATURAL() { return getToken(MYSQLGRAMMARParser.K_NATURAL, 0); }
		public TerminalNode K_INNER() { return getToken(MYSQLGRAMMARParser.K_INNER, 0); }
		public TerminalNode K_LEFT() { return getToken(MYSQLGRAMMARParser.K_LEFT, 0); }
		public TerminalNode K_CROSS() { return getToken(MYSQLGRAMMARParser.K_CROSS, 0); }
		public TerminalNode K_JOIN() { return getToken(MYSQLGRAMMARParser.K_JOIN, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_join_operator);
		int _la;
		try {
			setState(1579);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1566); match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1568);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1567); match(K_NATURAL);
					}
				}

				setState(1576);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1570); match(K_LEFT);
					setState(1572);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1571); match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1574); match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1575); match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1578); match(K_JOIN);
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

	public static class Join_constraintContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public TerminalNode K_ON() { return getToken(MYSQLGRAMMARParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode K_USING() { return getToken(MYSQLGRAMMARParser.K_USING, 0); }
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1595);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1581); match(K_ON);
				setState(1582); expr(0);
				}
				break;
			case K_USING:
				{
				setState(1583); match(K_USING);
				setState(1584); match(OPEN_PAR);
				setState(1585); column_name();
				setState(1590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1586); match(COMMA);
					setState(1587); column_name();
					}
					}
					setState(1592);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1593); match(CLOSE_PAR);
				}
				break;
			case EOF:
			case T__0:
			case CLOSE_PAR:
			case COMMA:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_CROSS:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXCEPT:
			case K_EXPLAIN:
			case K_GROUP:
			case K_INNER:
			case K_INSERT:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UNION:
			case K_UPDATE:
			case K_USE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Select_coreContext extends ParserRuleContext {
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public TerminalNode K_GROUP() { return getToken(MYSQLGRAMMARParser.K_GROUP, 0); }
		public TerminalNode K_ALL() { return getToken(MYSQLGRAMMARParser.K_ALL, 0); }
		public TerminalNode K_FROM() { return getToken(MYSQLGRAMMARParser.K_FROM, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public TerminalNode K_SELECT() { return getToken(MYSQLGRAMMARParser.K_SELECT, 0); }
		public TerminalNode K_WHERE() { return getToken(MYSQLGRAMMARParser.K_WHERE, 0); }
		public TerminalNode K_VALUES() { return getToken(MYSQLGRAMMARParser.K_VALUES, 0); }
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public TerminalNode K_DISTINCT() { return getToken(MYSQLGRAMMARParser.K_DISTINCT, 0); }
		public TerminalNode K_HAVING() { return getToken(MYSQLGRAMMARParser.K_HAVING, 0); }
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_select_core);
		int _la;
		try {
			setState(1671);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1597); match(K_SELECT);
				setState(1599);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1598);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					break;
				}
				setState(1601); result_column();
				setState(1606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1602); match(COMMA);
					setState(1603); result_column();
					}
					}
					setState(1608);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1621);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1609); match(K_FROM);
					setState(1619);
					switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
					case 1:
						{
						setState(1610); table_or_subquery();
						setState(1615);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1611); match(COMMA);
							setState(1612); table_or_subquery();
							}
							}
							setState(1617);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1618); join_clause();
						}
						break;
					}
					}
				}

				setState(1625);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1623); match(K_WHERE);
					setState(1624); expr(0);
					}
				}

				setState(1641);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1627); match(K_GROUP);
					setState(1628); match(K_BY);
					setState(1629); expr(0);
					setState(1634);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1630); match(COMMA);
						setState(1631); expr(0);
						}
						}
						setState(1636);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1639);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1637); match(K_HAVING);
						setState(1638); expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1643); match(K_VALUES);
				setState(1644); match(OPEN_PAR);
				setState(1645); expr(0);
				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1646); match(COMMA);
					setState(1647); expr(0);
					}
					}
					setState(1652);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1653); match(CLOSE_PAR);
				setState(1668);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1654); match(COMMA);
					setState(1655); match(OPEN_PAR);
					setState(1656); expr(0);
					setState(1661);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1657); match(COMMA);
						setState(1658); expr(0);
						}
						}
						setState(1663);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1664); match(CLOSE_PAR);
					}
					}
					setState(1670);
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

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_INTERSECT() { return getToken(MYSQLGRAMMARParser.K_INTERSECT, 0); }
		public TerminalNode K_ALL() { return getToken(MYSQLGRAMMARParser.K_ALL, 0); }
		public TerminalNode K_EXCEPT() { return getToken(MYSQLGRAMMARParser.K_EXCEPT, 0); }
		public TerminalNode K_UNION() { return getToken(MYSQLGRAMMARParser.K_UNION, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_compound_operator);
		try {
			setState(1678);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1673); match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1674); match(K_UNION);
				setState(1675); match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1676); match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1677); match(K_EXCEPT);
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

	public static class Cte_table_nameContext extends ParserRuleContext {
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1680); table_name();
			setState(1692);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1681); match(OPEN_PAR);
				setState(1682); column_name();
				setState(1687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1683); match(COMMA);
					setState(1684); column_name();
					}
					}
					setState(1689);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1690); match(CLOSE_PAR);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(MYSQLGRAMMARParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1695);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1694);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(1697); match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(MYSQLGRAMMARParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MYSQLGRAMMARParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(MYSQLGRAMMARParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(MYSQLGRAMMARParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(MYSQLGRAMMARParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(MYSQLGRAMMARParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(MYSQLGRAMMARParser.K_CURRENT_TIME, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1699);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & ((1L << (K_NULL - 106)) | (1L << (NUMERIC_LITERAL - 106)) | (1L << (STRING_LITERAL - 106)) | (1L << (BLOB_LITERAL - 106)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(MYSQLGRAMMARParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1703); match(STRING_LITERAL);
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

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_module_argument);
		try {
			setState(1707);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1705); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1706); column_def();
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

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MYSQLGRAMMARParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MYSQLGRAMMARParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_RENAME() { return getToken(MYSQLGRAMMARParser.K_RENAME, 0); }
		public TerminalNode K_SET() { return getToken(MYSQLGRAMMARParser.K_SET, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(MYSQLGRAMMARParser.K_ROLLBACK, 0); }
		public TerminalNode K_ELSE() { return getToken(MYSQLGRAMMARParser.K_ELSE, 0); }
		public TerminalNode K_TABLE() { return getToken(MYSQLGRAMMARParser.K_TABLE, 0); }
		public TerminalNode K_INNER() { return getToken(MYSQLGRAMMARParser.K_INNER, 0); }
		public TerminalNode K_RAISE() { return getToken(MYSQLGRAMMARParser.K_RAISE, 0); }
		public TerminalNode K_AFTER() { return getToken(MYSQLGRAMMARParser.K_AFTER, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(MYSQLGRAMMARParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_VIEW() { return getToken(MYSQLGRAMMARParser.K_VIEW, 0); }
		public TerminalNode K_FAIL() { return getToken(MYSQLGRAMMARParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(MYSQLGRAMMARParser.K_IGNORE, 0); }
		public TerminalNode K_CAST() { return getToken(MYSQLGRAMMARParser.K_CAST, 0); }
		public TerminalNode K_RELEASE() { return getToken(MYSQLGRAMMARParser.K_RELEASE, 0); }
		public TerminalNode K_INSTEAD() { return getToken(MYSQLGRAMMARParser.K_INSTEAD, 0); }
		public TerminalNode K_RESTRICT() { return getToken(MYSQLGRAMMARParser.K_RESTRICT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(MYSQLGRAMMARParser.K_DEFERRABLE, 0); }
		public TerminalNode K_RIGHT() { return getToken(MYSQLGRAMMARParser.K_RIGHT, 0); }
		public TerminalNode K_CHECK() { return getToken(MYSQLGRAMMARParser.K_CHECK, 0); }
		public TerminalNode K_GROUP() { return getToken(MYSQLGRAMMARParser.K_GROUP, 0); }
		public TerminalNode K_DEFERRED() { return getToken(MYSQLGRAMMARParser.K_DEFERRED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(MYSQLGRAMMARParser.K_INITIALLY, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(MYSQLGRAMMARParser.K_EXPLAIN, 0); }
		public TerminalNode K_AS() { return getToken(MYSQLGRAMMARParser.K_AS, 0); }
		public TerminalNode K_QUERY() { return getToken(MYSQLGRAMMARParser.K_QUERY, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(MYSQLGRAMMARParser.K_RECURSIVE, 0); }
		public TerminalNode K_CASE() { return getToken(MYSQLGRAMMARParser.K_CASE, 0); }
		public TerminalNode K_FULL() { return getToken(MYSQLGRAMMARParser.K_FULL, 0); }
		public TerminalNode K_DELETE() { return getToken(MYSQLGRAMMARParser.K_DELETE, 0); }
		public TerminalNode K_IS() { return getToken(MYSQLGRAMMARParser.K_IS, 0); }
		public TerminalNode K_ADD() { return getToken(MYSQLGRAMMARParser.K_ADD, 0); }
		public TerminalNode K_ROW() { return getToken(MYSQLGRAMMARParser.K_ROW, 0); }
		public TerminalNode K_PRIMARY() { return getToken(MYSQLGRAMMARParser.K_PRIMARY, 0); }
		public TerminalNode K_REFERENCES() { return getToken(MYSQLGRAMMARParser.K_REFERENCES, 0); }
		public TerminalNode K_HAVING() { return getToken(MYSQLGRAMMARParser.K_HAVING, 0); }
		public TerminalNode K_UNION() { return getToken(MYSQLGRAMMARParser.K_UNION, 0); }
		public TerminalNode K_COLLATE() { return getToken(MYSQLGRAMMARParser.K_COLLATE, 0); }
		public TerminalNode K_FOR() { return getToken(MYSQLGRAMMARParser.K_FOR, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(MYSQLGRAMMARParser.K_VIRTUAL, 0); }
		public TerminalNode K_END() { return getToken(MYSQLGRAMMARParser.K_END, 0); }
		public TerminalNode K_OUTER() { return getToken(MYSQLGRAMMARParser.K_OUTER, 0); }
		public TerminalNode K_ISNULL() { return getToken(MYSQLGRAMMARParser.K_ISNULL, 0); }
		public TerminalNode K_NULL() { return getToken(MYSQLGRAMMARParser.K_NULL, 0); }
		public TerminalNode K_INTO() { return getToken(MYSQLGRAMMARParser.K_INTO, 0); }
		public TerminalNode K_JOIN() { return getToken(MYSQLGRAMMARParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(MYSQLGRAMMARParser.K_KEY, 0); }
		public TerminalNode K_CREATE() { return getToken(MYSQLGRAMMARParser.K_CREATE, 0); }
		public TerminalNode K_GLOB() { return getToken(MYSQLGRAMMARParser.K_GLOB, 0); }
		public TerminalNode K_ASC() { return getToken(MYSQLGRAMMARParser.K_ASC, 0); }
		public TerminalNode K_WHEN() { return getToken(MYSQLGRAMMARParser.K_WHEN, 0); }
		public TerminalNode K_DISTINCT() { return getToken(MYSQLGRAMMARParser.K_DISTINCT, 0); }
		public TerminalNode K_LIKE() { return getToken(MYSQLGRAMMARParser.K_LIKE, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(MYSQLGRAMMARParser.K_TRANSACTION, 0); }
		public TerminalNode K_IN() { return getToken(MYSQLGRAMMARParser.K_IN, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(MYSQLGRAMMARParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_INDEX() { return getToken(MYSQLGRAMMARParser.K_INDEX, 0); }
		public TerminalNode K_ORDER() { return getToken(MYSQLGRAMMARParser.K_ORDER, 0); }
		public TerminalNode K_DATABASE() { return getToken(MYSQLGRAMMARParser.K_DATABASE, 0); }
		public TerminalNode K_CASCADE() { return getToken(MYSQLGRAMMARParser.K_CASCADE, 0); }
		public TerminalNode K_DROP() { return getToken(MYSQLGRAMMARParser.K_DROP, 0); }
		public TerminalNode K_ALL() { return getToken(MYSQLGRAMMARParser.K_ALL, 0); }
		public TerminalNode K_USING() { return getToken(MYSQLGRAMMARParser.K_USING, 0); }
		public TerminalNode K_NATURAL() { return getToken(MYSQLGRAMMARParser.K_NATURAL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(MYSQLGRAMMARParser.K_NOTNULL, 0); }
		public TerminalNode K_PRAGMA() { return getToken(MYSQLGRAMMARParser.K_PRAGMA, 0); }
		public TerminalNode K_WHERE() { return getToken(MYSQLGRAMMARParser.K_WHERE, 0); }
		public TerminalNode K_ALTER() { return getToken(MYSQLGRAMMARParser.K_ALTER, 0); }
		public TerminalNode K_VALUES() { return getToken(MYSQLGRAMMARParser.K_VALUES, 0); }
		public TerminalNode K_BEFORE() { return getToken(MYSQLGRAMMARParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(MYSQLGRAMMARParser.K_BEGIN, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(MYSQLGRAMMARParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_UPDATE() { return getToken(MYSQLGRAMMARParser.K_UPDATE, 0); }
		public TerminalNode K_REGEXP() { return getToken(MYSQLGRAMMARParser.K_REGEXP, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(MYSQLGRAMMARParser.K_CONSTRAINT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(MYSQLGRAMMARParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_REPLACE() { return getToken(MYSQLGRAMMARParser.K_REPLACE, 0); }
		public TerminalNode K_ANALYZE() { return getToken(MYSQLGRAMMARParser.K_ANALYZE, 0); }
		public TerminalNode K_LIMIT() { return getToken(MYSQLGRAMMARParser.K_LIMIT, 0); }
		public TerminalNode K_COMMIT() { return getToken(MYSQLGRAMMARParser.K_COMMIT, 0); }
		public TerminalNode K_CROSS() { return getToken(MYSQLGRAMMARParser.K_CROSS, 0); }
		public TerminalNode K_IF() { return getToken(MYSQLGRAMMARParser.K_IF, 0); }
		public TerminalNode K_PLAN() { return getToken(MYSQLGRAMMARParser.K_PLAN, 0); }
		public TerminalNode K_SELECT() { return getToken(MYSQLGRAMMARParser.K_SELECT, 0); }
		public TerminalNode K_EXISTS() { return getToken(MYSQLGRAMMARParser.K_EXISTS, 0); }
		public TerminalNode K_OR() { return getToken(MYSQLGRAMMARParser.K_OR, 0); }
		public TerminalNode K_TEMP() { return getToken(MYSQLGRAMMARParser.K_TEMP, 0); }
		public TerminalNode K_EXCEPT() { return getToken(MYSQLGRAMMARParser.K_EXCEPT, 0); }
		public TerminalNode K_MATCH() { return getToken(MYSQLGRAMMARParser.K_MATCH, 0); }
		public TerminalNode K_REINDEX() { return getToken(MYSQLGRAMMARParser.K_REINDEX, 0); }
		public TerminalNode K_INSERT() { return getToken(MYSQLGRAMMARParser.K_INSERT, 0); }
		public TerminalNode K_BETWEEN() { return getToken(MYSQLGRAMMARParser.K_BETWEEN, 0); }
		public TerminalNode K_ATTACH() { return getToken(MYSQLGRAMMARParser.K_ATTACH, 0); }
		public TerminalNode K_THEN() { return getToken(MYSQLGRAMMARParser.K_THEN, 0); }
		public TerminalNode K_FROM() { return getToken(MYSQLGRAMMARParser.K_FROM, 0); }
		public TerminalNode K_UNIQUE() { return getToken(MYSQLGRAMMARParser.K_UNIQUE, 0); }
		public TerminalNode K_WITHOUT() { return getToken(MYSQLGRAMMARParser.K_WITHOUT, 0); }
		public TerminalNode K_ACTION() { return getToken(MYSQLGRAMMARParser.K_ACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(MYSQLGRAMMARParser.K_TRIGGER, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(MYSQLGRAMMARParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ON() { return getToken(MYSQLGRAMMARParser.K_ON, 0); }
		public TerminalNode K_USE() { return getToken(MYSQLGRAMMARParser.K_USE, 0); }
		public TerminalNode K_DETACH() { return getToken(MYSQLGRAMMARParser.K_DETACH, 0); }
		public TerminalNode K_LEFT() { return getToken(MYSQLGRAMMARParser.K_LEFT, 0); }
		public TerminalNode K_NOT() { return getToken(MYSQLGRAMMARParser.K_NOT, 0); }
		public TerminalNode K_TO() { return getToken(MYSQLGRAMMARParser.K_TO, 0); }
		public TerminalNode K_CONFLICT() { return getToken(MYSQLGRAMMARParser.K_CONFLICT, 0); }
		public TerminalNode K_INTERSECT() { return getToken(MYSQLGRAMMARParser.K_INTERSECT, 0); }
		public TerminalNode K_BY() { return getToken(MYSQLGRAMMARParser.K_BY, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(MYSQLGRAMMARParser.K_SAVEPOINT, 0); }
		public TerminalNode K_ESCAPE() { return getToken(MYSQLGRAMMARParser.K_ESCAPE, 0); }
		public TerminalNode K_NO() { return getToken(MYSQLGRAMMARParser.K_NO, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(MYSQLGRAMMARParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(MYSQLGRAMMARParser.K_COLUMN, 0); }
		public TerminalNode K_OFFSET() { return getToken(MYSQLGRAMMARParser.K_OFFSET, 0); }
		public TerminalNode K_DEFAULT() { return getToken(MYSQLGRAMMARParser.K_DEFAULT, 0); }
		public TerminalNode K_FOREIGN() { return getToken(MYSQLGRAMMARParser.K_FOREIGN, 0); }
		public TerminalNode K_EACH() { return getToken(MYSQLGRAMMARParser.K_EACH, 0); }
		public TerminalNode K_INDEXED() { return getToken(MYSQLGRAMMARParser.K_INDEXED, 0); }
		public TerminalNode K_ABORT() { return getToken(MYSQLGRAMMARParser.K_ABORT, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(MYSQLGRAMMARParser.K_TEMPORARY, 0); }
		public TerminalNode K_AND() { return getToken(MYSQLGRAMMARParser.K_AND, 0); }
		public TerminalNode K_VACUUM() { return getToken(MYSQLGRAMMARParser.K_VACUUM, 0); }
		public TerminalNode K_WITH() { return getToken(MYSQLGRAMMARParser.K_WITH, 0); }
		public TerminalNode K_OF() { return getToken(MYSQLGRAMMARParser.K_OF, 0); }
		public TerminalNode K_DESC() { return getToken(MYSQLGRAMMARParser.K_DESC, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1711);
			_la = _input.LA(1);
			if ( !(((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (K_ABORT - 26)) | (1L << (K_ACTION - 26)) | (1L << (K_ADD - 26)) | (1L << (K_AFTER - 26)) | (1L << (K_ALL - 26)) | (1L << (K_ALTER - 26)) | (1L << (K_ANALYZE - 26)) | (1L << (K_AND - 26)) | (1L << (K_AS - 26)) | (1L << (K_ASC - 26)) | (1L << (K_ATTACH - 26)) | (1L << (K_AUTOINCREMENT - 26)) | (1L << (K_BEFORE - 26)) | (1L << (K_BEGIN - 26)) | (1L << (K_BETWEEN - 26)) | (1L << (K_BY - 26)) | (1L << (K_CASCADE - 26)) | (1L << (K_CASE - 26)) | (1L << (K_CAST - 26)) | (1L << (K_CHECK - 26)) | (1L << (K_COLLATE - 26)) | (1L << (K_COLUMN - 26)) | (1L << (K_COMMIT - 26)) | (1L << (K_CONFLICT - 26)) | (1L << (K_CONSTRAINT - 26)) | (1L << (K_CREATE - 26)) | (1L << (K_CROSS - 26)) | (1L << (K_CURRENT_DATE - 26)) | (1L << (K_CURRENT_TIME - 26)) | (1L << (K_CURRENT_TIMESTAMP - 26)) | (1L << (K_DATABASE - 26)) | (1L << (K_DEFAULT - 26)) | (1L << (K_DEFERRABLE - 26)) | (1L << (K_DEFERRED - 26)) | (1L << (K_DELETE - 26)) | (1L << (K_DESC - 26)) | (1L << (K_DETACH - 26)) | (1L << (K_DISTINCT - 26)) | (1L << (K_DROP - 26)) | (1L << (K_EACH - 26)) | (1L << (K_ELSE - 26)) | (1L << (K_END - 26)) | (1L << (K_ESCAPE - 26)) | (1L << (K_EXCEPT - 26)) | (1L << (K_EXCLUSIVE - 26)) | (1L << (K_EXISTS - 26)) | (1L << (K_EXPLAIN - 26)) | (1L << (K_FAIL - 26)) | (1L << (K_FOR - 26)) | (1L << (K_FOREIGN - 26)) | (1L << (K_FROM - 26)) | (1L << (K_FULL - 26)) | (1L << (K_GLOB - 26)) | (1L << (K_GROUP - 26)) | (1L << (K_HAVING - 26)) | (1L << (K_IF - 26)) | (1L << (K_IGNORE - 26)) | (1L << (K_IMMEDIATE - 26)) | (1L << (K_IN - 26)) | (1L << (K_INDEX - 26)) | (1L << (K_INDEXED - 26)) | (1L << (K_INITIALLY - 26)) | (1L << (K_INNER - 26)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (K_INSERT - 90)) | (1L << (K_INSTEAD - 90)) | (1L << (K_INTERSECT - 90)) | (1L << (K_INTO - 90)) | (1L << (K_IS - 90)) | (1L << (K_ISNULL - 90)) | (1L << (K_JOIN - 90)) | (1L << (K_KEY - 90)) | (1L << (K_LEFT - 90)) | (1L << (K_LIKE - 90)) | (1L << (K_LIMIT - 90)) | (1L << (K_MATCH - 90)) | (1L << (K_NATURAL - 90)) | (1L << (K_NO - 90)) | (1L << (K_NOT - 90)) | (1L << (K_NOTNULL - 90)) | (1L << (K_NULL - 90)) | (1L << (K_OF - 90)) | (1L << (K_OFFSET - 90)) | (1L << (K_ON - 90)) | (1L << (K_OR - 90)) | (1L << (K_ORDER - 90)) | (1L << (K_OUTER - 90)) | (1L << (K_PLAN - 90)) | (1L << (K_PRAGMA - 90)) | (1L << (K_PRIMARY - 90)) | (1L << (K_QUERY - 90)) | (1L << (K_RAISE - 90)) | (1L << (K_RECURSIVE - 90)) | (1L << (K_REFERENCES - 90)) | (1L << (K_REGEXP - 90)) | (1L << (K_REINDEX - 90)) | (1L << (K_RELEASE - 90)) | (1L << (K_RENAME - 90)) | (1L << (K_REPLACE - 90)) | (1L << (K_RESTRICT - 90)) | (1L << (K_RIGHT - 90)) | (1L << (K_ROLLBACK - 90)) | (1L << (K_ROW - 90)) | (1L << (K_SAVEPOINT - 90)) | (1L << (K_SELECT - 90)) | (1L << (K_SET - 90)) | (1L << (K_TABLE - 90)) | (1L << (K_TEMP - 90)) | (1L << (K_TEMPORARY - 90)) | (1L << (K_THEN - 90)) | (1L << (K_TO - 90)) | (1L << (K_TRANSACTION - 90)) | (1L << (K_TRIGGER - 90)) | (1L << (K_UNION - 90)) | (1L << (K_UNIQUE - 90)) | (1L << (K_UPDATE - 90)) | (1L << (K_USING - 90)) | (1L << (K_USE - 90)) | (1L << (K_VACUUM - 90)) | (1L << (K_VALUES - 90)) | (1L << (K_VIEW - 90)) | (1L << (K_VIRTUAL - 90)) | (1L << (K_WHEN - 90)) | (1L << (K_WHERE - 90)) | (1L << (K_WITH - 90)) | (1L << (K_WITHOUT - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713); any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715); any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717); any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719); any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721); any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723); any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725); any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727); any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729); any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731); any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733); any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735); any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737); any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739); any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741); any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743); any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745); any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(MYSQLGRAMMARParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(MYSQLGRAMMARParser.STRING_LITERAL, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYSQLGRAMMARListener ) ((MYSQLGRAMMARListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYSQLGRAMMARVisitor ) return ((MYSQLGRAMMARVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_any_name);
		try {
			setState(1754);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1747); match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_USE:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1748); keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1749); match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1750); match(OPEN_PAR);
				setState(1751); any_name();
				setState(1752); match(CLOSE_PAR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 42: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 20);
		case 1: return precpred(_ctx, 19);
		case 2: return precpred(_ctx, 18);
		case 3: return precpred(_ctx, 17);
		case 4: return precpred(_ctx, 16);
		case 5: return precpred(_ctx, 15);
		case 6: return precpred(_ctx, 14);
		case 7: return precpred(_ctx, 13);
		case 8: return precpred(_ctx, 6);
		case 9: return precpred(_ctx, 5);
		case 10: return precpred(_ctx, 9);
		case 11: return precpred(_ctx, 8);
		case 12: return precpred(_ctx, 7);
		case 13: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00a2\u06df\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\7\2\u00ad\n\2\f\2\16\2\u00b0\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\7\4\u00b8\n\4\f\4\16\4\u00bb\13\4\3\4\3\4\6\4\u00bf\n\4\r\4\16\4\u00c0"+
		"\3\4\7\4\u00c4\n\4\f\4\16\4\u00c7\13\4\3\4\7\4\u00ca\n\4\f\4\16\4\u00cd"+
		"\13\4\3\5\3\5\3\5\5\5\u00d2\n\5\5\5\u00d4\n\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00f6\n\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u00fd\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0105\n\6\3\6\5\6\u0108\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0111\n\7\3\b\3\b\5\b\u0115\n\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\5\t\u011d\n\t\3\t\3\t\5\t\u0121\n\t\5\t\u0123\n\t\3\n"+
		"\3\n\3\n\5\n\u0128\n\n\5\n\u012a\n\n\3\13\3\13\5\13\u012e\n\13\3\13\3"+
		"\13\3\13\7\13\u0133\n\13\f\13\16\13\u0136\13\13\5\13\u0138\n\13\3\13\3"+
		"\13\3\13\5\13\u013d\n\13\3\13\3\13\5\13\u0141\n\13\3\13\6\13\u0144\n\13"+
		"\r\13\16\13\u0145\3\13\3\13\3\13\3\13\3\13\7\13\u014d\n\13\f\13\16\13"+
		"\u0150\13\13\5\13\u0152\n\13\3\13\3\13\3\13\3\13\5\13\u0158\n\13\5\13"+
		"\u015a\n\13\3\f\3\f\3\f\3\f\3\f\5\f\u0161\n\f\3\f\3\f\3\r\3\r\3\r\3\16"+
		"\3\16\5\16\u016a\n\16\3\16\3\16\3\16\3\16\5\16\u0170\n\16\3\16\3\16\3"+
		"\16\5\16\u0175\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u017e\n\16"+
		"\f\16\16\16\u0181\13\16\3\16\3\16\3\16\5\16\u0186\n\16\3\17\3\17\5\17"+
		"\u018a\n\17\3\17\3\17\3\17\3\17\5\17\u0190\n\17\3\17\3\17\3\17\5\17\u0195"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u019c\n\17\f\17\16\17\u019f\13\17"+
		"\3\17\3\17\7\17\u01a3\n\17\f\17\16\17\u01a6\13\17\3\17\3\17\3\17\5\17"+
		"\u01ab\n\17\3\17\3\17\5\17\u01af\n\17\3\20\3\20\5\20\u01b3\n\20\3\20\3"+
		"\20\3\20\5\20\u01b8\n\20\3\20\3\20\3\20\3\20\7\20\u01be\n\20\f\20\16\20"+
		"\u01c1\13\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u01d1\n\20\f\20\16\20\u01d4\13\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u01df\n\20\3\21\3\21\5\21\u01e3\n\21"+
		"\3\21\3\21\3\21\3\21\5\21\u01e9\n\21\3\21\3\21\3\21\5\21\u01ee\n\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u01f5\n\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u01fe\n\21\f\21\16\21\u0201\13\21\5\21\u0203\n\21\5\21\u0205"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u020b\n\21\3\21\3\21\3\21\3\21\5\21\u0211"+
		"\n\21\3\21\3\21\5\21\u0215\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u021c\n"+
		"\21\3\21\3\21\6\21\u0220\n\21\r\21\16\21\u0221\3\21\3\21\3\22\3\22\5\22"+
		"\u0228\n\22\3\22\3\22\3\22\3\22\5\22\u022e\n\22\3\22\3\22\3\22\5\22\u0233"+
		"\n\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u023f\n\23"+
		"\3\23\3\23\3\23\5\23\u0244\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u024d\n\23\f\23\16\23\u0250\13\23\3\23\3\23\5\23\u0254\n\23\3\24\5\24"+
		"\u0257\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u025e\n\24\3\25\5\25\u0261\n"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u0268\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u026f\n\25\f\25\16\25\u0272\13\25\5\25\u0274\n\25\3\25\3\25\3\25"+
		"\3\25\5\25\u027a\n\25\5\25\u027c\n\25\3\26\3\26\5\26\u0280\n\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\5\27\u0288\n\27\3\27\3\27\3\27\5\27\u028d\n\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0295\n\30\3\30\3\30\3\30\5\30\u029a"+
		"\n\30\3\30\3\30\3\31\3\31\3\31\3\31\5\31\u02a2\n\31\3\31\3\31\3\31\5\31"+
		"\u02a7\n\31\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u02af\n\32\3\32\3\32\3"+
		"\32\5\32\u02b4\n\32\3\32\3\32\3\33\3\33\5\33\u02ba\n\33\3\33\3\33\3\33"+
		"\7\33\u02bf\n\33\f\33\16\33\u02c2\13\33\5\33\u02c4\n\33\3\33\3\33\3\33"+
		"\3\33\7\33\u02ca\n\33\f\33\16\33\u02cd\13\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u02d4\n\33\f\33\16\33\u02d7\13\33\5\33\u02d9\n\33\3\33\3\33\3\33"+
		"\3\33\5\33\u02df\n\33\5\33\u02e1\n\33\3\34\5\34\u02e4\n\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u02f7\n\34\3\34\3\34\3\34\3\34\5\34\u02fd\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u0304\n\34\f\34\16\34\u0307\13\34\3\34\3\34\5\34\u030b"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\7\34\u0312\n\34\f\34\16\34\u0315\13\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u031d\n\34\f\34\16\34\u0320\13\34"+
		"\3\34\3\34\7\34\u0324\n\34\f\34\16\34\u0327\13\34\3\34\3\34\3\34\5\34"+
		"\u032c\n\34\3\35\3\35\3\35\3\35\5\35\u0332\n\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u033b\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0342\n\36"+
		"\3\36\3\36\5\36\u0346\n\36\5\36\u0348\n\36\3\37\3\37\5\37\u034c\n\37\3"+
		"\37\3\37\3 \3 \3 \5 \u0353\n \5 \u0355\n \3 \3 \5 \u0359\n \3 \5 \u035c"+
		"\n \3!\3!\3!\3\"\3\"\5\"\u0363\n\"\3\"\3\"\3\"\7\"\u0368\n\"\f\"\16\""+
		"\u036b\13\"\5\"\u036d\n\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0375\n\"\f\"\16"+
		"\"\u0378\13\"\5\"\u037a\n\"\3\"\3\"\3\"\3\"\5\"\u0380\n\"\5\"\u0382\n"+
		"\"\3#\3#\5#\u0386\n#\3#\3#\3#\7#\u038b\n#\f#\16#\u038e\13#\5#\u0390\n"+
		"#\3#\3#\3#\3#\7#\u0396\n#\f#\16#\u0399\13#\3#\3#\3#\3#\3#\7#\u03a0\n#"+
		"\f#\16#\u03a3\13#\5#\u03a5\n#\3#\3#\3#\3#\5#\u03ab\n#\5#\u03ad\n#\3$\3"+
		"$\5$\u03b1\n$\3$\3$\3$\7$\u03b6\n$\f$\16$\u03b9\13$\3$\3$\3$\3$\7$\u03bf"+
		"\n$\f$\16$\u03c2\13$\3$\5$\u03c5\n$\5$\u03c7\n$\3$\3$\5$\u03cb\n$\3$\3"+
		"$\3$\3$\3$\7$\u03d2\n$\f$\16$\u03d5\13$\3$\3$\5$\u03d9\n$\5$\u03db\n$"+
		"\3$\3$\3$\3$\3$\7$\u03e2\n$\f$\16$\u03e5\13$\3$\3$\3$\3$\3$\3$\7$\u03ed"+
		"\n$\f$\16$\u03f0\13$\3$\3$\7$\u03f4\n$\f$\16$\u03f7\13$\5$\u03f9\n$\3"+
		"%\5%\u03fc\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0409\n%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\7%\u0415\n%\f%\16%\u0418\13%\3%\3%\5%\u041c\n%\3&"+
		"\5&\u041f\n&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u042c\n&\3&\3&\3&\3&"+
		"\3&\3&\3&\3&\3&\3&\7&\u0438\n&\f&\16&\u043b\13&\3&\3&\5&\u043f\n&\3&\3"+
		"&\3&\3&\3&\7&\u0446\n&\f&\16&\u0449\13&\5&\u044b\n&\3&\3&\3&\3&\5&\u0451"+
		"\n&\5&\u0453\n&\3\'\3\'\3(\3(\5(\u0459\n(\3(\7(\u045c\n(\f(\16(\u045f"+
		"\13(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u046c\n)\3*\3*\5*\u0470\n*\3"+
		"*\3*\3*\5*\u0475\n*\3*\3*\5*\u0479\n*\3*\5*\u047c\n*\3*\3*\3*\5*\u0481"+
		"\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0491\n*\3*\3*\3*\3*"+
		"\3*\5*\u0498\n*\3+\3+\3+\5+\u049d\n+\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u04a8"+
		"\n,\3,\3,\3,\5,\u04ad\n,\3,\3,\3,\3,\5,\u04b3\n,\3,\3,\3,\7,\u04b8\n,"+
		"\f,\16,\u04bb\13,\3,\5,\u04be\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\5,\u04ce\n,\3,\5,\u04d1\n,\3,\3,\3,\3,\3,\3,\5,\u04d9\n,\3,\3,\3"+
		",\3,\3,\6,\u04e0\n,\r,\16,\u04e1\3,\3,\5,\u04e6\n,\3,\3,\3,\5,\u04eb\n"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3"+
		",\3,\3,\3,\3,\3,\5,\u0509\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0515\n"+
		",\3,\3,\3,\5,\u051a\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0526\n,\3,\3"+
		",\3,\3,\5,\u052c\n,\3,\3,\3,\3,\3,\5,\u0533\n,\3,\3,\5,\u0537\n,\3,\3"+
		",\3,\3,\3,\3,\7,\u053f\n,\f,\16,\u0542\13,\5,\u0544\n,\3,\3,\3,\3,\5,"+
		"\u054a\n,\3,\5,\u054d\n,\7,\u054f\n,\f,\16,\u0552\13,\3-\3-\3-\3-\3-\3"+
		"-\7-\u055a\n-\f-\16-\u055d\13-\3-\3-\5-\u0561\n-\3-\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\5-\u056d\n-\3-\3-\5-\u0571\n-\7-\u0573\n-\f-\16-\u0576\13-\3"+
		"-\5-\u0579\n-\3-\3-\3-\3-\3-\5-\u0580\n-\5-\u0582\n-\3.\3.\3.\3.\3.\3"+
		".\5.\u058a\n.\3.\3.\3/\3/\3/\5/\u0591\n/\3/\5/\u0594\n/\3\60\3\60\5\60"+
		"\u0598\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\7\60\u05a6\n\60\f\60\16\60\u05a9\13\60\3\61\3\61\3\61\5\61\u05ae\n\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u05b6\n\61\3\62\3\62\3\62\5\62\u05bb"+
		"\n\62\3\62\5\62\u05be\n\62\3\63\3\63\3\63\5\63\u05c3\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\7\64\u05ca\n\64\f\64\16\64\u05cd\13\64\3\64\3\64\5\64\u05d1"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u05df\n\65\3\65\5\65\u05e2\n\65\5\65\u05e4\n\65\3\66\3\66\3\66\5\66\u05e9"+
		"\n\66\3\66\3\66\5\66\u05ed\n\66\3\66\5\66\u05f0\n\66\3\66\3\66\3\66\3"+
		"\66\3\66\5\66\u05f7\n\66\3\66\3\66\3\66\3\66\7\66\u05fd\n\66\f\66\16\66"+
		"\u0600\13\66\3\66\5\66\u0603\n\66\3\66\3\66\5\66\u0607\n\66\3\66\5\66"+
		"\u060a\n\66\3\66\3\66\3\66\3\66\5\66\u0610\n\66\3\66\5\66\u0613\n\66\5"+
		"\66\u0615\n\66\3\67\3\67\3\67\3\67\3\67\7\67\u061c\n\67\f\67\16\67\u061f"+
		"\13\67\38\38\58\u0623\n8\38\38\58\u0627\n8\38\38\58\u062b\n8\38\58\u062e"+
		"\n8\39\39\39\39\39\39\39\79\u0637\n9\f9\169\u063a\139\39\39\59\u063e\n"+
		"9\3:\3:\5:\u0642\n:\3:\3:\3:\7:\u0647\n:\f:\16:\u064a\13:\3:\3:\3:\3:"+
		"\7:\u0650\n:\f:\16:\u0653\13:\3:\5:\u0656\n:\5:\u0658\n:\3:\3:\5:\u065c"+
		"\n:\3:\3:\3:\3:\3:\7:\u0663\n:\f:\16:\u0666\13:\3:\3:\5:\u066a\n:\5:\u066c"+
		"\n:\3:\3:\3:\3:\3:\7:\u0673\n:\f:\16:\u0676\13:\3:\3:\3:\3:\3:\3:\7:\u067e"+
		"\n:\f:\16:\u0681\13:\3:\3:\7:\u0685\n:\f:\16:\u0688\13:\5:\u068a\n:\3"+
		";\3;\3;\3;\3;\5;\u0691\n;\3<\3<\3<\3<\3<\7<\u0698\n<\f<\16<\u069b\13<"+
		"\3<\3<\5<\u069f\n<\3=\5=\u06a2\n=\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\5A\u06ae"+
		"\nA\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L"+
		"\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3U\3U\3U\3U\3U"+
		"\5U\u06dd\nU\3U\2\3VV\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\2\24\5\2>>IIVV\4\2\62\62FF\4\2\b\bnn\3"+
		"\2\u0087\u0088\4\2  BB\4\2%%@@\7\2\34\34LLUU~~\u0081\u0081\4\2\n\n\17"+
		"\20\3\2\13\f\3\2\21\24\3\2\25\30\6\2QQeeggzz\4\2??\u008f\u008f\5\2\34"+
		"\34LL\u0081\u0081\6\28:ll\u009b\u009b\u009d\u009e\4\2\13\rjj\4\2\u009a"+
		"\u009a\u009d\u009d\4\2\34\62\64\u0099\u07ef\2\u00ae\3\2\2\2\4\u00b3\3"+
		"\2\2\2\6\u00b9\3\2\2\2\b\u00d3\3\2\2\2\n\u00f7\3\2\2\2\f\u0109\3\2\2\2"+
		"\16\u0112\3\2\2\2\20\u011a\3\2\2\2\22\u0124\3\2\2\2\24\u0137\3\2\2\2\26"+
		"\u015b\3\2\2\2\30\u0164\3\2\2\2\32\u0167\3\2\2\2\34\u0187\3\2\2\2\36\u01b2"+
		"\3\2\2\2 \u01e0\3\2\2\2\"\u0225\3\2\2\2$\u0238\3\2\2\2&\u0256\3\2\2\2"+
		"(\u0260\3\2\2\2*\u027d\3\2\2\2,\u0283\3\2\2\2.\u0290\3\2\2\2\60\u029d"+
		"\3\2\2\2\62\u02aa\3\2\2\2\64\u02c3\3\2\2\2\66\u02e3\3\2\2\28\u032d\3\2"+
		"\2\2:\u033c\3\2\2\2<\u0349\3\2\2\2>\u034f\3\2\2\2@\u035d\3\2\2\2B\u036c"+
		"\3\2\2\2D\u038f\3\2\2\2F\u03f8\3\2\2\2H\u03fb\3\2\2\2J\u041e\3\2\2\2L"+
		"\u0454\3\2\2\2N\u0456\3\2\2\2P\u0460\3\2\2\2R\u046f\3\2\2\2T\u049c\3\2"+
		"\2\2V\u04ea\3\2\2\2X\u0553\3\2\2\2Z\u0583\3\2\2\2\\\u058d\3\2\2\2^\u0595"+
		"\3\2\2\2`\u05ad\3\2\2\2b\u05b7\3\2\2\2d\u05c2\3\2\2\2f\u05c4\3\2\2\2h"+
		"\u05e3\3\2\2\2j\u0614\3\2\2\2l\u0616\3\2\2\2n\u062d\3\2\2\2p\u063d\3\2"+
		"\2\2r\u0689\3\2\2\2t\u0690\3\2\2\2v\u0692\3\2\2\2x\u06a1\3\2\2\2z\u06a5"+
		"\3\2\2\2|\u06a7\3\2\2\2~\u06a9\3\2\2\2\u0080\u06ad\3\2\2\2\u0082\u06af"+
		"\3\2\2\2\u0084\u06b1\3\2\2\2\u0086\u06b3\3\2\2\2\u0088\u06b5\3\2\2\2\u008a"+
		"\u06b7\3\2\2\2\u008c\u06b9\3\2\2\2\u008e\u06bb\3\2\2\2\u0090\u06bd\3\2"+
		"\2\2\u0092\u06bf\3\2\2\2\u0094\u06c1\3\2\2\2\u0096\u06c3\3\2\2\2\u0098"+
		"\u06c5\3\2\2\2\u009a\u06c7\3\2\2\2\u009c\u06c9\3\2\2\2\u009e\u06cb\3\2"+
		"\2\2\u00a0\u06cd\3\2\2\2\u00a2\u06cf\3\2\2\2\u00a4\u06d1\3\2\2\2\u00a6"+
		"\u06d3\3\2\2\2\u00a8\u06dc\3\2\2\2\u00aa\u00ad\5\6\4\2\u00ab\u00ad\5\4"+
		"\3\2\u00ac\u00aa\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b1\u00b2\7\2\2\3\u00b2\3\3\2\2\2\u00b3\u00b4\7\u00a2\2\2\u00b4"+
		"\u00b5\b\3\1\2\u00b5\5\3\2\2\2\u00b6\u00b8\7\3\2\2\u00b7\u00b6\3\2\2\2"+
		"\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00c5\5\b\5\2\u00bd\u00bf\7\3\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\5\b\5\2\u00c3\u00be\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cb\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00ca\7\3\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\7\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00ce\u00d1\7K\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d2"+
		"\7s\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00ce\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00f5\3\2\2\2\u00d5\u00f6\5\n"+
		"\6\2\u00d6\u00f6\5\f\7\2\u00d7\u00f6\5\16\b\2\u00d8\u00f6\5\20\t\2\u00d9"+
		"\u00f6\5\22\n\2\u00da\u00f6\5\24\13\2\u00db\u00f6\5\26\f\2\u00dc\u00f6"+
		"\5\32\16\2\u00dd\u00f6\5\34\17\2\u00de\u00f6\5 \21\2\u00df\u00f6\5\"\22"+
		"\2\u00e0\u00f6\5$\23\2\u00e1\u00f6\5&\24\2\u00e2\u00f6\5(\25\2\u00e3\u00f6"+
		"\5*\26\2\u00e4\u00f6\5\30\r\2\u00e5\u00f6\5,\27\2\u00e6\u00f6\5.\30\2"+
		"\u00e7\u00f6\5\60\31\2\u00e8\u00f6\5\62\32\2\u00e9\u00f6\5\64\33\2\u00ea"+
		"\u00f6\5\66\34\2\u00eb\u00f6\58\35\2\u00ec\u00f6\5:\36\2\u00ed\u00f6\5"+
		"<\37\2\u00ee\u00f6\5> \2\u00ef\u00f6\5@!\2\u00f0\u00f6\5B\"\2\u00f1\u00f6"+
		"\5D#\2\u00f2\u00f6\5H%\2\u00f3\u00f6\5J&\2\u00f4\u00f6\5L\'\2\u00f5\u00d5"+
		"\3\2\2\2\u00f5\u00d6\3\2\2\2\u00f5\u00d7\3\2\2\2\u00f5\u00d8\3\2\2\2\u00f5"+
		"\u00d9\3\2\2\2\u00f5\u00da\3\2\2\2\u00f5\u00db\3\2\2\2\u00f5\u00dc\3\2"+
		"\2\2\u00f5\u00dd\3\2\2\2\u00f5\u00de\3\2\2\2\u00f5\u00df\3\2\2\2\u00f5"+
		"\u00e0\3\2\2\2\u00f5\u00e1\3\2\2\2\u00f5\u00e2\3\2\2\2\u00f5\u00e3\3\2"+
		"\2\2\u00f5\u00e4\3\2\2\2\u00f5\u00e5\3\2\2\2\u00f5\u00e6\3\2\2\2\u00f5"+
		"\u00e7\3\2\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5\u00ea\3\2"+
		"\2\2\u00f5\u00eb\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ed\3\2\2\2\u00f5"+
		"\u00ee\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f0\3\2\2\2\u00f5\u00f1\3\2"+
		"\2\2\u00f5\u00f2\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\t\3\2\2\2\u00f7\u00f8\7!\2\2\u00f8\u00fc\7\u0086\2\2\u00f9\u00fa\5\u008a"+
		"F\2\u00fa\u00fb\7\5\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0107\5\u008cG\2\u00ff\u0100"+
		"\7}\2\2\u0100\u0101\7\u008a\2\2\u0101\u0108\5\u0090I\2\u0102\u0104\7\36"+
		"\2\2\u0103\u0105\7\61\2\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0108\5N(\2\u0107\u00ff\3\2\2\2\u0107\u0102\3\2\2"+
		"\2\u0108\13\3\2\2\2\u0109\u0110\7\"\2\2\u010a\u0111\5\u008aF\2\u010b\u0111"+
		"\5\u008eH\2\u010c\u010d\5\u008aF\2\u010d\u010e\7\5\2\2\u010e\u010f\5\u008e"+
		"H\2\u010f\u0111\3\2\2\2\u0110\u010a\3\2\2\2\u0110\u010b\3\2\2\2\u0110"+
		"\u010c\3\2\2\2\u0110\u0111\3\2\2\2\u0111\r\3\2\2\2\u0112\u0114\7&\2\2"+
		"\u0113\u0115\7;\2\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0117\5V,\2\u0117\u0118\7$\2\2\u0118\u0119\5\u008aF\2\u0119"+
		"\17\3\2\2\2\u011a\u011c\7)\2\2\u011b\u011d\t\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011c\u011d\3\2\2\2\u011d\u0122\3\2\2\2\u011e\u0120\7\u008b\2\2\u011f"+
		"\u0121\5\u00a6T\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123"+
		"\3\2\2\2\u0122\u011e\3\2\2\2\u0122\u0123\3\2\2\2\u0123\21\3\2\2\2\u0124"+
		"\u0129\t\3\2\2\u0125\u0127\7\u008b\2\2\u0126\u0128\5\u00a6T\2\u0127\u0126"+
		"\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129\u0125\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\23\3\2\2\2\u012b\u012d\7\u0098\2\2\u012c\u012e\7"+
		"x\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0134\5f\64\2\u0130\u0131\7\b\2\2\u0131\u0133\5f\64\2\u0132\u0130\3\2"+
		"\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u012b\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u0143\5r:\2\u013a\u013c\7\u008d\2\2\u013b"+
		"\u013d\7 \2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u0141\3\2"+
		"\2\2\u013e\u0141\7^\2\2\u013f\u0141\7H\2\2\u0140\u013a\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0144\5r:\2\u0143"+
		"\u0140\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0151\3\2\2\2\u0147\u0148\7q\2\2\u0148\u0149\7+\2\2\u0149\u014e"+
		"\5b\62\2\u014a\u014b\7\b\2\2\u014b\u014d\5b\62\2\u014c\u014a\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0152\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0151\u0147\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0159\3\2\2\2\u0153\u0154\7f\2\2\u0154\u0157\5V,\2\u0155\u0156\t\4\2"+
		"\2\u0156\u0158\5V,\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u015a"+
		"\3\2\2\2\u0159\u0153\3\2\2\2\u0159\u015a\3\2\2\2\u015a\25\3\2\2\2\u015b"+
		"\u015c\7\66\2\2\u015c\u0160\7;\2\2\u015d\u015e\7T\2\2\u015e\u015f\7j\2"+
		"\2\u015f\u0161\7J\2\2\u0160\u015d\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162"+
		"\3\2\2\2\u0162\u0163\5\u008aF\2\u0163\27\3\2\2\2\u0164\u0165\7\u0091\2"+
		"\2\u0165\u0166\5\u008aF\2\u0166\31\3\2\2\2\u0167\u0169\7\66\2\2\u0168"+
		"\u016a\7\u008e\2\2\u0169\u0168\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016f\7X\2\2\u016c\u016d\7T\2\2\u016d\u016e\7j\2\2\u016e"+
		"\u0170\7J\2\2\u016f\u016c\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0174\3\2"+
		"\2\2\u0171\u0172\5\u008aF\2\u0172\u0173\7\5\2\2\u0173\u0175\3\2\2\2\u0174"+
		"\u0171\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\5\u0098"+
		"M\2\u0177\u0178\7o\2\2\u0178\u0179\5\u008cG\2\u0179\u017a\7\6\2\2\u017a"+
		"\u017f\5\\/\2\u017b\u017c\7\b\2\2\u017c\u017e\5\\/\2\u017d\u017b\3\2\2"+
		"\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0185\7\7\2\2\u0183\u0184\7\u0097\2"+
		"\2\u0184\u0186\5V,\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\33"+
		"\3\2\2\2\u0187\u0189\7\66\2\2\u0188\u018a\t\5\2\2\u0189\u0188\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018f\7\u0086\2\2\u018c"+
		"\u018d\7T\2\2\u018d\u018e\7j\2\2\u018e\u0190\7J\2\2\u018f\u018c\3\2\2"+
		"\2\u018f\u0190\3\2\2\2\u0190\u0194\3\2\2\2\u0191\u0192\5\u008aF\2\u0192"+
		"\u0193\7\5\2\2\u0193\u0195\3\2\2\2\u0194\u0191\3\2\2\2\u0194\u0195\3\2"+
		"\2\2\u0195\u0196\3\2\2\2\u0196\u01ae\5\u008cG\2\u0197\u0198\7\6\2\2\u0198"+
		"\u019d\5N(\2\u0199\u019a\7\b\2\2\u019a\u019c\5N(\2\u019b\u0199\3\2\2\2"+
		"\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a4"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1\7\b\2\2\u01a1\u01a3\5\36\20\2"+
		"\u01a2\u01a0\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a4\u01a5"+
		"\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7\u01aa\7\7\2\2\u01a8"+
		"\u01a9\7\u0099\2\2\u01a9\u01ab\7\u009a\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01af\3\2\2\2\u01ac\u01ad\7$\2\2\u01ad\u01af\5D#\2\u01ae"+
		"\u0197\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\35\3\2\2\2\u01b0\u01b1\7\65\2"+
		"\2\u01b1\u01b3\5\u0086D\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"+
		"\u01de\3\2\2\2\u01b4\u01b5\7u\2\2\u01b5\u01b8\7c\2\2\u01b6\u01b8\7\u008e"+
		"\2\2\u01b7\u01b4\3\2\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9"+
		"\u01ba\7\6\2\2\u01ba\u01bf\5\\/\2\u01bb\u01bc\7\b\2\2\u01bc\u01be\5\\"+
		"/\2\u01bd\u01bb\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\7\7"+
		"\2\2\u01c3\u01c4\5T+\2\u01c4\u01df\3\2\2\2\u01c5\u01c6\7/\2\2\u01c6\u01c7"+
		"\7\6\2\2\u01c7\u01c8\5V,\2\u01c8\u01c9\7\7\2\2\u01c9\u01df\3\2\2\2\u01ca"+
		"\u01cb\7N\2\2\u01cb\u01cc\7c\2\2\u01cc\u01cd\7\6\2\2\u01cd\u01d2\5\u0092"+
		"J\2\u01ce\u01cf\7\b\2\2\u01cf\u01d1\5\u0092J\2\u01d0\u01ce\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d5\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\7\7\2\2\u01d6\u01d7\5X-\2\u01d7\u01df"+
		"\3\2\2\2\u01d8\u01d9\7c\2\2\u01d9\u01da\5\u008eH\2\u01da\u01db\7\6\2\2"+
		"\u01db\u01dc\5\u0092J\2\u01dc\u01dd\7\7\2\2\u01dd\u01df\3\2\2\2\u01de"+
		"\u01b7\3\2\2\2\u01de\u01c5\3\2\2\2\u01de\u01ca\3\2\2\2\u01de\u01d8\3\2"+
		"\2\2\u01df\37\3\2\2\2\u01e0\u01e2\7\66\2\2\u01e1\u01e3\t\5\2\2\u01e2\u01e1"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e8\7\u008c\2"+
		"\2\u01e5\u01e6\7T\2\2\u01e6\u01e7\7j\2\2\u01e7\u01e9\7J\2\2\u01e8\u01e5"+
		"\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\u01ed\3\2\2\2\u01ea\u01eb\5\u008aF"+
		"\2\u01eb\u01ec\7\5\2\2\u01ec\u01ee\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f4\5\u009aN\2\u01f0\u01f5\7(\2\2"+
		"\u01f1\u01f5\7\37\2\2\u01f2\u01f3\7]\2\2\u01f3\u01f5\7m\2\2\u01f4\u01f0"+
		"\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u0204\3\2\2\2\u01f6\u0205\7?\2\2\u01f7\u0205\7\\\2\2\u01f8\u0202\7\u008f"+
		"\2\2\u01f9\u01fa\7m\2\2\u01fa\u01ff\5\u0092J\2\u01fb\u01fc\7\b\2\2\u01fc"+
		"\u01fe\5\u0092J\2\u01fd\u01fb\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd"+
		"\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0202"+
		"\u01f9\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u01f6\3\2"+
		"\2\2\u0204\u01f7\3\2\2\2\u0204\u01f8\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u020a\7o\2\2\u0207\u0208\5\u008aF\2\u0208\u0209\7\5\2\2\u0209\u020b\3"+
		"\2\2\2\u020a\u0207\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c"+
		"\u0210\5\u008cG\2\u020d\u020e\7M\2\2\u020e\u020f\7D\2\2\u020f\u0211\7"+
		"\u0082\2\2\u0210\u020d\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0214\3\2\2\2"+
		"\u0212\u0213\7\u0096\2\2\u0213\u0215\5V,\2\u0214\u0212\3\2\2\2\u0214\u0215"+
		"\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u021f\7)\2\2\u0217\u021c\5H%\2\u0218"+
		"\u021c\5\66\34\2\u0219\u021c\5&\24\2\u021a\u021c\5D#\2\u021b\u0217\3\2"+
		"\2\2\u021b\u0218\3\2\2\2\u021b\u0219\3\2\2\2\u021b\u021a\3\2\2\2\u021c"+
		"\u021d\3\2\2\2\u021d\u021e\7\3\2\2\u021e\u0220\3\2\2\2\u021f\u021b\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0223\3\2\2\2\u0223\u0224\7F\2\2\u0224!\3\2\2\2\u0225\u0227\7\66\2\2"+
		"\u0226\u0228\t\5\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u022d\7\u0094\2\2\u022a\u022b\7T\2\2\u022b\u022c\7j\2\2"+
		"\u022c\u022e\7J\2\2\u022d\u022a\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0232"+
		"\3\2\2\2\u022f\u0230\5\u008aF\2\u0230\u0231\7\5\2\2\u0231\u0233\3\2\2"+
		"\2\u0232\u022f\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235"+
		"\5\u009cO\2\u0235\u0236\7$\2\2\u0236\u0237\5D#\2\u0237#\3\2\2\2\u0238"+
		"\u0239\7\66\2\2\u0239\u023a\7\u0095\2\2\u023a\u023e\7\u0086\2\2\u023b"+
		"\u023c\7T\2\2\u023c\u023d\7j\2\2\u023d\u023f\7J\2\2\u023e\u023b\3\2\2"+
		"\2\u023e\u023f\3\2\2\2\u023f\u0243\3\2\2\2\u0240\u0241\5\u008aF\2\u0241"+
		"\u0242\7\5\2\2\u0242\u0244\3\2\2\2\u0243\u0240\3\2\2\2\u0243\u0244\3\2"+
		"\2\2\u0244\u0245\3\2\2\2\u0245\u0246\5\u008cG\2\u0246\u0247\7\u0090\2"+
		"\2\u0247\u0253\5\u009eP\2\u0248\u0249\7\6\2\2\u0249\u024e\5\u0080A\2\u024a"+
		"\u024b\7\b\2\2\u024b\u024d\5\u0080A\2\u024c\u024a\3\2\2\2\u024d\u0250"+
		"\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250"+
		"\u024e\3\2\2\2\u0251\u0252\7\7\2\2\u0252\u0254\3\2\2\2\u0253\u0248\3\2"+
		"\2\2\u0253\u0254\3\2\2\2\u0254%\3\2\2\2\u0255\u0257\5^\60\2\u0256\u0255"+
		"\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u0259\7?\2\2\u0259"+
		"\u025a\7O\2\2\u025a\u025d\5`\61\2\u025b\u025c\7\u0097\2\2\u025c\u025e"+
		"\5V,\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\'\3\2\2\2\u025f\u0261"+
		"\5^\60\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"\u0263\7?\2\2\u0263\u0264\7O\2\2\u0264\u0267\5`\61\2\u0265\u0266\7\u0097"+
		"\2\2\u0266\u0268\5V,\2\u0267\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u027b"+
		"\3\2\2\2\u0269\u026a\7q\2\2\u026a\u026b\7+\2\2\u026b\u0270\5b\62\2\u026c"+
		"\u026d\7\b\2\2\u026d\u026f\5b\62\2\u026e\u026c\3\2\2\2\u026f\u0272\3\2"+
		"\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0274\3\2\2\2\u0272"+
		"\u0270\3\2\2\2\u0273\u0269\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0276\7f\2\2\u0276\u0279\5V,\2\u0277\u0278\t\4\2\2\u0278\u027a"+
		"\5V,\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b"+
		"\u0273\3\2\2\2\u027b\u027c\3\2\2\2\u027c)\3\2\2\2\u027d\u027f\7A\2\2\u027e"+
		"\u0280\7;\2\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2"+
		"\2\2\u0281\u0282\5\u008aF\2\u0282+\3\2\2\2\u0283\u0284\7C\2\2\u0284\u0287"+
		"\7X\2\2\u0285\u0286\7T\2\2\u0286\u0288\7J\2\2\u0287\u0285\3\2\2\2\u0287"+
		"\u0288\3\2\2\2\u0288\u028c\3\2\2\2\u0289\u028a\5\u008aF\2\u028a\u028b"+
		"\7\5\2\2\u028b\u028d\3\2\2\2\u028c\u0289\3\2\2\2\u028c\u028d\3\2\2\2\u028d"+
		"\u028e\3\2\2\2\u028e\u028f\5\u0098M\2\u028f-\3\2\2\2\u0290\u0291\7C\2"+
		"\2\u0291\u0294\7\u0086\2\2\u0292\u0293\7T\2\2\u0293\u0295\7J\2\2\u0294"+
		"\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295\u0299\3\2\2\2\u0296\u0297\5\u008a"+
		"F\2\u0297\u0298\7\5\2\2\u0298\u029a\3\2\2\2\u0299\u0296\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\5\u008cG\2\u029c/\3\2\2"+
		"\2\u029d\u029e\7C\2\2\u029e\u02a1\7\u008c\2\2\u029f\u02a0\7T\2\2\u02a0"+
		"\u02a2\7J\2\2\u02a1\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a6\3\2"+
		"\2\2\u02a3\u02a4\5\u008aF\2\u02a4\u02a5\7\5\2\2\u02a5\u02a7\3\2\2\2\u02a6"+
		"\u02a3\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\5\u009a"+
		"N\2\u02a9\61\3\2\2\2\u02aa\u02ab\7C\2\2\u02ab\u02ae\7\u0094\2\2\u02ac"+
		"\u02ad\7T\2\2\u02ad\u02af\7J\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2"+
		"\2\u02af\u02b3\3\2\2\2\u02b0\u02b1\5\u008aF\2\u02b1\u02b2\7\5\2\2\u02b2"+
		"\u02b4\3\2\2\2\u02b3\u02b0\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4\u02b5\3\2"+
		"\2\2\u02b5\u02b6\5\u009cO\2\u02b6\63\3\2\2\2\u02b7\u02b9\7\u0098\2\2\u02b8"+
		"\u02ba\7x\2\2\u02b9\u02b8\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\3\2"+
		"\2\2\u02bb\u02c0\5f\64\2\u02bc\u02bd\7\b\2\2\u02bd\u02bf\5f\64\2\u02be"+
		"\u02bc\3\2\2\2\u02bf\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2"+
		"\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02b7\3\2\2\2\u02c3"+
		"\u02c4\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02cb\5r:\2\u02c6\u02c7\5t;\2"+
		"\u02c7\u02c8\5r:\2\u02c8\u02ca\3\2\2\2\u02c9\u02c6\3\2\2\2\u02ca\u02cd"+
		"\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02d8\3\2\2\2\u02cd"+
		"\u02cb\3\2\2\2\u02ce\u02cf\7q\2\2\u02cf\u02d0\7+\2\2\u02d0\u02d5\5b\62"+
		"\2\u02d1\u02d2\7\b\2\2\u02d2\u02d4\5b\62\2\u02d3\u02d1\3\2\2\2\u02d4\u02d7"+
		"\3\2\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d9\3\2\2\2\u02d7"+
		"\u02d5\3\2\2\2\u02d8\u02ce\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02e0\3\2"+
		"\2\2\u02da\u02db\7f\2\2\u02db\u02de\5V,\2\u02dc\u02dd\t\4\2\2\u02dd\u02df"+
		"\5V,\2\u02de\u02dc\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0"+
		"\u02da\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\65\3\2\2\2\u02e2\u02e4\5^\60"+
		"\2\u02e3\u02e2\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02f6\3\2\2\2\u02e5\u02f7"+
		"\7\\\2\2\u02e6\u02f7\7~\2\2\u02e7\u02e8\7\\\2\2\u02e8\u02e9\7p\2\2\u02e9"+
		"\u02f7\7~\2\2\u02ea\u02eb\7\\\2\2\u02eb\u02ec\7p\2\2\u02ec\u02f7\7\u0081"+
		"\2\2\u02ed\u02ee\7\\\2\2\u02ee\u02ef\7p\2\2\u02ef\u02f7\7\34\2\2\u02f0"+
		"\u02f1\7\\\2\2\u02f1\u02f2\7p\2\2\u02f2\u02f7\7L\2\2\u02f3\u02f4\7\\\2"+
		"\2\u02f4\u02f5\7p\2\2\u02f5\u02f7\7U\2\2\u02f6\u02e5\3\2\2\2\u02f6\u02e6"+
		"\3\2\2\2\u02f6\u02e7\3\2\2\2\u02f6\u02ea\3\2\2\2\u02f6\u02ed\3\2\2\2\u02f6"+
		"\u02f0\3\2\2\2\u02f6\u02f3\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fc\7_"+
		"\2\2\u02f9\u02fa\5\u008aF\2\u02fa\u02fb\7\5\2\2\u02fb\u02fd\3\2\2\2\u02fc"+
		"\u02f9\3\2\2\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u030a\5\u008c"+
		"G\2\u02ff\u0300\7\6\2\2\u0300\u0305\5\u0092J\2\u0301\u0302\7\b\2\2\u0302"+
		"\u0304\5\u0092J\2\u0303\u0301\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303"+
		"\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0305\3\2\2\2\u0308"+
		"\u0309\7\7\2\2\u0309\u030b\3\2\2\2\u030a\u02ff\3\2\2\2\u030a\u030b\3\2"+
		"\2\2\u030b\u032b\3\2\2\2\u030c\u030d\7\u0093\2\2\u030d\u030e\7\6\2\2\u030e"+
		"\u0313\5V,\2\u030f\u0310\7\b\2\2\u0310\u0312\5V,\2\u0311\u030f\3\2\2\2"+
		"\u0312\u0315\3\2\2\2\u0313\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0316"+
		"\3\2\2\2\u0315\u0313\3\2\2\2\u0316\u0325\7\7\2\2\u0317\u0318\7\b\2\2\u0318"+
		"\u0319\7\6\2\2\u0319\u031e\5V,\2\u031a\u031b\7\b\2\2\u031b\u031d\5V,\2"+
		"\u031c\u031a\3\2\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f"+
		"\3\2\2\2\u031f\u0321\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0322\7\7\2\2\u0322"+
		"\u0324\3\2\2\2\u0323\u0317\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2"+
		"\2\2\u0325\u0326\3\2\2\2\u0326\u032c\3\2\2\2\u0327\u0325\3\2\2\2\u0328"+
		"\u032c\5D#\2\u0329\u032a\7<\2\2\u032a\u032c\7\u0093\2\2\u032b\u030c\3"+
		"\2\2\2\u032b\u0328\3\2\2\2\u032b\u0329\3\2\2\2\u032c\67\3\2\2\2\u032d"+
		"\u0331\7t\2\2\u032e\u032f\5\u008aF\2\u032f\u0330\7\5\2\2\u0330\u0332\3"+
		"\2\2\2\u0331\u032e\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u033a\5\u00a0Q\2\u0334\u0335\7\t\2\2\u0335\u033b\5d\63\2\u0336\u0337"+
		"\7\6\2\2\u0337\u0338\5d\63\2\u0338\u0339\7\7\2\2\u0339\u033b\3\2\2\2\u033a"+
		"\u0334\3\2\2\2\u033a\u0336\3\2\2\2\u033a\u033b\3\2\2\2\u033b9\3\2\2\2"+
		"\u033c\u0347\7{\2\2\u033d\u0348\5\u0094K\2\u033e\u033f\5\u008aF\2\u033f"+
		"\u0340\7\5\2\2\u0340\u0342\3\2\2\2\u0341\u033e\3\2\2\2\u0341\u0342\3\2"+
		"\2\2\u0342\u0345\3\2\2\2\u0343\u0346\5\u008cG\2\u0344\u0346\5\u0098M\2"+
		"\u0345\u0343\3\2\2\2\u0345\u0344\3\2\2\2\u0346\u0348\3\2\2\2\u0347\u033d"+
		"\3\2\2\2\u0347\u0341\3\2\2\2\u0347\u0348\3\2\2\2\u0348;\3\2\2\2\u0349"+
		"\u034b\7|\2\2\u034a\u034c\7\u0083\2\2\u034b\u034a\3\2\2\2\u034b\u034c"+
		"\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\5\u00a2R\2\u034e=\3\2\2\2\u034f"+
		"\u0354\7\u0081\2\2\u0350\u0352\7\u008b\2\2\u0351\u0353\5\u00a6T\2\u0352"+
		"\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0350\3\2"+
		"\2\2\u0354\u0355\3\2\2\2\u0355\u035b\3\2\2\2\u0356\u0358\7\u008a\2\2\u0357"+
		"\u0359\7\u0083\2\2\u0358\u0357\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a"+
		"\3\2\2\2\u035a\u035c\5\u00a2R\2\u035b\u0356\3\2\2\2\u035b\u035c\3\2\2"+
		"\2\u035c?\3\2\2\2\u035d\u035e\7\u0083\2\2\u035e\u035f\5\u00a2R\2\u035f"+
		"A\3\2\2\2\u0360\u0362\7\u0098\2\2\u0361\u0363\7x\2\2\u0362\u0361\3\2\2"+
		"\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0369\5f\64\2\u0365\u0366"+
		"\7\b\2\2\u0366\u0368\5f\64\2\u0367\u0365\3\2\2\2\u0368\u036b\3\2\2\2\u0369"+
		"\u0367\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2"+
		"\2\2\u036c\u0360\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u0379\5r:\2\u036f\u0370\7q\2\2\u0370\u0371\7+\2\2\u0371\u0376\5b\62\2"+
		"\u0372\u0373\7\b\2\2\u0373\u0375\5b\62\2\u0374\u0372\3\2\2\2\u0375\u0378"+
		"\3\2\2\2\u0376\u0374\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037a\3\2\2\2\u0378"+
		"\u0376\3\2\2\2\u0379\u036f\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0381\3\2"+
		"\2\2\u037b\u037c\7f\2\2\u037c\u037f\5V,\2\u037d\u037e\t\4\2\2\u037e\u0380"+
		"\5V,\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0382\3\2\2\2\u0381"+
		"\u037b\3\2\2\2\u0381\u0382\3\2\2\2\u0382C\3\2\2\2\u0383\u0385\7\u0098"+
		"\2\2\u0384\u0386\7x\2\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u038c\5f\64\2\u0388\u0389\7\b\2\2\u0389\u038b\5f"+
		"\64\2\u038a\u0388\3\2\2\2\u038b\u038e\3\2\2\2\u038c\u038a\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038d\u0390\3\2\2\2\u038e\u038c\3\2\2\2\u038f\u0383\3\2"+
		"\2\2\u038f\u0390\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0397\5F$\2\u0392\u0393"+
		"\5t;\2\u0393\u0394\5F$\2\u0394\u0396\3\2\2\2\u0395\u0392\3\2\2\2\u0396"+
		"\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u03a4\3\2"+
		"\2\2\u0399\u0397\3\2\2\2\u039a\u039b\7q\2\2\u039b\u039c\7+\2\2\u039c\u03a1"+
		"\5b\62\2\u039d\u039e\7\b\2\2\u039e\u03a0\5b\62\2\u039f\u039d\3\2\2\2\u03a0"+
		"\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a5\3\2"+
		"\2\2\u03a3\u03a1\3\2\2\2\u03a4\u039a\3\2\2\2\u03a4\u03a5\3\2\2\2\u03a5"+
		"\u03ac\3\2\2\2\u03a6\u03a7\7f\2\2\u03a7\u03aa\5V,\2\u03a8\u03a9\t\4\2"+
		"\2\u03a9\u03ab\5V,\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad"+
		"\3\2\2\2\u03ac\u03a6\3\2\2\2\u03ac\u03ad\3\2\2\2\u03adE\3\2\2\2\u03ae"+
		"\u03b0\7\u0084\2\2\u03af\u03b1\t\6\2\2\u03b0\u03af\3\2\2\2\u03b0\u03b1"+
		"\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b7\5h\65\2\u03b3\u03b4\7\b\2\2\u03b4"+
		"\u03b6\5h\65\2\u03b5\u03b3\3\2\2\2\u03b6\u03b9\3\2\2\2\u03b7\u03b5\3\2"+
		"\2\2\u03b7\u03b8\3\2\2\2\u03b8\u03c6\3\2\2\2\u03b9\u03b7\3\2\2\2\u03ba"+
		"\u03c4\7O\2\2\u03bb\u03c0\5j\66\2\u03bc\u03bd\7\b\2\2\u03bd\u03bf\5j\66"+
		"\2\u03be\u03bc\3\2\2\2\u03bf\u03c2\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1"+
		"\3\2\2\2\u03c1\u03c5\3\2\2\2\u03c2\u03c0\3\2\2\2\u03c3\u03c5\5l\67\2\u03c4"+
		"\u03bb\3\2\2\2\u03c4\u03c3\3\2\2\2\u03c5\u03c7\3\2\2\2\u03c6\u03ba\3\2"+
		"\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03ca\3\2\2\2\u03c8\u03c9\7\u0097\2\2\u03c9"+
		"\u03cb\5V,\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03da\3\2\2"+
		"\2\u03cc\u03cd\7R\2\2\u03cd\u03ce\7+\2\2\u03ce\u03d3\5V,\2\u03cf\u03d0"+
		"\7\b\2\2\u03d0\u03d2\5V,\2\u03d1\u03cf\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3"+
		"\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d8\3\2\2\2\u03d5\u03d3\3\2"+
		"\2\2\u03d6\u03d7\7S\2\2\u03d7\u03d9\5V,\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9"+
		"\3\2\2\2\u03d9\u03db\3\2\2\2\u03da\u03cc\3\2\2\2\u03da\u03db\3\2\2\2\u03db"+
		"\u03f9\3\2\2\2\u03dc\u03dd\7\u0093\2\2\u03dd\u03de\7\6\2\2\u03de\u03e3"+
		"\5V,\2\u03df\u03e0\7\b\2\2\u03e0\u03e2\5V,\2\u03e1\u03df\3\2\2\2\u03e2"+
		"\u03e5\3\2\2\2\u03e3\u03e1\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e6\3\2"+
		"\2\2\u03e5\u03e3\3\2\2\2\u03e6\u03f5\7\7\2\2\u03e7\u03e8\7\b\2\2\u03e8"+
		"\u03e9\7\6\2\2\u03e9\u03ee\5V,\2\u03ea\u03eb\7\b\2\2\u03eb\u03ed\5V,\2"+
		"\u03ec\u03ea\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef"+
		"\3\2\2\2\u03ef\u03f1\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u03f2\7\7\2\2\u03f2"+
		"\u03f4\3\2\2\2\u03f3\u03e7\3\2\2\2\u03f4\u03f7\3\2\2\2\u03f5\u03f3\3\2"+
		"\2\2\u03f5\u03f6\3\2\2\2\u03f6\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f8"+
		"\u03ae\3\2\2\2\u03f8\u03dc\3\2\2\2\u03f9G\3\2\2\2\u03fa\u03fc\5^\60\2"+
		"\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0408"+
		"\7\u008f\2\2\u03fe\u03ff\7p\2\2\u03ff\u0409\7\u0081\2\2\u0400\u0401\7"+
		"p\2\2\u0401\u0409\7\34\2\2\u0402\u0403\7p\2\2\u0403\u0409\7~\2\2\u0404"+
		"\u0405\7p\2\2\u0405\u0409\7L\2\2\u0406\u0407\7p\2\2\u0407\u0409\7U\2\2"+
		"\u0408\u03fe\3\2\2\2\u0408\u0400\3\2\2\2\u0408\u0402\3\2\2\2\u0408\u0404"+
		"\3\2\2\2\u0408\u0406\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u040b\5`\61\2\u040b\u040c\7\u0085\2\2\u040c\u040d\5\u0092J\2\u040d\u040e"+
		"\7\t\2\2\u040e\u0416\5V,\2\u040f\u0410\7\b\2\2\u0410\u0411\5\u0092J\2"+
		"\u0411\u0412\7\t\2\2\u0412\u0413\5V,\2\u0413\u0415\3\2\2\2\u0414\u040f"+
		"\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0416\u0417\3\2\2\2\u0417"+
		"\u041b\3\2\2\2\u0418\u0416\3\2\2\2\u0419\u041a\7\u0097\2\2\u041a\u041c"+
		"\5V,\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041cI\3\2\2\2\u041d\u041f"+
		"\5^\60\2\u041e\u041d\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\3\2\2\2\u0420"+
		"\u042b\7\u008f\2\2\u0421\u0422\7p\2\2\u0422\u042c\7\u0081\2\2\u0423\u0424"+
		"\7p\2\2\u0424\u042c\7\34\2\2\u0425\u0426\7p\2\2\u0426\u042c\7~\2\2\u0427"+
		"\u0428\7p\2\2\u0428\u042c\7L\2\2\u0429\u042a\7p\2\2\u042a\u042c\7U\2\2"+
		"\u042b\u0421\3\2\2\2\u042b\u0423\3\2\2\2\u042b\u0425\3\2\2\2\u042b\u0427"+
		"\3\2\2\2\u042b\u0429\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\3\2\2\2\u042d"+
		"\u042e\5`\61\2\u042e\u042f\7\u0085\2\2\u042f\u0430\5\u0092J\2\u0430\u0431"+
		"\7\t\2\2\u0431\u0439\5V,\2\u0432\u0433\7\b\2\2\u0433\u0434\5\u0092J\2"+
		"\u0434\u0435\7\t\2\2\u0435\u0436\5V,\2\u0436\u0438\3\2\2\2\u0437\u0432"+
		"\3\2\2\2\u0438\u043b\3\2\2\2\u0439\u0437\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u043e\3\2\2\2\u043b\u0439\3\2\2\2\u043c\u043d\7\u0097\2\2\u043d\u043f"+
		"\5V,\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0452\3\2\2\2\u0440"+
		"\u0441\7q\2\2\u0441\u0442\7+\2\2\u0442\u0447\5b\62\2\u0443\u0444\7\b\2"+
		"\2\u0444\u0446\5b\62\2\u0445\u0443\3\2\2\2\u0446\u0449\3\2\2\2\u0447\u0445"+
		"\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044b\3\2\2\2\u0449\u0447\3\2\2\2\u044a"+
		"\u0440\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\3\2\2\2\u044c\u044d\7f"+
		"\2\2\u044d\u0450\5V,\2\u044e\u044f\t\4\2\2\u044f\u0451\5V,\2\u0450\u044e"+
		"\3\2\2\2\u0450\u0451\3\2\2\2\u0451\u0453\3\2\2\2\u0452\u044a\3\2\2\2\u0452"+
		"\u0453\3\2\2\2\u0453K\3\2\2\2\u0454\u0455\7\u0092\2\2\u0455M\3\2\2\2\u0456"+
		"\u0458\5\u0092J\2\u0457\u0459\5P)\2\u0458\u0457\3\2\2\2\u0458\u0459\3"+
		"\2\2\2\u0459\u045d\3\2\2\2\u045a\u045c\5R*\2\u045b\u045a\3\2\2\2\u045c"+
		"\u045f\3\2\2\2\u045d\u045b\3\2\2\2\u045d\u045e\3\2\2\2\u045eO\3\2\2\2"+
		"\u045f\u045d\3\2\2\2\u0460\u046b\5\u0086D\2\u0461\u0462\7\6\2\2\u0462"+
		"\u0463\5x=\2\u0463\u0464\7\7\2\2\u0464\u046c\3\2\2\2\u0465\u0466\7\6\2"+
		"\2\u0466\u0467\5x=\2\u0467\u0468\7\b\2\2\u0468\u0469\5x=\2\u0469\u046a"+
		"\7\7\2\2\u046a\u046c\3\2\2\2\u046b\u0461\3\2\2\2\u046b\u0465\3\2\2\2\u046b"+
		"\u046c\3\2\2\2\u046cQ\3\2\2\2\u046d\u046e\7\65\2\2\u046e\u0470\5\u0086"+
		"D\2\u046f\u046d\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0497\3\2\2\2\u0471"+
		"\u0472\7u\2\2\u0472\u0474\7c\2\2\u0473\u0475\t\7\2\2\u0474\u0473\3\2\2"+
		"\2\u0474\u0475\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0478\5T+\2\u0477\u0479"+
		"\7\'\2\2\u0478\u0477\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u0498\3\2\2\2\u047a"+
		"\u047c\7j\2\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\3\2"+
		"\2\2\u047d\u047e\7l\2\2\u047e\u0480\5T+\2\u047f\u0481\7\'\2\2\u0480\u047f"+
		"\3\2\2\2\u0480\u0481\3\2\2\2\u0481\u0498\3\2\2\2\u0482\u0483\7\u008e\2"+
		"\2\u0483\u0498\5T+\2\u0484\u0485\7/\2\2\u0485\u0486\7\6\2\2\u0486\u0487"+
		"\5V,\2\u0487\u0488\7\7\2\2\u0488\u0498\3\2\2\2\u0489\u0490\7<\2\2\u048a"+
		"\u0491\5x=\2\u048b\u0491\5z>\2\u048c\u048d\7\6\2\2\u048d\u048e\5V,\2\u048e"+
		"\u048f\7\7\2\2\u048f\u0491\3\2\2\2\u0490\u048a\3\2\2\2\u0490\u048b\3\2"+
		"\2\2\u0490\u048c\3\2\2\2\u0491\u0498\3\2\2\2\u0492\u0493\7\60\2\2\u0493"+
		"\u0498\5\u0094K\2\u0494\u0498\5X-\2\u0495\u0496\7\63\2\2\u0496\u0498\7"+
		"\u009d\2\2\u0497\u0471\3\2\2\2\u0497\u047b\3\2\2\2\u0497\u0482\3\2\2\2"+
		"\u0497\u0484\3\2\2\2\u0497\u0489\3\2\2\2\u0497\u0492\3\2\2\2\u0497\u0494"+
		"\3\2\2\2\u0497\u0495\3\2\2\2\u0498S\3\2\2\2\u0499\u049a\7o\2\2\u049a\u049b"+
		"\7\64\2\2\u049b\u049d\t\b\2\2\u049c\u0499\3\2\2\2\u049c\u049d\3\2\2\2"+
		"\u049dU\3\2\2\2\u049e\u049f\b,\1\2\u049f\u04a0\5|?\2\u04a0\u04a1\5V,\27"+
		"\u04a1\u04eb\3\2\2\2\u04a2\u04eb\5z>\2\u04a3\u04eb\7\u009c\2\2\u04a4\u04a5"+
		"\5\u008aF\2\u04a5\u04a6\7\5\2\2\u04a6\u04a8\3\2\2\2\u04a7\u04a4\3\2\2"+
		"\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\5\u008cG\2\u04aa"+
		"\u04ab\7\5\2\2\u04ab\u04ad\3\2\2\2\u04ac\u04a7\3\2\2\2\u04ac\u04ad\3\2"+
		"\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04eb\5\u0092J\2\u04af\u04b0\5\u0088E\2"+
		"\u04b0\u04bd\7\6\2\2\u04b1\u04b3\7B\2\2\u04b2\u04b1\3\2\2\2\u04b2\u04b3"+
		"\3\2\2\2\u04b3\u04b4\3\2\2\2\u04b4\u04b9\5V,\2\u04b5\u04b6\7\b\2\2\u04b6"+
		"\u04b8\5V,\2\u04b7\u04b5\3\2\2\2\u04b8\u04bb\3\2\2\2\u04b9\u04b7\3\2\2"+
		"\2\u04b9\u04ba\3\2\2\2\u04ba\u04be\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bc\u04be"+
		"\7\n\2\2\u04bd\u04b2\3\2\2\2\u04bd\u04bc\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04c0\7\7\2\2\u04c0\u04eb\3\2\2\2\u04c1\u04c2\7\6"+
		"\2\2\u04c2\u04c3\5V,\2\u04c3\u04c4\7\7\2\2\u04c4\u04eb\3\2\2\2\u04c5\u04c6"+
		"\7.\2\2\u04c6\u04c7\7\6\2\2\u04c7\u04c8\5V,\2\u04c8\u04c9\7$\2\2\u04c9"+
		"\u04ca\5P)\2\u04ca\u04cb\7\7\2\2\u04cb\u04eb\3\2\2\2\u04cc\u04ce\7j\2"+
		"\2\u04cd\u04cc\3\2\2\2\u04cd\u04ce\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04d1"+
		"\7J\2\2\u04d0\u04cd\3\2\2\2\u04d0\u04d1\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2"+
		"\u04d3\7\6\2\2\u04d3\u04d4\5D#\2\u04d4\u04d5\7\7\2\2\u04d5\u04eb\3\2\2"+
		"\2\u04d6\u04d8\7-\2\2\u04d7\u04d9\5V,\2\u04d8\u04d7\3\2\2\2\u04d8\u04d9"+
		"\3\2\2\2\u04d9\u04df\3\2\2\2\u04da\u04db\7\u0096\2\2\u04db\u04dc\5V,\2"+
		"\u04dc\u04dd\7\u0089\2\2\u04dd\u04de\5V,\2\u04de\u04e0\3\2\2\2\u04df\u04da"+
		"\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u04e5\3\2\2\2\u04e3\u04e4\7E\2\2\u04e4\u04e6\5V,\2\u04e5\u04e3\3\2\2"+
		"\2\u04e5\u04e6\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\7F\2\2\u04e8\u04eb"+
		"\3\2\2\2\u04e9\u04eb\5Z.\2\u04ea\u049e\3\2\2\2\u04ea\u04a2\3\2\2\2\u04ea"+
		"\u04a3\3\2\2\2\u04ea\u04ac\3\2\2\2\u04ea\u04af\3\2\2\2\u04ea\u04c1\3\2"+
		"\2\2\u04ea\u04c5\3\2\2\2\u04ea\u04d0\3\2\2\2\u04ea\u04d6\3\2\2\2\u04ea"+
		"\u04e9\3\2\2\2\u04eb\u0550\3\2\2\2\u04ec\u04ed\f\26\2\2\u04ed\u04ee\7"+
		"\16\2\2\u04ee\u054f\5V,\27\u04ef\u04f0\f\25\2\2\u04f0\u04f1\t\t\2\2\u04f1"+
		"\u054f\5V,\26\u04f2\u04f3\f\24\2\2\u04f3\u04f4\t\n\2\2\u04f4\u054f\5V"+
		",\25\u04f5\u04f6\f\23\2\2\u04f6\u04f7\t\13\2\2\u04f7\u054f\5V,\24\u04f8"+
		"\u04f9\f\22\2\2\u04f9\u04fa\t\f\2\2\u04fa\u054f\5V,\23\u04fb\u0508\f\21"+
		"\2\2\u04fc\u0509\7\t\2\2\u04fd\u0509\7\31\2\2\u04fe\u0509\7\32\2\2\u04ff"+
		"\u0509\7\33\2\2\u0500\u0509\7`\2\2\u0501\u0502\7`\2\2\u0502\u0509\7j\2"+
		"\2\u0503\u0509\7W\2\2\u0504\u0509\7e\2\2\u0505\u0509\7Q\2\2\u0506\u0509"+
		"\7g\2\2\u0507\u0509\7z\2\2\u0508\u04fc\3\2\2\2\u0508\u04fd\3\2\2\2\u0508"+
		"\u04fe\3\2\2\2\u0508\u04ff\3\2\2\2\u0508\u0500\3\2\2\2\u0508\u0501\3\2"+
		"\2\2\u0508\u0503\3\2\2\2\u0508\u0504\3\2\2\2\u0508\u0505\3\2\2\2\u0508"+
		"\u0506\3\2\2\2\u0508\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u054f\5V"+
		",\22\u050b\u050c\f\20\2\2\u050c\u050d\7#\2\2\u050d\u054f\5V,\21\u050e"+
		"\u050f\f\17\2\2\u050f\u0510\7p\2\2\u0510\u054f\5V,\20\u0511\u0512\f\b"+
		"\2\2\u0512\u0514\7`\2\2\u0513\u0515\7j\2\2\u0514\u0513\3\2\2\2\u0514\u0515"+
		"\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u054f\5V,\t\u0517\u0519\f\7\2\2\u0518"+
		"\u051a\7j\2\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u051b\3\2"+
		"\2\2\u051b\u051c\7*\2\2\u051c\u051d\5V,\2\u051d\u051e\7#\2\2\u051e\u051f"+
		"\5V,\b\u051f\u054f\3\2\2\2\u0520\u0521\f\13\2\2\u0521\u0522\7\60\2\2\u0522"+
		"\u054f\5\u0094K\2\u0523\u0525\f\n\2\2\u0524\u0526\7j\2\2\u0525\u0524\3"+
		"\2\2\2\u0525\u0526\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\t\r\2\2\u0528"+
		"\u052b\5V,\2\u0529\u052a\7G\2\2\u052a\u052c\5V,\2\u052b\u0529\3\2\2\2"+
		"\u052b\u052c\3\2\2\2\u052c\u054f\3\2\2\2\u052d\u0532\f\t\2\2\u052e\u0533"+
		"\7a\2\2\u052f\u0533\7k\2\2\u0530\u0531\7j\2\2\u0531\u0533\7l\2\2\u0532"+
		"\u052e\3\2\2\2\u0532\u052f\3\2\2\2\u0532\u0530\3\2\2\2\u0533\u054f\3\2"+
		"\2\2\u0534\u0536\f\6\2\2\u0535\u0537\7j\2\2\u0536\u0535\3\2\2\2\u0536"+
		"\u0537\3\2\2\2\u0537\u0538\3\2\2\2\u0538\u054c\7W\2\2\u0539\u0543\7\6"+
		"\2\2\u053a\u0544\5D#\2\u053b\u0540\5V,\2\u053c\u053d\7\b\2\2\u053d\u053f"+
		"\5V,\2\u053e\u053c\3\2\2\2\u053f\u0542\3\2\2\2\u0540\u053e\3\2\2\2\u0540"+
		"\u0541\3\2\2\2\u0541\u0544\3\2\2\2\u0542\u0540\3\2\2\2\u0543\u053a\3\2"+
		"\2\2\u0543\u053b\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0545\3\2\2\2\u0545"+
		"\u054d\7\7\2\2\u0546\u0547\5\u008aF\2\u0547\u0548\7\5\2\2\u0548\u054a"+
		"\3\2\2\2\u0549\u0546\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054b\3\2\2\2\u054b"+
		"\u054d\5\u008cG\2\u054c\u0539\3\2\2\2\u054c\u0549\3\2\2\2\u054d\u054f"+
		"\3\2\2\2\u054e\u04ec\3\2\2\2\u054e\u04ef\3\2\2\2\u054e\u04f2\3\2\2\2\u054e"+
		"\u04f5\3\2\2\2\u054e\u04f8\3\2\2\2\u054e\u04fb\3\2\2\2\u054e\u050b\3\2"+
		"\2\2\u054e\u050e\3\2\2\2\u054e\u0511\3\2\2\2\u054e\u0517\3\2\2\2\u054e"+
		"\u0520\3\2\2\2\u054e\u0523\3\2\2\2\u054e\u052d\3\2\2\2\u054e\u0534\3\2"+
		"\2\2\u054f\u0552\3\2\2\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551"+
		"W\3\2\2\2\u0552\u0550\3\2\2\2\u0553\u0554\7y\2\2\u0554\u0560\5\u0096L"+
		"\2\u0555\u0556\7\6\2\2\u0556\u055b\5\u0092J\2\u0557\u0558\7\b\2\2\u0558"+
		"\u055a\5\u0092J\2\u0559\u0557\3\2\2\2\u055a\u055d\3\2\2\2\u055b\u0559"+
		"\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055e\3\2\2\2\u055d\u055b\3\2\2\2\u055e"+
		"\u055f\7\7\2\2\u055f\u0561\3\2\2\2\u0560\u0555\3\2\2\2\u0560\u0561\3\2"+
		"\2\2\u0561\u0574\3\2\2\2\u0562\u0563\7o\2\2\u0563\u056c\t\16\2\2\u0564"+
		"\u0565\7\u0085\2\2\u0565\u056d\7l\2\2\u0566\u0567\7\u0085\2\2\u0567\u056d"+
		"\7<\2\2\u0568\u056d\7,\2\2\u0569\u056d\7\177\2\2\u056a\u056b\7i\2\2\u056b"+
		"\u056d\7\35\2\2\u056c\u0564\3\2\2\2\u056c\u0566\3\2\2\2\u056c\u0568\3"+
		"\2\2\2\u056c\u0569\3\2\2\2\u056c\u056a\3\2\2\2\u056d\u0571\3\2\2\2\u056e"+
		"\u056f\7g\2\2\u056f\u0571\5\u0086D\2\u0570\u0562\3\2\2\2\u0570\u056e\3"+
		"\2\2\2\u0571\u0573\3\2\2\2\u0572\u0570\3\2\2\2\u0573\u0576\3\2\2\2\u0574"+
		"\u0572\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u0581\3\2\2\2\u0576\u0574\3\2"+
		"\2\2\u0577\u0579\7j\2\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579"+
		"\u057a\3\2\2\2\u057a\u057f\7=\2\2\u057b\u057c\7Z\2\2\u057c\u0580\7>\2"+
		"\2\u057d\u057e\7Z\2\2\u057e\u0580\7V\2\2\u057f\u057b\3\2\2\2\u057f\u057d"+
		"\3\2\2\2\u057f\u0580\3\2\2\2\u0580\u0582\3\2\2\2\u0581\u0578\3\2\2\2\u0581"+
		"\u0582\3\2\2\2\u0582Y\3\2\2\2\u0583\u0584\7w\2\2\u0584\u0589\7\6\2\2\u0585"+
		"\u058a\7U\2\2\u0586\u0587\t\17\2\2\u0587\u0588\7\b\2\2\u0588\u058a\5~"+
		"@\2\u0589\u0585\3\2\2\2\u0589\u0586\3\2\2\2\u058a\u058b\3\2\2\2\u058b"+
		"\u058c\7\7\2\2\u058c[\3\2\2\2\u058d\u0590\5\u0092J\2\u058e\u058f\7\60"+
		"\2\2\u058f\u0591\5\u0094K\2\u0590\u058e\3\2\2\2\u0590\u0591\3\2\2\2\u0591"+
		"\u0593\3\2\2\2\u0592\u0594\t\7\2\2\u0593\u0592\3\2\2\2\u0593\u0594\3\2"+
		"\2\2\u0594]\3\2\2\2\u0595\u0597\7\u0098\2\2\u0596\u0598\7x\2\2\u0597\u0596"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059a\5v<\2\u059a"+
		"\u059b\7$\2\2\u059b\u059c\7\6\2\2\u059c\u059d\5D#\2\u059d\u05a7\7\7\2"+
		"\2\u059e\u059f\7\b\2\2\u059f\u05a0\5v<\2\u05a0\u05a1\7$\2\2\u05a1\u05a2"+
		"\7\6\2\2\u05a2\u05a3\5D#\2\u05a3\u05a4\7\7\2\2\u05a4\u05a6\3\2\2\2\u05a5"+
		"\u059e\3\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a7\u05a8\3\2"+
		"\2\2\u05a8_\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa\u05ab\5\u008aF\2\u05ab\u05ac"+
		"\7\5\2\2\u05ac\u05ae\3\2\2\2\u05ad\u05aa\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae"+
		"\u05af\3\2\2\2\u05af\u05b5\5\u008cG\2\u05b0\u05b1\7Y\2\2\u05b1\u05b2\7"+
		"+\2\2\u05b2\u05b6\5\u0098M\2\u05b3\u05b4\7j\2\2\u05b4\u05b6\7Y\2\2\u05b5"+
		"\u05b0\3\2\2\2\u05b5\u05b3\3\2\2\2\u05b5\u05b6\3\2\2\2\u05b6a\3\2\2\2"+
		"\u05b7\u05ba\5V,\2\u05b8\u05b9\7\60\2\2\u05b9\u05bb\5\u0094K\2\u05ba\u05b8"+
		"\3\2\2\2\u05ba\u05bb\3\2\2\2\u05bb\u05bd\3\2\2\2\u05bc\u05be\t\7\2\2\u05bd"+
		"\u05bc\3\2\2\2\u05bd\u05be\3\2\2\2\u05bec\3\2\2\2\u05bf\u05c3\5x=\2\u05c0"+
		"\u05c3\5\u0086D\2\u05c1\u05c3\7\u009d\2\2\u05c2\u05bf\3\2\2\2\u05c2\u05c0"+
		"\3\2\2\2\u05c2\u05c1\3\2\2\2\u05c3e\3\2\2\2\u05c4\u05d0\5\u008cG\2\u05c5"+
		"\u05c6\7\6\2\2\u05c6\u05cb\5\u0092J\2\u05c7\u05c8\7\b\2\2\u05c8\u05ca"+
		"\5\u0092J\2\u05c9\u05c7\3\2\2\2\u05ca\u05cd\3\2\2\2\u05cb\u05c9\3\2\2"+
		"\2\u05cb\u05cc\3\2\2\2\u05cc\u05ce\3\2\2\2\u05cd\u05cb\3\2\2\2\u05ce\u05cf"+
		"\7\7\2\2\u05cf\u05d1\3\2\2\2\u05d0\u05c5\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1"+
		"\u05d2\3\2\2\2\u05d2\u05d3\7$\2\2\u05d3\u05d4\7\6\2\2\u05d4\u05d5\5D#"+
		"\2\u05d5\u05d6\7\7\2\2\u05d6g\3\2\2\2\u05d7\u05e4\7\n\2\2\u05d8\u05d9"+
		"\5\u008cG\2\u05d9\u05da\7\5\2\2\u05da\u05db\7\n\2\2\u05db\u05e4\3\2\2"+
		"\2\u05dc\u05e1\5V,\2\u05dd\u05df\7$\2\2\u05de\u05dd\3\2\2\2\u05de\u05df"+
		"\3\2\2\2\u05df\u05e0\3\2\2\2\u05e0\u05e2\5\u0082B\2\u05e1\u05de\3\2\2"+
		"\2\u05e1\u05e2\3\2\2\2\u05e2\u05e4\3\2\2\2\u05e3\u05d7\3\2\2\2\u05e3\u05d8"+
		"\3\2\2\2\u05e3\u05dc\3\2\2\2\u05e4i\3\2\2\2\u05e5\u05e6\5\u008aF\2\u05e6"+
		"\u05e7\7\5\2\2\u05e7\u05e9\3\2\2\2\u05e8\u05e5\3\2\2\2\u05e8\u05e9\3\2"+
		"\2\2\u05e9\u05ea\3\2\2\2\u05ea\u05ef\5\u008cG\2\u05eb\u05ed\7$\2\2\u05ec"+
		"\u05eb\3\2\2\2\u05ec\u05ed\3\2\2\2\u05ed\u05ee\3\2\2\2\u05ee\u05f0\5\u00a4"+
		"S\2\u05ef\u05ec\3\2\2\2\u05ef\u05f0\3\2\2\2\u05f0\u05f6\3\2\2\2\u05f1"+
		"\u05f2\7Y\2\2\u05f2\u05f3\7+\2\2\u05f3\u05f7\5\u0098M\2\u05f4\u05f5\7"+
		"j\2\2\u05f5\u05f7\7Y\2\2\u05f6\u05f1\3\2\2\2\u05f6\u05f4\3\2\2\2\u05f6"+
		"\u05f7\3\2\2\2\u05f7\u0615\3\2\2\2\u05f8\u0602\7\6\2\2\u05f9\u05fe\5j"+
		"\66\2\u05fa\u05fb\7\b\2\2\u05fb\u05fd\5j\66\2\u05fc\u05fa\3\2\2\2\u05fd"+
		"\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0603\3\2"+
		"\2\2\u0600\u05fe\3\2\2\2\u0601\u0603\5l\67\2\u0602\u05f9\3\2\2\2\u0602"+
		"\u0601\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0609\7\7\2\2\u0605\u0607\7$"+
		"\2\2\u0606\u0605\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0608\3\2\2\2\u0608"+
		"\u060a\5\u00a4S\2\u0609\u0606\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u0615"+
		"\3\2\2\2\u060b\u060c\7\6\2\2\u060c\u060d\5D#\2\u060d\u0612\7\7\2\2\u060e"+
		"\u0610\7$\2\2\u060f\u060e\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611\3\2"+
		"\2\2\u0611\u0613\5\u00a4S\2\u0612\u060f\3\2\2\2\u0612\u0613\3\2\2\2\u0613"+
		"\u0615\3\2\2\2\u0614\u05e8\3\2\2\2\u0614\u05f8\3\2\2\2\u0614\u060b\3\2"+
		"\2\2\u0615k\3\2\2\2\u0616\u061d\5j\66\2\u0617\u0618\5n8\2\u0618\u0619"+
		"\5j\66\2\u0619\u061a\5p9\2\u061a\u061c\3\2\2\2\u061b\u0617\3\2\2\2\u061c"+
		"\u061f\3\2\2\2\u061d\u061b\3\2\2\2\u061d\u061e\3\2\2\2\u061em\3\2\2\2"+
		"\u061f\u061d\3\2\2\2\u0620\u062e\7\b\2\2\u0621\u0623\7h\2\2\u0622\u0621"+
		"\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u062a\3\2\2\2\u0624\u0626\7d\2\2\u0625"+
		"\u0627\7r\2\2\u0626\u0625\3\2\2\2\u0626\u0627\3\2\2\2\u0627\u062b\3\2"+
		"\2\2\u0628\u062b\7[\2\2\u0629\u062b\7\67\2\2\u062a\u0624\3\2\2\2\u062a"+
		"\u0628\3\2\2\2\u062a\u0629\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062c\3\2"+
		"\2\2\u062c\u062e\7b\2\2\u062d\u0620\3\2\2\2\u062d\u0622\3\2\2\2\u062e"+
		"o\3\2\2\2\u062f\u0630\7o\2\2\u0630\u063e\5V,\2\u0631\u0632\7\u0090\2\2"+
		"\u0632\u0633\7\6\2\2\u0633\u0638\5\u0092J\2\u0634\u0635\7\b\2\2\u0635"+
		"\u0637\5\u0092J\2\u0636\u0634\3\2\2\2\u0637\u063a\3\2\2\2\u0638\u0636"+
		"\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\3\2\2\2\u063a\u0638\3\2\2\2\u063b"+
		"\u063c\7\7\2\2\u063c\u063e\3\2\2\2\u063d\u062f\3\2\2\2\u063d\u0631\3\2"+
		"\2\2\u063d\u063e\3\2\2\2\u063eq\3\2\2\2\u063f\u0641\7\u0084\2\2\u0640"+
		"\u0642\t\6\2\2\u0641\u0640\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\3\2"+
		"\2\2\u0643\u0648\5h\65\2\u0644\u0645\7\b\2\2\u0645\u0647\5h\65\2\u0646"+
		"\u0644\3\2\2\2\u0647\u064a\3\2\2\2\u0648\u0646\3\2\2\2\u0648\u0649\3\2"+
		"\2\2\u0649\u0657\3\2\2\2\u064a\u0648\3\2\2\2\u064b\u0655\7O\2\2\u064c"+
		"\u0651\5j\66\2\u064d\u064e\7\b\2\2\u064e\u0650\5j\66\2\u064f\u064d\3\2"+
		"\2\2\u0650\u0653\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652"+
		"\u0656\3\2\2\2\u0653\u0651\3\2\2\2\u0654\u0656\5l\67\2\u0655\u064c\3\2"+
		"\2\2\u0655\u0654\3\2\2\2\u0656\u0658\3\2\2\2\u0657\u064b\3\2\2\2\u0657"+
		"\u0658\3\2\2\2\u0658\u065b\3\2\2\2\u0659\u065a\7\u0097\2\2\u065a\u065c"+
		"\5V,\2\u065b\u0659\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u066b\3\2\2\2\u065d"+
		"\u065e\7R\2\2\u065e\u065f\7+\2\2\u065f\u0664\5V,\2\u0660\u0661\7\b\2\2"+
		"\u0661\u0663\5V,\2\u0662\u0660\3\2\2\2\u0663\u0666\3\2\2\2\u0664\u0662"+
		"\3\2\2\2\u0664\u0665\3\2\2\2\u0665\u0669\3\2\2\2\u0666\u0664\3\2\2\2\u0667"+
		"\u0668\7S\2\2\u0668\u066a\5V,\2\u0669\u0667\3\2\2\2\u0669\u066a\3\2\2"+
		"\2\u066a\u066c\3\2\2\2\u066b\u065d\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u068a"+
		"\3\2\2\2\u066d\u066e\7\u0093\2\2\u066e\u066f\7\6\2\2\u066f\u0674\5V,\2"+
		"\u0670\u0671\7\b\2\2\u0671\u0673\5V,\2\u0672\u0670\3\2\2\2\u0673\u0676"+
		"\3\2\2\2\u0674\u0672\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0677\3\2\2\2\u0676"+
		"\u0674\3\2\2\2\u0677\u0686\7\7\2\2\u0678\u0679\7\b\2\2\u0679\u067a\7\6"+
		"\2\2\u067a\u067f\5V,\2\u067b\u067c\7\b\2\2\u067c\u067e\5V,\2\u067d\u067b"+
		"\3\2\2\2\u067e\u0681\3\2\2\2\u067f\u067d\3\2\2\2\u067f\u0680\3\2\2\2\u0680"+
		"\u0682\3\2\2\2\u0681\u067f\3\2\2\2\u0682\u0683\7\7\2\2\u0683\u0685\3\2"+
		"\2\2\u0684\u0678\3\2\2\2\u0685\u0688\3\2\2\2\u0686\u0684\3\2\2\2\u0686"+
		"\u0687\3\2\2\2\u0687\u068a\3\2\2\2\u0688\u0686\3\2\2\2\u0689\u063f\3\2"+
		"\2\2\u0689\u066d\3\2\2\2\u068as\3\2\2\2\u068b\u0691\7\u008d\2\2\u068c"+
		"\u068d\7\u008d\2\2\u068d\u0691\7 \2\2\u068e\u0691\7^\2\2\u068f\u0691\7"+
		"H\2\2\u0690\u068b\3\2\2\2\u0690\u068c\3\2\2\2\u0690\u068e\3\2\2\2\u0690"+
		"\u068f\3\2\2\2\u0691u\3\2\2\2\u0692\u069e\5\u008cG\2\u0693\u0694\7\6\2"+
		"\2\u0694\u0699\5\u0092J\2\u0695\u0696\7\b\2\2\u0696\u0698\5\u0092J\2\u0697"+
		"\u0695\3\2\2\2\u0698\u069b\3\2\2\2\u0699\u0697\3\2\2\2\u0699\u069a\3\2"+
		"\2\2\u069a\u069c\3\2\2\2\u069b\u0699\3\2\2\2\u069c\u069d\7\7\2\2\u069d"+
		"\u069f\3\2\2\2\u069e\u0693\3\2\2\2\u069e\u069f\3\2\2\2\u069fw\3\2\2\2"+
		"\u06a0\u06a2\t\n\2\2\u06a1\u06a0\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a3"+
		"\3\2\2\2\u06a3\u06a4\7\u009b\2\2\u06a4y\3\2\2\2\u06a5\u06a6\t\20\2\2\u06a6"+
		"{\3\2\2\2\u06a7\u06a8\t\21\2\2\u06a8}\3\2\2\2\u06a9\u06aa\7\u009d\2\2"+
		"\u06aa\177\3\2\2\2\u06ab\u06ae\5V,\2\u06ac\u06ae\5N(\2\u06ad\u06ab\3\2"+
		"\2\2\u06ad\u06ac\3\2\2\2\u06ae\u0081\3\2\2\2\u06af\u06b0\t\22\2\2\u06b0"+
		"\u0083\3\2\2\2\u06b1\u06b2\t\23\2\2\u06b2\u0085\3\2\2\2\u06b3\u06b4\5"+
		"\u00a8U\2\u06b4\u0087\3\2\2\2\u06b5\u06b6\5\u00a8U\2\u06b6\u0089\3\2\2"+
		"\2\u06b7\u06b8\5\u00a8U\2\u06b8\u008b\3\2\2\2\u06b9\u06ba\5\u00a8U\2\u06ba"+
		"\u008d\3\2\2\2\u06bb\u06bc\5\u00a8U\2\u06bc\u008f\3\2\2\2\u06bd\u06be"+
		"\5\u00a8U\2\u06be\u0091\3\2\2\2\u06bf\u06c0\5\u00a8U\2\u06c0\u0093\3\2"+
		"\2\2\u06c1\u06c2\5\u00a8U\2\u06c2\u0095\3\2\2\2\u06c3\u06c4\5\u00a8U\2"+
		"\u06c4\u0097\3\2\2\2\u06c5\u06c6\5\u00a8U\2\u06c6\u0099\3\2\2\2\u06c7"+
		"\u06c8\5\u00a8U\2\u06c8\u009b\3\2\2\2\u06c9\u06ca\5\u00a8U\2\u06ca\u009d"+
		"\3\2\2\2\u06cb\u06cc\5\u00a8U\2\u06cc\u009f\3\2\2\2\u06cd\u06ce\5\u00a8"+
		"U\2\u06ce\u00a1\3\2\2\2\u06cf\u06d0\5\u00a8U\2\u06d0\u00a3\3\2\2\2\u06d1"+
		"\u06d2\5\u00a8U\2\u06d2\u00a5\3\2\2\2\u06d3\u06d4\5\u00a8U\2\u06d4\u00a7"+
		"\3\2\2\2\u06d5\u06dd\7\u009a\2\2\u06d6\u06dd\5\u0084C\2\u06d7\u06dd\7"+
		"\u009d\2\2\u06d8\u06d9\7\6\2\2\u06d9\u06da\5\u00a8U\2\u06da\u06db\7\7"+
		"\2\2\u06db\u06dd\3\2\2\2\u06dc\u06d5\3\2\2\2\u06dc\u06d6\3\2\2\2\u06dc"+
		"\u06d7\3\2\2\2\u06dc\u06d8\3\2\2\2\u06dd\u00a9\3\2\2\2\u00f7\u00ac\u00ae"+
		"\u00b9\u00c0\u00c5\u00cb\u00d1\u00d3\u00f5\u00fc\u0104\u0107\u0110\u0114"+
		"\u011c\u0120\u0122\u0127\u0129\u012d\u0134\u0137\u013c\u0140\u0145\u014e"+
		"\u0151\u0157\u0159\u0160\u0169\u016f\u0174\u017f\u0185\u0189\u018f\u0194"+
		"\u019d\u01a4\u01aa\u01ae\u01b2\u01b7\u01bf\u01d2\u01de\u01e2\u01e8\u01ed"+
		"\u01f4\u01ff\u0202\u0204\u020a\u0210\u0214\u021b\u0221\u0227\u022d\u0232"+
		"\u023e\u0243\u024e\u0253\u0256\u025d\u0260\u0267\u0270\u0273\u0279\u027b"+
		"\u027f\u0287\u028c\u0294\u0299\u02a1\u02a6\u02ae\u02b3\u02b9\u02c0\u02c3"+
		"\u02cb\u02d5\u02d8\u02de\u02e0\u02e3\u02f6\u02fc\u0305\u030a\u0313\u031e"+
		"\u0325\u032b\u0331\u033a\u0341\u0345\u0347\u034b\u0352\u0354\u0358\u035b"+
		"\u0362\u0369\u036c\u0376\u0379\u037f\u0381\u0385\u038c\u038f\u0397\u03a1"+
		"\u03a4\u03aa\u03ac\u03b0\u03b7\u03c0\u03c4\u03c6\u03ca\u03d3\u03d8\u03da"+
		"\u03e3\u03ee\u03f5\u03f8\u03fb\u0408\u0416\u041b\u041e\u042b\u0439\u043e"+
		"\u0447\u044a\u0450\u0452\u0458\u045d\u046b\u046f\u0474\u0478\u047b\u0480"+
		"\u0490\u0497\u049c\u04a7\u04ac\u04b2\u04b9\u04bd\u04cd\u04d0\u04d8\u04e1"+
		"\u04e5\u04ea\u0508\u0514\u0519\u0525\u052b\u0532\u0536\u0540\u0543\u0549"+
		"\u054c\u054e\u0550\u055b\u0560\u056c\u0570\u0574\u0578\u057f\u0581\u0589"+
		"\u0590\u0593\u0597\u05a7\u05ad\u05b5\u05ba\u05bd\u05c2\u05cb\u05d0\u05de"+
		"\u05e1\u05e3\u05e8\u05ec\u05ef\u05f6\u05fe\u0602\u0606\u0609\u060f\u0612"+
		"\u0614\u061d\u0622\u0626\u062a\u062d\u0638\u063d\u0641\u0648\u0651\u0655"+
		"\u0657\u065b\u0664\u0669\u066b\u0674\u067f\u0686\u0689\u0690\u0699\u069e"+
		"\u06a1\u06ad\u06dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}