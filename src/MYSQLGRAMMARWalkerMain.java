import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Test;

public class MYSQLGRAMMARWalkerMain {

	public static class MISQLGRAMMARMainListenerImpl extends
			MYSQLGRAMMARBaseListener {

		private Map<String, String> columns = new HashMap<String, String>();

		@Override
		public void enterColumn_name(
				@NotNull MYSQLGRAMMARParser.Column_nameContext ctx) {

		}

		@Override
		public void enterColumn_def(
				@NotNull MYSQLGRAMMARParser.Column_defContext ctx) {
			 System.out.println(ctx.getText());
			// System.out.println(ctx.getChildCount());
			String columnName = null;
			String typeName = null;
			for (int i = 0; i < ctx.getChildCount(); i++) {
				//System.out.println(ctx.getChild(i).getText());
				// System.out.println(ctx.getChild(i).getClass());
				if (ctx.getChild(i).getClass()
						.equals(MYSQLGRAMMARParser.Column_nameContext.class)) {
					// System.out
					// .println(MISQLGRAMMARParser.Column_nameContext.class);
					MYSQLGRAMMARParser.Column_nameContext nameCtx = null;

					nameCtx = (MYSQLGRAMMARParser.Column_nameContext) ctx
							.getChild(i);
					for (int ii = 0; ii < nameCtx.getChildCount(); ii++) {
						MYSQLGRAMMARParser.Any_nameContext anyNameCtx = (MYSQLGRAMMARParser.Any_nameContext) nameCtx
								.getChild(ii);
						for (int iii = 0; iii < anyNameCtx.getChildCount(); iii++) {

							if (org.antlr.v4.runtime.tree.TerminalNodeImpl.class
									.equals(anyNameCtx.getChild(iii).getClass())) {
//								System.out.println(anyNameCtx.getChild(iii)
//										.getText());
								columnName = anyNameCtx.getChild(iii).getText();
							}
						}

					}
				}

				if (ctx.getChild(i).getClass()
						.equals(MYSQLGRAMMARParser.Type_nameContext.class)) {
					// System.out
					// .println(MISQLGRAMMARParser.Type_nameContext.class);
					MYSQLGRAMMARParser.Type_nameContext typeNameCtx = null;

					typeNameCtx = (MYSQLGRAMMARParser.Type_nameContext) ctx
							.getChild(i);
					for (int j = 0; j < typeNameCtx.getChildCount(); j++) {
						if (MYSQLGRAMMARParser.NameContext.class
								.equals(typeNameCtx.getChild(j).getClass())) {
							MYSQLGRAMMARParser.NameContext nameCtx = (MYSQLGRAMMARParser.NameContext)typeNameCtx.getChild(j);
							//System.out.println(typeNameCtx.getChild(j).getClass());
							//typeName = typeNameCtx.getChild(j).getText();
							//System.out.println(typeNameCtx.getChild(j).getText());
							for(int jj = 0; jj < nameCtx.getChildCount(); jj++){
								
								typeName = nameCtx.getChild(jj).getText();
								//System.out.println(typeName);
							}
							
						}
					}
				}
			}

			if (null != typeName && null != columnName) {
				columns.put(columnName, typeName);
			}
		}

	}

	public static void main(String[] args) throws Exception {
		String inputFile = null;
		if (args.length > 0)
			inputFile = args[0];
		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);
		MYSQLGRAMMARLexer lexer = new MYSQLGRAMMARLexer(
				new ANTLRInputStream(is));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MYSQLGRAMMARParser parser = new MYSQLGRAMMARParser(tokens);
		parser.setBuildParseTree(true); // tell ANTLR to build a parse tree
		ParseTree tree = parser.create_table_stmt();

		ParseTreeWalker walker = new ParseTreeWalker();
		MISQLGRAMMARMainListenerImpl listener = new MISQLGRAMMARMainListenerImpl();
		walker.walk(listener, tree);
		System.out.println(listener.columns);
		//System.out.println(listener.columns.keySet());
		
		//System.out.println(listener.columns.values());
		
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		MYSQLGRAMMARWalkerMain walkerMain = new MYSQLGRAMMARWalkerMain();
		Map<String, String> columns = listener.columns;
		Map<String, String> jTypeMap = walkerMain.sqlTypeToJType(columns);
		System.out.println(jTypeMap);
		
