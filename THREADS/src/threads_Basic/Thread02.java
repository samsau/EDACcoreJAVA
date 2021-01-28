package threads_Basic;
class MyThread02 extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("START METHOD");
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("CHILD THREAD");
		}
	}
}
public class Thread02 
{
	public static void main(String[] args) 
	{
		MyThread02 t = new MyThread02();
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("PARENT THREAD");
		}
	}
}