package oct22_morning;
class Main5
{
	static int a=10;
	int b;
	int c;
	static void fun()
	{
		System.out.println("fun of Main5");
	}
	void anotherFun()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("anotherFun of Main5");
	}
}
public class Static_06 
{
	public static void main(String[] args) 
	{
		System.out.println(Main5.a);
		Main5 m=new Main5();
		Main5.fun();
		
		//System.out.println(Main.b);
		//System.out.println(Main.c);
		m.anotherFun();
		//Main5.anotherfun();
	}

}
