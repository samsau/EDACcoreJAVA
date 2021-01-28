package oct22_morning;

class Main7
{
	static int a;
	int b=2;
	int c=4;
	
	{
				//non static
		a=1;
		b=1;
		c=1;
		System.out.println("NON STATIC a= "+a+"b= "+b+"c= "+c);
	}
	
	static
	{
				//static block
		a=10;
		
		System.out.println(" STATIC a= "+a);
		
		{
			System.out.println(" NON STATIC inside Static-- hello");
		}
			
		
		
	}
	
	static void fun()
	{		
		System.out.println(" in FUNN method ");
	}
	static void anotherFun()
	{
		System.out.println(a);
		/*
		 * System.out.println(b); 
		 * System.out.println(c);
		 */
		fun();
		System.out.println("int anotherFun methods");
	}
}
public class Static_08 {

	public static void main(String[] args) 
	{
		System.out.println(Main7.a);
		Main7 m =new Main7();
		System.out.println("MAIN.A "+Main7.a);
		Main7.fun();
		System.out.println("MAIN.B "+m.b);
		System.out.println("MAIN.C "+m.c);
		
		Main7.anotherFun();
	}
}
