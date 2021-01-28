package oct22_morning;

class Test1
{
	int b;	//when ever a instance is created the instance variable is created.
	int c;	//when ever a instance is created the instance variable is created.
		
	Test1()
	{
		System.out.println("NO ARGUMENT CONSTRUCTOR");
		b=1;
		c=1;
	}
	
	Test1(int b)
	{
		this.b=b;
	}
	
	Test1(int b, int c)
	{
		this.b=b;		//as it is making confusion which is local of which is instance one
		this.c=c;		//so we use 'this' for instance variable only not for local.
	}
	
	void fun()	//to access this method we need to create an object.
	{
		System.out.println("fun of test");
		System.out.println(this.b);
		System.out.println(this.c);
	}
	
}
class This02
{
	public static void main(String[] args)
	{
		Test1 t1=new Test1(5,10);
		Test1 t2=new Test1(15);
		Test1 t3=new Test1();
		
		t1.fun();
		t2.fun();
		t3.fun();
		
		System.out.println(t1.b);
		System.out.println(t1.c);
		
		//this.b;	//this may not used in main method as it is impossible to find the current reference.
		//this.c;
		//this.fun();
	}
}
