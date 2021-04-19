package linkedListProg.surajSir;

public class FindCycle {
	class Node {
		int data;
		Node next;

		public Node() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
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
			temp= temp.next;
		}
		System.out.println(temp.data);
	}
	
	public void findCycle() {
		Node temp = head;
		Node temp2 = head;
		int flag = 0;
		while(temp.next!=null) {
			if(temp.next.next != null) {
				temp2 = temp2.next;
				temp = temp.next;
			}
			temp = temp.next;
			
			if(temp == temp2) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 1) 
			System.out.println("found cycle");
		else
			System.out.println("not found cycle");
	}
	
	public static void main(String[] args) {
		FindCycle fc = new FindCycle();
		fc.add(3);
		fc.add(4);
		fc.add(5);
		fc.add(6);
		fc.showList();
		
		fc.head.next.next.next.next = fc.head;
		fc.findCycle();
		fc.head.next.next.next = fc.head;
		fc.findCycle();
		fc.head.next.next = fc.head.next.next.next;
		fc.findCycle();
		fc.head.next = fc.head;
		fc.findCycle();
		fc.head = fc.head;
		fc.findCycle();
	}
}
