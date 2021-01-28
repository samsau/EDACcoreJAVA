package arrayList;
import java.util.*;
public class PrintSecondLargest 
{
	
	static void secondLargest(List<Integer>list)
	{
		System.out.println("INTO SECOND LARGEST FUNCTION : ");
		Collections.sort(list);
		
		System.out.println(list.get(list.size()-2));
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < 5; i++)
			list.add(sc.nextInt());
		
		/*
		list.add(1);
		list.add(34);
		list.add(12);
		list.add(24);
		list.add(23);
		list.add(9);
		*/
		
		
		
		System.out.println("simple list");
		System.out.println(list);
		
		
		secondLargest(list);
		
		
//		Collections.sort(list);
//		System.out.println(list);
//		
//		int s = list.size();
//		
//		System.out.println("SIZE OF LIST IS "+ s);
//		
//		System.out.println("printing second largest");
//		System.out.println(list.get(list.size()-2));
		sc.close();
	}
}