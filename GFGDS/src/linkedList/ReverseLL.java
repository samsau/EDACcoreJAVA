package linkedList;
import java.util.*;
public class ReverseLL 
{
	static void reverse(LinkedList<Integer>ll)
	{
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		for(int i = ll.size()-1; i>=0; i--)
			ll1.add(ll.get(i));
		System.out.println("printing the reverse");
		System.out.println(ll1);	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<>();
		for(int i = 0;i<5; i++)
			ll.add(sc.nextInt());
		System.out.println(ll);
		
		//using Collections class.
		
//		System.out.println("USING COLLECTION CLASS");
//		Collections.reverse(ll);
//		System.out.println(ll);
		System.out.println("calling reverse " );
		reverse(ll);
		sc.close();
	}
}
