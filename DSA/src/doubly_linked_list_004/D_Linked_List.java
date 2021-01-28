package doubly_linked_list_004;

public class D_Linked_List 
{
	Node head;
	void showForward()
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
		{
			head = MyNode;
		}
		else
		{
			
			MyNode.next = head;
			head.prev = MyNode;
			head = MyNode;
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
		}
	}
	public static void main(String[] args) 
	{
		D_Linked_List dlist = new D_Linked_List();
		dlist.addFirst(10);
		dlist.addFirst(20);
		dlist.showForward();
	}
}
