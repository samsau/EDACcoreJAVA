package satish_sir_class02;
import java.util.*;
public class Prog03 {

	public static void main(String[] args) 
	{
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		hs.add(10);
		hs.add(30);
		hs.add(15);
		hs.add(20);
		hs.add(40);
		
		boolean status = hs.add(20);
		System.out.println("Status "+status);
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext())
		{
			Integer i = itr.next();
			System.out.println(i);
		}
		
	}

}
