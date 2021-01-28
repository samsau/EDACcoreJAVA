package circular_linked_list_002;

public class Circular_LL_002 
{
	Node head;
	Node tail;
	void show()
	{
		Node temp = head;
		do
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		while(temp != head);
	}
	void insertFirst(int item)
	{
		Node MyNode = new Node();
		MyNode.data = item;
		if(head == null)
		{
			head = MyNode;
			head.next = MyNode;
			tail = MyNode;
		}
		else
		{
			tail.next = MyNode;
			MyNode.next = head;
			head = MyNode;
		}
	}
	void insertLast(int item)
	{
		Node MyNode = new Node();
		MyNode.data = item;
		if(head == null)
			insertFirst(item);
		else
		{
			MyNode.next = head;
			tail.next = MyNode;
			tail = MyNode;
			head = tail.next;
		}
	}
	void insertMiddle(int position, int item)
	{
		Node MyNode = new Node();
		MyNode.data = item;
		if(head == null)
			insertFirst(item);
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
	void deleteFirst()
	{
		if(head == null)
			System.out.println("NO LIST FOUND");
		else
		{
			head = head.next;
			tail.next = head;
		}
	}
	void deleteLast()
	{
		if(head == null)
			System.out.println("NO LIST FOUND");
		else
		{
			Node temp = head;
			while(temp.next.next != head)
			{
				temp = temp.next;
			}
			temp.next = head;
			tail = temp;
		}
	}
	void deleteMiddle(int position)
	{
		if(head == null)
			System.out.println("NO LIST FOUND");
		else
		{
			Node temp = head;
			for(int i = 1; i< position-1; i++)
			{
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
	public static void main(String[] args) 
	{
		Circular_LL_002 clist = new Circular_LL_002();
		clist.insertFirst(11);
		clist.insertLast(500);
		clist.insertFirst(12);
		clist.insertLast(20);
		clist.insertMiddle(3, 200);
		clist.show();
		System.out.println("------------");
		clist.deleteFirst();
		clist.show();
		System.out.println("------------");
		clist.deleteLast();
		clist.show();
		System.out.println("------------");
		clist.deleteMiddle(2);
		clist.show();
	}
}
