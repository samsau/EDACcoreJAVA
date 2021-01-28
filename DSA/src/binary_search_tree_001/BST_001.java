package binary_search_tree_001;
import java.util.*;

// operations on BST:
// 1. insertion
// 2. deletion
// 3. traversal
// 		3.1 inorder
// 		3.2 preorder
// 		3.3 postorder

public class BST_001 
{
	Node root;	//by default the value of Node type value is null.
	Node parent;
	void insert(int item)
	{
		
		Node MyNode = new Node();
		MyNode.data = item;
		MyNode.left = null;
		MyNode.right = null;
		Node temp = root;
		
		if(root == null)
			root = MyNode;
		else
		{
			Node curr = root;
			while(curr != null)
			{
				parent = curr;
				if(MyNode.data > curr.data)
					curr = curr.right;
				else
					curr = curr.left;
			}
		}
		if(MyNode.data > parent.data)
			parent.right = MyNode;
		else
			parent.left = MyNode;
	}
	
	void printInorder(Node node)
	{
		if(node == null)
			return;
		printInorder(node.left);
		System.out.println(node.data + " ");
		printInorder(node.right);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		BST_001 b = new BST_001();
		while(true)
		{
			System.out.println("ENTER ELEMENT");
			int number = sc.nextInt();
			Node MyNode = new Node();
			MyNode.data = number;
			b.insert(number);
			b.printInorder(MyNode);
			
		}
	}
}
