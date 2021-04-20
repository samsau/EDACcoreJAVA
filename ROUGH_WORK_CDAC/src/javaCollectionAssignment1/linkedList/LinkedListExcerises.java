package javaCollectionAssignment1.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListExcerises {
//	1. Write a Java program to append the specified element to the end of a linked list of names. 
//	-Write a Java program to iterate through all elements in a linked list starting at the specified position. 
	public void ques01(List<String> list) {
		Scanner sc = new Scanner(System.in);
		int pos = sc.nextInt();
		ListIterator<String> itr = list.listIterator(pos);
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
//	-Write a Java program to iterate a linked list in reverse order. 
	public void ques02(List<String> list) {
		ListIterator<String> itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
//	-Write a Java program to insert the specified element at the specified position in the linked list. 
	public void ques03(List<String> list) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String s = sc.nextLine();
		list.add(i, s);
		System.out.println(list);
		sc.close();
	}
//	
//	public void ques03a(List<String> list) {
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		String s = sc.nextLine();
//		int counter = 0;
//		Iterator<String> itr = list.iterator();
//		while(itr.hasNext()) {
//			if(counter == i) {
//				list.add(s);				
//			}
//			counter++;
//		}
//		System.out.println(list);
//		sc.close();
//	}
	
//	-Write a Java program to insert elements into the linked list at the first and last position. 
	public void ques04(LinkedList<String> list) {
		list.addFirst("Aditya");
		list.addLast("baraskar");
		System.out.println(list);
	}
//	-Write a Java program to insert the specified element at the front of a linked list. 
	public void ques05(LinkedList<String> list) {
		list.add(3, "Hero Honda");
		System.out.println(list);
	}
//	-Write a Java program to insert some elements at the specified position into a linked list. 
	public void ques06(LinkedList<String> list) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("murphy");
		l.add("go to hell");
		l.add("koi ni millega");
		list.addAll(4, l);
		System.out.println(list);
	}
//	-Write a Java program to get the first and last occurrence of the specified elements in a linked list. 
	public void ques07(LinkedList<String> list) {
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list);
	}
//	-Write a Java program to remove first and last element from a linked list. 
	public void ques08(LinkedList<String> list) {
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
	}
//	-Write a Java program of swap two elements in a linked list. 

	
//	-Write a Java program to join two linked lists. 
	public void ques10(LinkedList<String> list) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("murphy");
		l.add("go to hell");
		l.add("koi ni millega");
		list.addAll(list.size(), l);
		System.out.println(list);
	}
//	-Write a Java program to check if a particular element exists in a linked list. 
	public void ques11(LinkedList<String> list) {
		System.out.println(list.contains("saurabh"));
	}
//	-Write a Java program to convert a linked list to array list. 

//	-Write a Java program to compare two linked lists. 

//	-Write a Java program to test an linked list is empty or not. 

//	-Write a Java program to replace an element in a linked list.

	public static void main(String[] args) {
		LinkedListExcerises ll = new LinkedListExcerises();
		LinkedList<String> list=new LinkedList<String>();
		list.add("Meghana");
		list.add("Tanuja");
		list.add("Saurabh");
		list.add("Manoj");
		list.add("Milan");
		list.add("Mayank");
//		ll.ques01(list);
//		ll.ques02(list);
//		ll.ques03(list);
//		ll.ques04(list);
//		ll.ques05(list);
//		ll.ques06(list);
//		ll.ques07(list);
//		ll.ques08(list);
//		ll.ques09(list);
		ll.ques10(list);
	}
}
