package stingsfunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class abc{
    static void run(Object i)
   { 
       System.out.println("hello");
   }
   
   public static void run(String s)
   { 
       System.out.println("hi");
   }
}

public class NullChecking {
//	static int x;
//	int y=60;
//	
//	public NullChecking() {
//		System.out.println("constructor");
//	}
//	static{
//		System.out.println("static");
//		NullChecking n = new NullChecking();
//		n.y = 50;
//		System.out.println(n.y);
//	}
//	{
//		System.out.println("init");
//		x=10;
//		y=20;
//		System.out.println(x+" "+y);
//	}
	public static void main(String[] args) {
//	       abc.run(null);
		ArrayList<Integer> l = new ArrayList<Integer>();
		List<String> s = Collections.emptyList();
		s.add("saurabh");
		System.out.println(s);
		l.add(2);
		l.add(4);
		Collections.emptyList();
		System.out.println(l);
		l.add(6);
		System.out.println(l);
//		System.out.println("main");
//		NullChecking nn = new NullChecking();
//		System.out.println(nn.y);
	}
}

/*
 * static 
 * 50
 * main
 * 20
 * 
 */
