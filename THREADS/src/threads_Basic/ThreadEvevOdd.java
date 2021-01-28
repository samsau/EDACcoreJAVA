package threads_Basic;
class Odd implements Runnable
{
    public void run()
   {
      for(int i=0;i<11;i++)
      {
         if(i%2==1)
         {
             System.out.println(Thread.currentThread().getName()+" "+i);
         }
      }
   }
}
class Even implements  Runnable
{
    public void run()
    {
        for(int i=0;i<11;i++)
        {
            if(i%2==0)
            {
            System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
    }
}
public class ThreadEvevOdd 
{
		public static void main(String args[])
		{
			Runnable r1=new Odd();
			Thread t=new Thread(r1);
			t.start();
			Runnable r2=new Even();
			Thread t2=new Thread(r2);
			t2.start();	       
	    }
}
