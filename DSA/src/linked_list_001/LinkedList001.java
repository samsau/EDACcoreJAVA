package linked_list_001;

public class LinkedList001 
{
	Node_001 head;
		
	public void show()
	{
		Node_001 MyNode = head;		//n is made as a reference variable in place of head.
		while(MyNode.next001 != null)
		{
			System.out.println(MyNode.data001);
			MyNode = MyNode.next001;
		}
		System.out.println(MyNode.data001);
	}
	public boolean isEmpty()
	{
		if(head == null)
			return true;
		else
			return false;
	}
	public void insertFirst(int item)
	{
		Node_001 MyNode = new Node_001();
		MyNode.data001 = item;
		MyNode.next001 = null;
		
		MyNode.next001 = head;
		head = MyNode;
		
	}
	
	public void insertLast(int item)
	{
		Node_001 MyNode = new Node_001();
		MyNode.data001 = item;
		MyNode.next001 = null;
		if(isEmpty())
			insertFirst(item);
		else
		{
			Node_001 temp = head;
			while(temp.next001 != null)
			{
				temp = temp.next001;
			}
			temp.next001 = MyNode;
		}
	}
	
	public void insertMiddle(int position, int item)
	{
		int i = 1;
		if(isEmpty())
			insertFirst(item);
		else if(position == 1)
			insertFirst(item);
		else
		{
			Node_001 MyNode = new Node_001();
			MyNode.data001 = item;
			MyNode.next001 = null;
			Node_001 temp = head;
			while(i < position-1)
			{
				temp = temp.next001;
				i++;
			}
			MyNode.next001 = temp.next001;
			temp.next001 = MyNode;
		}
	}
	
	public void deleteFirst()
	{
		Node_001 temp = head;
		if(isEmpty())
			System.out.println("NO LIST FOUND");
		else
		{
			temp = temp.next001;
			head = temp;
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
			System.out.println("NO LIST FOUND");
		else
		{
			Node_001 temp = head;
			while(temp.next001.next001 != null)
			{
				temp = temp.next001;
			}
			temp.next001 = null;
		}
	}
	
	public void deleteMiddle(int position)
	{
		if(isEmpty())
			System.out.println("NO LIST FOUND");
		else if(position == 1)
			deleteFirst();
		else
		{
			Node_001 temp = head;
			int i = 1;
			while(i < position)
			{
				i++;
				//temp = temp.next001;
				if(temp.next001.next001 != null)
					temp.next001 = temp.next001.next001;
			}		
		}
	}
	
	public static void main(String[] args)
	{
		LinkedList001 list = new LinkedList001();
		list.insertFirst(200);
		list.insertFirst(100);
		list.insertLast(300);
		list.insertLast(400);
		list.insertMiddle(3, 1000);
		list.show();
		System.out.println("-----");
		list.deleteFirst();
		list.show();
		System.out.println("-----");
		list.deleteLast();
		list.show();
		System.out.println("-----");
		list.deleteMiddle(2);
		list.show();
	}
}
