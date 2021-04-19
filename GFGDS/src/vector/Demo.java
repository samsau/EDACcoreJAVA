package vector;

import java.util.Collections;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity());
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.add(5);
		Collections.reverse(v);
		v.addAll(v);
		System.out.println(v);
		System.out.println(v.capacity());
		v.add(11);
		System.out.println(v.capacity());
	}

}
