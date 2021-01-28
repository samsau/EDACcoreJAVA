package threads_Basic;
class Even01 extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10 ; i=i+2)
			System.out.println(Thread.currentThread().getName()+" "+ i);
	}
}
class Odd01 extends Thread
{
	public void run()
	{
		for(int i = 1; i < 10 ; i=i+2)
			System.out.println(Thread.currentThread().getName()+" "+ i);
	}
}
public class ThreadEvenOdd 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(Thread.currentThread().getName());
		Even01 e = new Even01();
		Odd01 o = new Odd01();
//		Thread t1 = new Thread(e);
//		t1.setPriority(10);
//		Thread t2 = new Thread(o);
//		t2.setPriority(8);
		o.start();
		e.start();
//		t1.join();
//		t2.join();
	}
}
