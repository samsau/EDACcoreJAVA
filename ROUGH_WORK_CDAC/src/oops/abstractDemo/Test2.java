package oops.abstractDemo;

public class Test2 extends Test {

	@Override
	public void helloHello() {
		// TODO Auto-generated method stub
		System.out.println("hello hello");
	}
	public void doubleM(double a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		AbstractClass a = new Test2();
		a.hello();
		a.helloHello();
		a.helloHi();
		Test2 b= new Test2();
		short z = 3;
		b.doubleM(z);
		a.a=2;	
		System.out.println(a.a);
//		int dd[] = new int[5];
//		System.out.println(dd);
		
//		String str = "saurabh";
		if("string".substring(0,6) == "string") {
			System.out.println("equal");
		} else {
			System.out.println("false");
		}
		
	}
}
