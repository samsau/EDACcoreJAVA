package cdac.rough;

class A {
	public void hello() {
		System.out.println("parent hello");
	}
}

public class B extends A{
	public void hello() {
		System.out.println("hello");
	}
	
	public void hello(int a) {
		System.out.println("hello with int");
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.hello();
		B b1 = new B();
		b1.hello(1);
		A a = new B();
		
		B b2 = (B)a;
		String s = new String("saurabh");
		String s1 = "saurabh";
		String s2 = "saurabh";
		System.out.println(s1.concat("abcd"));
		b2.hello();
		float z = (1/7);
		System.out.println((double)22/7);
		
	}
}
