import java.util.HashMap;
import java.util.Map;


public class TypeMap {
	public static Map<String, String> typeMap = new HashMap<String, String>();
	
	//java的基本类型
	public static String INTEGER  = "Integer";
	public static String STRING  = "String";
	public static String DATE  = "Date";
	public static String DOUBLE  = "Double";
	public static String LONG = "Long";
	
	//sqlType: javaType
	static {
		typeMap.put("CHAR", STRING);
		typeMap.put("INT", INTEGER);
		typeMap.put("TINYINT", INTEGER);
		typeMap.put("DATETIME", INTEGER);
		typeMap.put("VARCHAR", STRING);
		typeMap.put("DOUBLE", DOUBLE);
		typeMap.put("DOUBLE", DOUBLE);
		typeMap.put("LONG",  LONG);
		typeMap.put("BIGINT", INTEGER);
	}
	

}
