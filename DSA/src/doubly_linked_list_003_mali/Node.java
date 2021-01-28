package doubly_linked_list_003_mali;

class Node
{
    int data;
    Node next,prev;
    Node(int data)
    {
        this.data=data;
        next=prev=null;
    }
}
