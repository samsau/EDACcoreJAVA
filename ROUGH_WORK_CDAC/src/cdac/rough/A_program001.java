package cdac.rough;

import java.util.ArrayList;
import java.util.Arrays;

public class A_program001 {

	public static void ques01() {
		ArrayList<String> l = new ArrayList<String>();
		l.add("saurabh");
		l.add("meghana");
		l.add("vaibhav");
		l.add("aditya");
		l.add("sumit");
		System.out.println(l);
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("Kumar");
		l1.add("mali");
		l1.add("barasker");
		l1.add("upadhaya");
		l1.add("vyas");
		System.out.println(l1);
		int count=0;
		ArrayList<String> concat = new ArrayList<String>();
		for(int i =0 ; i<l.size();i++) {
			concat.add(l.get(count)+ " "+ l1.get(count));
			count++;
		}
		System.out.println(concat);
	}
	
	public static void ques02() {
		String s = "saurabh";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}
	
	public static void ques03() {
		String s = "saurabh";
		String ss = "";
		for(int i=s.length()-1; i>=0;i--) {
			char ch = s.charAt(i);			
			ss= ss+ch;
		}
		System.out.println(s);
		System.out.println(ss);
	}
	
	public static void ques04() {
		String s = "listen";
		String ss = "silent";
		int len1 = s.length();
		int len2 = ss.length();
		if(len1 != len2) {
			System.out.println("string are not anagram");
		} else {
			char[] arr1 = s.toLowerCase().toCharArray();
			char[] arr2 = ss.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("String are in anagram");
			}
		}
	}
	
	public static void main(String[] args) {
//		ques01();
//		ques02();
//		ques03();
		ques04();
	}
}
