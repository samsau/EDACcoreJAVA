package oct22_morning;

class Test
{

	int b=2;	//when ever a instance is created the instance variable is created.
	int c=4;	//when ever a instance is created the instance variable is created.
		
	Test()
	{
		System.out.println("NO ARGUMENT CONSTRUCTOR");
		b=1;
		c=1;
	}
	
	Test(int b, int c)
	{
		this.b=b;		//as it is making confusion which is local of which is instance one
		this.c=c;		//so we use 'this' for instance variable only not for local.
		//c=this.c;
		//b=this.b;
	}
	void fun()	//to access this method we need to create an object.
	{
		System.out.println("fun of test");
		System.out.println(this.b);
		System.out.println(this.c);
	}
}
class This01
{
	public static void main(String[] args)
	{
		Test t1=new Test(5,10);
		Test t2=new Test();
		Test t3=new Test();
		
		t1.fun();
		t2.fun();
		t3.fun();
		
		System.out.println(t1.b);
		System.out.println(t1.c);
	}
}