		String bean = walkerMain.fieldToBean(jTypeMap, "Demo" );
		System.out.println(bean);
		
	}
	
	@Test
	public void testHandleSql() throws Exception{
		MYSQLGRAMMARWalkerMain walkerMain = new MYSQLGRAMMARWalkerMain();
		String output = "E:\\eclipseAntlr\\sql2beantool\\src\\";
		//E:\eclipseAntlr\sql2beantool\src
		walkerMain.handleSql("E:\\eclipseAntlr\\sql2beantool\\src\\create.sql", output, "Demo");
		
	}
	
	public void handleSql(String inputFile, String output, String beanName)  throws Exception{
		output = output + "\\" + beanName + ".java";
		InputStream is =  new FileInputStream(inputFile);
		MYSQLGRAMMARLexer lexer = new MYSQLGRAMMARLexer(
				new ANTLRInputStream(is));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MYSQLGRAMMARParser parser = new MYSQLGRAMMARParser(tokens);
		parser.setBuildParseTree(true); // tell ANTLR to build a parse tree
		ParseTree tree = parser.create_table_stmt();

		ParseTreeWalker walker = new ParseTreeWalker();
		MISQLGRAMMARMainListenerImpl listener = new MISQLGRAMMARMainListenerImpl();
		walker.walk(listener, tree);
		System.out.println(listener.columns);
		//System.out.println(listener.columns.keySet());
		
		//System.out.println(listener.columns.values());
		
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		//MYSQLGRAMMARWalkerMain walkerMain = new MYSQLGRAMMARWalkerMain();
		Map<String, String> columns = listener.columns;
		Map<String, String> jTypeMap = sqlTypeToJType(columns);
		System.out.println(jTypeMap);
		
		String bean = fieldToBean(jTypeMap, beanName);
		System.out.println(bean);
		
		OutputStream os = new FileOutputStream(output);
		
		
		File file = new File(output);
		
		if(file.exists()){
			file.delete();
		}
		os.write(bean.getBytes());
		
		os.close();
		
	}
	
	
	/*
	 * 输入：name:type
	 * 输出：
	 * */
	public Map<String, String> sqlTypeToJType(Map<String, String> inputSqlFiled){
		Map<String, String> beanFiledMap = new HashMap<String, String>();
		//sql 类型转java 类型
		for(Map.Entry<String ,String> entry : inputSqlFiled.entrySet()){
			String field = entry.getKey();
			String sqlType = entry.getValue();
			String jType = TypeMap.typeMap.get(sqlType.toUpperCase());
			//对字段的下划线处理，并生成 bean 格式的 字段
			field =  field.replaceAll("`", "");
			field = handleFild(field);
			
			beanFiledMap.put(field, jType);
		}
		
		return beanFiledMap;
	}
	
	public Map<String, String> genDbBeanFieldMap(Map<String, String> inputSqlFiled){
		Map<String, String> dbBeanMap = new HashMap<String, String>();
		//sql 类型转java 类型
		for(Map.Entry<String ,String> entry : inputSqlFiled.entrySet()){
			String field = entry.getKey();
			String sqlType = entry.getValue();
			
			//对字段的下划线处理，并生成 bean 格式的 字段
			field =  field.replaceAll("`", "");
			String newField = handleFild(field);
			//根据db field 生成java bean field
			
			//db:bean
			dbBeanMap.put(field, newField);
		}
		
		return dbBeanMap;
		
	}
	
	// db 字段转 为bean field
	public String handleFild(String field){
		String [] fildParts = field.split("_");
		String newFiled = "";
		for(String part : fildParts){
			//首字母大写
			String lowField = part.toLowerCase();
			String  firstUpField = lowField.substring(0, 1).toUpperCase() + lowField.substring(1);
			
			newFiled = newFiled + firstUpField;
		}
		//字段的首字母小写
		newFiled = newFiled.substring(0,  1).toLowerCase() +  newFiled.substring(1);
		
		return newFiled;
	}
	
	public String fieldToBean(Map<String, String> filedMap, String beanName){
		String beanClassStmt = "";
		String fieldStmtTotal = "";
		String methodStmtTotal = "";
		String decl = "public class " + beanName  + SPACE  + "{\n";
		
		for(Map.Entry<String, String> entry : filedMap.entrySet()){
			String field = entry.getKey();
			String type = entry.getValue();
			
			String  fieldStmt = genFieldStmt(field, type);
			String  getMethod = genGetMethod(field, type);
			String 	setMethod = genSetMethod(field, type);
			
			String methodStmt = getMethod + setMethod;
			
			fieldStmtTotal = fieldStmtTotal + fieldStmt;
			methodStmtTotal = methodStmtTotal + methodStmt;
			
		}
		beanClassStmt = decl + fieldStmtTotal + methodStmtTotal;
		
		String end = RBRACE + NEWLINE;
		return beanClassStmt + end;
	}
	
	public String genFieldStmt(String field, String type){
		String stmt = genXSpace(4) + "private" + SPACE + type + SPACE + field + ";\n";
		
		return stmt;
	}
	
	public String genGetMethod(String field, String type){
		//首字母大写
		String  upFirstField = field.substring(0, 1).toUpperCase() + field.substring(1);
		
		String decl = genXSpace(4) + "public" +  SPACE  + type + SPACE +  "get" + upFirstField + LBRACKET +  RBRACKET + LBRACE + NEWLINE;
		String body = genXSpace(8) + "return  this." + field + ";" + NEWLINE;
		String getMethod = decl + body + genXSpace(4) + RBRACE + NEWLINE;
		return getMethod;
	}
	
	public String genSetMethod(String field, String type){
		String  upFirstField = field.substring(0, 1).toUpperCase() + field.substring(1);
		
		String setMethod = genXSpace(4) + "public" +  SPACE  + "void" + SPACE +  "set" + upFirstField + 
				LBRACKET + type + SPACE + field  + RBRACKET ;
		setMethod = setMethod + LBRACE + "\n";
		String body = genXSpace(8) + "this." + field + " = " + field + ";\n";
		
		setMethod = setMethod + body ;
		setMethod = setMethod + genXSpace(4) + RBRACE + NEWLINE;
		return setMethod;
	}
	
	public String genXSpace(Integer num){
		StringBuilder space = new StringBuilder();
		for(int i =0; i < num.intValue(); i++ ){
			space = space.append(SPACE);
		}
		
		return space.toString();
	}
	
	
	public static String SPACE = " ";
	public static String PUBLIC = "public";
	public static String LBRACKET = "(";
	public static String RBRACKET = ")";
	public static String LBRACE = "{";
	public static String RBRACE = "}";
	public static String NEWLINE = "\n";
	
	public static String SEMICOLON = ";";
	
	

}
