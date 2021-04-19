package linkedListProg.surajSir;

/*
 * How do you reverse a linked list?
 */

public class ReverseRecursive {
	class Node {
		int data;
		Node next = null;
		
		public Node() {
			super();
		}

		public Node(int data) {
			super();
			this.data = data;
		}
	}
	
	Node head;
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		return false;
	}
	
	public void addFirst(int data) {
		Node MyNode = new Node(data);
		head = MyNode;
	}
	
	public void add(int data) {
		if(isEmpty()) {
			addFirst(data);
		} else {
			Node MyNode = new Node(data);
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = MyNode;
		}
	}
	
	public void showList() {
		Node temp = head;
		while(temp.next!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	
	public void reverseRecursive(Node head) {
		
		if(head == null) {
			return;
		}
		reverseRecursive(head.next);
		System.out.println(head.data);
	}
	
	public static void main(String[] args) {
		ReverseRecursive rr = new ReverseRecursive();
		rr.add(2);
		rr.add(5);
		rr.add(6);
		rr.add(1);
		rr.showList();
		System.out.println("printing reverse");
		rr.reverseRecursive(rr.head);
		rr.showList();
	}
}
