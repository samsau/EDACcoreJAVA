package oct22_morning;
class Test3
{
	int b;	
	int c;	
		
	Test3()
	{	
		//this(5,10);
		System.out.println("NO ARGUMENT CONSTRUCTOR");
		b=1;
		c=1;
	}
	
	Test3(int b)
	{
		this();		
		System.out.println("ONE ARGUMENT CONSTRUCTOR");
		this.b=b;
	}
	
	Test3(int b, int c)
	{
		//this();		
		this(b);	
		this.b=b;	
		this.c=c;	
	}
	
	void fun()	
	{
		System.out.println("fun of test");
		System.out.println(this.b);
		System.out.println(this.c);
	}
	
}
class This03
{
	public static void main(String[] args)
	{
		Test3 t1=new Test3(5,10);
		Test3 t2=new Test3(15);
		Test3 t3=new Test3();
		
		t1.fun();
		t2.fun();
		t3.fun();
		
		System.out.println(t1.b);
		System.out.println(t1.c);
		
		
	}
}
