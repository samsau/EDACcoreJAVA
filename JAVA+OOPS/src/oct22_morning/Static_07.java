package oct22_morning;
class Main6
{
	static int a=10;
	int b;
	int c;
	
	static void fun()
	{
		System.out.println("fun of MAIN 6");
	}
	static void anotherFun()
	{
		System.out.println(a);
		//System.out.println(b);		//error
		//System.out.println(c);		//error
		fun();
		System.out.println();
	}
}
public class Static_07 
{
	public static void main(String[] args) 
	{
		System.out.println(Main6.a);
		Main6 m=new Main6();
		Main6.fun();
		Main6.anotherFun();
		//Main6.b;
		System.out.println(Main6.a);
		System.out.println(m.b);
		System.out.println(m.c);
	}
}
