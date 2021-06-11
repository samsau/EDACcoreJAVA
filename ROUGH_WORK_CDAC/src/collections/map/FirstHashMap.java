package collections.map;

import java.util.HashMap;

public class FirstHashMap {
	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(3, 5);
		hm.put(19, 9);
		hm.put(4, 3);
		hm.put(null, 6);
		
		hm.forEach((k,v) -> {
			System.out.println(hm.get(k) +" "+ hm.get(v));
		} );
		
		System.out.println("entry set");
		
		hm.entrySet().stream().forEach((k)->{
			if(k.getValue() > 5 )
			System.out.println(k.getKey() + " " + k.getValue());
		});
	}
}
