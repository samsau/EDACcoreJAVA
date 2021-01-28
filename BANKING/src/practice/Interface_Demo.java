package practice;
interface Myinterface
{
	int j=20;	//final, static, public
	void fun();
	void anotherfun();
}
abstract class Kuchbhi implements Myinterface
{
	static int z=0;
	abstract public void fun();
	abstract public void anotherfun();
}
class OK extends Kuchbhi
{
	int p=20;
	public void fun()
	{
		System.out.println("FUN OF OK");
	}
	public void anotherfun()
	{
		System.out.println("ANOTHERFUN OF OK");
	}
	void ptani()	//local of class OK
	{
		System.out.println("PTANI OF OK");
	}
}
public class Interface_Demo extends OK
{
	int z=10;
	public static void main(String[] args)
	{
		
		//parent obj = new child;
		//obj.fun();
		Kuchbhi k=new Interface_Demo();
		System.out.println("z = "+Kuchbhi.z);
		Myinterface i=new Interface_Demo();
		i.anotherfun();
		i.fun();
		
		System.out.println(j);
		OK o=new OK();
		System.out.println(o.p);
		o.ptani();
		Interface_Demo n=new Interface_Demo();
		n.ptani();
		System.out.println(n.p);
	}
}
