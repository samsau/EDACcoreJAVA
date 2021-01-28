package stackArray001;
import java.util.*;
public class StackArr001 
{
	static int[] stack = new int[10];
	static int top=-1;	//no element in stack
	static boolean isFull()
	{
		if(top == stack.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static void push(int item)
	{
		if(isFull())
		{
			System.out.println("STACK OVERFLOW");
		}
		else
		{
			top++;
			stack[top] = item;
			System.out.println("element inserted SUCCESSFULLY");
		}
	}
	static boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	static int  pop()
	{
		if(isEmpty())
		{
			return 0;
		}
		else
		{
			return stack[top--];
		}
	}
	static void peek()
	{
		if(isEmpty())
		{
			System.out.println("STACK IS EMPTY");
		}
		else
		{
			System.out.println("PEEK ELEMENT IS : "+stack[top]);
		}
	}
	static void traversal()
	{
		if(isEmpty())
		{
			System.out.println("STACK IS EMPTY");
		}
		else
		{
			System.out.println("STACK ELEMENTS ARE : ");
			for(int i=0;i<=top;i++)
			{
				System.out.println(stack[i]);
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
		int choice;
		while(true)
		//do
		{
			
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. peek");
			System.out.println("4. traverse");
			System.out.println("5. quit");
			System.out.println("enter your choice");
			
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
				case 1:
				{
					System.out.println("ENTER THE ELEMENT YOU WANT TO PUSH");
					int a = sc.nextInt();
					push(a);
				}
				break;
				case 2:
				{
					System.out.println("YOU ENTERED THE POP CHOICE");
					System.out.println("TOP ELEMENT IF PRESENT WILL BE REMOVED");
					int item = pop();
					if(item == 0)
					{	
						System.out.println("STACK IS UNDERFLOW");
					}
					else
					{
						System.out.println(item + " SUCCESSFULLY POPED OUT");
					}
				}
				break;
				case 3:
				{
					System.out.println("YOU ENTER TO PRINT PEEK ELEMENT");
					peek();
				}
				break;
				case 4:
				{
					System.out.println("YOU ENTERED THE TRAVESAL FOR STACK");
					traversal();
				}
				break;
				case 5:
				{
					System.out.println("THANKU FOR COMING");
					quit();
				}
				break;
				default : 
				{
					System.out.println("ENTERED A WRONG CHOICE");
				}
			}		
		}
	}
}