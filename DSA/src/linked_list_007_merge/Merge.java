package linked_list_007_merge;

public class Merge 
{
	Node mergeList(Node head1, Node head2)
	{
		Node MyNode = new Node(0);
		Node temp = MyNode;
		while(true)
		{
			if(head1 == null)
			{
				temp.next = head2;
				break;
			}
			if(head2 == null)
			{
				temp.next = head1;
				break;
			}
			
			
			if(head1.data <= head2.data)
			{
				temp.next = head1;
				head1 = head1.next;
			}
			else
			{
				temp.next = head2;
				head2 = head2.next;
			}
			temp = temp.next;
		}
		
		return MyNode.next;
	}
}
