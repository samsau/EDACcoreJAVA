package javaCollectionAssignment1.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListExcerises {
//	1. Write a Java program to create a new array list, 
//	add some Movie names (string) and print out the collection. 

//	-Write a Java program to insert an element into the array list at the first -position. 
	public void ques01() {
		List<String> list = new ArrayList<String>();
		list.add("Kranti");
		list.add(0, "Koi Mil Gya");
		list.add(0, "Life ho to aaisi");
		System.out.println(list);
	}
//	-Write a Java program to retrieve an element (at a specified index) from a given array list. 
	public void ques02() {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		list.add("Kranti");
		list.add("budha mil gya");
		list.add("dilwale");
		System.out.println(list.get(sc.nextInt()));
		sc.close();
	}
//	-Write a Java program to update specific array element by given element. 
	public void ques03(List<String> list) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String s = sc.nextLine();
		System.out.println(list.set(i, s));
		System.out.println(list);
		sc.close();
	}
//	-Write a Java program to remove the third element from a array list. 
	public void ques04(List<String> list) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println(list.remove(i));
		System.out.println(list);
		sc.close();
	}
//	-Write a Java program to search an element in a array list. 
	public void ques05(List<String> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println(list.contains("Tenet"));
		System.out.println(list);
		sc.close();
	}
//	-Write a Java program to sort a given array list. 
	public void ques06(List<String> list) {
		Collections.sort(list);
		System.out.println(list);
	}
//	-Write a Java program to reverse elements in a array list. 
	public void ques07(List<String> list) {
		Collections.reverse(list);
		System.out.println(list);
	}
//	-Write a Java program to empty an array list.
	public void ques08(List<String> list) {
		list.removeAll(list);
		System.out.println(list);
		list.clear();
		System.out.println(list);
	}
	public static void main(String[] args) {
		ArrayListExcerises al = new ArrayListExcerises();
		List<String> list = new ArrayList<String>();
		list.add("Bad Boys for Life");
		list.add("The Eight Hundred");
		list.add("My People My Homeland");
		list.add("Tenet");
		list.add("Sonic the Hedgehog");
		list.add("Dolittle");
		list.add("Jiang Ziya");
		list.add("A Little Red Flower");
		list.add("Shock Wave");
		list.add("Black Panther");
		list.add("Guardian of Galaxy");

//		al.ques01();
//		al.ques02();
//		al.ques03(list);
//		al.ques04(list);
//		al.ques05(list);
//		al.ques06(list);
//		al.ques07(list);
//		al.ques08(list);
	}
}
