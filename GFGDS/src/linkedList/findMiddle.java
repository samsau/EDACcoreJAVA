package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class findMiddle 
{
	static void findMiddleElement(LinkedList<Integer> ll)
	{
		Iterator<Integer> itr = ll.iterator();	//turtle
		Iterator<Integer> itr1 = ll.iterator();	//rabbit
		
		Integer i1 = null;
		Integer i2 = null;
		
		while(itr1.hasNext())
		{
			i1 = itr.next();
			i2 = itr1.next();
			if(itr1.hasNext())
				i2 = itr1.next();
		}
		System.out.println(i1);
		System.out.println(i2);
	}
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER the number of elements");
		int n = sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i = 0; i < n ; i++)
			ll.add(sc.nextInt());
			
		findMiddleElement(ll);
		
		sc.close();
	}
}
