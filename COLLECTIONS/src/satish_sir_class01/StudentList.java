package satish_sir_class01;

import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(101, "Atul");
		Student s2 = new Student(102, "Amit");
		Student s3 = new Student(103, "Mathuri");
		
		ArrayList<Student> st = new ArrayList<>();
		
		System.out.println("just printing s1 : "+s1);
		/*
		 * without overriding toString() in Student class
		 * 
		 * satish_sir_class01.Student@7a81197d
		 */
		
		System.out.println("just printing s1 : "+s1);
		/*
		 * with overriding toString() in Student class
		 * 
		 * Student [id=101, name=Atul]
		 */
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
	
		System.out.println(st.toString());
		/*
		 * without overriding toString() in Student class
		 * 
		 * [satish_sir_class01.Student@7a81197d, 
		 * satish_sir_class01.Student@5ca881b5, 
		 * satish_sir_class01.Student@24d46ca6]
		 */
		System.out.println(st);
		/*
		 * after overriding toString() in Student class
		 */
	}

}
