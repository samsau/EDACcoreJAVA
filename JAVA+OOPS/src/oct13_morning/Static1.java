package oct13_morning;

public class Static1 {
	String st;
	static {
		System.out.println("hello 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(st);
		/*java.lang.Error: Unresolved compilation problem: 
										 *Cannot make a static reference to the 
										 *non-static field st*/
		System.out.println("hello main");
	}
	static {
		System.out.println("hello 2");
	}

}
