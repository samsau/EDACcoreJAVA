package satish_sir_class02;
import java.util.*;
public class prog01 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(10);
		ll.add(20);
		ll.addFirst(30);
		ll.add(15);
		ll.addLast(40);
		ll.add(59);
		
		System.out.println(ll);
		
		System.out.println("get first"+ ll.getFirst());
		System.out.println("get first"+ ll.getLast());
		
		ll.removeFirst();
		ll.removeLast();
	
	}
}
