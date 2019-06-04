// Generated from C:/Users/Quicker/Documents/THU/curriculum/major/Database/homework/Final/SimpleDB/src\SQLite.g4 by ANTLR 4.7.2
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_CREATE=50, K_CROSS=51, K_CURRENT_DATE=52, K_CURRENT_TIME=53, K_CURRENT_TIMESTAMP=54, 
		K_DATABASE=55, K_DATABASES=56, K_DEFAULT=57, K_DEFERRABLE=58, K_DEFERRED=59, 
		K_DELETE=60, K_DESC=61, K_DETACH=62, K_DISTINCT=63, K_DROP=64, K_EACH=65, 
		K_ELSE=66, K_END=67, K_ESCAPE=68, K_EXCEPT=69, K_EXCLUSIVE=70, K_EXISTS=71, 
		K_EXPLAIN=72, K_FAIL=73, K_FOR=74, K_FOREIGN=75, K_FROM=76, K_FULL=77, 
		K_GLOB=78, K_GROUP=79, K_HAVING=80, K_IF=81, K_IGNORE=82, K_IMMEDIATE=83, 
		K_IN=84, K_INDEX=85, K_INDEXED=86, K_INITIALLY=87, K_INNER=88, K_INSERT=89, 
		K_INSTEAD=90, K_INTERSECT=91, K_INTO=92, K_IS=93, K_ISNULL=94, K_JOIN=95, 
		K_KEY=96, K_LEFT=97, K_LIKE=98, K_LIMIT=99, K_MATCH=100, K_NATURAL=101, 
		K_NO=102, K_NOT=103, K_NOTNULL=104, K_NULL=105, K_OF=106, K_OFFSET=107, 
		K_ON=108, K_OR=109, K_ORDER=110, K_OUTER=111, K_PLAN=112, K_PRAGMA=113, 
		K_PRIMARY=114, K_QUERY=115, K_RAISE=116, K_RECURSIVE=117, K_REFERENCES=118, 
		K_REGEXP=119, K_REINDEX=120, K_RELEASE=121, K_RENAME=122, K_REPLACE=123, 
		K_RESTRICT=124, K_RIGHT=125, K_ROLLBACK=126, K_ROW=127, K_SAVEPOINT=128, 
		K_SELECT=129, K_SET=130, K_SHOW=131, K_TABLE=132, K_TEMP=133, K_TEMPORARY=134, 
		K_THEN=135, K_TO=136, K_TRANSACTION=137, K_TRIGGER=138, K_UNION=139, K_UNIQUE=140, 
		K_UPDATE=141, K_USE=142, K_USING=143, K_VACUUM=144, K_VALUES=145, K_VIEW=146, 
		K_VIRTUAL=147, K_WHEN=148, K_WHERE=149, K_WITH=150, K_WITHOUT=151, IDENTIFIER=152, 
		NUMERIC_LITERAL=153, BIND_PARAMETER=154, STRING_LITERAL=155, BLOB_LITERAL=156, 
		SINGLE_LINE_COMMENT=157, MULTILINE_COMMENT=158, SPACES=159, UNEXPECTED_CHAR=160;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_show_databases_stmt = 4, RULE_show_database_stmt = 5, RULE_create_database_stmt = 6, 
		RULE_drop_database_stmt = 7, RULE_use_database_stmt = 8, RULE_alter_table_stmt = 9, 
		RULE_analyze_stmt = 10, RULE_attach_stmt = 11, RULE_begin_stmt = 12, RULE_commit_stmt = 13, 
		RULE_compound_select_stmt = 14, RULE_create_index_stmt = 15, RULE_create_table_stmt = 16, 
		RULE_create_trigger_stmt = 17, RULE_create_view_stmt = 18, RULE_create_virtual_table_stmt = 19, 
		RULE_delete_stmt = 20, RULE_delete_stmt_limited = 21, RULE_detach_stmt = 22, 
		RULE_drop_index_stmt = 23, RULE_drop_table_stmt = 24, RULE_drop_trigger_stmt = 25, 
		RULE_drop_view_stmt = 26, RULE_factored_select_stmt = 27, RULE_insert_stmt = 28, 
		RULE_pragma_stmt = 29, RULE_reindex_stmt = 30, RULE_release_stmt = 31, 
		RULE_rollback_stmt = 32, RULE_savepoint_stmt = 33, RULE_simple_select_stmt = 34, 
		RULE_select_stmt = 35, RULE_select_or_values = 36, RULE_update_stmt = 37, 
		RULE_update_stmt_limited = 38, RULE_vacuum_stmt = 39, RULE_column_def = 40, 
		RULE_type_name = 41, RULE_column_constraint = 42, RULE_conflict_clause = 43, 
		RULE_expr = 44, RULE_foreign_key_clause = 45, RULE_raise_function = 46, 
		RULE_indexed_column = 47, RULE_table_constraint = 48, RULE_with_clause = 49, 
		RULE_qualified_table_name = 50, RULE_ordering_term = 51, RULE_pragma_value = 52, 
		RULE_common_table_expression = 53, RULE_result_column = 54, RULE_table_or_subquery = 55, 
		RULE_join_clause = 56, RULE_join_operator = 57, RULE_join_constraint = 58, 
		RULE_select_core = 59, RULE_compound_operator = 60, RULE_cte_table_name = 61, 
		RULE_signed_number = 62, RULE_literal_value = 63, RULE_unary_operator = 64, 
		RULE_error_message = 65, RULE_module_argument = 66, RULE_column_alias = 67, 
		RULE_keyword = 68, RULE_name = 69, RULE_function_name = 70, RULE_database_name = 71, 
		RULE_table_name = 72, RULE_table_or_index_name = 73, RULE_new_table_name = 74, 
		RULE_column_name = 75, RULE_collation_name = 76, RULE_foreign_table = 77, 
		RULE_index_name = 78, RULE_trigger_name = 79, RULE_view_name = 80, RULE_module_name = 81, 
		RULE_pragma_name = 82, RULE_savepoint_name = 83, RULE_table_alias = 84, 
		RULE_transaction_name = 85, RULE_any_name = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "show_databases_stmt", 
			"show_database_stmt", "create_database_stmt", "drop_database_stmt", "use_database_stmt", 
			"alter_table_stmt", "analyze_stmt", "attach_stmt", "begin_stmt", "commit_stmt", 
			"compound_select_stmt", "create_index_stmt", "create_table_stmt", "create_trigger_stmt", 
			"create_view_stmt", "create_virtual_table_stmt", "delete_stmt", "delete_stmt_limited", 
			"detach_stmt", "drop_index_stmt", "drop_table_stmt", "drop_trigger_stmt", 
			"drop_view_stmt", "factored_select_stmt", "insert_stmt", "pragma_stmt", 
			"reindex_stmt", "release_stmt", "rollback_stmt", "savepoint_stmt", "simple_select_stmt", 
			"select_stmt", "select_or_values", "update_stmt", "update_stmt_limited", 
			"vacuum_stmt", "column_def", "type_name", "column_constraint", "conflict_clause", 
			"expr", "foreign_key_clause", "raise_function", "indexed_column", "table_constraint", 
			"with_clause", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "compound_operator", 
			"cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "name", 
			"function_name", "database_name", "table_name", "table_or_index_name", 
			"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
			"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
			"table_alias", "transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
			"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
			"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
			"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
			"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
			"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
			"K_DATABASES", "K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", 
			"K_DESC", "K_DETACH", "K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", 
			"K_ESCAPE", "K_EXCEPT", "K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", 
			"K_FOR", "K_FOREIGN", "K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", 
			"K_IF", "K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
			"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", 
			"K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", 
			"K_NATURAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", 
			"K_ON", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", 
			"K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", 
			"K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", 
			"K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_SHOW", "K_TABLE", "K_TEMP", 
			"K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", 
			"K_UNIQUE", "K_UPDATE", "K_USE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", 
			"K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "IDENTIFIER", 
			"NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", 
			"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
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
	public String getGrammarFileName() { return "SQLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_DROP - 64)) | (1L << (K_END - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_ROLLBACK - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SHOW - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USE - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_WITH - 128)) | (1L << (UNEXPECTED_CHAR - 128)))) != 0)) {
				{
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
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
				case K_SHOW:
				case K_UPDATE:
				case K_USE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(174);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(175);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLiteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

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
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt_list(this);
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
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(186);
				match(SCOL);
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			sql_stmt();
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(193);
						match(SCOL);
						}
						}
						setState(196); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(198);
					sql_stmt();
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204);
					match(SCOL);
					}
					} 
				}
				setState(209);
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
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_database_stmtContext drop_database_stmt() {
			return getRuleContext(Drop_database_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Show_database_stmtContext show_database_stmt() {
			return getRuleContext(Show_database_stmtContext.class,0);
		}
		public Show_databases_stmtContext show_databases_stmt() {
			return getRuleContext(Show_databases_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Use_database_stmtContext use_database_stmt() {
			return getRuleContext(Use_database_stmtContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt(this);
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
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(210);
				match(K_EXPLAIN);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(211);
					match(K_QUERY);
					setState(212);
					match(K_PLAN);
					}
				}

				}
			}

			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(217);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(218);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(219);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(220);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(221);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(222);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(223);
				create_database_stmt();
				}
				break;
			case 8:
				{
				setState(224);
				create_index_stmt();
				}
				break;
			case 9:
				{
				setState(225);
				create_table_stmt();
				}
				break;
			case 10:
				{
				setState(226);
				create_trigger_stmt();
				}
				break;
			case 11:
				{
				setState(227);
				create_view_stmt();
				}
				break;
			case 12:
				{
				setState(228);
				create_virtual_table_stmt();
				}
				break;
			case 13:
				{
				setState(229);
				delete_stmt();
				}
				break;
			case 14:
				{
				setState(230);
				delete_stmt_limited();
				}
				break;
			case 15:
				{
				setState(231);
				detach_stmt();
				}
				break;
			case 16:
				{
				setState(232);
				drop_database_stmt();
				}
				break;
			case 17:
				{
				setState(233);
				drop_index_stmt();
				}
				break;
			case 18:
				{
				setState(234);
				drop_table_stmt();
				}
				break;
			case 19:
				{
				setState(235);
				drop_trigger_stmt();
				}
				break;
			case 20:
				{
				setState(236);
				drop_view_stmt();
				}
				break;
			case 21:
				{
				setState(237);
				factored_select_stmt();
				}
				break;
			case 22:
				{
				setState(238);
				insert_stmt();
				}
				break;
			case 23:
				{
				setState(239);
				pragma_stmt();
				}
				break;
			case 24:
				{
				setState(240);
				reindex_stmt();
				}
				break;
			case 25:
				{
				setState(241);
				release_stmt();
				}
				break;
			case 26:
				{
				setState(242);
				rollback_stmt();
				}
				break;
			case 27:
				{
				setState(243);
				savepoint_stmt();
				}
				break;
			case 28:
				{
				setState(244);
				simple_select_stmt();
				}
				break;
			case 29:
				{
				setState(245);
				select_stmt();
				}
				break;
			case 30:
				{
				setState(246);
				show_database_stmt();
				}
				break;
			case 31:
				{
				setState(247);
				show_databases_stmt();
				}
				break;
			case 32:
				{
				setState(248);
				update_stmt();
				}
				break;
			case 33:
				{
				setState(249);
				update_stmt_limited();
				}
				break;
			case 34:
				{
				setState(250);
				use_database_stmt();
				}
				break;
			case 35:
				{
				setState(251);
				vacuum_stmt();
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

	public static class Show_databases_stmtContext extends ParserRuleContext {
		public TerminalNode K_SHOW() { return getToken(SQLiteParser.K_SHOW, 0); }
		public TerminalNode K_DATABASES() { return getToken(SQLiteParser.K_DATABASES, 0); }
		public Show_databases_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_databases_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterShow_databases_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitShow_databases_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitShow_databases_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_databases_stmtContext show_databases_stmt() throws RecognitionException {
		Show_databases_stmtContext _localctx = new Show_databases_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_show_databases_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(K_SHOW);
			setState(255);
			match(K_DATABASES);
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

	public static class Show_database_stmtContext extends ParserRuleContext {
		public TerminalNode K_SHOW() { return getToken(SQLiteParser.K_SHOW, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Show_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterShow_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitShow_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitShow_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_database_stmtContext show_database_stmt() throws RecognitionException {
		Show_database_stmtContext _localctx = new Show_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_show_database_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(K_SHOW);
			setState(258);
			match(K_DATABASE);
			setState(259);
			database_name();
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
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_database_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(K_CREATE);
			setState(262);
			match(K_DATABASE);
			setState(263);
			database_name();
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

	public static class Drop_database_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Drop_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_database_stmtContext drop_database_stmt() throws RecognitionException {
		Drop_database_stmtContext _localctx = new Drop_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_drop_database_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(K_DROP);
			setState(266);
			match(K_DATABASE);
			setState(267);
			database_name();
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

	public static class Use_database_stmtContext extends ParserRuleContext {
		public TerminalNode K_USE() { return getToken(SQLiteParser.K_USE, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Use_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUse_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUse_database_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUse_database_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_database_stmtContext use_database_stmt() throws RecognitionException {
		Use_database_stmtContext _localctx = new Use_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_use_database_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(K_USE);
			setState(270);
			match(K_DATABASE);
			setState(271);
			database_name();
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
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(K_ALTER);
			setState(274);
			match(K_TABLE);
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(275);
				database_name();
				setState(276);
				match(DOT);
				}
				break;
			}
			setState(280);
			table_name();
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(281);
				match(K_RENAME);
				setState(282);
				match(K_TO);
				setState(283);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(284);
				match(K_ADD);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(285);
					match(K_COLUMN);
					}
					break;
				}
				setState(288);
				column_def();
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
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(K_ANALYZE);
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(292);
				database_name();
				}
				break;
			case 2:
				{
				setState(293);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(294);
				database_name();
				setState(295);
				match(DOT);
				setState(296);
				table_or_index_name();
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
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(K_ATTACH);
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(301);
				match(K_DATABASE);
				}
				break;
			}
			setState(304);
			expr(0);
			setState(305);
			match(K_AS);
			setState(306);
			database_name();
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
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(K_BEGIN);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (K_DEFERRED - 59)) | (1L << (K_EXCLUSIVE - 59)) | (1L << (K_IMMEDIATE - 59)))) != 0)) {
				{
				setState(309);
				_la = _input.LA(1);
				if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (K_DEFERRED - 59)) | (1L << (K_EXCLUSIVE - 59)) | (1L << (K_IMMEDIATE - 59)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(312);
				match(K_TRANSACTION);
				setState(314);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(313);
					transaction_name();
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
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(319);
				match(K_TRANSACTION);
				setState(321);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(320);
					transaction_name();
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
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SQLiteParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SQLiteParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SQLiteParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SQLiteParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SQLiteParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SQLiteParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SQLiteParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SQLiteParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(325);
				match(K_WITH);
				setState(327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(326);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(329);
				common_table_expression();
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(330);
					match(COMMA);
					setState(331);
					common_table_expression();
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(339);
			select_core();
			setState(349); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(346);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(340);
					match(K_UNION);
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(341);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(344);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(345);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(348);
				select_core();
				}
				}
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(353);
				match(K_ORDER);
				setState(354);
				match(K_BY);
				setState(355);
				ordering_term();
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(356);
					match(COMMA);
					setState(357);
					ordering_term();
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(365);
				match(K_LIMIT);
				setState(366);
				expr(0);
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(367);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(368);
					expr(0);
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

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(K_CREATE);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(374);
				match(K_UNIQUE);
				}
			}

			setState(377);
			match(K_INDEX);
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(378);
				match(K_IF);
				setState(379);
				match(K_NOT);
				setState(380);
				match(K_EXISTS);
				}
				break;
			}
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(383);
				database_name();
				setState(384);
				match(DOT);
				}
				break;
			}
			setState(388);
			index_name();
			setState(389);
			match(K_ON);
			setState(390);
			table_name();
			setState(391);
			match(OPEN_PAR);
			setState(392);
			indexed_column();
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(393);
				match(COMMA);
				setState(394);
				indexed_column();
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			match(CLOSE_PAR);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(401);
				match(K_WHERE);
				setState(402);
				expr(0);
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
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(K_CREATE);
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(409);
			match(K_TABLE);
			setState(413);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(410);
				match(K_IF);
				setState(411);
				match(K_NOT);
				setState(412);
				match(K_EXISTS);
				}
				break;
			}
			setState(418);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(415);
				database_name();
				setState(416);
				match(DOT);
				}
				break;
			}
			setState(420);
			table_name();
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(421);
				match(OPEN_PAR);
				setState(422);
				column_def();
				setState(427);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(423);
						match(COMMA);
						setState(424);
						column_def();
						}
						} 
					}
					setState(429);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(430);
					match(COMMA);
					setState(431);
					table_constraint();
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(437);
				match(CLOSE_PAR);
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(438);
					match(K_WITHOUT);
					setState(439);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(442);
				match(K_AS);
				setState(443);
				select_stmt();
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
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SQLiteParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SQLiteParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(K_CREATE);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(447);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(450);
			match(K_TRIGGER);
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(451);
				match(K_IF);
				setState(452);
				match(K_NOT);
				setState(453);
				match(K_EXISTS);
				}
				break;
			}
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(456);
				database_name();
				setState(457);
				match(DOT);
				}
				break;
			}
			setState(461);
			trigger_name();
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(462);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(463);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(464);
				match(K_INSTEAD);
				setState(465);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(482);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(468);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(469);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(470);
				match(K_UPDATE);
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(471);
					match(K_OF);
					setState(472);
					column_name();
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(473);
						match(COMMA);
						setState(474);
						column_name();
						}
						}
						setState(479);
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
			setState(484);
			match(K_ON);
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(485);
				database_name();
				setState(486);
				match(DOT);
				}
				break;
			}
			setState(490);
			table_name();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(491);
				match(K_FOR);
				setState(492);
				match(K_EACH);
				setState(493);
				match(K_ROW);
				}
			}

			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(496);
				match(K_WHEN);
				setState(497);
				expr(0);
				}
			}

			setState(500);
			match(K_BEGIN);
			setState(509); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(505);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(501);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(502);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(503);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(504);
					select_stmt();
					}
					break;
				}
				setState(507);
				match(SCOL);
				}
				}
				setState(511); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSERT - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_WITH - 89)))) != 0) );
			setState(513);
			match(K_END);
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
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(K_CREATE);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(516);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(519);
			match(K_VIEW);
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(520);
				match(K_IF);
				setState(521);
				match(K_NOT);
				setState(522);
				match(K_EXISTS);
				}
				break;
			}
			setState(528);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(525);
				database_name();
				setState(526);
				match(DOT);
				}
				break;
			}
			setState(530);
			view_name();
			setState(531);
			match(K_AS);
			setState(532);
			select_stmt();
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
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(K_CREATE);
			setState(535);
			match(K_VIRTUAL);
			setState(536);
			match(K_TABLE);
			setState(540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(537);
				match(K_IF);
				setState(538);
				match(K_NOT);
				setState(539);
				match(K_EXISTS);
				}
				break;
			}
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(542);
				database_name();
				setState(543);
				match(DOT);
				}
				break;
			}
			setState(547);
			table_name();
			setState(548);
			match(K_USING);
			setState(549);
			module_name();
			setState(561);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(550);
				match(OPEN_PAR);
				setState(551);
				module_argument();
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(552);
					match(COMMA);
					setState(553);
					module_argument();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(559);
				match(CLOSE_PAR);
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
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(563);
				with_clause();
				}
			}

			setState(566);
			match(K_DELETE);
			setState(567);
			match(K_FROM);
			setState(568);
			qualified_table_name();
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(569);
				match(K_WHERE);
				setState(570);
				expr(0);
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
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(573);
				with_clause();
				}
			}

			setState(576);
			match(K_DELETE);
			setState(577);
			match(K_FROM);
			setState(578);
			qualified_table_name();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(579);
				match(K_WHERE);
				setState(580);
				expr(0);
				}
			}

			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(583);
					match(K_ORDER);
					setState(584);
					match(K_BY);
					setState(585);
					ordering_term();
					setState(590);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(586);
						match(COMMA);
						setState(587);
						ordering_term();
						}
						}
						setState(592);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(595);
				match(K_LIMIT);
				setState(596);
				expr(0);
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(597);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(598);
					expr(0);
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
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			match(K_DETACH);
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(604);
				match(K_DATABASE);
				}
				break;
			}
			setState(607);
			database_name();
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
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(K_DROP);
			setState(610);
			match(K_INDEX);
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(611);
				match(K_IF);
				setState(612);
				match(K_EXISTS);
				}
				break;
			}
			setState(618);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(615);
				database_name();
				setState(616);
				match(DOT);
				}
				break;
			}
			setState(620);
			index_name();
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
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(K_DROP);
			setState(623);
			match(K_TABLE);
			setState(626);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(624);
				match(K_IF);
				setState(625);
				match(K_EXISTS);
				}
				break;
			}
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(628);
				database_name();
				setState(629);
				match(DOT);
				}
				break;
			}
			setState(633);
			table_name();
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
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(K_DROP);
			setState(636);
			match(K_TRIGGER);
			setState(639);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(637);
				match(K_IF);
				setState(638);
				match(K_EXISTS);
				}
				break;
			}
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(641);
				database_name();
				setState(642);
				match(DOT);
				}
				break;
			}
			setState(646);
			trigger_name();
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
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(K_DROP);
			setState(649);
			match(K_VIEW);
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(650);
				match(K_IF);
				setState(651);
				match(K_EXISTS);
				}
				break;
			}
			setState(657);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(654);
				database_name();
				setState(655);
				match(DOT);
				}
				break;
			}
			setState(659);
			view_name();
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
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(661);
				match(K_WITH);
				setState(663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(662);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(665);
				common_table_expression();
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(666);
					match(COMMA);
					setState(667);
					common_table_expression();
					}
					}
					setState(672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(675);
			select_core();
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(676);
				compound_operator();
				setState(677);
				select_core();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(684);
				match(K_ORDER);
				setState(685);
				match(K_BY);
				setState(686);
				ordering_term();
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(687);
					match(COMMA);
					setState(688);
					ordering_term();
					}
					}
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(696);
				match(K_LIMIT);
				setState(697);
				expr(0);
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(698);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(699);
					expr(0);
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
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(704);
				with_clause();
				}
			}

			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(707);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(708);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(709);
				match(K_INSERT);
				setState(710);
				match(K_OR);
				setState(711);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(712);
				match(K_INSERT);
				setState(713);
				match(K_OR);
				setState(714);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(715);
				match(K_INSERT);
				setState(716);
				match(K_OR);
				setState(717);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(718);
				match(K_INSERT);
				setState(719);
				match(K_OR);
				setState(720);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(721);
				match(K_INSERT);
				setState(722);
				match(K_OR);
				setState(723);
				match(K_IGNORE);
				}
				break;
			}
			setState(726);
			match(K_INTO);
			setState(730);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(727);
				database_name();
				setState(728);
				match(DOT);
				}
				break;
			}
			setState(732);
			table_name();
			setState(744);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(733);
				match(OPEN_PAR);
				setState(734);
				column_name();
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(735);
					match(COMMA);
					setState(736);
					column_name();
					}
					}
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(742);
				match(CLOSE_PAR);
				}
			}

			setState(777);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(746);
				match(K_VALUES);
				setState(747);
				match(OPEN_PAR);
				setState(748);
				expr(0);
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(749);
					match(COMMA);
					setState(750);
					expr(0);
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(756);
				match(CLOSE_PAR);
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(757);
					match(COMMA);
					setState(758);
					match(OPEN_PAR);
					setState(759);
					expr(0);
					setState(764);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(760);
						match(COMMA);
						setState(761);
						expr(0);
						}
						}
						setState(766);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(767);
					match(CLOSE_PAR);
					}
					}
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(774);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(775);
				match(K_DEFAULT);
				setState(776);
				match(K_VALUES);
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
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			match(K_PRAGMA);
			setState(783);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(780);
				database_name();
				setState(781);
				match(DOT);
				}
				break;
			}
			setState(785);
			pragma_name();
			setState(792);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(786);
				match(ASSIGN);
				setState(787);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(788);
				match(OPEN_PAR);
				setState(789);
				pragma_value();
				setState(790);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
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
			case K_SHOW:
			case K_UPDATE:
			case K_USE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
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

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(K_REINDEX);
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(795);
				collation_name();
				}
				break;
			case 2:
				{
				setState(799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(796);
					database_name();
					setState(797);
					match(DOT);
					}
					break;
				}
				setState(803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(801);
					table_name();
					}
					break;
				case 2:
					{
					setState(802);
					index_name();
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
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(K_RELEASE);
			setState(809);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(808);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(811);
			savepoint_name();
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
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(K_ROLLBACK);
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(814);
				match(K_TRANSACTION);
				setState(816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(815);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(820);
				match(K_TO);
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(821);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(824);
				savepoint_name();
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
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(K_SAVEPOINT);
			setState(828);
			savepoint_name();
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
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(830);
				match(K_WITH);
				setState(832);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(831);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(834);
				common_table_expression();
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(835);
					match(COMMA);
					setState(836);
					common_table_expression();
					}
					}
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(844);
			select_core();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(845);
				match(K_ORDER);
				setState(846);
				match(K_BY);
				setState(847);
				ordering_term();
				setState(852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(848);
					match(COMMA);
					setState(849);
					ordering_term();
					}
					}
					setState(854);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(857);
				match(K_LIMIT);
				setState(858);
				expr(0);
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(859);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(860);
					expr(0);
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
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(865);
				match(K_WITH);
				setState(867);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(866);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(869);
				common_table_expression();
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(870);
					match(COMMA);
					setState(871);
					common_table_expression();
					}
					}
					setState(876);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(879);
			select_or_values();
			setState(885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(880);
				compound_operator();
				setState(881);
				select_or_values();
				}
				}
				setState(887);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(888);
				match(K_ORDER);
				setState(889);
				match(K_BY);
				setState(890);
				ordering_term();
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(891);
					match(COMMA);
					setState(892);
					ordering_term();
					}
					}
					setState(897);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(906);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(900);
				match(K_LIMIT);
				setState(901);
				expr(0);
				setState(904);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(902);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(903);
					expr(0);
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
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_select_or_values);
		int _la;
		try {
			setState(982);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(908);
				match(K_SELECT);
				setState(910);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(909);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(912);
				result_column();
				setState(917);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(913);
					match(COMMA);
					setState(914);
					result_column();
					}
					}
					setState(919);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(920);
					match(K_FROM);
					setState(930);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(921);
						table_or_subquery();
						setState(926);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(922);
							match(COMMA);
							setState(923);
							table_or_subquery();
							}
							}
							setState(928);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(929);
						join_clause();
						}
						break;
					}
					}
				}

				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(934);
					match(K_WHERE);
					setState(935);
					expr(0);
					}
				}

				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(938);
					match(K_GROUP);
					setState(939);
					match(K_BY);
					setState(940);
					expr(0);
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(941);
						match(COMMA);
						setState(942);
						expr(0);
						}
						}
						setState(947);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(950);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(948);
						match(K_HAVING);
						setState(949);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				match(K_VALUES);
				setState(955);
				match(OPEN_PAR);
				setState(956);
				expr(0);
				setState(961);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(957);
					match(COMMA);
					setState(958);
					expr(0);
					}
					}
					setState(963);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(964);
				match(CLOSE_PAR);
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(965);
					match(COMMA);
					setState(966);
					match(OPEN_PAR);
					setState(967);
					expr(0);
					setState(972);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(968);
						match(COMMA);
						setState(969);
						expr(0);
						}
						}
						setState(974);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(975);
					match(CLOSE_PAR);
					}
					}
					setState(981);
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
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(984);
				with_clause();
				}
			}

			setState(987);
			match(K_UPDATE);
			setState(998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(988);
				match(K_OR);
				setState(989);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(990);
				match(K_OR);
				setState(991);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(992);
				match(K_OR);
				setState(993);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(994);
				match(K_OR);
				setState(995);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(996);
				match(K_OR);
				setState(997);
				match(K_IGNORE);
				}
				break;
			}
			setState(1000);
			qualified_table_name();
			setState(1001);
			match(K_SET);
			setState(1002);
			column_name();
			setState(1003);
			match(ASSIGN);
			setState(1004);
			expr(0);
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1005);
				match(COMMA);
				setState(1006);
				column_name();
				setState(1007);
				match(ASSIGN);
				setState(1008);
				expr(0);
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1017);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1015);
				match(K_WHERE);
				setState(1016);
				expr(0);
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
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1019);
				with_clause();
				}
			}

			setState(1022);
			match(K_UPDATE);
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1023);
				match(K_OR);
				setState(1024);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1025);
				match(K_OR);
				setState(1026);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1027);
				match(K_OR);
				setState(1028);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1029);
				match(K_OR);
				setState(1030);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1031);
				match(K_OR);
				setState(1032);
				match(K_IGNORE);
				}
				break;
			}
			setState(1035);
			qualified_table_name();
			setState(1036);
			match(K_SET);
			setState(1037);
			column_name();
			setState(1038);
			match(ASSIGN);
			setState(1039);
			expr(0);
			setState(1047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1040);
				match(COMMA);
				setState(1041);
				column_name();
				setState(1042);
				match(ASSIGN);
				setState(1043);
				expr(0);
				}
				}
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1050);
				match(K_WHERE);
				setState(1051);
				expr(0);
				}
			}

			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1054);
					match(K_ORDER);
					setState(1055);
					match(K_BY);
					setState(1056);
					ordering_term();
					setState(1061);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1057);
						match(COMMA);
						setState(1058);
						ordering_term();
						}
						}
						setState(1063);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1066);
				match(K_LIMIT);
				setState(1067);
				expr(0);
				setState(1070);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1068);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1069);
					expr(0);
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
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1074);
			match(K_VACUUM);
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
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			column_name();
			setState(1078);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1077);
				type_name();
				}
				break;
			}
			setState(1083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (K_NOT - 103)) | (1L << (K_NULL - 103)) | (1L << (K_PRIMARY - 103)) | (1L << (K_REFERENCES - 103)) | (1L << (K_UNIQUE - 103)))) != 0)) {
				{
				{
				setState(1080);
				column_constraint();
				}
				}
				setState(1085);
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
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1087); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1086);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1089); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1091);
				match(OPEN_PAR);
				setState(1092);
				signed_number();
				setState(1093);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1095);
				match(OPEN_PAR);
				setState(1096);
				signed_number();
				setState(1097);
				match(COMMA);
				setState(1098);
				signed_number();
				setState(1099);
				match(CLOSE_PAR);
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
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1103);
				match(K_CONSTRAINT);
				setState(1104);
				name();
				}
			}

			setState(1140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1107);
				match(K_PRIMARY);
				setState(1108);
				match(K_KEY);
				setState(1110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1109);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1112);
				conflict_clause();
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1113);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1116);
					match(K_NOT);
					}
				}

				setState(1119);
				match(K_NULL);
				setState(1120);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1121);
				match(K_UNIQUE);
				setState(1122);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1123);
				match(K_CHECK);
				setState(1124);
				match(OPEN_PAR);
				setState(1125);
				expr(0);
				setState(1126);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1128);
				match(K_DEFAULT);
				setState(1135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1129);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1130);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1131);
					match(OPEN_PAR);
					setState(1132);
					expr(0);
					setState(1133);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1137);
				match(K_COLLATE);
				setState(1138);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1139);
				foreign_key_clause();
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
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1142);
				match(K_ON);
				setState(1143);
				match(K_CONFLICT);
				setState(1144);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & ((1L << (K_FAIL - 73)) | (1L << (K_IGNORE - 73)) | (1L << (K_REPLACE - 73)) | (1L << (K_ROLLBACK - 73)))) != 0)) ) {
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLiteParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLiteParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SQLiteParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLiteParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLiteParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLiteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLiteParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLiteParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLiteParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLiteParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLiteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLiteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLiteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLiteParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLiteParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLiteParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLiteParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1148);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1149);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1158);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1150);
						database_name();
						setState(1151);
						match(DOT);
						}
						break;
					}
					setState(1155);
					table_name();
					setState(1156);
					match(DOT);
					}
					break;
				}
				setState(1160);
				column_name();
				}
				break;
			case 4:
				{
				setState(1161);
				unary_operator();
				setState(1162);
				expr(21);
				}
				break;
			case 5:
				{
				setState(1164);
				function_name();
				setState(1165);
				match(OPEN_PAR);
				setState(1178);
				_errHandler.sync(this);
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
				case K_DATABASES:
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
				case K_SHOW:
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
				case K_USE:
				case K_USING:
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
					setState(1167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1166);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1169);
					expr(0);
					setState(1174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1170);
						match(COMMA);
						setState(1171);
						expr(0);
						}
						}
						setState(1176);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1177);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1180);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1182);
				match(OPEN_PAR);
				setState(1183);
				expr(0);
				setState(1184);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1186);
				match(K_CAST);
				setState(1187);
				match(OPEN_PAR);
				setState(1188);
				expr(0);
				setState(1189);
				match(K_AS);
				setState(1190);
				type_name();
				setState(1191);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1194);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1193);
						match(K_NOT);
						}
					}

					setState(1196);
					match(K_EXISTS);
					}
				}

				setState(1199);
				match(OPEN_PAR);
				setState(1200);
				select_stmt();
				setState(1201);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1203);
				match(K_CASE);
				setState(1205);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1204);
					expr(0);
					}
					break;
				}
				setState(1212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1207);
					match(K_WHEN);
					setState(1208);
					expr(0);
					setState(1209);
					match(K_THEN);
					setState(1210);
					expr(0);
					}
					}
					setState(1214); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1216);
					match(K_ELSE);
					setState(1217);
					expr(0);
					}
				}

				setState(1220);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1222);
				raise_function();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1325);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1323);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1225);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1226);
						match(PIPE2);
						setState(1227);
						expr(21);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1228);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1229);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1230);
						expr(20);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1231);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1232);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1233);
						expr(19);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1234);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1235);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1236);
						expr(18);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1237);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1238);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1239);
						expr(17);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1240);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1253);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
						case 1:
							{
							setState(1241);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1242);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1243);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1244);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1245);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1246);
							match(K_IS);
							setState(1247);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1248);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1249);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1250);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1251);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1252);
							match(K_REGEXP);
							}
							break;
						}
						setState(1255);
						expr(16);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1256);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1257);
						match(K_AND);
						setState(1258);
						expr(15);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1259);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1260);
						match(K_OR);
						setState(1261);
						expr(14);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1262);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1263);
						match(K_IS);
						setState(1265);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
						case 1:
							{
							setState(1264);
							match(K_NOT);
							}
							break;
						}
						setState(1267);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1268);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1270);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1269);
							match(K_NOT);
							}
						}

						setState(1272);
						match(K_BETWEEN);
						setState(1273);
						expr(0);
						setState(1274);
						match(K_AND);
						setState(1275);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1277);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1278);
						match(K_COLLATE);
						setState(1279);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1280);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1282);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1281);
							match(K_NOT);
							}
						}

						setState(1284);
						_la = _input.LA(1);
						if ( !(((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & ((1L << (K_GLOB - 78)) | (1L << (K_LIKE - 78)) | (1L << (K_MATCH - 78)) | (1L << (K_REGEXP - 78)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1285);
						expr(0);
						setState(1288);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1286);
							match(K_ESCAPE);
							setState(1287);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1290);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1295);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1291);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1292);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1293);
							match(K_NOT);
							setState(1294);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1297);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1299);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1298);
							match(K_NOT);
							}
						}

						setState(1301);
						match(K_IN);
						setState(1321);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
						case 1:
							{
							setState(1302);
							match(OPEN_PAR);
							setState(1312);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
							case 1:
								{
								setState(1303);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1304);
								expr(0);
								setState(1309);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1305);
									match(COMMA);
									setState(1306);
									expr(0);
									}
									}
									setState(1311);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1314);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1318);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
							case 1:
								{
								setState(1315);
								database_name();
								setState(1316);
								match(DOT);
								}
								break;
							}
							setState(1320);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1327);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
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
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLiteParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLiteParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLiteParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLiteParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLiteParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLiteParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLiteParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLiteParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLiteParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLiteParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLiteParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLiteParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLiteParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLiteParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLiteParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLiteParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLiteParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLiteParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLiteParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLiteParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLiteParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLiteParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1328);
			match(K_REFERENCES);
			setState(1329);
			foreign_table();
			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1330);
				match(OPEN_PAR);
				setState(1331);
				column_name();
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1332);
					match(COMMA);
					setState(1333);
					column_name();
					}
					}
					setState(1338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1339);
				match(CLOSE_PAR);
				}
			}

			setState(1361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1357);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1343);
					match(K_ON);
					setState(1344);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1353);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						setState(1345);
						match(K_SET);
						setState(1346);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1347);
						match(K_SET);
						setState(1348);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1349);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1350);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1351);
						match(K_NO);
						setState(1352);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1355);
					match(K_MATCH);
					setState(1356);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1365);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1364);
					match(K_NOT);
					}
				}

				setState(1367);
				match(K_DEFERRABLE);
				setState(1372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1368);
					match(K_INITIALLY);
					setState(1369);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1370);
					match(K_INITIALLY);
					setState(1371);
					match(K_IMMEDIATE);
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
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			match(K_RAISE);
			setState(1377);
			match(OPEN_PAR);
			setState(1382);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1378);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1379);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1380);
				match(COMMA);
				setState(1381);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1384);
			match(CLOSE_PAR);
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
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
			column_name();
			setState(1389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1387);
				match(K_COLLATE);
				setState(1388);
				collation_name();
				}
			}

			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1391);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
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

	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1394);
				match(K_CONSTRAINT);
				setState(1395);
				name();
				}
			}

			setState(1434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1401);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1398);
					match(K_PRIMARY);
					setState(1399);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1400);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1403);
				match(OPEN_PAR);
				setState(1404);
				indexed_column();
				setState(1409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1405);
					match(COMMA);
					setState(1406);
					indexed_column();
					}
					}
					setState(1411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1412);
				match(CLOSE_PAR);
				setState(1413);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1415);
				match(K_CHECK);
				setState(1416);
				match(OPEN_PAR);
				setState(1417);
				expr(0);
				setState(1418);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1420);
				match(K_FOREIGN);
				setState(1421);
				match(K_KEY);
				setState(1422);
				match(OPEN_PAR);
				setState(1423);
				column_name();
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1424);
					match(COMMA);
					setState(1425);
					column_name();
					}
					}
					setState(1430);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1431);
				match(CLOSE_PAR);
				setState(1432);
				foreign_key_clause();
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

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SQLiteParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SQLiteParser.K_AS, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1436);
			match(K_WITH);
			setState(1438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1437);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1440);
			cte_table_name();
			setState(1441);
			match(K_AS);
			setState(1442);
			match(OPEN_PAR);
			setState(1443);
			select_stmt();
			setState(1444);
			match(CLOSE_PAR);
			setState(1454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1445);
				match(COMMA);
				setState(1446);
				cte_table_name();
				setState(1447);
				match(K_AS);
				setState(1448);
				match(OPEN_PAR);
				setState(1449);
				select_stmt();
				setState(1450);
				match(CLOSE_PAR);
				}
				}
				setState(1456);
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1460);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1457);
				database_name();
				setState(1458);
				match(DOT);
				}
				break;
			}
			setState(1462);
			table_name();
			setState(1468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1463);
				match(K_INDEXED);
				setState(1464);
				match(K_BY);
				setState(1465);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1466);
				match(K_NOT);
				setState(1467);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
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
			case K_SHOW:
			case K_UPDATE:
			case K_USE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
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

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			expr(0);
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1471);
				match(K_COLLATE);
				setState(1472);
				collation_name();
				}
			}

			setState(1476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1475);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
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

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_pragma_value);
		try {
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1478);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1479);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1480);
				match(STRING_LITERAL);
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			table_name();
			setState(1495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1484);
				match(OPEN_PAR);
				setState(1485);
				column_name();
				setState(1490);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1486);
					match(COMMA);
					setState(1487);
					column_name();
					}
					}
					setState(1492);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1493);
				match(CLOSE_PAR);
				}
			}

			setState(1497);
			match(K_AS);
			setState(1498);
			match(OPEN_PAR);
			setState(1499);
			select_stmt();
			setState(1500);
			match(CLOSE_PAR);
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
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_result_column);
		int _la;
		try {
			setState(1514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1502);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1503);
				table_name();
				setState(1504);
				match(DOT);
				setState(1505);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1507);
				expr(0);
				setState(1512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1509);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1508);
						match(K_AS);
						}
					}

					setState(1511);
					column_alias();
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_table_or_subquery);
		int _la;
		try {
			setState(1563);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1519);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
				case 1:
					{
					setState(1516);
					database_name();
					setState(1517);
					match(DOT);
					}
					break;
				}
				setState(1521);
				table_name();
				setState(1526);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1523);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
					case 1:
						{
						setState(1522);
						match(K_AS);
						}
						break;
					}
					setState(1525);
					table_alias();
					}
					break;
				}
				setState(1533);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1528);
					match(K_INDEXED);
					setState(1529);
					match(K_BY);
					setState(1530);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1531);
					match(K_NOT);
					setState(1532);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
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
				case K_SHOW:
				case K_UNION:
				case K_UPDATE:
				case K_USE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1535);
				match(OPEN_PAR);
				setState(1545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1536);
					table_or_subquery();
					setState(1541);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1537);
						match(COMMA);
						setState(1538);
						table_or_subquery();
						}
						}
						setState(1543);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1544);
					join_clause();
					}
					break;
				}
				setState(1547);
				match(CLOSE_PAR);
				setState(1552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1549);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
					case 1:
						{
						setState(1548);
						match(K_AS);
						}
						break;
					}
					setState(1551);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1554);
				match(OPEN_PAR);
				setState(1555);
				select_stmt();
				setState(1556);
				match(CLOSE_PAR);
				setState(1561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1558);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
					case 1:
						{
						setState(1557);
						match(K_AS);
						}
						break;
					}
					setState(1560);
					table_alias();
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
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1565);
			table_or_subquery();
			setState(1572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INNER - 88)) | (1L << (K_JOIN - 88)) | (1L << (K_LEFT - 88)) | (1L << (K_NATURAL - 88)))) != 0)) {
				{
				{
				setState(1566);
				join_operator();
				setState(1567);
				table_or_subquery();
				setState(1568);
				join_constraint();
				}
				}
				setState(1574);
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
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_join_operator);
		int _la;
		try {
			setState(1588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1575);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1576);
					match(K_NATURAL);
					}
				}

				setState(1585);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1579);
					match(K_LEFT);
					setState(1581);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1580);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1583);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1584);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1587);
				match(K_JOIN);
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
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1604);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1590);
				match(K_ON);
				setState(1591);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1592);
				match(K_USING);
				setState(1593);
				match(OPEN_PAR);
				setState(1594);
				column_name();
				setState(1599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1595);
					match(COMMA);
					setState(1596);
					column_name();
					}
					}
					setState(1601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1602);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
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
			case K_SHOW:
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

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_select_core);
		int _la;
		try {
			setState(1680);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1606);
				match(K_SELECT);
				setState(1608);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
				case 1:
					{
					setState(1607);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1610);
				result_column();
				setState(1615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1611);
					match(COMMA);
					setState(1612);
					result_column();
					}
					}
					setState(1617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1618);
					match(K_FROM);
					setState(1628);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
					case 1:
						{
						setState(1619);
						table_or_subquery();
						setState(1624);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1620);
							match(COMMA);
							setState(1621);
							table_or_subquery();
							}
							}
							setState(1626);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1627);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1632);
					match(K_WHERE);
					setState(1633);
					expr(0);
					}
				}

				setState(1650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1636);
					match(K_GROUP);
					setState(1637);
					match(K_BY);
					setState(1638);
					expr(0);
					setState(1643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1639);
						match(COMMA);
						setState(1640);
						expr(0);
						}
						}
						setState(1645);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1648);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1646);
						match(K_HAVING);
						setState(1647);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1652);
				match(K_VALUES);
				setState(1653);
				match(OPEN_PAR);
				setState(1654);
				expr(0);
				setState(1659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1655);
					match(COMMA);
					setState(1656);
					expr(0);
					}
					}
					setState(1661);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1662);
				match(CLOSE_PAR);
				setState(1677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1663);
					match(COMMA);
					setState(1664);
					match(OPEN_PAR);
					setState(1665);
					expr(0);
					setState(1670);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1666);
						match(COMMA);
						setState(1667);
						expr(0);
						}
						}
						setState(1672);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1673);
					match(CLOSE_PAR);
					}
					}
					setState(1679);
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
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_compound_operator);
		try {
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1682);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1683);
				match(K_UNION);
				setState(1684);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1685);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1686);
				match(K_EXCEPT);
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
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1689);
			table_name();
			setState(1701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1690);
				match(OPEN_PAR);
				setState(1691);
				column_name();
				setState(1696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1692);
					match(COMMA);
					setState(1693);
					column_name();
					}
					}
					setState(1698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1699);
				match(CLOSE_PAR);
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1703);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1706);
			match(NUMERIC_LITERAL);
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
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (K_NULL - 105)) | (1L << (NUMERIC_LITERAL - 105)) | (1L << (STRING_LITERAL - 105)) | (1L << (BLOB_LITERAL - 105)))) != 0)) ) {
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLiteParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1710);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
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

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			match(STRING_LITERAL);
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_module_argument);
		try {
			setState(1716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1714);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1715);
				column_def();
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
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1718);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLiteParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLiteParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public TerminalNode K_DATABASES() { return getToken(SQLiteParser.K_DATABASES, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLiteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLiteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLiteParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLiteParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode K_SHOW() { return getToken(SQLiteParser.K_SHOW, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLiteParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_USE() { return getToken(SQLiteParser.K_USE, 0); }
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1720);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_ACTION - 25)) | (1L << (K_ADD - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_ALL - 25)) | (1L << (K_ALTER - 25)) | (1L << (K_ANALYZE - 25)) | (1L << (K_AND - 25)) | (1L << (K_AS - 25)) | (1L << (K_ASC - 25)) | (1L << (K_ATTACH - 25)) | (1L << (K_AUTOINCREMENT - 25)) | (1L << (K_BEFORE - 25)) | (1L << (K_BEGIN - 25)) | (1L << (K_BETWEEN - 25)) | (1L << (K_BY - 25)) | (1L << (K_CASCADE - 25)) | (1L << (K_CASE - 25)) | (1L << (K_CAST - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_COLUMN - 25)) | (1L << (K_COMMIT - 25)) | (1L << (K_CONFLICT - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_CURRENT_DATE - 25)) | (1L << (K_CURRENT_TIME - 25)) | (1L << (K_CURRENT_TIMESTAMP - 25)) | (1L << (K_DATABASE - 25)) | (1L << (K_DATABASES - 25)) | (1L << (K_DEFAULT - 25)) | (1L << (K_DEFERRABLE - 25)) | (1L << (K_DEFERRED - 25)) | (1L << (K_DELETE - 25)) | (1L << (K_DESC - 25)) | (1L << (K_DETACH - 25)) | (1L << (K_DISTINCT - 25)) | (1L << (K_DROP - 25)) | (1L << (K_EACH - 25)) | (1L << (K_ELSE - 25)) | (1L << (K_END - 25)) | (1L << (K_ESCAPE - 25)) | (1L << (K_EXCEPT - 25)) | (1L << (K_EXCLUSIVE - 25)) | (1L << (K_EXISTS - 25)) | (1L << (K_EXPLAIN - 25)) | (1L << (K_FAIL - 25)) | (1L << (K_FOR - 25)) | (1L << (K_FOREIGN - 25)) | (1L << (K_FROM - 25)) | (1L << (K_FULL - 25)) | (1L << (K_GLOB - 25)) | (1L << (K_GROUP - 25)) | (1L << (K_HAVING - 25)) | (1L << (K_IF - 25)) | (1L << (K_IGNORE - 25)) | (1L << (K_IMMEDIATE - 25)) | (1L << (K_IN - 25)) | (1L << (K_INDEX - 25)) | (1L << (K_INDEXED - 25)) | (1L << (K_INITIALLY - 25)) | (1L << (K_INNER - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSERT - 89)) | (1L << (K_INSTEAD - 89)) | (1L << (K_INTERSECT - 89)) | (1L << (K_INTO - 89)) | (1L << (K_IS - 89)) | (1L << (K_ISNULL - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_KEY - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_LIKE - 89)) | (1L << (K_LIMIT - 89)) | (1L << (K_MATCH - 89)) | (1L << (K_NATURAL - 89)) | (1L << (K_NO - 89)) | (1L << (K_NOT - 89)) | (1L << (K_NOTNULL - 89)) | (1L << (K_NULL - 89)) | (1L << (K_OF - 89)) | (1L << (K_OFFSET - 89)) | (1L << (K_ON - 89)) | (1L << (K_OR - 89)) | (1L << (K_ORDER - 89)) | (1L << (K_OUTER - 89)) | (1L << (K_PLAN - 89)) | (1L << (K_PRAGMA - 89)) | (1L << (K_PRIMARY - 89)) | (1L << (K_QUERY - 89)) | (1L << (K_RAISE - 89)) | (1L << (K_RECURSIVE - 89)) | (1L << (K_REFERENCES - 89)) | (1L << (K_REGEXP - 89)) | (1L << (K_REINDEX - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_RESTRICT - 89)) | (1L << (K_RIGHT - 89)) | (1L << (K_ROLLBACK - 89)) | (1L << (K_ROW - 89)) | (1L << (K_SAVEPOINT - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_SET - 89)) | (1L << (K_SHOW - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_TEMP - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_TO - 89)) | (1L << (K_TRANSACTION - 89)) | (1L << (K_TRIGGER - 89)) | (1L << (K_UNION - 89)) | (1L << (K_UNIQUE - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_USE - 89)) | (1L << (K_USING - 89)) | (1L << (K_VACUUM - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_VIEW - 89)) | (1L << (K_VIRTUAL - 89)) | (1L << (K_WHEN - 89)) | (1L << (K_WHERE - 89)) | (1L << (K_WITH - 89)) | (1L << (K_WITHOUT - 89)))) != 0)) ) {
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1722);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1724);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1728);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1730);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1732);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1734);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1736);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1738);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1740);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1742);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1746);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1750);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			any_name();
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
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1754);
			any_name();
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
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_any_name);
		try {
			setState(1763);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1756);
				match(IDENTIFIER);
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
			case K_DATABASES:
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
			case K_SHOW:
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
			case K_USE:
			case K_USING:
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
				setState(1757);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1758);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1759);
				match(OPEN_PAR);
				setState(1760);
				any_name();
				setState(1761);
				match(CLOSE_PAR);
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
		case 44:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 9);
		case 11:
			return precpred(_ctx, 8);
		case 12:
			return precpred(_ctx, 7);
		case 13:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00a2\u06e8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\3\2\7\2\u00b3\n\2\f\2\16\2\u00b6\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\7\4\u00be\n\4\f\4\16\4\u00c1\13\4\3\4\3\4\6\4\u00c5"+
		"\n\4\r\4\16\4\u00c6\3\4\7\4\u00ca\n\4\f\4\16\4\u00cd\13\4\3\4\7\4\u00d0"+
		"\n\4\f\4\16\4\u00d3\13\4\3\5\3\5\3\5\5\5\u00d8\n\5\5\5\u00da\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ff"+
		"\n\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u0119\n\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u0121\n\13\3\13\5\13\u0124\n\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u012d\n\f\3\r\3\r\5\r\u0131\n\r\3\r\3\r\3\r\3\r\3\16\3\16\5"+
		"\16\u0139\n\16\3\16\3\16\5\16\u013d\n\16\5\16\u013f\n\16\3\17\3\17\3\17"+
		"\5\17\u0144\n\17\5\17\u0146\n\17\3\20\3\20\5\20\u014a\n\20\3\20\3\20\3"+
		"\20\7\20\u014f\n\20\f\20\16\20\u0152\13\20\5\20\u0154\n\20\3\20\3\20\3"+
		"\20\5\20\u0159\n\20\3\20\3\20\5\20\u015d\n\20\3\20\6\20\u0160\n\20\r\20"+
		"\16\20\u0161\3\20\3\20\3\20\3\20\3\20\7\20\u0169\n\20\f\20\16\20\u016c"+
		"\13\20\5\20\u016e\n\20\3\20\3\20\3\20\3\20\5\20\u0174\n\20\5\20\u0176"+
		"\n\20\3\21\3\21\5\21\u017a\n\21\3\21\3\21\3\21\3\21\5\21\u0180\n\21\3"+
		"\21\3\21\3\21\5\21\u0185\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u018e\n\21\f\21\16\21\u0191\13\21\3\21\3\21\3\21\5\21\u0196\n\21\3\22"+
		"\3\22\5\22\u019a\n\22\3\22\3\22\3\22\3\22\5\22\u01a0\n\22\3\22\3\22\3"+
		"\22\5\22\u01a5\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u01ac\n\22\f\22\16\22"+
		"\u01af\13\22\3\22\3\22\7\22\u01b3\n\22\f\22\16\22\u01b6\13\22\3\22\3\22"+
		"\3\22\5\22\u01bb\n\22\3\22\3\22\5\22\u01bf\n\22\3\23\3\23\5\23\u01c3\n"+
		"\23\3\23\3\23\3\23\3\23\5\23\u01c9\n\23\3\23\3\23\3\23\5\23\u01ce\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u01d5\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u01de\n\23\f\23\16\23\u01e1\13\23\5\23\u01e3\n\23\5\23\u01e5"+
		"\n\23\3\23\3\23\3\23\3\23\5\23\u01eb\n\23\3\23\3\23\3\23\3\23\5\23\u01f1"+
		"\n\23\3\23\3\23\5\23\u01f5\n\23\3\23\3\23\3\23\3\23\3\23\5\23\u01fc\n"+
		"\23\3\23\3\23\6\23\u0200\n\23\r\23\16\23\u0201\3\23\3\23\3\24\3\24\5\24"+
		"\u0208\n\24\3\24\3\24\3\24\3\24\5\24\u020e\n\24\3\24\3\24\3\24\5\24\u0213"+
		"\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u021f\n\25"+
		"\3\25\3\25\3\25\5\25\u0224\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u022d\n\25\f\25\16\25\u0230\13\25\3\25\3\25\5\25\u0234\n\25\3\26\5\26"+
		"\u0237\n\26\3\26\3\26\3\26\3\26\3\26\5\26\u023e\n\26\3\27\5\27\u0241\n"+
		"\27\3\27\3\27\3\27\3\27\3\27\5\27\u0248\n\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u024f\n\27\f\27\16\27\u0252\13\27\5\27\u0254\n\27\3\27\3\27\3\27"+
		"\3\27\5\27\u025a\n\27\5\27\u025c\n\27\3\30\3\30\5\30\u0260\n\30\3\30\3"+
		"\30\3\31\3\31\3\31\3\31\5\31\u0268\n\31\3\31\3\31\3\31\5\31\u026d\n\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0275\n\32\3\32\3\32\3\32\5\32\u027a"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u0282\n\33\3\33\3\33\3\33\5\33"+
		"\u0287\n\33\3\33\3\33\3\34\3\34\3\34\3\34\5\34\u028f\n\34\3\34\3\34\3"+
		"\34\5\34\u0294\n\34\3\34\3\34\3\35\3\35\5\35\u029a\n\35\3\35\3\35\3\35"+
		"\7\35\u029f\n\35\f\35\16\35\u02a2\13\35\5\35\u02a4\n\35\3\35\3\35\3\35"+
		"\3\35\7\35\u02aa\n\35\f\35\16\35\u02ad\13\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u02b4\n\35\f\35\16\35\u02b7\13\35\5\35\u02b9\n\35\3\35\3\35\3\35"+
		"\3\35\5\35\u02bf\n\35\5\35\u02c1\n\35\3\36\5\36\u02c4\n\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\5\36\u02d7\n\36\3\36\3\36\3\36\3\36\5\36\u02dd\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u02e4\n\36\f\36\16\36\u02e7\13\36\3\36\3\36\5\36\u02eb"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\7\36\u02f2\n\36\f\36\16\36\u02f5\13\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02fd\n\36\f\36\16\36\u0300\13\36"+
		"\3\36\3\36\7\36\u0304\n\36\f\36\16\36\u0307\13\36\3\36\3\36\3\36\5\36"+
		"\u030c\n\36\3\37\3\37\3\37\3\37\5\37\u0312\n\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u031b\n\37\3 \3 \3 \3 \3 \5 \u0322\n \3 \3 \5 \u0326"+
		"\n \5 \u0328\n \3!\3!\5!\u032c\n!\3!\3!\3\"\3\"\3\"\5\"\u0333\n\"\5\""+
		"\u0335\n\"\3\"\3\"\5\"\u0339\n\"\3\"\5\"\u033c\n\"\3#\3#\3#\3$\3$\5$\u0343"+
		"\n$\3$\3$\3$\7$\u0348\n$\f$\16$\u034b\13$\5$\u034d\n$\3$\3$\3$\3$\3$\3"+
		"$\7$\u0355\n$\f$\16$\u0358\13$\5$\u035a\n$\3$\3$\3$\3$\5$\u0360\n$\5$"+
		"\u0362\n$\3%\3%\5%\u0366\n%\3%\3%\3%\7%\u036b\n%\f%\16%\u036e\13%\5%\u0370"+
		"\n%\3%\3%\3%\3%\7%\u0376\n%\f%\16%\u0379\13%\3%\3%\3%\3%\3%\7%\u0380\n"+
		"%\f%\16%\u0383\13%\5%\u0385\n%\3%\3%\3%\3%\5%\u038b\n%\5%\u038d\n%\3&"+
		"\3&\5&\u0391\n&\3&\3&\3&\7&\u0396\n&\f&\16&\u0399\13&\3&\3&\3&\3&\7&\u039f"+
		"\n&\f&\16&\u03a2\13&\3&\5&\u03a5\n&\5&\u03a7\n&\3&\3&\5&\u03ab\n&\3&\3"+
		"&\3&\3&\3&\7&\u03b2\n&\f&\16&\u03b5\13&\3&\3&\5&\u03b9\n&\5&\u03bb\n&"+
		"\3&\3&\3&\3&\3&\7&\u03c2\n&\f&\16&\u03c5\13&\3&\3&\3&\3&\3&\3&\7&\u03cd"+
		"\n&\f&\16&\u03d0\13&\3&\3&\7&\u03d4\n&\f&\16&\u03d7\13&\5&\u03d9\n&\3"+
		"\'\5\'\u03dc\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u03e9"+
		"\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\7\'\u03f5\n\'\f\'\16\'\u03f8"+
		"\13\'\3\'\3\'\5\'\u03fc\n\'\3(\5(\u03ff\n(\3(\3(\3(\3(\3(\3(\3(\3(\3("+
		"\3(\3(\5(\u040c\n(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\7(\u0418\n(\f(\16(\u041b"+
		"\13(\3(\3(\5(\u041f\n(\3(\3(\3(\3(\3(\7(\u0426\n(\f(\16(\u0429\13(\5("+
		"\u042b\n(\3(\3(\3(\3(\5(\u0431\n(\5(\u0433\n(\3)\3)\3*\3*\5*\u0439\n*"+
		"\3*\7*\u043c\n*\f*\16*\u043f\13*\3+\6+\u0442\n+\r+\16+\u0443\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\5+\u0450\n+\3,\3,\5,\u0454\n,\3,\3,\3,\5,\u0459"+
		"\n,\3,\3,\5,\u045d\n,\3,\5,\u0460\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\5,\u0472\n,\3,\3,\3,\5,\u0477\n,\3-\3-\3-\5-\u047c\n-"+
		"\3.\3.\3.\3.\3.\3.\5.\u0484\n.\3.\3.\3.\5.\u0489\n.\3.\3.\3.\3.\3.\3."+
		"\3.\5.\u0492\n.\3.\3.\3.\7.\u0497\n.\f.\16.\u049a\13.\3.\5.\u049d\n.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u04ad\n.\3.\5.\u04b0\n.\3"+
		".\3.\3.\3.\3.\3.\5.\u04b8\n.\3.\3.\3.\3.\3.\6.\u04bf\n.\r.\16.\u04c0\3"+
		".\3.\5.\u04c5\n.\3.\3.\3.\5.\u04ca\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u04e8\n.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\5.\u04f4\n.\3.\3.\3.\5.\u04f9\n.\3.\3.\3.\3"+
		".\3.\3.\3.\3.\3.\3.\5.\u0505\n.\3.\3.\3.\3.\5.\u050b\n.\3.\3.\3.\3.\3"+
		".\5.\u0512\n.\3.\3.\5.\u0516\n.\3.\3.\3.\3.\3.\3.\7.\u051e\n.\f.\16.\u0521"+
		"\13.\5.\u0523\n.\3.\3.\3.\3.\5.\u0529\n.\3.\5.\u052c\n.\7.\u052e\n.\f"+
		".\16.\u0531\13.\3/\3/\3/\3/\3/\3/\7/\u0539\n/\f/\16/\u053c\13/\3/\3/\5"+
		"/\u0540\n/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u054c\n/\3/\3/\5/\u0550\n"+
		"/\7/\u0552\n/\f/\16/\u0555\13/\3/\5/\u0558\n/\3/\3/\3/\3/\3/\5/\u055f"+
		"\n/\5/\u0561\n/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0569\n\60\3\60\3\60"+
		"\3\61\3\61\3\61\5\61\u0570\n\61\3\61\5\61\u0573\n\61\3\62\3\62\5\62\u0577"+
		"\n\62\3\62\3\62\3\62\5\62\u057c\n\62\3\62\3\62\3\62\3\62\7\62\u0582\n"+
		"\62\f\62\16\62\u0585\13\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\7\62\u0595\n\62\f\62\16\62\u0598\13\62\3\62"+
		"\3\62\3\62\5\62\u059d\n\62\3\63\3\63\5\63\u05a1\n\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\7\63\u05af\n\63\f\63\16\63"+
		"\u05b2\13\63\3\64\3\64\3\64\5\64\u05b7\n\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\5\64\u05bf\n\64\3\65\3\65\3\65\5\65\u05c4\n\65\3\65\5\65\u05c7\n\65"+
		"\3\66\3\66\3\66\5\66\u05cc\n\66\3\67\3\67\3\67\3\67\3\67\7\67\u05d3\n"+
		"\67\f\67\16\67\u05d6\13\67\3\67\3\67\5\67\u05da\n\67\3\67\3\67\3\67\3"+
		"\67\3\67\38\38\38\38\38\38\38\58\u05e8\n8\38\58\u05eb\n8\58\u05ed\n8\3"+
		"9\39\39\59\u05f2\n9\39\39\59\u05f6\n9\39\59\u05f9\n9\39\39\39\39\39\5"+
		"9\u0600\n9\39\39\39\39\79\u0606\n9\f9\169\u0609\139\39\59\u060c\n9\39"+
		"\39\59\u0610\n9\39\59\u0613\n9\39\39\39\39\59\u0619\n9\39\59\u061c\n9"+
		"\59\u061e\n9\3:\3:\3:\3:\3:\7:\u0625\n:\f:\16:\u0628\13:\3;\3;\5;\u062c"+
		"\n;\3;\3;\5;\u0630\n;\3;\3;\5;\u0634\n;\3;\5;\u0637\n;\3<\3<\3<\3<\3<"+
		"\3<\3<\7<\u0640\n<\f<\16<\u0643\13<\3<\3<\5<\u0647\n<\3=\3=\5=\u064b\n"+
		"=\3=\3=\3=\7=\u0650\n=\f=\16=\u0653\13=\3=\3=\3=\3=\7=\u0659\n=\f=\16"+
		"=\u065c\13=\3=\5=\u065f\n=\5=\u0661\n=\3=\3=\5=\u0665\n=\3=\3=\3=\3=\3"+
		"=\7=\u066c\n=\f=\16=\u066f\13=\3=\3=\5=\u0673\n=\5=\u0675\n=\3=\3=\3="+
		"\3=\3=\7=\u067c\n=\f=\16=\u067f\13=\3=\3=\3=\3=\3=\3=\7=\u0687\n=\f=\16"+
		"=\u068a\13=\3=\3=\7=\u068e\n=\f=\16=\u0691\13=\5=\u0693\n=\3>\3>\3>\3"+
		">\3>\5>\u069a\n>\3?\3?\3?\3?\3?\7?\u06a1\n?\f?\16?\u06a4\13?\3?\3?\5?"+
		"\u06a8\n?\3@\5@\u06ab\n@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\5D\u06b7\nD\3E"+
		"\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P"+
		"\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3X\3X\3X\3X\3X\5X\u06e6"+
		"\nX\3X\2\3ZY\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\24\5\2==HHUU\4\2\61\61EE"+
		"\4\2\7\7mm\3\2\u0087\u0088\4\2\37\37AA\4\2$$??\7\2\33\33KKTT}}\u0080\u0080"+
		"\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2PPddffyy\4\2>>\u008f\u008f"+
		"\5\2\33\33KK\u0080\u0080\6\2\668kk\u009b\u009b\u009d\u009e\4\2\n\fii\4"+
		"\2\u009a\u009a\u009d\u009d\3\2\33\u0099\2\u07f5\2\u00b4\3\2\2\2\4\u00b9"+
		"\3\2\2\2\6\u00bf\3\2\2\2\b\u00d9\3\2\2\2\n\u0100\3\2\2\2\f\u0103\3\2\2"+
		"\2\16\u0107\3\2\2\2\20\u010b\3\2\2\2\22\u010f\3\2\2\2\24\u0113\3\2\2\2"+
		"\26\u0125\3\2\2\2\30\u012e\3\2\2\2\32\u0136\3\2\2\2\34\u0140\3\2\2\2\36"+
		"\u0153\3\2\2\2 \u0177\3\2\2\2\"\u0197\3\2\2\2$\u01c0\3\2\2\2&\u0205\3"+
		"\2\2\2(\u0218\3\2\2\2*\u0236\3\2\2\2,\u0240\3\2\2\2.\u025d\3\2\2\2\60"+
		"\u0263\3\2\2\2\62\u0270\3\2\2\2\64\u027d\3\2\2\2\66\u028a\3\2\2\28\u02a3"+
		"\3\2\2\2:\u02c3\3\2\2\2<\u030d\3\2\2\2>\u031c\3\2\2\2@\u0329\3\2\2\2B"+
		"\u032f\3\2\2\2D\u033d\3\2\2\2F\u034c\3\2\2\2H\u036f\3\2\2\2J\u03d8\3\2"+
		"\2\2L\u03db\3\2\2\2N\u03fe\3\2\2\2P\u0434\3\2\2\2R\u0436\3\2\2\2T\u0441"+
		"\3\2\2\2V\u0453\3\2\2\2X\u047b\3\2\2\2Z\u04c9\3\2\2\2\\\u0532\3\2\2\2"+
		"^\u0562\3\2\2\2`\u056c\3\2\2\2b\u0576\3\2\2\2d\u059e\3\2\2\2f\u05b6\3"+
		"\2\2\2h\u05c0\3\2\2\2j\u05cb\3\2\2\2l\u05cd\3\2\2\2n\u05ec\3\2\2\2p\u061d"+
		"\3\2\2\2r\u061f\3\2\2\2t\u0636\3\2\2\2v\u0646\3\2\2\2x\u0692\3\2\2\2z"+
		"\u0699\3\2\2\2|\u069b\3\2\2\2~\u06aa\3\2\2\2\u0080\u06ae\3\2\2\2\u0082"+
		"\u06b0\3\2\2\2\u0084\u06b2\3\2\2\2\u0086\u06b6\3\2\2\2\u0088\u06b8\3\2"+
		"\2\2\u008a\u06ba\3\2\2\2\u008c\u06bc\3\2\2\2\u008e\u06be\3\2\2\2\u0090"+
		"\u06c0\3\2\2\2\u0092\u06c2\3\2\2\2\u0094\u06c4\3\2\2\2\u0096\u06c6\3\2"+
		"\2\2\u0098\u06c8\3\2\2\2\u009a\u06ca\3\2\2\2\u009c\u06cc\3\2\2\2\u009e"+
		"\u06ce\3\2\2\2\u00a0\u06d0\3\2\2\2\u00a2\u06d2\3\2\2\2\u00a4\u06d4\3\2"+
		"\2\2\u00a6\u06d6\3\2\2\2\u00a8\u06d8\3\2\2\2\u00aa\u06da\3\2\2\2\u00ac"+
		"\u06dc\3\2\2\2\u00ae\u06e5\3\2\2\2\u00b0\u00b3\5\6\4\2\u00b1\u00b3\5\4"+
		"\3\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\7\2\2\3\u00b8\3\3\2\2\2\u00b9\u00ba\7\u00a2\2\2\u00ba"+
		"\u00bb\b\3\1\2\u00bb\5\3\2\2\2\u00bc\u00be\7\3\2\2\u00bd\u00bc\3\2\2\2"+
		"\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00cb\5\b\5\2\u00c3\u00c5\7\3\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\5\b\5\2\u00c9\u00c4\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d1\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\7\3\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\7\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d4\u00d7\7J\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d8"+
		"\7r\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d4\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00fe\3\2\2\2\u00db\u00ff\5\24"+
		"\13\2\u00dc\u00ff\5\26\f\2\u00dd\u00ff\5\30\r\2\u00de\u00ff\5\32\16\2"+
		"\u00df\u00ff\5\34\17\2\u00e0\u00ff\5\36\20\2\u00e1\u00ff\5\16\b\2\u00e2"+
		"\u00ff\5 \21\2\u00e3\u00ff\5\"\22\2\u00e4\u00ff\5$\23\2\u00e5\u00ff\5"+
		"&\24\2\u00e6\u00ff\5(\25\2\u00e7\u00ff\5*\26\2\u00e8\u00ff\5,\27\2\u00e9"+
		"\u00ff\5.\30\2\u00ea\u00ff\5\20\t\2\u00eb\u00ff\5\60\31\2\u00ec\u00ff"+
		"\5\62\32\2\u00ed\u00ff\5\64\33\2\u00ee\u00ff\5\66\34\2\u00ef\u00ff\58"+
		"\35\2\u00f0\u00ff\5:\36\2\u00f1\u00ff\5<\37\2\u00f2\u00ff\5> \2\u00f3"+
		"\u00ff\5@!\2\u00f4\u00ff\5B\"\2\u00f5\u00ff\5D#\2\u00f6\u00ff\5F$\2\u00f7"+
		"\u00ff\5H%\2\u00f8\u00ff\5\f\7\2\u00f9\u00ff\5\n\6\2\u00fa\u00ff\5L\'"+
		"\2\u00fb\u00ff\5N(\2\u00fc\u00ff\5\22\n\2\u00fd\u00ff\5P)\2\u00fe\u00db"+
		"\3\2\2\2\u00fe\u00dc\3\2\2\2\u00fe\u00dd\3\2\2\2\u00fe\u00de\3\2\2\2\u00fe"+
		"\u00df\3\2\2\2\u00fe\u00e0\3\2\2\2\u00fe\u00e1\3\2\2\2\u00fe\u00e2\3\2"+
		"\2\2\u00fe\u00e3\3\2\2\2\u00fe\u00e4\3\2\2\2\u00fe\u00e5\3\2\2\2\u00fe"+
		"\u00e6\3\2\2\2\u00fe\u00e7\3\2\2\2\u00fe\u00e8\3\2\2\2\u00fe\u00e9\3\2"+
		"\2\2\u00fe\u00ea\3\2\2\2\u00fe\u00eb\3\2\2\2\u00fe\u00ec\3\2\2\2\u00fe"+
		"\u00ed\3\2\2\2\u00fe\u00ee\3\2\2\2\u00fe\u00ef\3\2\2\2\u00fe\u00f0\3\2"+
		"\2\2\u00fe\u00f1\3\2\2\2\u00fe\u00f2\3\2\2\2\u00fe\u00f3\3\2\2\2\u00fe"+
		"\u00f4\3\2\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00f7\3\2"+
		"\2\2\u00fe\u00f8\3\2\2\2\u00fe\u00f9\3\2\2\2\u00fe\u00fa\3\2\2\2\u00fe"+
		"\u00fb\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\t\3\2\2\2"+
		"\u0100\u0101\7\u0085\2\2\u0101\u0102\7:\2\2\u0102\13\3\2\2\2\u0103\u0104"+
		"\7\u0085\2\2\u0104\u0105\79\2\2\u0105\u0106\5\u0090I\2\u0106\r\3\2\2\2"+
		"\u0107\u0108\7\64\2\2\u0108\u0109\79\2\2\u0109\u010a\5\u0090I\2\u010a"+
		"\17\3\2\2\2\u010b\u010c\7B\2\2\u010c\u010d\79\2\2\u010d\u010e\5\u0090"+
		"I\2\u010e\21\3\2\2\2\u010f\u0110\7\u0090\2\2\u0110\u0111\79\2\2\u0111"+
		"\u0112\5\u0090I\2\u0112\23\3\2\2\2\u0113\u0114\7 \2\2\u0114\u0118\7\u0086"+
		"\2\2\u0115\u0116\5\u0090I\2\u0116\u0117\7\4\2\2\u0117\u0119\3\2\2\2\u0118"+
		"\u0115\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0123\5\u0092"+
		"J\2\u011b\u011c\7|\2\2\u011c\u011d\7\u008a\2\2\u011d\u0124\5\u0096L\2"+
		"\u011e\u0120\7\35\2\2\u011f\u0121\7\60\2\2\u0120\u011f\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\5R*\2\u0123\u011b\3\2\2\2\u0123"+
		"\u011e\3\2\2\2\u0124\25\3\2\2\2\u0125\u012c\7!\2\2\u0126\u012d\5\u0090"+
		"I\2\u0127\u012d\5\u0094K\2\u0128\u0129\5\u0090I\2\u0129\u012a\7\4\2\2"+
		"\u012a\u012b\5\u0094K\2\u012b\u012d\3\2\2\2\u012c\u0126\3\2\2\2\u012c"+
		"\u0127\3\2\2\2\u012c\u0128\3\2\2\2\u012c\u012d\3\2\2\2\u012d\27\3\2\2"+
		"\2\u012e\u0130\7%\2\2\u012f\u0131\79\2\2\u0130\u012f\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\5Z.\2\u0133\u0134\7#\2\2\u0134"+
		"\u0135\5\u0090I\2\u0135\31\3\2\2\2\u0136\u0138\7(\2\2\u0137\u0139\t\2"+
		"\2\2\u0138\u0137\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013e\3\2\2\2\u013a"+
		"\u013c\7\u008b\2\2\u013b\u013d\5\u00acW\2\u013c\u013b\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013a\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\33\3\2\2\2\u0140\u0145\t\3\2\2\u0141\u0143\7\u008b\2\2\u0142\u0144\5"+
		"\u00acW\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3\2\2\2"+
		"\u0145\u0141\3\2\2\2\u0145\u0146\3\2\2\2\u0146\35\3\2\2\2\u0147\u0149"+
		"\7\u0098\2\2\u0148\u014a\7w\2\2\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2"+
		"\2\u014a\u014b\3\2\2\2\u014b\u0150\5l\67\2\u014c\u014d\7\7\2\2\u014d\u014f"+
		"\5l\67\2\u014e\u014c\3\2\2\2\u014f\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0153\u0147\3\2"+
		"\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u015f\5x=\2\u0156\u0158"+
		"\7\u008d\2\2\u0157\u0159\7\37\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015d\3\2\2\2\u015a\u015d\7]\2\2\u015b\u015d\7G\2\2\u015c\u0156"+
		"\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u0160\5x=\2\u015f\u015c\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u015f\3\2\2"+
		"\2\u0161\u0162\3\2\2\2\u0162\u016d\3\2\2\2\u0163\u0164\7p\2\2\u0164\u0165"+
		"\7*\2\2\u0165\u016a\5h\65\2\u0166\u0167\7\7\2\2\u0167\u0169\5h\65\2\u0168"+
		"\u0166\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0163\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0175\3\2\2\2\u016f\u0170\7e\2\2\u0170\u0173\5Z."+
		"\2\u0171\u0172\t\4\2\2\u0172\u0174\5Z.\2\u0173\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\u0176\3\2\2\2\u0175\u016f\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\37\3\2\2\2\u0177\u0179\7\64\2\2\u0178\u017a\7\u008e\2\2\u0179\u0178\3"+
		"\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017f\7W\2\2\u017c"+
		"\u017d\7S\2\2\u017d\u017e\7i\2\2\u017e\u0180\7I\2\2\u017f\u017c\3\2\2"+
		"\2\u017f\u0180\3\2\2\2\u0180\u0184\3\2\2\2\u0181\u0182\5\u0090I\2\u0182"+
		"\u0183\7\4\2\2\u0183\u0185\3\2\2\2\u0184\u0181\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0187\5\u009eP\2\u0187\u0188\7n\2\2\u0188"+
		"\u0189\5\u0092J\2\u0189\u018a\7\5\2\2\u018a\u018f\5`\61\2\u018b\u018c"+
		"\7\7\2\2\u018c\u018e\5`\61\2\u018d\u018b\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u018f\3\2"+
		"\2\2\u0192\u0195\7\6\2\2\u0193\u0194\7\u0097\2\2\u0194\u0196\5Z.\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196!\3\2\2\2\u0197\u0199\7\64\2\2"+
		"\u0198\u019a\t\5\2\2\u0199\u0198\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019f\7\u0086\2\2\u019c\u019d\7S\2\2\u019d\u019e\7i\2\2"+
		"\u019e\u01a0\7I\2\2\u019f\u019c\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a4"+
		"\3\2\2\2\u01a1\u01a2\5\u0090I\2\u01a2\u01a3\7\4\2\2\u01a3\u01a5\3\2\2"+
		"\2\u01a4\u01a1\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01be"+
		"\5\u0092J\2\u01a7\u01a8\7\5\2\2\u01a8\u01ad\5R*\2\u01a9\u01aa\7\7\2\2"+
		"\u01aa\u01ac\5R*\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b4\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0"+
		"\u01b1\7\7\2\2\u01b1\u01b3\5b\62\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2"+
		"\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b7\u01ba\7\6\2\2\u01b8\u01b9\7\u0099\2\2\u01b9\u01bb"+
		"\7\u009a\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bf\3\2\2"+
		"\2\u01bc\u01bd\7#\2\2\u01bd\u01bf\5H%\2\u01be\u01a7\3\2\2\2\u01be\u01bc"+
		"\3\2\2\2\u01bf#\3\2\2\2\u01c0\u01c2\7\64\2\2\u01c1\u01c3\t\5\2\2\u01c2"+
		"\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c8\7\u008c"+
		"\2\2\u01c5\u01c6\7S\2\2\u01c6\u01c7\7i\2\2\u01c7\u01c9\7I\2\2\u01c8\u01c5"+
		"\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cd\3\2\2\2\u01ca\u01cb\5\u0090I"+
		"\2\u01cb\u01cc\7\4\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01ca\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d4\5\u00a0Q\2\u01d0\u01d5\7\'\2"+
		"\2\u01d1\u01d5\7\36\2\2\u01d2\u01d3\7\\\2\2\u01d3\u01d5\7l\2\2\u01d4\u01d0"+
		"\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01e4\3\2\2\2\u01d6\u01e5\7>\2\2\u01d7\u01e5\7[\2\2\u01d8\u01e2\7\u008f"+
		"\2\2\u01d9\u01da\7l\2\2\u01da\u01df\5\u0098M\2\u01db\u01dc\7\7\2\2\u01dc"+
		"\u01de\5\u0098M\2\u01dd\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd"+
		"\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2"+
		"\u01d9\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01d6\3\2"+
		"\2\2\u01e4\u01d7\3\2\2\2\u01e4\u01d8\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6"+
		"\u01ea\7n\2\2\u01e7\u01e8\5\u0090I\2\u01e8\u01e9\7\4\2\2\u01e9\u01eb\3"+
		"\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01f0\5\u0092J\2\u01ed\u01ee\7L\2\2\u01ee\u01ef\7C\2\2\u01ef\u01f1\7"+
		"\u0081\2\2\u01f0\u01ed\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f4\3\2\2\2"+
		"\u01f2\u01f3\7\u0096\2\2\u01f3\u01f5\5Z.\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5"+
		"\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01ff\7(\2\2\u01f7\u01fc\5L\'\2\u01f8"+
		"\u01fc\5:\36\2\u01f9\u01fc\5*\26\2\u01fa\u01fc\5H%\2\u01fb\u01f7\3\2\2"+
		"\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fc\u01fd"+
		"\3\2\2\2\u01fd\u01fe\7\3\2\2\u01fe\u0200\3\2\2\2\u01ff\u01fb\3\2\2\2\u0200"+
		"\u0201\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0204\7E\2\2\u0204%\3\2\2\2\u0205\u0207\7\64\2\2\u0206\u0208"+
		"\t\5\2\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020d\7\u0094\2\2\u020a\u020b\7S\2\2\u020b\u020c\7i\2\2\u020c\u020e\7"+
		"I\2\2\u020d\u020a\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0212\3\2\2\2\u020f"+
		"\u0210\5\u0090I\2\u0210\u0211\7\4\2\2\u0211\u0213\3\2\2\2\u0212\u020f"+
		"\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\3\2\2\2\u0214\u0215\5\u00a2R"+
		"\2\u0215\u0216\7#\2\2\u0216\u0217\5H%\2\u0217\'\3\2\2\2\u0218\u0219\7"+
		"\64\2\2\u0219\u021a\7\u0095\2\2\u021a\u021e\7\u0086\2\2\u021b\u021c\7"+
		"S\2\2\u021c\u021d\7i\2\2\u021d\u021f\7I\2\2\u021e\u021b\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0223\3\2\2\2\u0220\u0221\5\u0090I\2\u0221\u0222"+
		"\7\4\2\2\u0222\u0224\3\2\2\2\u0223\u0220\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\5\u0092J\2\u0226\u0227\7\u0091\2\2\u0227\u0233"+
		"\5\u00a4S\2\u0228\u0229\7\5\2\2\u0229\u022e\5\u0086D\2\u022a\u022b\7\7"+
		"\2\2\u022b\u022d\5\u0086D\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0231\u0232\7\6\2\2\u0232\u0234\3\2\2\2\u0233\u0228\3\2\2\2\u0233"+
		"\u0234\3\2\2\2\u0234)\3\2\2\2\u0235\u0237\5d\63\2\u0236\u0235\3\2\2\2"+
		"\u0236\u0237\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\7>\2\2\u0239\u023a"+
		"\7N\2\2\u023a\u023d\5f\64\2\u023b\u023c\7\u0097\2\2\u023c\u023e\5Z.\2"+
		"\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e+\3\2\2\2\u023f\u0241\5"+
		"d\63\2\u0240\u023f\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\7>\2\2\u0243\u0244\7N\2\2\u0244\u0247\5f\64\2\u0245\u0246\7\u0097"+
		"\2\2\u0246\u0248\5Z.\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\u025b"+
		"\3\2\2\2\u0249\u024a\7p\2\2\u024a\u024b\7*\2\2\u024b\u0250\5h\65\2\u024c"+
		"\u024d\7\7\2\2\u024d\u024f\5h\65\2\u024e\u024c\3\2\2\2\u024f\u0252\3\2"+
		"\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0253\u0249\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255\u0256\7e\2\2\u0256\u0259\5Z.\2\u0257\u0258\t\4\2\2\u0258\u025a"+
		"\5Z.\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025c\3\2\2\2\u025b"+
		"\u0253\3\2\2\2\u025b\u025c\3\2\2\2\u025c-\3\2\2\2\u025d\u025f\7@\2\2\u025e"+
		"\u0260\79\2\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2"+
		"\2\2\u0261\u0262\5\u0090I\2\u0262/\3\2\2\2\u0263\u0264\7B\2\2\u0264\u0267"+
		"\7W\2\2\u0265\u0266\7S\2\2\u0266\u0268\7I\2\2\u0267\u0265\3\2\2\2\u0267"+
		"\u0268\3\2\2\2\u0268\u026c\3\2\2\2\u0269\u026a\5\u0090I\2\u026a\u026b"+
		"\7\4\2\2\u026b\u026d\3\2\2\2\u026c\u0269\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u026e\3\2\2\2\u026e\u026f\5\u009eP\2\u026f\61\3\2\2\2\u0270\u0271\7B"+
		"\2\2\u0271\u0274\7\u0086\2\2\u0272\u0273\7S\2\2\u0273\u0275\7I\2\2\u0274"+
		"\u0272\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u0279\3\2\2\2\u0276\u0277\5\u0090"+
		"I\2\u0277\u0278\7\4\2\2\u0278\u027a\3\2\2\2\u0279\u0276\3\2\2\2\u0279"+
		"\u027a\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027c\5\u0092J\2\u027c\63\3\2"+
		"\2\2\u027d\u027e\7B\2\2\u027e\u0281\7\u008c\2\2\u027f\u0280\7S\2\2\u0280"+
		"\u0282\7I\2\2\u0281\u027f\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0286\3\2"+
		"\2\2\u0283\u0284\5\u0090I\2\u0284\u0285\7\4\2\2\u0285\u0287\3\2\2\2\u0286"+
		"\u0283\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\5\u00a0"+
		"Q\2\u0289\65\3\2\2\2\u028a\u028b\7B\2\2\u028b\u028e\7\u0094\2\2\u028c"+
		"\u028d\7S\2\2\u028d\u028f\7I\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2"+
		"\2\u028f\u0293\3\2\2\2\u0290\u0291\5\u0090I\2\u0291\u0292\7\4\2\2\u0292"+
		"\u0294\3\2\2\2\u0293\u0290\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0295\3\2"+
		"\2\2\u0295\u0296\5\u00a2R\2\u0296\67\3\2\2\2\u0297\u0299\7\u0098\2\2\u0298"+
		"\u029a\7w\2\2\u0299\u0298\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u02a0\5l\67\2\u029c\u029d\7\7\2\2\u029d\u029f\5l\67\2\u029e"+
		"\u029c\3\2\2\2\u029f\u02a2\3\2\2\2\u02a0\u029e\3\2\2\2\u02a0\u02a1\3\2"+
		"\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a3\u0297\3\2\2\2\u02a3"+
		"\u02a4\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02ab\5x=\2\u02a6\u02a7\5z>\2"+
		"\u02a7\u02a8\5x=\2\u02a8\u02aa\3\2\2\2\u02a9\u02a6\3\2\2\2\u02aa\u02ad"+
		"\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02b8\3\2\2\2\u02ad"+
		"\u02ab\3\2\2\2\u02ae\u02af\7p\2\2\u02af\u02b0\7*\2\2\u02b0\u02b5\5h\65"+
		"\2\u02b1\u02b2\7\7\2\2\u02b2\u02b4\5h\65\2\u02b3\u02b1\3\2\2\2\u02b4\u02b7"+
		"\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b9\3\2\2\2\u02b7"+
		"\u02b5\3\2\2\2\u02b8\u02ae\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02c0\3\2"+
		"\2\2\u02ba\u02bb\7e\2\2\u02bb\u02be\5Z.\2\u02bc\u02bd\t\4\2\2\u02bd\u02bf"+
		"\5Z.\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0"+
		"\u02ba\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c19\3\2\2\2\u02c2\u02c4\5d\63\2"+
		"\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02d6\3\2\2\2\u02c5\u02d7"+
		"\7[\2\2\u02c6\u02d7\7}\2\2\u02c7\u02c8\7[\2\2\u02c8\u02c9\7o\2\2\u02c9"+
		"\u02d7\7}\2\2\u02ca\u02cb\7[\2\2\u02cb\u02cc\7o\2\2\u02cc\u02d7\7\u0080"+
		"\2\2\u02cd\u02ce\7[\2\2\u02ce\u02cf\7o\2\2\u02cf\u02d7\7\33\2\2\u02d0"+
		"\u02d1\7[\2\2\u02d1\u02d2\7o\2\2\u02d2\u02d7\7K\2\2\u02d3\u02d4\7[\2\2"+
		"\u02d4\u02d5\7o\2\2\u02d5\u02d7\7T\2\2\u02d6\u02c5\3\2\2\2\u02d6\u02c6"+
		"\3\2\2\2\u02d6\u02c7\3\2\2\2\u02d6\u02ca\3\2\2\2\u02d6\u02cd\3\2\2\2\u02d6"+
		"\u02d0\3\2\2\2\u02d6\u02d3\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02dc\7^"+
		"\2\2\u02d9\u02da\5\u0090I\2\u02da\u02db\7\4\2\2\u02db\u02dd\3\2\2\2\u02dc"+
		"\u02d9\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02ea\5\u0092"+
		"J\2\u02df\u02e0\7\5\2\2\u02e0\u02e5\5\u0098M\2\u02e1\u02e2\7\7\2\2\u02e2"+
		"\u02e4\5\u0098M\2\u02e3\u02e1\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3"+
		"\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8"+
		"\u02e9\7\6\2\2\u02e9\u02eb\3\2\2\2\u02ea\u02df\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u030b\3\2\2\2\u02ec\u02ed\7\u0093\2\2\u02ed\u02ee\7\5\2\2\u02ee"+
		"\u02f3\5Z.\2\u02ef\u02f0\7\7\2\2\u02f0\u02f2\5Z.\2\u02f1\u02ef\3\2\2\2"+
		"\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f6"+
		"\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u0305\7\6\2\2\u02f7\u02f8\7\7\2\2\u02f8"+
		"\u02f9\7\5\2\2\u02f9\u02fe\5Z.\2\u02fa\u02fb\7\7\2\2\u02fb\u02fd\5Z.\2"+
		"\u02fc\u02fa\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff"+
		"\3\2\2\2\u02ff\u0301\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u0302\7\6\2\2\u0302"+
		"\u0304\3\2\2\2\u0303\u02f7\3\2\2\2\u0304\u0307\3\2\2\2\u0305\u0303\3\2"+
		"\2\2\u0305\u0306\3\2\2\2\u0306\u030c\3\2\2\2\u0307\u0305\3\2\2\2\u0308"+
		"\u030c\5H%\2\u0309\u030a\7;\2\2\u030a\u030c\7\u0093\2\2\u030b\u02ec\3"+
		"\2\2\2\u030b\u0308\3\2\2\2\u030b\u0309\3\2\2\2\u030c;\3\2\2\2\u030d\u0311"+
		"\7s\2\2\u030e\u030f\5\u0090I\2\u030f\u0310\7\4\2\2\u0310\u0312\3\2\2\2"+
		"\u0311\u030e\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u031a"+
		"\5\u00a6T\2\u0314\u0315\7\b\2\2\u0315\u031b\5j\66\2\u0316\u0317\7\5\2"+
		"\2\u0317\u0318\5j\66\2\u0318\u0319\7\6\2\2\u0319\u031b\3\2\2\2\u031a\u0314"+
		"\3\2\2\2\u031a\u0316\3\2\2\2\u031a\u031b\3\2\2\2\u031b=\3\2\2\2\u031c"+
		"\u0327\7z\2\2\u031d\u0328\5\u009aN\2\u031e\u031f\5\u0090I\2\u031f\u0320"+
		"\7\4\2\2\u0320\u0322\3\2\2\2\u0321\u031e\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0325\3\2\2\2\u0323\u0326\5\u0092J\2\u0324\u0326\5\u009eP\2\u0325\u0323"+
		"\3\2\2\2\u0325\u0324\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u031d\3\2\2\2\u0327"+
		"\u0321\3\2\2\2\u0327\u0328\3\2\2\2\u0328?\3\2\2\2\u0329\u032b\7{\2\2\u032a"+
		"\u032c\7\u0082\2\2\u032b\u032a\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d"+
		"\3\2\2\2\u032d\u032e\5\u00a8U\2\u032eA\3\2\2\2\u032f\u0334\7\u0080\2\2"+
		"\u0330\u0332\7\u008b\2\2\u0331\u0333\5\u00acW\2\u0332\u0331\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334\u0330\3\2\2\2\u0334\u0335\3\2"+
		"\2\2\u0335\u033b\3\2\2\2\u0336\u0338\7\u008a\2\2\u0337\u0339\7\u0082\2"+
		"\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c"+
		"\5\u00a8U\2\u033b\u0336\3\2\2\2\u033b\u033c\3\2\2\2\u033cC\3\2\2\2\u033d"+
		"\u033e\7\u0082\2\2\u033e\u033f\5\u00a8U\2\u033fE\3\2\2\2\u0340\u0342\7"+
		"\u0098\2\2\u0341\u0343\7w\2\2\u0342\u0341\3\2\2\2\u0342\u0343\3\2\2\2"+
		"\u0343\u0344\3\2\2\2\u0344\u0349\5l\67\2\u0345\u0346\7\7\2\2\u0346\u0348"+
		"\5l\67\2\u0347\u0345\3\2\2\2\u0348\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349"+
		"\u034a\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034c\u0340\3\2"+
		"\2\2\u034c\u034d\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0359\5x=\2\u034f\u0350"+
		"\7p\2\2\u0350\u0351\7*\2\2\u0351\u0356\5h\65\2\u0352\u0353\7\7\2\2\u0353"+
		"\u0355\5h\65\2\u0354\u0352\3\2\2\2\u0355\u0358\3\2\2\2\u0356\u0354\3\2"+
		"\2\2\u0356\u0357\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0359"+
		"\u034f\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u0361\3\2\2\2\u035b\u035c\7e"+
		"\2\2\u035c\u035f\5Z.\2\u035d\u035e\t\4\2\2\u035e\u0360\5Z.\2\u035f\u035d"+
		"\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u035b\3\2\2\2\u0361"+
		"\u0362\3\2\2\2\u0362G\3\2\2\2\u0363\u0365\7\u0098\2\2\u0364\u0366\7w\2"+
		"\2\u0365\u0364\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u036c"+
		"\5l\67\2\u0368\u0369\7\7\2\2\u0369\u036b\5l\67\2\u036a\u0368\3\2\2\2\u036b"+
		"\u036e\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0370\3\2"+
		"\2\2\u036e\u036c\3\2\2\2\u036f\u0363\3\2\2\2\u036f\u0370\3\2\2\2\u0370"+
		"\u0371\3\2\2\2\u0371\u0377\5J&\2\u0372\u0373\5z>\2\u0373\u0374\5J&\2\u0374"+
		"\u0376\3\2\2\2\u0375\u0372\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2"+
		"\2\2\u0377\u0378\3\2\2\2\u0378\u0384\3\2\2\2\u0379\u0377\3\2\2\2\u037a"+
		"\u037b\7p\2\2\u037b\u037c\7*\2\2\u037c\u0381\5h\65\2\u037d\u037e\7\7\2"+
		"\2\u037e\u0380\5h\65\2\u037f\u037d\3\2\2\2\u0380\u0383\3\2\2\2\u0381\u037f"+
		"\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0385\3\2\2\2\u0383\u0381\3\2\2\2\u0384"+
		"\u037a\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u038c\3\2\2\2\u0386\u0387\7e"+
		"\2\2\u0387\u038a\5Z.\2\u0388\u0389\t\4\2\2\u0389\u038b\5Z.\2\u038a\u0388"+
		"\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u0386\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038dI\3\2\2\2\u038e\u0390\7\u0083\2\2\u038f\u0391\t\6"+
		"\2\2\u0390\u038f\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0392\3\2\2\2\u0392"+
		"\u0397\5n8\2\u0393\u0394\7\7\2\2\u0394\u0396\5n8\2\u0395\u0393\3\2\2\2"+
		"\u0396\u0399\3\2\2\2\u0397\u0395\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u03a6"+
		"\3\2\2\2\u0399\u0397\3\2\2\2\u039a\u03a4\7N\2\2\u039b\u03a0\5p9\2\u039c"+
		"\u039d\7\7\2\2\u039d\u039f\5p9\2\u039e\u039c\3\2\2\2\u039f\u03a2\3\2\2"+
		"\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1\u03a5\3\2\2\2\u03a2\u03a0"+
		"\3\2\2\2\u03a3\u03a5\5r:\2\u03a4\u039b\3\2\2\2\u03a4\u03a3\3\2\2\2\u03a5"+
		"\u03a7\3\2\2\2\u03a6\u039a\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03aa\3\2"+
		"\2\2\u03a8\u03a9\7\u0097\2\2\u03a9\u03ab\5Z.\2\u03aa\u03a8\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03ba\3\2\2\2\u03ac\u03ad\7Q\2\2\u03ad\u03ae\7*\2"+
		"\2\u03ae\u03b3\5Z.\2\u03af\u03b0\7\7\2\2\u03b0\u03b2\5Z.\2\u03b1\u03af"+
		"\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b3\u03b4\3\2\2\2\u03b4"+
		"\u03b8\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6\u03b7\7R\2\2\u03b7\u03b9\5Z."+
		"\2\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03ac"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03d9\3\2\2\2\u03bc\u03bd\7\u0093\2"+
		"\2\u03bd\u03be\7\5\2\2\u03be\u03c3\5Z.\2\u03bf\u03c0\7\7\2\2\u03c0\u03c2"+
		"\5Z.\2\u03c1\u03bf\3\2\2\2\u03c2\u03c5\3\2\2\2\u03c3\u03c1\3\2\2\2\u03c3"+
		"\u03c4\3\2\2\2\u03c4\u03c6\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c6\u03d5\7\6"+
		"\2\2\u03c7\u03c8\7\7\2\2\u03c8\u03c9\7\5\2\2\u03c9\u03ce\5Z.\2\u03ca\u03cb"+
		"\7\7\2\2\u03cb\u03cd\5Z.\2\u03cc\u03ca\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce"+
		"\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2"+
		"\2\2\u03d1\u03d2\7\6\2\2\u03d2\u03d4\3\2\2\2\u03d3\u03c7\3\2\2\2\u03d4"+
		"\u03d7\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d9\3\2"+
		"\2\2\u03d7\u03d5\3\2\2\2\u03d8\u038e\3\2\2\2\u03d8\u03bc\3\2\2\2\u03d9"+
		"K\3\2\2\2\u03da\u03dc\5d\63\2\u03db\u03da\3\2\2\2\u03db\u03dc\3\2\2\2"+
		"\u03dc\u03dd\3\2\2\2\u03dd\u03e8\7\u008f\2\2\u03de\u03df\7o\2\2\u03df"+
		"\u03e9\7\u0080\2\2\u03e0\u03e1\7o\2\2\u03e1\u03e9\7\33\2\2\u03e2\u03e3"+
		"\7o\2\2\u03e3\u03e9\7}\2\2\u03e4\u03e5\7o\2\2\u03e5\u03e9\7K\2\2\u03e6"+
		"\u03e7\7o\2\2\u03e7\u03e9\7T\2\2\u03e8\u03de\3\2\2\2\u03e8\u03e0\3\2\2"+
		"\2\u03e8\u03e2\3\2\2\2\u03e8\u03e4\3\2\2\2\u03e8\u03e6\3\2\2\2\u03e8\u03e9"+
		"\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\5f\64\2\u03eb\u03ec\7\u0084\2"+
		"\2\u03ec\u03ed\5\u0098M\2\u03ed\u03ee\7\b\2\2\u03ee\u03f6\5Z.\2\u03ef"+
		"\u03f0\7\7\2\2\u03f0\u03f1\5\u0098M\2\u03f1\u03f2\7\b\2\2\u03f2\u03f3"+
		"\5Z.\2\u03f3\u03f5\3\2\2\2\u03f4\u03ef\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6"+
		"\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03fb\3\2\2\2\u03f8\u03f6\3\2"+
		"\2\2\u03f9\u03fa\7\u0097\2\2\u03fa\u03fc\5Z.\2\u03fb\u03f9\3\2\2\2\u03fb"+
		"\u03fc\3\2\2\2\u03fcM\3\2\2\2\u03fd\u03ff\5d\63\2\u03fe\u03fd\3\2\2\2"+
		"\u03fe\u03ff\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u040b\7\u008f\2\2\u0401"+
		"\u0402\7o\2\2\u0402\u040c\7\u0080\2\2\u0403\u0404\7o\2\2\u0404\u040c\7"+
		"\33\2\2\u0405\u0406\7o\2\2\u0406\u040c\7}\2\2\u0407\u0408\7o\2\2\u0408"+
		"\u040c\7K\2\2\u0409\u040a\7o\2\2\u040a\u040c\7T\2\2\u040b\u0401\3\2\2"+
		"\2\u040b\u0403\3\2\2\2\u040b\u0405\3\2\2\2\u040b\u0407\3\2\2\2\u040b\u0409"+
		"\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u040d\3\2\2\2\u040d\u040e\5f\64\2\u040e"+
		"\u040f\7\u0084\2\2\u040f\u0410\5\u0098M\2\u0410\u0411\7\b\2\2\u0411\u0419"+
		"\5Z.\2\u0412\u0413\7\7\2\2\u0413\u0414\5\u0098M\2\u0414\u0415\7\b\2\2"+
		"\u0415\u0416\5Z.\2\u0416\u0418\3\2\2\2\u0417\u0412\3\2\2\2\u0418\u041b"+
		"\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041e\3\2\2\2\u041b"+
		"\u0419\3\2\2\2\u041c\u041d\7\u0097\2\2\u041d\u041f\5Z.\2\u041e\u041c\3"+
		"\2\2\2\u041e\u041f\3\2\2\2\u041f\u0432\3\2\2\2\u0420\u0421\7p\2\2\u0421"+
		"\u0422\7*\2\2\u0422\u0427\5h\65\2\u0423\u0424\7\7\2\2\u0424\u0426\5h\65"+
		"\2\u0425\u0423\3\2\2\2\u0426\u0429\3\2\2\2\u0427\u0425\3\2\2\2\u0427\u0428"+
		"\3\2\2\2\u0428\u042b\3\2\2\2\u0429\u0427\3\2\2\2\u042a\u0420\3\2\2\2\u042a"+
		"\u042b\3\2\2\2\u042b\u042c\3\2\2\2\u042c\u042d\7e\2\2\u042d\u0430\5Z."+
		"\2\u042e\u042f\t\4\2\2\u042f\u0431\5Z.\2\u0430\u042e\3\2\2\2\u0430\u0431"+
		"\3\2\2\2\u0431\u0433\3\2\2\2\u0432\u042a\3\2\2\2\u0432\u0433\3\2\2\2\u0433"+
		"O\3\2\2\2\u0434\u0435\7\u0092\2\2\u0435Q\3\2\2\2\u0436\u0438\5\u0098M"+
		"\2\u0437\u0439\5T+\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043d"+
		"\3\2\2\2\u043a\u043c\5V,\2\u043b\u043a\3\2\2\2\u043c\u043f\3\2\2\2\u043d"+
		"\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043eS\3\2\2\2\u043f\u043d\3\2\2\2"+
		"\u0440\u0442\5\u008cG\2\u0441\u0440\3\2\2\2\u0442\u0443\3\2\2\2\u0443"+
		"\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u044f\3\2\2\2\u0445\u0446\7\5"+
		"\2\2\u0446\u0447\5~@\2\u0447\u0448\7\6\2\2\u0448\u0450\3\2\2\2\u0449\u044a"+
		"\7\5\2\2\u044a\u044b\5~@\2\u044b\u044c\7\7\2\2\u044c\u044d\5~@\2\u044d"+
		"\u044e\7\6\2\2\u044e\u0450\3\2\2\2\u044f\u0445\3\2\2\2\u044f\u0449\3\2"+
		"\2\2\u044f\u0450\3\2\2\2\u0450U\3\2\2\2\u0451\u0452\7\63\2\2\u0452\u0454"+
		"\5\u008cG\2\u0453\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0476\3\2\2"+
		"\2\u0455\u0456\7t\2\2\u0456\u0458\7b\2\2\u0457\u0459\t\7\2\2\u0458\u0457"+
		"\3\2\2\2\u0458\u0459\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045c\5X-\2\u045b"+
		"\u045d\7&\2\2\u045c\u045b\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u0477\3\2"+
		"\2\2\u045e\u0460\7i\2\2\u045f\u045e\3\2\2\2\u045f\u0460\3\2\2\2\u0460"+
		"\u0461\3\2\2\2\u0461\u0462\7k\2\2\u0462\u0477\5X-\2\u0463\u0464\7\u008e"+
		"\2\2\u0464\u0477\5X-\2\u0465\u0466\7.\2\2\u0466\u0467\7\5\2\2\u0467\u0468"+
		"\5Z.\2\u0468\u0469\7\6\2\2\u0469\u0477\3\2\2\2\u046a\u0471\7;\2\2\u046b"+
		"\u0472\5~@\2\u046c\u0472\5\u0080A\2\u046d\u046e\7\5\2\2\u046e\u046f\5"+
		"Z.\2\u046f\u0470\7\6\2\2\u0470\u0472\3\2\2\2\u0471\u046b\3\2\2\2\u0471"+
		"\u046c\3\2\2\2\u0471\u046d\3\2\2\2\u0472\u0477\3\2\2\2\u0473\u0474\7/"+
		"\2\2\u0474\u0477\5\u009aN\2\u0475\u0477\5\\/\2\u0476\u0455\3\2\2\2\u0476"+
		"\u045f\3\2\2\2\u0476\u0463\3\2\2\2\u0476\u0465\3\2\2\2\u0476\u046a\3\2"+
		"\2\2\u0476\u0473\3\2\2\2\u0476\u0475\3\2\2\2\u0477W\3\2\2\2\u0478\u0479"+
		"\7n\2\2\u0479\u047a\7\62\2\2\u047a\u047c\t\b\2\2\u047b\u0478\3\2\2\2\u047b"+
		"\u047c\3\2\2\2\u047cY\3\2\2\2\u047d\u047e\b.\1\2\u047e\u04ca\5\u0080A"+
		"\2\u047f\u04ca\7\u009c\2\2\u0480\u0481\5\u0090I\2\u0481\u0482\7\4\2\2"+
		"\u0482\u0484\3\2\2\2\u0483\u0480\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485"+
		"\3\2\2\2\u0485\u0486\5\u0092J\2\u0486\u0487\7\4\2\2\u0487\u0489\3\2\2"+
		"\2\u0488\u0483\3\2\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u04ca"+
		"\5\u0098M\2\u048b\u048c\5\u0082B\2\u048c\u048d\5Z.\27\u048d\u04ca\3\2"+
		"\2\2\u048e\u048f\5\u008eH\2\u048f\u049c\7\5\2\2\u0490\u0492\7A\2\2\u0491"+
		"\u0490\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0498\5Z"+
		".\2\u0494\u0495\7\7\2\2\u0495\u0497\5Z.\2\u0496\u0494\3\2\2\2\u0497\u049a"+
		"\3\2\2\2\u0498\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049d\3\2\2\2\u049a"+
		"\u0498\3\2\2\2\u049b\u049d\7\t\2\2\u049c\u0491\3\2\2\2\u049c\u049b\3\2"+
		"\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\7\6\2\2\u049f"+
		"\u04ca\3\2\2\2\u04a0\u04a1\7\5\2\2\u04a1\u04a2\5Z.\2\u04a2\u04a3\7\6\2"+
		"\2\u04a3\u04ca\3\2\2\2\u04a4\u04a5\7-\2\2\u04a5\u04a6\7\5\2\2\u04a6\u04a7"+
		"\5Z.\2\u04a7\u04a8\7#\2\2\u04a8\u04a9\5T+\2\u04a9\u04aa\7\6\2\2\u04aa"+
		"\u04ca\3\2\2\2\u04ab\u04ad\7i\2\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3\2"+
		"\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04b0\7I\2\2\u04af\u04ac\3\2\2\2\u04af"+
		"\u04b0\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\7\5\2\2\u04b2\u04b3\5H"+
		"%\2\u04b3\u04b4\7\6\2\2\u04b4\u04ca\3\2\2\2\u04b5\u04b7\7,\2\2\u04b6\u04b8"+
		"\5Z.\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04be\3\2\2\2\u04b9"+
		"\u04ba\7\u0096\2\2\u04ba\u04bb\5Z.\2\u04bb\u04bc\7\u0089\2\2\u04bc\u04bd"+
		"\5Z.\2\u04bd\u04bf\3\2\2\2\u04be\u04b9\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0"+
		"\u04be\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c3\7D"+
		"\2\2\u04c3\u04c5\5Z.\2\u04c4\u04c2\3\2\2\2\u04c4\u04c5\3\2\2\2\u04c5\u04c6"+
		"\3\2\2\2\u04c6\u04c7\7E\2\2\u04c7\u04ca\3\2\2\2\u04c8\u04ca\5^\60\2\u04c9"+
		"\u047d\3\2\2\2\u04c9\u047f\3\2\2\2\u04c9\u0488\3\2\2\2\u04c9\u048b\3\2"+
		"\2\2\u04c9\u048e\3\2\2\2\u04c9\u04a0\3\2\2\2\u04c9\u04a4\3\2\2\2\u04c9"+
		"\u04af\3\2\2\2\u04c9\u04b5\3\2\2\2\u04c9\u04c8\3\2\2\2\u04ca\u052f\3\2"+
		"\2\2\u04cb\u04cc\f\26\2\2\u04cc\u04cd\7\r\2\2\u04cd\u052e\5Z.\27\u04ce"+
		"\u04cf\f\25\2\2\u04cf\u04d0\t\t\2\2\u04d0\u052e\5Z.\26\u04d1\u04d2\f\24"+
		"\2\2\u04d2\u04d3\t\n\2\2\u04d3\u052e\5Z.\25\u04d4\u04d5\f\23\2\2\u04d5"+
		"\u04d6\t\13\2\2\u04d6\u052e\5Z.\24\u04d7\u04d8\f\22\2\2\u04d8\u04d9\t"+
		"\f\2\2\u04d9\u052e\5Z.\23\u04da\u04e7\f\21\2\2\u04db\u04e8\7\b\2\2\u04dc"+
		"\u04e8\7\30\2\2\u04dd\u04e8\7\31\2\2\u04de\u04e8\7\32\2\2\u04df\u04e8"+
		"\7_\2\2\u04e0\u04e1\7_\2\2\u04e1\u04e8\7i\2\2\u04e2\u04e8\7V\2\2\u04e3"+
		"\u04e8\7d\2\2\u04e4\u04e8\7P\2\2\u04e5\u04e8\7f\2\2\u04e6\u04e8\7y\2\2"+
		"\u04e7\u04db\3\2\2\2\u04e7\u04dc\3\2\2\2\u04e7\u04dd\3\2\2\2\u04e7\u04de"+
		"\3\2\2\2\u04e7\u04df\3\2\2\2\u04e7\u04e0\3\2\2\2\u04e7\u04e2\3\2\2\2\u04e7"+
		"\u04e3\3\2\2\2\u04e7\u04e4\3\2\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e6\3\2"+
		"\2\2\u04e8\u04e9\3\2\2\2\u04e9\u052e\5Z.\22\u04ea\u04eb\f\20\2\2\u04eb"+
		"\u04ec\7\"\2\2\u04ec\u052e\5Z.\21\u04ed\u04ee\f\17\2\2\u04ee\u04ef\7o"+
		"\2\2\u04ef\u052e\5Z.\20\u04f0\u04f1\f\b\2\2\u04f1\u04f3\7_\2\2\u04f2\u04f4"+
		"\7i\2\2\u04f3\u04f2\3\2\2\2\u04f3\u04f4\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5"+
		"\u052e\5Z.\t\u04f6\u04f8\f\7\2\2\u04f7\u04f9\7i\2\2\u04f8\u04f7\3\2\2"+
		"\2\u04f8\u04f9\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fb\7)\2\2\u04fb\u04fc"+
		"\5Z.\2\u04fc\u04fd\7\"\2\2\u04fd\u04fe\5Z.\b\u04fe\u052e\3\2\2\2\u04ff"+
		"\u0500\f\13\2\2\u0500\u0501\7/\2\2\u0501\u052e\5\u009aN\2\u0502\u0504"+
		"\f\n\2\2\u0503\u0505\7i\2\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u0506\3\2\2\2\u0506\u0507\t\r\2\2\u0507\u050a\5Z.\2\u0508\u0509\7F\2"+
		"\2\u0509\u050b\5Z.\2\u050a\u0508\3\2\2\2\u050a\u050b\3\2\2\2\u050b\u052e"+
		"\3\2\2\2\u050c\u0511\f\t\2\2\u050d\u0512\7`\2\2\u050e\u0512\7j\2\2\u050f"+
		"\u0510\7i\2\2\u0510\u0512\7k\2\2\u0511\u050d\3\2\2\2\u0511\u050e\3\2\2"+
		"\2\u0511\u050f\3\2\2\2\u0512\u052e\3\2\2\2\u0513\u0515\f\6\2\2\u0514\u0516"+
		"\7i\2\2\u0515\u0514\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0517\3\2\2\2\u0517"+
		"\u052b\7V\2\2\u0518\u0522\7\5\2\2\u0519\u0523\5H%\2\u051a\u051f\5Z.\2"+
		"\u051b\u051c\7\7\2\2\u051c\u051e\5Z.\2\u051d\u051b\3\2\2\2\u051e\u0521"+
		"\3\2\2\2\u051f\u051d\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0523\3\2\2\2\u0521"+
		"\u051f\3\2\2\2\u0522\u0519\3\2\2\2\u0522\u051a\3\2\2\2\u0522\u0523\3\2"+
		"\2\2\u0523\u0524\3\2\2\2\u0524\u052c\7\6\2\2\u0525\u0526\5\u0090I\2\u0526"+
		"\u0527\7\4\2\2\u0527\u0529\3\2\2\2\u0528\u0525\3\2\2\2\u0528\u0529\3\2"+
		"\2\2\u0529\u052a\3\2\2\2\u052a\u052c\5\u0092J\2\u052b\u0518\3\2\2\2\u052b"+
		"\u0528\3\2\2\2\u052c\u052e\3\2\2\2\u052d\u04cb\3\2\2\2\u052d\u04ce\3\2"+
		"\2\2\u052d\u04d1\3\2\2\2\u052d\u04d4\3\2\2\2\u052d\u04d7\3\2\2\2\u052d"+
		"\u04da\3\2\2\2\u052d\u04ea\3\2\2\2\u052d\u04ed\3\2\2\2\u052d\u04f0\3\2"+
		"\2\2\u052d\u04f6\3\2\2\2\u052d\u04ff\3\2\2\2\u052d\u0502\3\2\2\2\u052d"+
		"\u050c\3\2\2\2\u052d\u0513\3\2\2\2\u052e\u0531\3\2\2\2\u052f\u052d\3\2"+
		"\2\2\u052f\u0530\3\2\2\2\u0530[\3\2\2\2\u0531\u052f\3\2\2\2\u0532\u0533"+
		"\7x\2\2\u0533\u053f\5\u009cO\2\u0534\u0535\7\5\2\2\u0535\u053a\5\u0098"+
		"M\2\u0536\u0537\7\7\2\2\u0537\u0539\5\u0098M\2\u0538\u0536\3\2\2\2\u0539"+
		"\u053c\3\2\2\2\u053a\u0538\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u053d\3\2"+
		"\2\2\u053c\u053a\3\2\2\2\u053d\u053e\7\6\2\2\u053e\u0540\3\2\2\2\u053f"+
		"\u0534\3\2\2\2\u053f\u0540\3\2\2\2\u0540\u0553\3\2\2\2\u0541\u0542\7n"+
		"\2\2\u0542\u054b\t\16\2\2\u0543\u0544\7\u0084\2\2\u0544\u054c\7k\2\2\u0545"+
		"\u0546\7\u0084\2\2\u0546\u054c\7;\2\2\u0547\u054c\7+\2\2\u0548\u054c\7"+
		"~\2\2\u0549\u054a\7h\2\2\u054a\u054c\7\34\2\2\u054b\u0543\3\2\2\2\u054b"+
		"\u0545\3\2\2\2\u054b\u0547\3\2\2\2\u054b\u0548\3\2\2\2\u054b\u0549\3\2"+
		"\2\2\u054c\u0550\3\2\2\2\u054d\u054e\7f\2\2\u054e\u0550\5\u008cG\2\u054f"+
		"\u0541\3\2\2\2\u054f\u054d\3\2\2\2\u0550\u0552\3\2\2\2\u0551\u054f\3\2"+
		"\2\2\u0552\u0555\3\2\2\2\u0553\u0551\3\2\2\2\u0553\u0554\3\2\2\2\u0554"+
		"\u0560\3\2\2\2\u0555\u0553\3\2\2\2\u0556\u0558\7i\2\2\u0557\u0556\3\2"+
		"\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2\2\2\u0559\u055e\7<\2\2\u055a"+
		"\u055b\7Y\2\2\u055b\u055f\7=\2\2\u055c\u055d\7Y\2\2\u055d\u055f\7U\2\2"+
		"\u055e\u055a\3\2\2\2\u055e\u055c\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0561"+
		"\3\2\2\2\u0560\u0557\3\2\2\2\u0560\u0561\3\2\2\2\u0561]\3\2\2\2\u0562"+
		"\u0563\7v\2\2\u0563\u0568\7\5\2\2\u0564\u0569\7T\2\2\u0565\u0566\t\17"+
		"\2\2\u0566\u0567\7\7\2\2\u0567\u0569\5\u0084C\2\u0568\u0564\3\2\2\2\u0568"+
		"\u0565\3\2\2\2\u0569\u056a\3\2\2\2\u056a\u056b\7\6\2\2\u056b_\3\2\2\2"+
		"\u056c\u056f\5\u0098M\2\u056d\u056e\7/\2\2\u056e\u0570\5\u009aN\2\u056f"+
		"\u056d\3\2\2\2\u056f\u0570\3\2\2\2\u0570\u0572\3\2\2\2\u0571\u0573\t\7"+
		"\2\2\u0572\u0571\3\2\2\2\u0572\u0573\3\2\2\2\u0573a\3\2\2\2\u0574\u0575"+
		"\7\63\2\2\u0575\u0577\5\u008cG\2\u0576\u0574\3\2\2\2\u0576\u0577\3\2\2"+
		"\2\u0577\u059c\3\2\2\2\u0578\u0579\7t\2\2\u0579\u057c\7b\2\2\u057a\u057c"+
		"\7\u008e\2\2\u057b\u0578\3\2\2\2\u057b\u057a\3\2\2\2\u057c\u057d\3\2\2"+
		"\2\u057d\u057e\7\5\2\2\u057e\u0583\5`\61\2\u057f\u0580\7\7\2\2\u0580\u0582"+
		"\5`\61\2\u0581\u057f\3\2\2\2\u0582\u0585\3\2\2\2\u0583\u0581\3\2\2\2\u0583"+
		"\u0584\3\2\2\2\u0584\u0586\3\2\2\2\u0585\u0583\3\2\2\2\u0586\u0587\7\6"+
		"\2\2\u0587\u0588\5X-\2\u0588\u059d\3\2\2\2\u0589\u058a\7.\2\2\u058a\u058b"+
		"\7\5\2\2\u058b\u058c\5Z.\2\u058c\u058d\7\6\2\2\u058d\u059d\3\2\2\2\u058e"+
		"\u058f\7M\2\2\u058f\u0590\7b\2\2\u0590\u0591\7\5\2\2\u0591\u0596\5\u0098"+
		"M\2\u0592\u0593\7\7\2\2\u0593\u0595\5\u0098M\2\u0594\u0592\3\2\2\2\u0595"+
		"\u0598\3\2\2\2\u0596\u0594\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0599\3\2"+
		"\2\2\u0598\u0596\3\2\2\2\u0599\u059a\7\6\2\2\u059a\u059b\5\\/\2\u059b"+
		"\u059d\3\2\2\2\u059c\u057b\3\2\2\2\u059c\u0589\3\2\2\2\u059c\u058e\3\2"+
		"\2\2\u059dc\3\2\2\2\u059e\u05a0\7\u0098\2\2\u059f\u05a1\7w\2\2\u05a0\u059f"+
		"\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u05a3\5|?\2\u05a3"+
		"\u05a4\7#\2\2\u05a4\u05a5\7\5\2\2\u05a5\u05a6\5H%\2\u05a6\u05b0\7\6\2"+
		"\2\u05a7\u05a8\7\7\2\2\u05a8\u05a9\5|?\2\u05a9\u05aa\7#\2\2\u05aa\u05ab"+
		"\7\5\2\2\u05ab\u05ac\5H%\2\u05ac\u05ad\7\6\2\2\u05ad\u05af\3\2\2\2\u05ae"+
		"\u05a7\3\2\2\2\u05af\u05b2\3\2\2\2\u05b0\u05ae\3\2\2\2\u05b0\u05b1\3\2"+
		"\2\2\u05b1e\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b3\u05b4\5\u0090I\2\u05b4\u05b5"+
		"\7\4\2\2\u05b5\u05b7\3\2\2\2\u05b6\u05b3\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7"+
		"\u05b8\3\2\2\2\u05b8\u05be\5\u0092J\2\u05b9\u05ba\7X\2\2\u05ba\u05bb\7"+
		"*\2\2\u05bb\u05bf\5\u009eP\2\u05bc\u05bd\7i\2\2\u05bd\u05bf\7X\2\2\u05be"+
		"\u05b9\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bfg\3\2\2\2"+
		"\u05c0\u05c3\5Z.\2\u05c1\u05c2\7/\2\2\u05c2\u05c4\5\u009aN\2\u05c3\u05c1"+
		"\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c6\3\2\2\2\u05c5\u05c7\t\7\2\2\u05c6"+
		"\u05c5\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7i\3\2\2\2\u05c8\u05cc\5~@\2\u05c9"+
		"\u05cc\5\u008cG\2\u05ca\u05cc\7\u009d\2\2\u05cb\u05c8\3\2\2\2\u05cb\u05c9"+
		"\3\2\2\2\u05cb\u05ca\3\2\2\2\u05cck\3\2\2\2\u05cd\u05d9\5\u0092J\2\u05ce"+
		"\u05cf\7\5\2\2\u05cf\u05d4\5\u0098M\2\u05d0\u05d1\7\7\2\2\u05d1\u05d3"+
		"\5\u0098M\2\u05d2\u05d0\3\2\2\2\u05d3\u05d6\3\2\2\2\u05d4\u05d2\3\2\2"+
		"\2\u05d4\u05d5\3\2\2\2\u05d5\u05d7\3\2\2\2\u05d6\u05d4\3\2\2\2\u05d7\u05d8"+
		"\7\6\2\2\u05d8\u05da\3\2\2\2\u05d9\u05ce\3\2\2\2\u05d9\u05da\3\2\2\2\u05da"+
		"\u05db\3\2\2\2\u05db\u05dc\7#\2\2\u05dc\u05dd\7\5\2\2\u05dd\u05de\5H%"+
		"\2\u05de\u05df\7\6\2\2\u05dfm\3\2\2\2\u05e0\u05ed\7\t\2\2\u05e1\u05e2"+
		"\5\u0092J\2\u05e2\u05e3\7\4\2\2\u05e3\u05e4\7\t\2\2\u05e4\u05ed\3\2\2"+
		"\2\u05e5\u05ea\5Z.\2\u05e6\u05e8\7#\2\2\u05e7\u05e6\3\2\2\2\u05e7\u05e8"+
		"\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9\u05eb\5\u0088E\2\u05ea\u05e7\3\2\2"+
		"\2\u05ea\u05eb\3\2\2\2\u05eb\u05ed\3\2\2\2\u05ec\u05e0\3\2\2\2\u05ec\u05e1"+
		"\3\2\2\2\u05ec\u05e5\3\2\2\2\u05edo\3\2\2\2\u05ee\u05ef\5\u0090I\2\u05ef"+
		"\u05f0\7\4\2\2\u05f0\u05f2\3\2\2\2\u05f1\u05ee\3\2\2\2\u05f1\u05f2\3\2"+
		"\2\2\u05f2\u05f3\3\2\2\2\u05f3\u05f8\5\u0092J\2\u05f4\u05f6\7#\2\2\u05f5"+
		"\u05f4\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\5\u00aa"+
		"V\2\u05f8\u05f5\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9\u05ff\3\2\2\2\u05fa"+
		"\u05fb\7X\2\2\u05fb\u05fc\7*\2\2\u05fc\u0600\5\u009eP\2\u05fd\u05fe\7"+
		"i\2\2\u05fe\u0600\7X\2\2\u05ff\u05fa\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff"+
		"\u0600\3\2\2\2\u0600\u061e\3\2\2\2\u0601\u060b\7\5\2\2\u0602\u0607\5p"+
		"9\2\u0603\u0604\7\7\2\2\u0604\u0606\5p9\2\u0605\u0603\3\2\2\2\u0606\u0609"+
		"\3\2\2\2\u0607\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u060c\3\2\2\2\u0609"+
		"\u0607\3\2\2\2\u060a\u060c\5r:\2\u060b\u0602\3\2\2\2\u060b\u060a\3\2\2"+
		"\2\u060c\u060d\3\2\2\2\u060d\u0612\7\6\2\2\u060e\u0610\7#\2\2\u060f\u060e"+
		"\3\2\2\2\u060f\u0610\3\2\2\2\u0610\u0611\3\2\2\2\u0611\u0613\5\u00aaV"+
		"\2\u0612\u060f\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u061e\3\2\2\2\u0614\u0615"+
		"\7\5\2\2\u0615\u0616\5H%\2\u0616\u061b\7\6\2\2\u0617\u0619\7#\2\2\u0618"+
		"\u0617\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061c\5\u00aa"+
		"V\2\u061b\u0618\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061e\3\2\2\2\u061d"+
		"\u05f1\3\2\2\2\u061d\u0601\3\2\2\2\u061d\u0614\3\2\2\2\u061eq\3\2\2\2"+
		"\u061f\u0626\5p9\2\u0620\u0621\5t;\2\u0621\u0622\5p9\2\u0622\u0623\5v"+
		"<\2\u0623\u0625\3\2\2\2\u0624\u0620\3\2\2\2\u0625\u0628\3\2\2\2\u0626"+
		"\u0624\3\2\2\2\u0626\u0627\3\2\2\2\u0627s\3\2\2\2\u0628\u0626\3\2\2\2"+
		"\u0629\u0637\7\7\2\2\u062a\u062c\7g\2\2\u062b\u062a\3\2\2\2\u062b\u062c"+
		"\3\2\2\2\u062c\u0633\3\2\2\2\u062d\u062f\7c\2\2\u062e\u0630\7q\2\2\u062f"+
		"\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0634\3\2\2\2\u0631\u0634\7Z"+
		"\2\2\u0632\u0634\7\65\2\2\u0633\u062d\3\2\2\2\u0633\u0631\3\2\2\2\u0633"+
		"\u0632\3\2\2\2\u0633\u0634\3\2\2\2\u0634\u0635\3\2\2\2\u0635\u0637\7a"+
		"\2\2\u0636\u0629\3\2\2\2\u0636\u062b\3\2\2\2\u0637u\3\2\2\2\u0638\u0639"+
		"\7n\2\2\u0639\u0647\5Z.\2\u063a\u063b\7\u0091\2\2\u063b\u063c\7\5\2\2"+
		"\u063c\u0641\5\u0098M\2\u063d\u063e\7\7\2\2\u063e\u0640\5\u0098M\2\u063f"+
		"\u063d\3\2\2\2\u0640\u0643\3\2\2\2\u0641\u063f\3\2\2\2\u0641\u0642\3\2"+
		"\2\2\u0642\u0644\3\2\2\2\u0643\u0641\3\2\2\2\u0644\u0645\7\6\2\2\u0645"+
		"\u0647\3\2\2\2\u0646\u0638\3\2\2\2\u0646\u063a\3\2\2\2\u0646\u0647\3\2"+
		"\2\2\u0647w\3\2\2\2\u0648\u064a\7\u0083\2\2\u0649\u064b\t\6\2\2\u064a"+
		"\u0649\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u0651\5n"+
		"8\2\u064d\u064e\7\7\2\2\u064e\u0650\5n8\2\u064f\u064d\3\2\2\2\u0650\u0653"+
		"\3\2\2\2\u0651\u064f\3\2\2\2\u0651\u0652\3\2\2\2\u0652\u0660\3\2\2\2\u0653"+
		"\u0651\3\2\2\2\u0654\u065e\7N\2\2\u0655\u065a\5p9\2\u0656\u0657\7\7\2"+
		"\2\u0657\u0659\5p9\2\u0658\u0656\3\2\2\2\u0659\u065c\3\2\2\2\u065a\u0658"+
		"\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065f\3\2\2\2\u065c\u065a\3\2\2\2\u065d"+
		"\u065f\5r:\2\u065e\u0655\3\2\2\2\u065e\u065d\3\2\2\2\u065f\u0661\3\2\2"+
		"\2\u0660\u0654\3\2\2\2\u0660\u0661\3\2\2\2\u0661\u0664\3\2\2\2\u0662\u0663"+
		"\7\u0097\2\2\u0663\u0665\5Z.\2\u0664\u0662\3\2\2\2\u0664\u0665\3\2\2\2"+
		"\u0665\u0674\3\2\2\2\u0666\u0667\7Q\2\2\u0667\u0668\7*\2\2\u0668\u066d"+
		"\5Z.\2\u0669\u066a\7\7\2\2\u066a\u066c\5Z.\2\u066b\u0669\3\2\2\2\u066c"+
		"\u066f\3\2\2\2\u066d\u066b\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u0672\3\2"+
		"\2\2\u066f\u066d\3\2\2\2\u0670\u0671\7R\2\2\u0671\u0673\5Z.\2\u0672\u0670"+
		"\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u0675\3\2\2\2\u0674\u0666\3\2\2\2\u0674"+
		"\u0675\3\2\2\2\u0675\u0693\3\2\2\2\u0676\u0677\7\u0093\2\2\u0677\u0678"+
		"\7\5\2\2\u0678\u067d\5Z.\2\u0679\u067a\7\7\2\2\u067a\u067c\5Z.\2\u067b"+
		"\u0679\3\2\2\2\u067c\u067f\3\2\2\2\u067d\u067b\3\2\2\2\u067d\u067e\3\2"+
		"\2\2\u067e\u0680\3\2\2\2\u067f\u067d\3\2\2\2\u0680\u068f\7\6\2\2\u0681"+
		"\u0682\7\7\2\2\u0682\u0683\7\5\2\2\u0683\u0688\5Z.\2\u0684\u0685\7\7\2"+
		"\2\u0685\u0687\5Z.\2\u0686\u0684\3\2\2\2\u0687\u068a\3\2\2\2\u0688\u0686"+
		"\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068b\3\2\2\2\u068a\u0688\3\2\2\2\u068b"+
		"\u068c\7\6\2\2\u068c\u068e\3\2\2\2\u068d\u0681\3\2\2\2\u068e\u0691\3\2"+
		"\2\2\u068f\u068d\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u0693\3\2\2\2\u0691"+
		"\u068f\3\2\2\2\u0692\u0648\3\2\2\2\u0692\u0676\3\2\2\2\u0693y\3\2\2\2"+
		"\u0694\u069a\7\u008d\2\2\u0695\u0696\7\u008d\2\2\u0696\u069a\7\37\2\2"+
		"\u0697\u069a\7]\2\2\u0698\u069a\7G\2\2\u0699\u0694\3\2\2\2\u0699\u0695"+
		"\3\2\2\2\u0699\u0697\3\2\2\2\u0699\u0698\3\2\2\2\u069a{\3\2\2\2\u069b"+
		"\u06a7\5\u0092J\2\u069c\u069d\7\5\2\2\u069d\u06a2\5\u0098M\2\u069e\u069f"+
		"\7\7\2\2\u069f\u06a1\5\u0098M\2\u06a0\u069e\3\2\2\2\u06a1\u06a4\3\2\2"+
		"\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2\2\2\u06a3\u06a5\3\2\2\2\u06a4\u06a2"+
		"\3\2\2\2\u06a5\u06a6\7\6\2\2\u06a6\u06a8\3\2\2\2\u06a7\u069c\3\2\2\2\u06a7"+
		"\u06a8\3\2\2\2\u06a8}\3\2\2\2\u06a9\u06ab\t\n\2\2\u06aa\u06a9\3\2\2\2"+
		"\u06aa\u06ab\3\2\2\2\u06ab\u06ac\3\2\2\2\u06ac\u06ad\7\u009b\2\2\u06ad"+
		"\177\3\2\2\2\u06ae\u06af\t\20\2\2\u06af\u0081\3\2\2\2\u06b0\u06b1\t\21"+
		"\2\2\u06b1\u0083\3\2\2\2\u06b2\u06b3\7\u009d\2\2\u06b3\u0085\3\2\2\2\u06b4"+
		"\u06b7\5Z.\2\u06b5\u06b7\5R*\2\u06b6\u06b4\3\2\2\2\u06b6\u06b5\3\2\2\2"+
		"\u06b7\u0087\3\2\2\2\u06b8\u06b9\t\22\2\2\u06b9\u0089\3\2\2\2\u06ba\u06bb"+
		"\t\23\2\2\u06bb\u008b\3\2\2\2\u06bc\u06bd\5\u00aeX\2\u06bd\u008d\3\2\2"+
		"\2\u06be\u06bf\5\u00aeX\2\u06bf\u008f\3\2\2\2\u06c0\u06c1\5\u00aeX\2\u06c1"+
		"\u0091\3\2\2\2\u06c2\u06c3\5\u00aeX\2\u06c3\u0093\3\2\2\2\u06c4\u06c5"+
		"\5\u00aeX\2\u06c5\u0095\3\2\2\2\u06c6\u06c7\5\u00aeX\2\u06c7\u0097\3\2"+
		"\2\2\u06c8\u06c9\5\u00aeX\2\u06c9\u0099\3\2\2\2\u06ca\u06cb\5\u00aeX\2"+
		"\u06cb\u009b\3\2\2\2\u06cc\u06cd\5\u00aeX\2\u06cd\u009d\3\2\2\2\u06ce"+
		"\u06cf\5\u00aeX\2\u06cf\u009f\3\2\2\2\u06d0\u06d1\5\u00aeX\2\u06d1\u00a1"+
		"\3\2\2\2\u06d2\u06d3\5\u00aeX\2\u06d3\u00a3\3\2\2\2\u06d4\u06d5\5\u00ae"+
		"X\2\u06d5\u00a5\3\2\2\2\u06d6\u06d7\5\u00aeX\2\u06d7\u00a7\3\2\2\2\u06d8"+
		"\u06d9\5\u00aeX\2\u06d9\u00a9\3\2\2\2\u06da\u06db\5\u00aeX\2\u06db\u00ab"+
		"\3\2\2\2\u06dc\u06dd\5\u00aeX\2\u06dd\u00ad\3\2\2\2\u06de\u06e6\7\u009a"+
		"\2\2\u06df\u06e6\5\u008aF\2\u06e0\u06e6\7\u009d\2\2\u06e1\u06e2\7\5\2"+
		"\2\u06e2\u06e3\5\u00aeX\2\u06e3\u06e4\7\6\2\2\u06e4\u06e6\3\2\2\2\u06e5"+
		"\u06de\3\2\2\2\u06e5\u06df\3\2\2\2\u06e5\u06e0\3\2\2\2\u06e5\u06e1\3\2"+
		"\2\2\u06e6\u00af\3\2\2\2\u00f6\u00b2\u00b4\u00bf\u00c6\u00cb\u00d1\u00d7"+
		"\u00d9\u00fe\u0118\u0120\u0123\u012c\u0130\u0138\u013c\u013e\u0143\u0145"+
		"\u0149\u0150\u0153\u0158\u015c\u0161\u016a\u016d\u0173\u0175\u0179\u017f"+
		"\u0184\u018f\u0195\u0199\u019f\u01a4\u01ad\u01b4\u01ba\u01be\u01c2\u01c8"+
		"\u01cd\u01d4\u01df\u01e2\u01e4\u01ea\u01f0\u01f4\u01fb\u0201\u0207\u020d"+
		"\u0212\u021e\u0223\u022e\u0233\u0236\u023d\u0240\u0247\u0250\u0253\u0259"+
		"\u025b\u025f\u0267\u026c\u0274\u0279\u0281\u0286\u028e\u0293\u0299\u02a0"+
		"\u02a3\u02ab\u02b5\u02b8\u02be\u02c0\u02c3\u02d6\u02dc\u02e5\u02ea\u02f3"+
		"\u02fe\u0305\u030b\u0311\u031a\u0321\u0325\u0327\u032b\u0332\u0334\u0338"+
		"\u033b\u0342\u0349\u034c\u0356\u0359\u035f\u0361\u0365\u036c\u036f\u0377"+
		"\u0381\u0384\u038a\u038c\u0390\u0397\u03a0\u03a4\u03a6\u03aa\u03b3\u03b8"+
		"\u03ba\u03c3\u03ce\u03d5\u03d8\u03db\u03e8\u03f6\u03fb\u03fe\u040b\u0419"+
		"\u041e\u0427\u042a\u0430\u0432\u0438\u043d\u0443\u044f\u0453\u0458\u045c"+
		"\u045f\u0471\u0476\u047b\u0483\u0488\u0491\u0498\u049c\u04ac\u04af\u04b7"+
		"\u04c0\u04c4\u04c9\u04e7\u04f3\u04f8\u0504\u050a\u0511\u0515\u051f\u0522"+
		"\u0528\u052b\u052d\u052f\u053a\u053f\u054b\u054f\u0553\u0557\u055e\u0560"+
		"\u0568\u056f\u0572\u0576\u057b\u0583\u0596\u059c\u05a0\u05b0\u05b6\u05be"+
		"\u05c3\u05c6\u05cb\u05d4\u05d9\u05e7\u05ea\u05ec\u05f1\u05f5\u05f8\u05ff"+
		"\u0607\u060b\u060f\u0612\u0618\u061b\u061d\u0626\u062b\u062f\u0633\u0636"+
		"\u0641\u0646\u064a\u0651\u065a\u065e\u0660\u0664\u066d\u0672\u0674\u067d"+
		"\u0688\u068f\u0692\u0699\u06a2\u06a7\u06aa\u06b6\u06e5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}