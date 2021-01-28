package oct22_morning;
class Main2
{
	static int a;
	int b;
	int c;
	void fun()
	{
		System.out.println("fun of Main");
	}
}
public class Static_03 
{
	public static void main(String[] args) 
	{
		System.out.println(Main.a);
		Main2 m=new Main2();
		//Main2.fun();
		//Main2.b;
		//Main2.c;
		m.fun();
		System.out.println(m.b);
		System.out.println(m.c);
	}
}