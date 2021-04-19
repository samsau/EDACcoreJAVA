package collections.hashmap;

import java.util.HashMap;
/*
 * to count the repetition of each value
 */
public class FindFrequencyOfEachElement {
	
	public static void main(String[] args) {
		String s = "saurabh kumar meghana mali manoj bhoe";
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
	}
}
