package threads_Basic;
class Test04
{
	int val;
	void increment()
	{
		val++;
		//System.out.println("VAL IS : "+val);
	}
}
class MyThread04 implements Runnable
{
	Test04 q;
	MyThread04(Test04 q)
	{
		this.q=q;
	}
	public void run()
	{
		for(int i=0;i<100000;i++)
		{
			//System.out.println(Thread.currentThread().getName());
			q.increment();
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			
		}
	}
}
public class Thread04 
{
	public static void main(String[] args) 
	{
		Test04 test = new Test04();
		MyThread04 th1 = new MyThread04(test);
		MyThread04 th2 = new MyThread04(test);
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		t1.start();
		t2.start();
		for(int i=0;i<100000;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("test.val"+test.val);
	}
}
