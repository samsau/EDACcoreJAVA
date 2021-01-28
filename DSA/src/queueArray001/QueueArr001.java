package queueArray001;
import java.util.*;
public class QueueArr001 
{
	static int front = -1;
	static int[] queue = new int[10];
	static int size = queue.length;
	static int rear = -1;
	static int count = 0;
	static boolean isEmpty()
	{
		if(front == -1)
			return true;
		else
			return false;
	}
	
	static boolean isFull()
	{
		if(rear == queue.length-1)
			return true;
		else
			return false;
	}
	
	static void add(int a)
	{
		
		if(!isFull())
		{
			if(count == 0)
			{
				front = 0;
				count++;
			}
			
			//front++;
			++rear;
			queue[rear] = a;
		}
		else
			System.out.println("ERROR");
	}
	
	static int delete()
	{
		if(isEmpty() || front > rear)
		{
			System.out.println("QUEUE UNDERFLOW ");
//			front = 0;
//			rear = 0;
			System.out.println("front is "+ front);
			System.out.println("rear is "+ rear);
			return 0;
		}
		else
		{
			//rear--;
			return queue[front++];
		}
	}
	
	static void traverse()
	{
		if(isEmpty())
			System.out.println("QUEUE IS EMPTY ");
		else
		{
			System.out.println("TRAVERSAL OF QUEUE IS ");
			for(int i=front;i<=rear;i++)
			{
				System.out.println(queue[i]);
			}
		}
	}
	
	static void quit()
	{
		System.exit(0);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("1. ADD ELEMENT");
			System.out.println("2. DELETE ELEMENT");
			System.out.println("3. TRAVERSE QUEUE");
			System.out.println("4. QUIT ELEMENT");
			System.out.println();
			System.out.println("ENTER YOUR CHOICE");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1 :
				{
					System.out.println("ADDING ELEMENT IN LAST ");
					System.out.println("ENTER THE ELEMENT TO ADD ");
					int item = sc.nextInt();
					add(item);
					System.out.println("ITEM ADDED");
				}
				break;
				case 2 :
				{
					System.out.println("DELETING ELEMENT FROM FRONT ");
					int res = delete();
					System.out.println(res + " ITEM DELETED ");
				}
				break;
				case 3 :
				{
					System.out.println("TRAVERSING THE QUEUE");
					traverse();
				}
				break;
				case 4 :
				{
					System.out.println("YOU ENTERED TO QUIT ");
					quit();
				}
				break;
				default :
				{
					System.out.println("YOU ENTERED A WRONG CHOICE");
				}
			}
		}
	}
}