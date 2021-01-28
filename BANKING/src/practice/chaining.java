package practice;
class First
{
	First()
	{
		System.out.println("constructor of First");
	}
	First(int a)
	{
		System.out.println(a);
	}
}
class Second extends First
{
	Second()
	{
		super(5);
		System.out.println("constructor of Second");
	}
	Second(double a, double b)
	{
		super(5);	
		System.out.println(a+b);
	}
}
class Third extends Second
{
	Third()
	{
		System.out.println("constructor of Third");
	}
	Third(int a, int b)
	{
		
		super(2.0,3.0);
		System.out.println(a+b);
	}
}
public class chaining 
{
	public static void main(String[] args) 
	{
		Third t=new Third(2,6);
	}
}
