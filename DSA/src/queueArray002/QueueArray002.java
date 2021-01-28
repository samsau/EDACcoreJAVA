package queueArray002;

public class QueueArray002 
{
	static int capacity = 5;
	static int front = 0;
	static int size = 0;
	static int rear = capacity - 1;
	static int[] queue = new int[capacity];
	
	static boolean isFull()
	{
		if(size == capacity)
		{
			System.out.println("IS FULL");
			return true;
		}
		else
		{
//			System.out.println("IS FULL");
			return false;
		}
	}
	
	static boolean isEmpty()
	{
		if(size == 0)
			return true;
		else
			return false;
	}
	static void enqueue(int item)
	{
		if(isFull())
			return;
		rear = (rear + 1) % capacity;
		queue[rear] = item;
		size++;
		System.out.println(item + " enqueued ");
	}
	
	static int dequeue()
	{
		if(isEmpty())
			return 0;
		int item = queue[front];
		front = (front + 1) % capacity;
		size = size - 1;
		System.out.println(item + " dequeued ");
		return item;
	}
	
	static int front()
	{
		if(isEmpty())
			return 0;
		return queue[front];
	}
	
	static int rear()
	{
		if(isEmpty())
			return 0;
		else
			return queue[rear];
	}
	public static void main(String[] args) 
	{
		enqueue(11);
		enqueue(21);
		enqueue(31);
		enqueue(41);
		enqueue(51);
		enqueue(61);
		enqueue(71);
		
		System.out.println("front element is : " + front());
		
		System.out.println("rear element is : " + rear());
		
		dequeue();
		
		System.out.println("front element is : " + front());
		
		System.out.println("rear element is : " + rear());
		
		enqueue(71);
		
		System.out.println("front element is : " + front());
		
		System.out.println("rear element is : " + rear());
	}
}