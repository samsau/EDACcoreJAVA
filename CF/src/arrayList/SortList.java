package arrayList;

import java.util.*;

public class SortList {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("ADDING ITEM IN LIST");
		for (int i = 0; i < 5; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		
		System.out.println("finding maximum");
		Collections.sort(list);
		System.out.println("sorted list is");
		System.out.println(list);
		int size = list.size()-1;
		Integer max = list.get(size);
		
		System.out.println("max is : "+max);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer s = itr.next();
			if(s < max/2) {
				System.out.println(s+" is less than avg");
			}else {
				System.out.println(s+" is more than avg");
			}
		}
		sc.close();
	}
}
