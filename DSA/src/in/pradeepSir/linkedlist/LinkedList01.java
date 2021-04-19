package in.pradeepSir.linkedlist;

public class LinkedList01 {

	static class Node {
		int data;
		Node next;
		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}
	Node head;
	int count=1;

	public void showData() {
		Node temp = head;
		while(temp.next!=null) {
			count++;
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
		System.out.println("no. of nodes now are : "+count);
	}
	
	boolean isEmpty() {
		if(head == null)
			return true;
		else
			return false;
	}
	
	public void insertAtFirst(int item) {
		Node MyNode = new Node(item, null);
		MyNode.next = head;
		head = MyNode;
	}
	
	public void insertAtLast(int item) {
		Node MyNode = new Node(item, null);
		if(isEmpty()) {
			insertAtFirst(item);
		} else {
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=MyNode;
		}
	}
	
	public void insertAtMiddle(int item, int pos) {
		Node MyNode = new Node(item, null);
		if(head == null) {
			insertAtFirst(item);
		} else {
			Node temp = head;
			for(int i = 0; i<pos-1 ;i++) {
				temp = temp.next;
			}
			MyNode.next = temp.next;
			temp.next = MyNode;
		}
	}
	
	public static void main(String[] args) {
		LinkedList01 list = new LinkedList01();
		list.insertAtFirst(5);
		list.insertAtFirst(7);
		list.insertAtFirst(6);
		list.insertAtLast(5);
		list.insertAtLast(7);
		list.insertAtLast(6);
		list.insertAtMiddle(1,2);
		list.insertAtMiddle(4,2);
		list.insertAtMiddle(3,1);
		list.showData();

	}

}
