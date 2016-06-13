import java.util.Map;


public class XmlFacotry {
	
	private Map<String, String> dbBeanFieldMap;
	private String tableName;
	private String beanName;
	
	private static String NEWLINE = "\n";
	
	
	public XmlFacotry(Map<String, String> dbBeanFieldMap, String tableName,
			String beanName) {
		this.dbBeanFieldMap = dbBeanFieldMap;
		this.tableName = tableName;
		this.beanName = beanName;
	}

	public String selectStmt(){
		String select = "<select id = \"select\"  resultMap=\" " + beanName 
				+ "parameterClass=\"" + "Integer" +  "\">";
		
		String sql = "select ";
		String fieldStr = "";
		String whereStr = "";
		for(Map.Entry<String, String> entry : dbBeanFieldMap.entrySet()){
			fieldStr = fieldStr + ", " + entry.getKey();
			whereStr = whereStr + "," +  entry.getKey() + "=" + "#{" + entry.getValue() +  "}";
 		}
		
		//去除 第一个 ,
		
		sql = sql +  fieldStr + "from " + beanName + "where"  + whereStr;
		
		return select;
	}
	
	public String updateStmt(){
		return null;
	}
	
	public String deleteStmt(){
		
		return null;
	}
	
	public String insertStmt(){
		
		return null;
	}
	
	public String result(){
		String result = "<resultMap id= \"result\" class=" + "\"" + beanName + "\">";
		String property = "";
		for(Map.Entry<String, String> entry : dbBeanFieldMap.entrySet()){
			String line = "<result property= \" " + entry.getValue() + "\" " +
		 "columen=" + "\"" + entry.getKey() + "\"" + NEWLINE;
			property = property + line;
		}
		String end = "</resultMap>" + NEWLINE;
		result = result + property + end;
		
		return result;
	}
	
	public String genFile(){
		//select
		//update
		// delete
		// insert
		return null;
	}
	

	public Map<String, String> getDbBeanFieldMap() {
		return dbBeanFieldMap;
	}

	public void setDbBeanFieldMap(Map<String, String> dbBeanFieldMap) {
		this.dbBeanFieldMap = dbBeanFieldMap;
	}
	
}
