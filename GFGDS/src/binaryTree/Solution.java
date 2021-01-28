package binaryTree;

class Node
{
    Node left;
    int data;
    Node right;
    Node(int data)
    {
        this.data = data;
        left = right =null;
    }
}
public class Solution 
{
    
    Node root1, root2, root3, root4, root5;
    
    boolean identicalTrees(Node a, Node b)  
    { 
        if (a == null && b == null) 
            return true; 
              
        
        if (a != null && b != null)  
            return (a.data == b.data 
                    && identicalTrees(a.left, b.left) 
                    && identicalTrees(a.right, b.right)); 
   
        
        return false; 
    } 
    public static void main(String[] args) 
    {
        Solution tree = new Solution(); 
   
        tree.root1 = new Node(1); 
        tree.root1.right = new Node(3); 
        tree.root1.right.right = new Node(4); 
        tree.root1.right.left = new Node(5);
   
        tree.root2 = new Node(4); 
        tree.root2.left = new Node(1); 
        tree.root2.left.right = new Node(2); 
        tree.root2.left.right.right = new Node(3); 
        
        tree.root3 = new Node(3); 
        tree.root3.left = new Node(2); 
        tree.root3.right = new Node(1); 
        tree.root3.left.left = new Node(4);
   
        tree.root4 = new Node(4); 
        tree.root4.left = new Node(3); 
        tree.root4.left.left = new Node(2); 
        tree.root4.left.left.left = new Node(1);
        
        tree.root5 = new Node(1); 
        tree.root5.right = new Node(3); 
        tree.root5.right.right = new Node(2); 
        tree.root5.right.left = new Node(4);
   
        boolean res = tree.identicalTrees(tree.root1, tree.root2); 
        if(res == true)
        	System.out.println("YES");
        else
            System.out.println("NO");
        
        res = tree.identicalTrees(tree.root1, tree.root3); 
        if(res == true)
        	System.out.println("YES");
        else
            System.out.println("NO");
        
        res = tree.identicalTrees(tree.root1, tree.root4); 
        if(res == true)
        	System.out.println("YES");
        else
            System.out.println("NO");
        
        res = tree.identicalTrees(tree.root1, tree.root5); 
        if(res == true)
        	System.out.println("YES");
        else
            System.out.println("NO");
        
    }
}