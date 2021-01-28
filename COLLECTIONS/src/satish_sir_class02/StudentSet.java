package satish_sir_class02;

import java.util.HashSet;

import satish_sir_class01.Student;

public class StudentSet {

	public static void main(String[] args) 
	{
		Student s1 = new Student(101, "Atul");
		Student s2 = new Student(102, "Amit");
		Student s3 = new Student(103, "Mathuri");
		Student s4 = new Student(101, "Atul");
		Student s5 = new Student(102, "Amit");
		
		HashSet<Student> set = new HashSet<>();
		
		boolean status = set.add(s1);
		System.out.println("inserting student 1 "+ status);
		status =set.add(s2);
		System.out.println("inserting student 2 "+ status);
		status =set.add(s3);
		System.out.println("inserting student 3 "+ status);
		status =set.add(s4);
		System.out.println("inserting student 4 "+ status);
		status =set.add(s5);
		System.out.println("inserting student 5 "+ status);
		
		System.out.println("Size of the set "+set.size());
		
		
		
	}

}
