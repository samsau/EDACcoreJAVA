package queueArray003;

public class QueueArray003 
{
	int front = 0;
	int capacity = 5;
	int size = 0;
	int rear = capacity - 1;
	int[] queue = new int[capacity];
	boolean isEmpty()
	{
		if(size == 0)
			return true;
		else
			return false;
	}
	
	boolean isFull()
	{
		if(size == capacity)
		{
			System.out.println("queue is full ");
			return true;
		}
		else
			return false;
	}
	
	void enqueue(int item)
	{
		if(isFull())
		{
			
			return;
		}
		rear = (rear + 1) % capacity;
		queue[rear] = item;
		size = size + 1; 
		System.out.println(item + " is ENQUEUED ");
	}
	
	int dequeue()
	{
		if(isEmpty())
			return 0;
		int item = queue[front];
		front = (front + 1) % capacity;
		size = size - 1;;
		System.out.println(item + " is DEQUEUED ");
		return item;
	}
	
	public static void main(String[] args) 
	{
		QueueArray003 qa = new QueueArray003();
		qa.enqueue(15);
		qa.enqueue(20);
		qa.enqueue(15);
		qa.enqueue(20);
		qa.enqueue(15);
		qa.enqueue(20);
//		qa.dequeue();
//		qa.dequeue();
	}
}
