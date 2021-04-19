package threads_Basic;

public class ThreadPractice extends Thread implements Runnable {
	{
		System.out.println("calling the non static block");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("printing the method");
//		System.out.println(10/0);
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		ThreadPractice t = new ThreadPractice();
		t.setName("saurabh");
		System.out.println(t.getName());
		t.start();
		ThreadPractice p = new ThreadPractice();
		Thread t1 = new Thread(p);
		t1.setName("saurabh kumar");
		System.out.println(t1.getName());
		t1.start();
	}
}
