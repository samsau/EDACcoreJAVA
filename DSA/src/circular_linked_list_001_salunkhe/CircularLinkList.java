package circular_linked_list_001_salunkhe;

import java.util.*;
class CircularLinkList
{
     Node head;
     Node tail;
    
     void display()
     {
    	 Node n=head;
    	 do{	
                System.out.print(" "+ n.data);  
                n = n.next;  
       		}
    	 	while(n != head);  
     }
     void inBeg(int x)
     {
    	 Node newN=new Node(x);
    	 if(head==null)
    	 {
    		 head=newN;
    		 head.next=newN;
    		 tail=newN;
    	 }
    	 else
    	 {
    		 newN.next=head;
    		 tail.next=newN;
    		 head=newN;
    	 }
     }
     void inEnd(int x)
     {
    	 Node newN=new Node(x);
    	 if(head==null)
    	 {
    		 head=newN;
    		 head.next=newN;
    		 tail=newN;
    	 }
    	 else
    	 {
    		 tail.next=newN;
    		 newN.next=head;
    		 tail=newN;
    	 }
     }
     void inMiddle(int x,int pos)
     {
    	 Node newN=new Node(x);
    	 Node n=head;
    	 if(head==null)
    	 {
    		 head=newN;
    		 head.next=newN;
    		 tail=newN;
    	 }
    	 else
    	 {
    		 for(int i=1;i<pos-1;i++)
    		 {
    			 n=head.next;
    		 }
    		 newN.next=n.next;
    		 n.next=newN;
    	 }
     }
     void delBeg()
     {
    	 if(head==null)
    		 System.out.println("LinkedList is Empty");
    	 else
    	 {
    		 head=head.next;
    		 tail.next=head;
    	 }
     }
     void delEnd()
     {
    	 if(head==null)
    	 {
    		 System.out.println("LinkedList is Empty");
    	 }
    	 else
    	 {
    		 Node n=head;
    		 while(n.next.next!=head)
    		 {
    			 n=n.next;
    		 }
    		 n.next=head;
    		 tail=n;
    	 }
     
     }
     void delMiddle(int pos)
     {
    	 Node n=head;
    	 if(head==null)
    	 {
    		 System.out.println("LinkedList is Empty");
    	 }
    	 else
    	 {
    		 for(int i=1;i<pos-1;i++)
    		 {
                n=n.next;
            }
            n.next=n.next.next;
        }
       
    }
}

