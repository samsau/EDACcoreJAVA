package cdac.darkHorses.challange01;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class FirstAssignment {

//	1. How to reverse a String in Java?
	public void ques01() {
		String s = "saurabh";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}
	
//	2. How to swap two numbers without using a third variable?
	public void ques02() {
		int a = 5;
		int b = 4;
		System.out.println("a = "+a+" b = "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a+" b = "+b);
	}
//	3. Java Program to check if a vowel is present in the string?
	public void ques03() {
		String s = "sarbh";
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			} 
		}
		if(count>0) {
			System.out.println("vowel is present");
		} else {
			System.out.println("vowel is not present");
		}
	}
//	4. Java program to check if the given number is Prime?
	public void ques04() {
		int no = 13;
		int div = 2;
		while(div*div <= no) {
			if(no%div == 0)
				break;
			div++;
		}
		if(div*div>no) {
			System.out.println("it is prime");
		} else {
			System.out.println("it is not prime");
		}
	}
//	5. Fibonacci Series using recursion
//	6. Check if a List of integers contains only odd numbers?
//	Java Interview Questions and Solutions
//	7. Palindrome Check
//	8. How to remove Whitespaces from String
//	9. How to remove leading and trailing whitespaces from a string?
//	10. Sorting an array in Java?
//	11. How to Create a Deadlock Scenario Programatically?
//	12. Find factorial of an integer?
	public void ques12() {
		int no = 4;
		int fact = 1;
		for(int i =1; i<=no ;i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
//	13. Reverse a Linked List?
	public void ques13() throws Exception {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(23);
		l.add(45);
		l.add(13);
		l.add(48);
		l.add(10);
		System.out.println(l);
		Iterator<Integer> rs =  l.descendingIterator();
		while(rs.hasNext()) {
			System.out.print(rs.next()+", ");
		}
		System.out.println(l);
		Collections.reverse(l);
		System.out.println("collections.reverse "+l);
//		LinkedList<Integer> l1 = new LinkedList<Integer>();
//		for(int i=0;i<l.size();i++) {
//			l1.addFirst(l.get(i));
//		}
//		System.out.println(l1);
	}
	
//	14. How to implement Binary Search?
	public static void binarySearch(int arr[],int p, int q, int key) {
		int mid = (p+q+1)/2;
		if(arr[mid]==key) {
			System.out.println("key found at position "+mid);
		} else {
			if(arr[mid] < key) {
				mid = (p+mid)/2;
				binarySearch(arr, p, mid-1, key);
				System.out.println("in if condition");
			} else if(arr[mid] > key) {
				mid = (q+mid)/2;
				binarySearch(arr, mid+1, q, key);
				System.out.println("in else condition");
			}
		}
	}
	public void ques14() {
		int[] arr = {12, 31, 45, 78, 96, 102, 124, 145};
		int key = 102;
		int p = 0;
		int q = arr.length-1;
		System.out.println(q);
//		int mid = (p+q)/2;
		binarySearch(arr, p, q, key);
	}
//	15. Merge Sort in Java?
//	16. Create a Pyramid of Characters in Java?
//	17. Check if two arrays contains same elements?
//	18. Sum of all elements in integer array?
//	19. Find second largest number in an array?
//	20. How to Shuffle an Array in Java?
//	21. How to find if a string is present in a text file?
//	22. How to print date in specific format?
//	23. How to merge two lists in java?
//	24. How to Sort HashMap by values?
//	25. remove all occurrences of a given character from input String?
	public static void main(String[] args) throws Exception {
		FirstAssignment fa = new FirstAssignment();
//		fa.ques01();
//		fa.ques02();
//		fa.ques03();
//		fa.ques04();
//		fa.ques12();
//		fa.ques13();
		fa.ques14();
//		System.out.println(args);
	}
}
