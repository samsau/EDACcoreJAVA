package linked_list_006_merge;

class Gfg 
{ 
	/* Takes two lists sorted in  
	increasing order, and splices  
	their nodes together to make  
	one big sorted list which is  
	returned. */
	Node sortedMerge(Node headA, Node headB) 
	{ 
	      
	    /* a dummy first node to  
	       hang the result on */
	    Node dummyNode = new Node(0); 
	      
	    /* tail points to the  
	    last result node */
	    Node tail = dummyNode; 
	    while(true)  
	    { 
	          
	        /* if either list runs out,  
	        use the other list */
	        if(headA == null) 
	        { 
	            tail.next = headB; 
	            break; 
	        } 
	        if(headB == null) 
	        { 
	            tail.next = headA; 
	            break; 
	        } 
	          
	        /* Compare the data of the two 
	        lists whichever lists' data is  
	        smaller, append it into tail and 
	        advance the head to the next Node 
	        */
	        if(headA.data <= headB.data) 
	        { 
	            tail.next = headA; 
	            headA = headA.next; 
	        }  
	        else
	        { 
	            tail.next = headB; 
	            headB = headB.next; 
	        } 
	          
	        /* Advance the tail */
	        tail = tail.next; 
	    } 
	    return dummyNode.next; 
	} 
} 
