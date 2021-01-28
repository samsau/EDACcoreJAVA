package linked_list_007_merge;

public class Linked_List 
{
	Node head;
	
	void addLast(Node MyNode)
	{
		if(head == null)
		{
			head = MyNode;
		}
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
	void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Linked_List list1 = new Linked_List();
		Linked_List list2 = new Linked_List();
		
		list1.addLast(new Node(5));
		list1.addLast(new Node(10));
		list1.addLast(new Node(15));
		
		list2.addLast(new Node(2));
		list1.addLast(new Node(3));
		list1.addLast(new Node(20));
		
		list1.head = new Merge().mergeList(list1.head, list2.head);
		
		list1.printList();
	}

}
