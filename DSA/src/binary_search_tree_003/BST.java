package binary_search_tree_003;
/*
 * BST is of two type.(BFS AND DFS)
 * 
 * BFS - in, pre, post
 * 
 * DFS -  
 */


public class BST 
{
	Node root;
	
	
	void insertNode(int data)
	{
		root = insertNode(root, data);
	}
	
	Node insertNode(Node root, int data)
	{
		if(root == null)
		{
			root = new Node(data);
//			root.data = data;
			return root;
		}
		if(data < root.data)
			root.left = insertNode(root.left, data);
		else
			root.right = insertNode(root.right, data);
		return root;
	}
	
	int min(Node root)
	{
		int minv = root.data;
		while(root.left != null)
		{
			minv = root.left.data;
			root = root.left;
		}
		return minv;
	}
	
	void delete(int data)
	{
		root = delete(root, data);
	}
	
	Node delete(Node root, int data)
	{
		if(root == null)
			return root;
		if(data < root.data)
			root.left = delete(root.left, data);
		else if(data > root.data)
		{
			root.right = delete(root.right, data);
		}
		else
		{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			
			root.data = min(root.right);
			root.right = delete(root.right, root.data);
		}
		return root;
	}
	
	void printInorder()
	{
		inorder(root);
	}
	void inorder(Node root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.println(root.data);
			inorder(root.right);
		}
	}
	
	public static void main(String[] args)
	{
		BST b = new BST();
		b.insertNode(50);
		b.insertNode(30);
		b.insertNode(20);
		b.insertNode(40);
		b.insertNode(70);
		b.insertNode(60);
		b.insertNode(80);
		System.out.println("INORDER PRINTING IS : ");
		b.printInorder();
		b.delete(20);
		System.out.println("INORDER PRINTING IS : ");
		b.printInorder();
		b.delete(70);
		System.out.println("INORDER PRINTING IS : ");
		b.printInorder();
	}
}
