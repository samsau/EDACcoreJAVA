package arrayList;
import java.util.*;
public class ARRAYLIST001 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<>();
		l.add(5);
		
		for(int i = 0; i < 5; i++)
			l.add(sc.nextInt());
		
		//for each loop
		for(Integer d : l)
			System.out.println(d);
		
		System.out.println("using iterator");
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext())
		{
			Integer i = itr.next();
			System.out.println(i);
		}
		
		System.out.println("TO SORT THE ARRAY LIST");
		Collections.sort(l);
		System.out.println(l);
		
		System.out.println("TO REVESE THE ARRAY LIST");
		Collections.reverse(l);
		System.out.println(l);
		sc.close();
	}
}
