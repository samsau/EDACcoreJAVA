package durgaNotes;

public class ExceptionPractice {

	private void throwException01() {
		// TODO Auto-generated method stub
		throw new ArithmeticException("divide by 0 execption");
	}
	
	private void throwException02() {
		System.out.println(10/0);
	}
	
	public static void main(String[] args) {
		ExceptionPractice ep = new ExceptionPractice();
		try {
			ep.throwException01();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			ep.throwException02();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	
}

class abc{
    static void run(Object i)
   { 
       System.out.println("hello");
       
   }
   
   public static void run(String s)
   { 
       
       System.out.println("hi");
   }
}
class HelloWorld {
   public static void main(String[] args) {
       abc.run(null);
   }
}

