package circular_queue_arrar;

public class C_QueueArray 
{
	int size = 5;
	int front = -1;
	int rear = -1;
	int[] cqueue = new int[size];
	
	boolean isFull()
	{
		if(front == 0 && rear == size - 1)
			return true;
		if(front == rear + 1)
			return true;
		return false;
	}
	
	void enqueue(int element)
	{
		if(isFull())
			System.out.println("queue is full ");
		else
		{
			if(front == -1)
				front = 0;
			rear = (rear + 1) % size;
			cqueue[rear] = element;
			System.out.println("INSERTED : " + element);
		}
	}
	
	boolean isEmpty()
	{
		if(front == -1)
			return true;
		return false;
	}
	
	int dequeue()
	{
		if(isEmpty())
		{
			System.out.println("QUEUE IS EMPTY");
			return -1;
		}
		else
		{
			int element = cqueue[front];
			if(front == rear)
			{
				front = -1;
				rear = -1;
			}
			else
			{
				front = (front + 1) % size;
			}
			return (element);
		}
	}
	
	void display()
	{
		int i;
		if(isEmpty())
			System.out.println("EMPTY QUEUE");
		else
		{
			System.out.println("FRONT -> " + front);
			System.out.println("ITEMS -> " );
			for(i = front; i != rear; i = (i+1)%size)
				System.out.println(cqueue[i] + " ");
			System.out.println(cqueue[i]);
			System.out.println("REAR ->" + rear);
		}
	}
	
	public static void main(String[] args) 
	{
		C_QueueArray cq = new C_QueueArray();
		
		cq.dequeue();
		cq.enqueue(1);
		cq.enqueue(2);
		cq.enqueue(3);
		cq.enqueue(4);
		cq.enqueue(5);
		
		cq.enqueue(6);
		
		cq.display();
		
		int element = cq.dequeue();
		
		if(element != -1)
			System.out.println("DELETED ELEMENT IS : " + element);
		
		cq.display();
		
		cq.enqueue(7);
		
		cq.display();
		
		cq.enqueue(8);
	}
}