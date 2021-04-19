package practice;

public class Demo1 extends Demo{
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		d.hello();
		d.hello1();
	}
	
	public void hello() {
		this.setRollno(2);
		System.out.println(this.getRollno());
		
	}
	public void hello1() {
		super.setRollno(3);
		System.out.println(super.getRollno());
		
	}
	
}
