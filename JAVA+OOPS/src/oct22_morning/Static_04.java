package oct22_morning;
class Main3
{
	static int a;
	int b;
	int c;
	static void fun()
	{
		System.out.println("fun of test");
	}
}
public class Static_04 
{
	public static void main(String[] args) 
	{
		System.out.println(Main3.a);
		Main3 t=new Main3();
		Main3.fun();
		
		//System.out.println(Main3.b);
		//System.out.println(Main3.c);
		
		System.out.println(t.b);
		System.out.println(t.c);
	}
}