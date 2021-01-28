package oct22_morning;
class Main4
{
	static int a=10;
	int b;
	int c;
	
	static void fun()
	{
		System.out.println("FUN OF MAIN 4");
	}
	static void anotherFun()
	{
		System.out.println(a);
		System.out.println("anotherFun of MAIN 4");
	}
}
public class Static_05 
{
	public static void main(String[] args) 
	{
		System.out.println(Main4.a);
		Main4 m=new Main4();
		Main4.fun();
		
		//Main4.b;
		//Main4.c;
		System.out.println(m.b);
		System.out.println(m.c);
		Main4.anotherFun();
	}
}
