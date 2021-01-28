package satish_sir_class01;
import java.util.*;
public class prog001 {

	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<>();
		
		System.out.println("ARRAYLIST IS  EMPLTY: " + l.isEmpty());
		
		l.add("APPLE");
		l.add("ORANGE");
		l.add("BANANA");
		l.add("PAPAYA");
		l.add(null);
		l.add("ORANGE");
		l.add("APPLE");
		l.add(null);
		
		System.out.println("APPROACH 1");
		System.out.println(l);
//		
//		System.out.println("APPROACH 2");
//		for(String s : l)
//			System.out.println(s);
		
		System.out.println("ARRAYLIST IS  EMPLTY: " + l.isEmpty());
		
		System.out.println("ARRAYLIST SIZE IS : " + l.size());
		
		System.out.println("CONTAINS APPLE "+ l.contains("APPLE"));
		
		System.out.println("CONTAINS APPLE "+ l.contains("apple"));
		
		String rem1 = l.remove(0);
		System.out.println("REMOVED ONE IS "+rem1);		//removes with respect to index
		
		boolean rem2 = l.remove("ORANGE");
		System.out.println("REMOVED TWO IS "+rem2);		//removes with respect to OBJECT
		
		boolean rem3 = l.remove("CHERRY");
		System.out.println("REMOVED THREE IS "+rem3);		//removes with respect to OBJECT
		
		l.add(0, "CHERRY");		//inserting at a given position
		System.out.println(l);
		
		l.set(0, "NO FRUIT");
		
		
		System.out.println("APPROACH 1");
		System.out.println(l);
		
//		System.out.println("APPROACH 3");
//		Iterator<String> itr = l.iterator();
//		while(itr.hasNext())
//		{
//			String ss = itr.next();
//			System.out.println(ss);
//		}
	}

}
