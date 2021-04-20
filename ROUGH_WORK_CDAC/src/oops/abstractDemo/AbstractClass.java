package oops.abstractDemo;

public abstract class AbstractClass {
	int a;
	public void hello() {
		System.out.println("hello");
	}
	abstract public void helloHi();
	
	public AbstractClass() {
		super();
	}
	public AbstractClass(int a) {
		super();
		this.a = a;
	}
	abstract public void helloHello();
}
