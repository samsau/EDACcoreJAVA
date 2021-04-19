package linkedListProg.surajSir;

/*
 * How do you find the middle element of a singly linked list in one pass?
 */

public class FindMiddle {
	final static class Node{
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
		if(head == null)
			return true;
		return false;
	}
	
	public void addFirst(int data) {
		Node MyNode = new Node(data);
//		MyNode.next = head;
		head = MyNode;
	}
	
	public void add(int data) {
		if(isEmpty()) {
			addFirst(data);
		} else {
			Node temp = head;
			Node MyNode = new Node(data);
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = MyNode;
		}
	}
	
	public void showList() {
		Node MyNode = head;
		while (MyNode.next!=null) {
			System.out.println("data "+MyNode.data);
			MyNode = MyNode.next;
		}
		System.out.println("data "+MyNode.data);
	}
	
	public void findMiddle() {
		Node temp = head;
		Node temp2 = head;
		while(temp.next!=null) {
			if(temp.next.next != null)
			{
				temp2 = temp2.next;
				temp = temp.next;
			}
			temp = temp.next;
		}
		System.out.println(temp2.data);
	}
	
	public static void main(String[] args) {
		FindMiddle fm = new FindMiddle();
		fm.add(5);
		fm.add(2);
		fm.add(6);
		fm.add(4);
		fm.add(3);
		fm.add(8);
		fm.add(7);
		fm.add(0);
		fm.add(7);
		fm.add(4);
		fm.showList();
		fm.findMiddle();
	}
}
