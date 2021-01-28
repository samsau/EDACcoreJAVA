package threads_Basic;
class MyThread03 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" CHILD THREAD");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
public class Thread03 
{
	public static void main(String[] args) 
	{
		MyThread03 t1 = new MyThread03();
		MyThread03 t2 = new MyThread03();
		Thread t3 = new Thread(t1);
		Thread t4 = new Thread(t2);
		t3.setName("THREAD 1");
		t4.setName("THREAD 2");
		t3.start();
		t4.start();
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" PARENT THREAD");
		}
	}
}
