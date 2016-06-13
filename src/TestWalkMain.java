import org.junit.Test;


public class TestWalkMain {
	MYSQLGRAMMARWalkerMain walker = new MYSQLGRAMMARWalkerMain();
	
	
	@Test
	public void testGetMethod(){
		
		
		String field = "name";
		String type = "Integer";
		String tmp = walker.genGetMethod(field, type);
		System.out.println(tmp);
	}
	
	@Test
	public void testFor(){
		
		for(int i = 0; i< 0; i++){
			System.out.println("demo");
		}
	}
	
	@Test
	public void testSetMethod(){
		String field = "name";
		String type = "Integer";
		String tmp = walker.genSetMethod(field, type);
		System.out.println(tmp);
		
	}
	
	
	
}
