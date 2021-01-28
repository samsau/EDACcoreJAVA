package threads_Basic;

class MyThread01 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}
public class Thread01 
{
	public static void main(String[] args) 
	{	
		MyThread01 m = new MyThread01();
		m.start();
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(i);
		}
	}
}
