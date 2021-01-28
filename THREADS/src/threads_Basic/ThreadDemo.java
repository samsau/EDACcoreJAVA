package threads_Basic;

class Sync implements Runnable 
{
    int count;

    public synchronized void run() 
    {

        for (int i = 1; i <= 10; i++) 
        {
            count++;
        }
        System.out.println(count);
    }
}
public class ThreadDemo 
{
    public static void main(String[] args) 
    {

        System.out.println("Main Start");
//        Hi obj1 = new Hi();
//        Hello obj2 = new Hello();
        Sync s = new Sync();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();

        try 
        {
            t1.join();
            t2.join();
        } catch (InterruptedException e) 
        {
            System.out.println(e);
        }

        System.out.println("Main stop");
    }
}