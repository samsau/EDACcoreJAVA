package linked_list_006_merge;

class Linked_List
{ 
	Node head;  
  
	/* Method to insert a node at  
	   the end of the linked list */
	public void addToTheLast(Node node)  
	{ 
	    if (head == null) 
	    { 
	        head = node; 
	    } 
	    else 
	    { 
	        Node temp = head; 
	        while (temp.next != null) 
	            temp = temp.next; 
	        temp.next = node; 
	    } 
	} 
  
	/* Method to print linked list */
	void printList() 
	{ 
	    Node temp = head; 
	    while (temp != null) 
	    { 
	        System.out.print(temp.data + " "); 
	        temp = temp.next; 
	    }  
	    System.out.println(); 
	} 
	  
	  
	// Driver Code 
	public static void main(String args[]) 
	{ 
	    /* Let us create two sorted linked 
	       lists to test the methods  
	       Created lists: 
	           llist1: 5->10->15, 
	           llist2: 2->3->20 
	    */
		Linked_List llist1 = new Linked_List(); 
		Linked_List llist2 = new Linked_List(); 
	      
	    // Node head1 = new Node(5); 
	    llist1.addToTheLast(new Node(5));
	    llist1.addToTheLast(new Node(10));
	    llist1.addToTheLast(new Node(15));
	      
	    // Node head2 = new Node(2); 
	    llist2.addToTheLast(new Node(2)); 
	    llist2.addToTheLast(new Node(3)); 
	    llist2.addToTheLast(new Node(20)); 
	      
	      
	    llist1.head = new Gfg().sortedMerge(llist1.head,  
	                                        llist2.head); 
	    llist1.printList();      
	      
	} 
}
