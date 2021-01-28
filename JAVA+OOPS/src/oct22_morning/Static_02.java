package oct22_morning;
class Main1
{
	static int a=10;
	int b;
	int c;
	Main1()
	{
		System.out.println("CONST");
	}
}
public class Static_02
{
	public static void main(String[] args) 
	{
		System.out.println(Main1.a);
		System.out.println(new Main1());
	}
}