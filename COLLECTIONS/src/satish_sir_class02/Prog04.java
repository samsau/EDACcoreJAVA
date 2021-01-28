package satish_sir_class02;
import java.util.*;

import satish_sir_class01.Student;
public class Prog04 {

	public static void main(String[] args) 
	{
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(5);
		set1.add(3);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(2);
		
		System.out.println(set1);
		System.out.println("first" + set1.first());
		System.out.println("first" + set1.last());
		
		TreeSet<String> set2 = new TreeSet<>();
		set2.add("Apple");
		set2.add("Banana");
		set2.add("Grapes");
		set2.add("Mango");
		set2.add("Papaya");
		
		System.out.println(set2);
		
		Student s1 = new Student(101, "Atul");
		s1.setMarks(95);
		Student s2 = new Student(102, "Amit");
		s1.setMarks(75);
		Student s3 = new Student(103, "Mathuri");
		s1.setMarks(80);
		
		TreeSet<Student> set3 = new TreeSet<>();
		set3.add(s1);
		set3.add(s2);
		set3.add(s3);
		
		System.out.println(set3);
		
		
		
		
		
	}
}
