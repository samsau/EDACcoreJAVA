package tree_IN_PRE_POST;

public class BinaryTree_001 
{
	Node_001 root;
	void printInorder(Node_001 node)
	{
		if(node == null)
			return;
		printInorder(node.left);
		System.out.println(node.data + " ");
		printInorder(node.right);
	}
	void printPostorder(Node_001 node)
	{
		if(node == null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.println(node.data + " ");
	}
	void printPreorder(Node_001 node)
	{
		if(node == null)
			return;
		System.out.println(node.data + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	public static void main(String[] args) 
	{
		BinaryTree_001 tree = new BinaryTree_001();
		tree.root = new Node_001();
		tree.root.data = 1;
		tree.root.left = new Node_001();
		tree.root.left.data = 2;
		tree.root.right = new Node_001();
		tree.root.right.data = 3;
		tree.root.left.left = new Node_001();
		tree.root.left.left.data = 4;
		tree.root.left.right = new Node_001();
		tree.root.left.right.data = 5;
		System.out.println("preorder traversal of binary tree is : ");
		tree.printPreorder(tree.root);
		System.out.println("Inorder traversal of binary tree is : ");
		tree.printInorder(tree.root);
		System.out.println("Postorder traversal of binary tree is : ");
		tree.printPostorder(tree.root);
		
		
	}
}
