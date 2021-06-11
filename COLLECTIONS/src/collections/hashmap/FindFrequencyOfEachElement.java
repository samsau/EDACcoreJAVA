package collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;
/*
 * to count the repetition of each value
 */
public class FindFrequencyOfEachElement {
	
	public static void main(String[] args) {
//		String s = "saurabh kumar meghana mali manoj bhoe";
		String s = "abacd";
//		Scanner sc = new Scanner(System.in);
//		String s = sc.nextLine();
		char[] c = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();		
		for(int i = 0;i<c.length;i++) {
			if(hm.get(c[i])==null) {
				hm.put(c[i], 1);
			} else {
				hm.put(c[i], hm.get(c[i])+1);
			}
		}
		
		hm.forEach((k,v)->System.out.println(k+" - "+v));
		
		System.out.println("printing value greater than 1");
		
		hm.entrySet().stream().filter((e)->e.getValue()>1).forEach((e)->{
			System.out.println(e.getKey()+ " - "+e.getValue());
		});
		
		System.out.println("printing value greater than 2");
		
		hm.entrySet().stream().filter((k)->k.getValue() > 2).forEach(k->{
			System.out.println(k.getKey() + " - " + k.getValue());
		});
		
		System.out.println("printing value greater than 0");
		
//		hm.entrySet().stream().filter((k)->k.getValue() == 1).forEach(k->{
//			System.out.println(k.getKey() + " - " + k.getValue());
//		});
		
		hm.entrySet().stream().forEach((k)->{
			int flag = 0;
			if(k.getValue() == 1 && flag == 1)
				{
					System.out.println(k.getKey());
//					System.exit(0);
					flag++;
				}
		});
//		.forEach(k->{
//			System.out.println(k.getKey() + " - " + k.getValue());
//		});
	}
}
