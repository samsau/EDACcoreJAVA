package threads_Basic;
class MyThread implements Runnable
{
	int count=0;
	 public void run()
	{
		for(int i=0;i<10000;i++)
		{
			synchronized(this)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
public class Thread05 
{
	public static void main(String[] args)	throws InterruptedException 
	{
		System.out.println("MAIN STARTING");
		MyThread t1 = new MyThread();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t1);
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		System.out.println("MAIN ENDING");
	}
}