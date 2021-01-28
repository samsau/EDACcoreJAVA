package doubly_linked_list_001;
import java.util.*;
//blink	= prev;
//flink = next;
public class D_LinkedList_001 
{
	D_Node_001 head;
	int count = 0;
	int length = 0;
	void calcLength()
	{
		D_Node_001 temp = head;
		while(temp.next != null)
		{
			length++;
			temp = temp.next;
		}
		System.out.println("LENGTH IS : "+(length+1));
	}
	boolean isEmpty()
	{
		if(head == null )
			return true;
		else
			return false;
	}
	

	void insertFirst(int item)
	{
		D_Node_001 MyNode = new D_Node_001();
		MyNode.item = item;
		if(isEmpty())
			head = MyNode;
		else
		{
			head.prev = MyNode;
			MyNode.next = head;
			head = MyNode;
		}
		count++;
	}
	void insertLast(int item)
	{
		D_Node_001 MyNode = new D_Node_001();
		MyNode.item = item;
		if(isEmpty())
			head = MyNode;
		else
		{
			D_Node_001 temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = MyNode;
			MyNode.prev = temp;
		}
		count++;
	}
	void insertMiddle(int pos, int item)
	{
		if(pos == 1)
		{
			insertFirst(item);
		}
		else if(pos == count+1)
		{
			insertLast(item);
		}
		else
		{
			int i = 1;
			 D_Node_001 temp = head;
			 
			 while(temp.next != null)
			 {
				 i++;
				 if(i == pos )
					 break;
				 temp = temp.next;
			 }
			 D_Node_001 MyNode = new D_Node_001();
			 MyNode.item = item;
			 MyNode.prev = temp;
			 MyNode.next = temp.next;
			 temp.next.prev = MyNode;
			 temp.next = MyNode;
		}
	}
	void delFirst()
	{
		D_Node_001 temp = head;
		if(isEmpty())
			System.out.println("list is empty");
		else
		{
			head = temp.next;
			head.prev = null;
		}
		count--;
	}
	void delLast()
	{
		if(isEmpty())
		{
			System.out.println("LIST EMPTY");
		}
		else
		{
			D_Node_001 temp = head;
			while(temp.next.next != null)
				temp = temp.next;
			temp.next.next = null;
			temp.next = null;
		}
		count--;
	}
	void delMiddle(int pos)
	{
		if(pos < 0)
			System.out.println("POS NOT FOUND");
		if(pos == 1)
			delFirst();
		else if(pos > count)
			delLast();
		else
		{
			int i = 1;
			D_Node_001 temp = head;
			while(temp.next != null)
			{
				i++;
				if(i == pos)
					break;
				temp = temp.next;
			}
			temp.next.next.prev = temp;
			temp.next = temp.next.next;
			count--;
		}
	}
	void showForward()
	{
		D_Node_001 temp = head;
//		temp = head;
		
		while(temp.next != null)
		{
			System.out.println(temp.item);
			temp = temp.next;
		}
//		System.out.println(temp.item);
	}
	void showBackward()
	{
		D_Node_001 temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		while(temp.prev != null)
		{
			System.out.print(temp.item + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.item);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		D_LinkedList_001 dlist = new D_LinkedList_001();
		while(true)
		{
			System.out.println("1. INSERT FIRST ");
			System.out.println("2. INSERT LAST ");
			System.out.println("3. INSERT MIDDLE ");
			System.out.println("4. DELETE FIRST ");
			System.out.println("5. DELETE LAST ");
			System.out.println("6. DELETE MIDDLE ");
			System.out.println("7. SHOW FORWARD ");
			System.out.println("8. SHOW BACKWARDS ");
			System.out.println("9. QUIT ");
			System.out.println("ENTER YOU CHOICE");
			int ch = sc.nextInt();
			
			switch(ch)
			{
				case 1 :
				{
					System.out.println("ENTER ELEMENT TO ADD ");
					int item = sc.nextInt();
					dlist.insertFirst(item);
				}
				break;
				case 2 :
				{
					System.out.println("ENTER ELEMENT TO ADD ");
					int item = sc.nextInt();
					dlist.insertLast(item);
				}
				break;
				case 3 :
				{
					System.out.println("ENTER ELEMENT TO ADD ");
					int item = sc.nextInt();
					System.out.println("ENTER POSITION TO ADD ");
					int pos = sc.nextInt();
					dlist.insertMiddle(pos, item);
				}
				break;
				case 4 :
				{
					dlist.delFirst();
				}
				break;
				case 5 :
				{
					dlist.delLast();
				}
				break;
				case 6 :
				{
					System.out.println("ENTER POSITION TO DELETE ");
					int pos = sc.nextInt();
					dlist.delMiddle(pos);
				}
				break;
				case 7 :
				{
					dlist.showBackward();
				}
				break;
				case 8 :
				{
					dlist.showForward();
				}
				break;
				case 9 :
				{
					System.exit(0);
				}
				break;
			}
			
		}
		
	}
}
