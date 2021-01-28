package linkedList;

public class Solution 
{
    private class node
    {
        String name;
        int age;
        node next;
    }
    
    node top = null;
    
    public void push(String na, int ag)
    {
        node MyNode = new node();
        MyNode.name = na;
        MyNode.age = ag;
        if(MyNode == null)
            return;
        MyNode.next = top;
        top = MyNode;
            
    }
    
    public boolean isEmpty()
    {
        return top == null;
    }
    public void peek()
    {
        if(!isEmpty())
        {
            System.out.println(top.name + " " + top.age);
        }
        else
        {
            return;
        }
    }
    public void pop()
    {
        if(top == null)
        {
            return;
        }
        top = top.next;
    }
    
    public static void main(String[] args) 
    {
        Solution sol = new Solution();
        sol.push("sasi",40);
        sol.push("srini", 30);
        sol.peek();
        sol.push("Pradeep", 35);
        sol.pop();
        sol.peek();
    }
}




