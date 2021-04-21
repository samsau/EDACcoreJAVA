package linkedListProg.surajSir;

public class NoRecursiveReverse {
	
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
		
		public void reverse() {
			Node prev = null;
			Node current = head;
			Node next = null;
			while(current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			head = prev;
		}
		
		public static void main(String[] args) {
			NoRecursiveReverse fc = new NoRecursiveReverse();
			fc.add(3);
			fc.add(4);
			fc.add(5);
			fc.add(6);
			fc.showList();
			System.out.println("printing the reverse");
			fc.reverse();
			fc.showList();
		}
	}

