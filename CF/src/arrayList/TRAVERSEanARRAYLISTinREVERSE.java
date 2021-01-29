package arrayList;
/*
 * Java Program to Traverse Through ArrayList in Reverse Direction
 */
import java.util.*;
public class TRAVERSEanARRAYLISTinREVERSE 
{
	static void traverseReverse(List<Integer> ll)
	{
		ListIterator<Integer> ltr = ll.listIterator(ll.size());
		while(ltr.hasPrevious())
			System.out.println(ltr.previous());
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> ll = new ArrayList<>();
		for(int i = 0; i<5; i++)
			ll.add(sc.nextInt());
		
		traverseReverse(ll);
		sc.close();
	}
	
}