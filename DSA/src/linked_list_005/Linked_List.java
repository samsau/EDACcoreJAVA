package linked_list_005;
/*
 * program for printing even elements and even index elements.
 */
public class Linked_List 
{
	Node head;
	void show()
	{
		Node temp = head;
		System.out.println("data is : ");
		while(temp != null)
		{
				System.out.println(temp.data);
				temp = temp.next;
		}
		System.out.println("even elements are : ");
		temp = head;
		while(temp != null)
		{
			if(temp.data % 2 == 0)
			{	
				System.out.println(temp.data);
				temp = temp.next;
			}
			else
				temp= temp.next;
		}
		System.out.println("even index are : ");
		temp = head;
		while(temp != null)
		{
				
				System.out.println(temp.data);
				temp = temp.next.next;
		}
	}
	void insertFirst(int data)
	{
		Node MyNode = new Node();
		MyNode.data = data;
		if(head == null)
			head = MyNode;
		else
		{
			MyNode.next = head;
			head = MyNode;
		}
			
	}
	public static void main(String[] args) 
	{
		Linked_List list = new Linked_List();
		list.insertFirst(15);
		list.insertFirst(10);
		list.insertFirst(5);
		list.insertFirst(26);
		list.insertFirst(46);
		list.insertFirst(51);
//		list.insert(20);
		list.show();
	}
}
