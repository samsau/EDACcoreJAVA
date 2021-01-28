package satish_sir_class02;
import java.util.*;
public class Prog02 {

	public static void main(String[] args) 
	{
		HashSet<String> h = new HashSet<>();
		h.add("Apple");
		h.add("Banana");
		h.add("Grapes");
		h.add("Mango");
		h.add("Papaya");
		
		System.out.println("Size : " + h.size());

		boolean status = h.add("Apple");
		System.out.println("inserting apple status : "+ status);
		
		status = h.add("Pineapple");
		System.out.println("inserting Pineapple status : "+ status);
		
		
		/*
		 * we don't have get method in HashSet so we need to iterate
		 */
		Iterator<String> itr = h.iterator();
		while(itr.hasNext())
		{
			String fr = itr.next();
			System.out.println(fr);
		}
		
	}
}
