package simple.forLoop;

class Abc {
	int i;
	int j;
	public Abc() {
		super();
		this.i = 15;
		this.j = 25;
		// TODO Auto-generated constructor stub
	}
	
	public void function() {	// defination
		System.out.println("Abc hello yellow");
	}
	public void alloo() {	// defination
		System.out.println("Abc hello alloo");
	}
	
}

public class ForExample extends Abc {
//	class is a logical unit
//	object is a physical unit
//	data members -- instance variables
//	member functions -- methods
//	method is nothing but a servant
	int i ;
	int j ;
	
	public ForExample() {
		super();
		this.i = 10;
		this.j = 20;
		// TODO Auto-generated constructor stub
	}
	
	public void function() {	// defination
		System.out.println("hello pink color");
	}
	public void alloo() {	// defination
		System.out.println("hello alloo");
	}
	public void bringle() {	// defination
		System.out.println("hello bringle");
	}
	public void tomatoo() {	// defination
		System.out.println("hello tamatoo");
	}
	public void Rajma() {	// defination
		System.out.println("hello rajma");
	}
	
	public static void main(String[] args) {
//		ForExample f = new ForExample();
//		f.function(); 	// calling
//		f.function();	// calling
//		f.alloo();
//		f.bringle();
//		f.tomatoo();
//		f.Rajma();
//		System.out.println(f.i + " " +f.j);
		Abc a = new Abc();
		a.alloo();
		a.function();
//		papa khete hai bada naam kerega.
		Abc p = new ForExample();
		p.alloo();
		p.function();
	}
	
}
