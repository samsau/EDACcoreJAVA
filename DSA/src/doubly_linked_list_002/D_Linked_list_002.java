package doubly_linked_list_002;

public class D_Linked_list_002 
{
	Node_002 head;
	void showForward()
	{
		Node_002 temp = head;
		while(temp.next != null)
		{
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
	}
	void showBackward()
	{
		Node_002 temp = head;
		while(temp.next != null)
		{
			
			temp = temp.next;
		}
//		temp = temp.next;
		while(temp.prev != null)
		{
			System.out.print(" <- "+ temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	boolean isEmpty()
	{
		if(head == null)
			return true;
		else
			return false;
	}
	
	void insertFirst(int item)
	{
		Node_002 MyNode = new Node_002();
		if(isEmpty())
		{
			head = MyNode;
		}
		else
		{
			head.prev = MyNode;
			
			MyNode.next = head;
			head = MyNode;
		}
	}
	public static void main(String[] args) 
	{
		D_Linked_list_002 dlist = new D_Linked_list_002();
		dlist.insertFirst(20);
		dlist.insertFirst(10);
//		dlist.showBackward();
		dlist.showForward();
	}
}
