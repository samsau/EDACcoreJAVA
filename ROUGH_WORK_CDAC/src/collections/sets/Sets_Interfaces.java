package collections.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.Vector;

public class Sets_Interfaces {

	public void list01() {
		
	}
	public void list1() {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(23);
		l.add(13);
		l.add(45);
		l.add(3);
		l.add(4);
		l.add(1);
		l.add(5);
		l.add(46);
		l.add(43);
		System.out.println(l.size());
		System.out.println("if list contains 45 or not :"+ l.contains(45));
		System.out.println(l);
		System.out.println(l.set(2, 46));
		System.out.println(l);
		l.addAll(l);
		System.out.println(l);
		l.addAll(2, l);
		System.out.println(l);
	}
	
	public void list2() {
		Vector<Integer> v = new Vector<Integer>();
		v.add(34);
		v.add(90);
		v.addElement(45);
		System.out.println(v);
		v.addAll(v);
		System.out.println(v);
	}
	
//	to find middle in linked list
	public void list3() { 
		List<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(75);
		l.add(65);
		l.add(76);
		l.add(45);
		l.add(23);
		l.add(13);
		int a = 0;
		System.out.println(l);
		Iterator<Integer> itr = l.iterator();
		Iterator<Integer> itr1 = l.iterator();
		while(itr.hasNext()) {
			itr.next();
			a = itr1.next();
			if(itr.hasNext()) {
				itr.next();
			}
		}
		System.out.println(a);
	}
	public void mapfun() {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		m.put(1, 2);
		m.put(2, 4);
		m.put(null, 5);
		System.out.println(m.put(null, 7));
		System.out.println(m);
		
	}
//	print 3rd largest
	public void list4() {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(75);
		l.add(65);
		l.add(76);
		l.add(45);
		l.add(23);
		l.add(13);
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(l.get(l.size()-3));
	}
	
//	Write a Java program to search an element in a array list
	public void list5() {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(12);
		l.add(75);
		l.add(65);
		l.add(76);
		l.add(45);
		l.add(23);
		l.add(13);
		int key = 75;
		System.out.println(l.contains(key));
	}
	
	public void set1() {
		LinkedHashSet<Integer> s = new LinkedHashSet<Integer>();
		s.add(69);
		s.add(26);
		System.out.println(s.add(null));
		System.out.println(s.add(56));
		System.out.println(s.add(56));
		System.out.println(s.add(null));
		System.out.println("add all" + s.addAll(s));
		System.out.println(s);
	}
	
	public void set2() {
		HashSet<Integer> s = new HashSet<Integer>();
		s.add(69);
		s.add(26);
		System.out.println(s.add(null));
		System.out.println(s.add(56));
		System.out.println(s.add(56));
		System.out.println(s.add(null));
		s.addAll(s);
		System.out.println(s);
	}
	
	public void set3() {
		TreeSet<Integer> s = new TreeSet<Integer>();
		TreeSet<Integer> s1 = new TreeSet<Integer>();
		s.add(34);
		s.add(45);
		s.add(13);
		s.add(24);
		s.add(50);
		s.add(90);
		s.add(1);
		s1.add(2);
		s1.add(5);
		s1.add(9);
		s1.add(10);
		System.out.println(s);
		System.out.println(s.headSet(24)); // substring(starting to end-1)
		System.out.println(s.tailSet(24)); // start to end(inclusive)
		System.out.println(s.clone());
		System.out.println(s.contains(90));
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println("retain all "+s.retainAll(s1)); // boolean
		System.out.println(s);
		System.out.println(s1);
		System.out.println("poll first "+s.pollFirst());
		System.out.println("Poll last "+s.pollLast());
	}
	
//	default natural sorting
	//comparable : obj1.compareTo(obj2);
	public void set4() {	
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		System.out.println(t);
	}
	
//	comparator : compare(obj1, obj2);
	class MyComparator implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			String i1 = o1.toString();
			String i2 = (String)o2;
			return i1.compareTo(i2);
		}
	}
//	customized sorting.
	public void set5() {
		TreeSet<String> t = new TreeSet<String>(new MyComparator());
		t.add("meghana");
		t.add("saurabh");
		t.add("tanu");
		t.add("manoj");
		t.add("milan");
		t.add("aditya");
		System.out.println(t);
	}

	public static void main(String[] args) {
		Sets_Interfaces ss = new Sets_Interfaces();
//		ss.list01();
//		ss.list1();
//		ss.list2();
//		ss.list3();
//		ss.list4();
//		ss.list5();
//		ss.set1();
//		ss.set2();
//		ss.set3();
//		ss.set4();
//		ss.set5();
		ss.mapfun();
//		System.out.println(ss);
		
	}
}
