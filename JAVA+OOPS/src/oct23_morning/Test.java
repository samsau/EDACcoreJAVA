package oct23_morning;

public class Test {
	int a;
	int b;
	Test(int a, int b)
	{
		//a=a;
		//b=b;
		System.out.println("local a : "+a);		//5
		System.out.println("local b : "+b);		//10
		/*this.a=a;
		this.b=b;
		System.out.println("this.a = "+a);		//
		System.out.println("this.b = "+b);		//
		*/
	}
	void print()
	{
		System.out.println("print method a : "+a);	//0
		System.out.println("print method b : "+b);	//0
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test(5,10);
		t.print();
	}
}
