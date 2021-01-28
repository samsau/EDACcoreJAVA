package linked_list_002;

public class Linked_List_002 
{
	int count = 0;
	Node_002 head;
	private Node_002 temp2;
	private Node_002 temp;
	void show()
	{
		Node_002 temp = head;
		int count1=0;
		while(temp != null)
		{
			count1++;
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("count in show is : "+ count1);
	}
	
	/*
	 * this is made to check if the linkedlist is empty or not
	 */
	boolean isEmpty()
	{
		if(head == null)
			return true;
		else
			return false;
	}
	
	/*
	 * this is made for insertion at last or when head is null
	 */
	void insert(int item)
	{
		Node_002 MyNode = new Node_002();
		MyNode.data = item;
		if(isEmpty())
		{
			head = MyNode;
		}
		else
		{
			Node_002 temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = MyNode;
		}
	}
	
	/*
	 * this is made for adding node at first
	 */
	void addFirst(int item)
	{
		Node_002 MyNode = new Node_002();
		MyNode.data = item;
		MyNode.next = null;
		MyNode.next  = head;
		head  = MyNode;
	}
	
	/*
	 * this is made for adding node at last.
	 */
	void addLast(int item)
	{
		Node_002 MyNode = new Node_002();
		/*
		 * assuming already having atleast one element
		 */
		MyNode.data = item;
		MyNode.next = null;
		Node_002 temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = MyNode;
	}
	
	/*
	 * this method is made to add an element in the linkedlist
	 */
	void addAtMiddle(int pos, int item)
	{
		int count = calcLength();
		int i = 1;
		Node_002 MyNode = new Node_002();
		MyNode.data = item;
		MyNode.next = null;
		Node_002 temp = head;
		if(pos > count)
		{
			System.out.println("count is "+ count);
			System.out.println("POSITION OUT OF RANGE ");
		}
		else
		{
			while(i< pos)
			{
				temp = temp.next;
				i++;
			}
			MyNode.next = temp.next;
			temp.next = MyNode;
		}
	}
	
	/*
	 * this method print length of the given linkedlist.
	 */
	int calcLength()
	{
		int count2=0;
		Node_002 temp = head;
		while(temp != null)
		{
			count2++;
			temp = temp.next;
		}
		System.out.println("Length of LinkedList is : "+(count2));
		return count2;
	}
	void delFirst()
	{
		if(isEmpty())
		{
			System.out.println("LinkedList Empty");
		}
		else
		{
			Node_002 temp = head;
			temp = temp.next;
			head.next = null;
			head = temp;
			System.out.println("DELFIRST ");		
		}
	}
	void delLast()
	{
		if(isEmpty())
		{
			System.out.println("empty LINKED LIST");
		}
		else
		{
			Node_002 temp = head;
			
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	void delAtMiddle(int pos)
	{
		Node_002 temp = head;
		for(int i =0; temp != null && i < pos-1 ; i++)
		{
			temp = temp.next;
		}
		
		if(temp == null || temp.next == null)
			return;
		
		Node_002 next = temp.next.next;
		
		temp.next = next;
	}
//	void sorting()
//	{
//		int max = 0;
//		Node_002 temp = head;
//		Node_002 temp2 = null;
//		if(head == null)
//		{
//			return;
//		}
//		else
//		{
//			while(temp != null)
//			{
//				temp2 = temp.next;
//				while(temp2 != null)
//				{
//					if(temp.data > temp2.data)
//					{
//						max = temp.data;
//						temp.data = temp2.data;
//						temp2.data = max;
//					}
//				}
//				temp2 = temp2.next;
//			}			
//			temp = temp.next;
//		}
//	}
	public static void main(String[] args) 
	{
		Linked_List_002 list = new Linked_List_002();
//		for(int i=0;i<5;i++)
//			list.insert(i);
		
//		for printing the reverse element add at the head always.
//		code for inserting at first
//		for(int i=0;i<5;i++)
//			list.addFirst(i);
		
		list.addFirst(15);
		list.addFirst(20);
		list.addFirst(30);
		list.addLast(100);
		list.addLast(200);
		list.addLast(300);
		list.addLast(400);
//		list.addAtMiddle(2, 500);
//		list.addAtMiddle(10, 1000);
//		int res = list.calcLength();
//		
//		System.out.println("count is "+res);
//		list.show();
//		list.delFirst();
//		list.delLast();
//		list.show();
//		list.delAtMiddle(1);
		list.show();
//		list.sorting();
		list.show();
	}
}
