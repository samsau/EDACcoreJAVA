package linked_list_003;
/*
 * sorting into the linked list
 */
public class Linked_List_003 
{
	Node head;
	void show()
	{
		Node temp = head;
		while(temp.next != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	void addFirst(int item)
	{
		Node MyNode = new Node();
		MyNode.data = item;
		if(head == null)
			head = MyNode;
		else
		{
			MyNode.next = head;
			head =MyNode;
		}
	}
	void addLast(int item)
	{
		Node MyNode = new Node();
		MyNode.data = item;
		if(head == null)
			addFirst(item);
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = MyNode;
		}
	}
	void addMiddle(int position, int item)
	{
		Node MyNode = new Node();
		MyNode.data = item;
		if(head == null)
			addFirst(item);
		else
		{
			Node temp = head;
			for(int i = 1; i < position-1; i++)
			{
				temp = temp.next;
			}
			MyNode.next = temp.next;
			temp.next = MyNode;
		}
	}
	void delFirst()
	{
		if(head == null)
			System.out.println("LIST IS EMPTY");
		else
			head = head.next;
	}
	void delLast()
	{
		if(head == null)
			System.out.println("LIST IS EMPTY");
		else
		{
			Node temp = head;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	void delMiddle(int position)
	{
		if(head == null)
			System.out.println("LIST IS EMPTY");
		else
		{
			Node temp =head;
			for(int i = 1; i < position-1; i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
	
	
	void listSort()
	{
		int max = 0;
		Node temp = head,temp2 = null;
		if(head == null)
		{
			return;
		}
		else
		{
			while(temp != null)
			{
				temp2 = temp.next;
				while(temp2 != null)
				{
					if(temp.data > temp2.data)
					{
						max = temp.data;
						temp.data = temp2.data;
						temp2.data = max;
					}
					temp2 = temp2.next;
				}
				temp = temp.next;
			}			
		}
	}
	public static void main(String[] args) 
	{
		Linked_List_003 list = new Linked_List_003();
		list.addFirst(200);
		list.addFirst(300);
		list.addLast(400);
		list.addLast(100);
		list.addMiddle(3,1000);
		list.addMiddle(5,5000);
		list.addMiddle(2, 4);
		list.show();
		System.out.println("----------");
//		list.delFirst();
		list.listSort();
		list.show();
		System.out.println("----------");
//		list.delLast();
//		list.delLast();
//		list.show();
		System.out.println("----------");
//		list.delMiddle(2);
//		list.show();
	}
}
