package doubly_linked_list_003_mali;

import java.util.Scanner;

class DoublyLL
{
    
    public Node head;
    public int length;
    DoublyLL()
    {
        this.head=null;
        this.length=0;
    }
    void displayForward()
    {
       Node temp=head;
       while(temp!=null)
         {
             System.out.print(temp.data+"--> ");
             temp=temp.next;
         }
    }
      void displayBackward()
    {
        Node temp=head;
       while(temp.next!=null)
         {
             temp=temp.next;
         }
        while(temp.prev!=null)
         {
             System.out.print("<-- "+temp.data);
             temp=temp.prev;
         }
        System.out.print("<-- "+temp.data);
    }
    void insertFirst(int item)
    {
        Node MyNode=new Node(item);
        if(head==null)
        {
            head=MyNode;
        }
        else
        {
            head.prev=MyNode;
            MyNode.next=head;
            head=MyNode;
        }
        length++;
    }
    void insertLast(int item)
    {
        Node MyNode=new Node(item);
        if(head==null)
        {
            head=MyNode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=MyNode;
            MyNode.prev=temp;
        }
         length++;
    }
    void insertMiddle(int item,int pos)
    {
        Node MyNode=new Node(item);
        Node temp=head;
        if(head==null)
        {
            head=MyNode;
        }
        else
        {
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            temp.next.prev=MyNode;
            MyNode.next=temp.next;
            MyNode.prev=temp;
            temp.next=MyNode;
        }
         length++;
    }
     void deleteFirst()
    {
        if(head==null)
        System.out.println("LinkedList is Empty");
        else
        {
            head=head.next;
            head.prev=null;
             length--;
        }
        length--;
    }
    void deleteLast()
    {
        if(head==null)
        {
             System.out.println("LinkedList is Empty");
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.prev.next=null;
            temp.prev=null;
            length--;
        }
     
    }
    void deleteMiddle(int pos)
    {
        Node temp=head;
        if(head==null)
        {
              System.out.println("LinkedList is Empty");
        }
        else
        {
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.next.prev=temp;
             length--;
        }
       
    }
}
