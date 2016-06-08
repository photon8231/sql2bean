import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

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
		
	}
	
	public String filedToBean(Map<String, String> inputFiled){
		Map<String, String> beanFiledMap = new HashMap<String, String>();
		//sql 类型转java 类型
		for(Map.Entry<String ,String> entry : inputFiled.entrySet()){
			String key = entry.getKey();
			String value = entry.getValue();
		}
		
		
		
		return null;
	}
	
	
	
	

}
