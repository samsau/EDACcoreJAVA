package oct22_morning;
class Main8
{
	static int a=10;
	int b;
	int c;
	//a=20;
	{
		System.out.println("non static block");
		b=20;
		c=30;
	}
	static 
	{
		a=20;
	}
	
	Main8()
	{
		System.out.println("NO ARGUMENT CONSTRUCTOR");
	}
	
	static void fun()	//to access this method we need to create an object.
	{
		System.out.println("fun of test");
	}
	static void anotherFun()	//static function (class method) is mainly used to work upon static data only. Example "static int a".
	{
		System.out.println(a);		//will give output as 10
		
		//System.out.println(b);		//ERROR-non static
		//System.out.println(c);		//ERROR-non static
		fun();		//ERROR-non static
		
		System.out.println("anotherFun of Test");
	}
}
public class Static09 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Main8 t=new Main8();
		System.out.println(t.b);
		Main8.anotherFun();
		Main8 t1=new Main8();
		System.out.println(t1.b);
	}

}
