package assignment_Class_Object_04;
import java.util.*;
public class Student {

	int rollno;
	String name;
	double marks;
	Scanner sc=new Scanner(System.in);
	
	Student()
	{
		System.out.println("into const");
	}
	
	void getDetails()
	{
		
		System.out.println("Enter RollNo : ");
		rollno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		name=sc.nextLine();
		System.out.println("Enter Marks : ");
		marks=sc.nextDouble();
		
	}
	
	void showDetails()
	{
		System.out.println("RollNo is : "+rollno);
		System.out.println("name is : "+name);
		System.out.println("Marks is : "+marks);
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*Student s1=new Student();
		s1.getDetails();
		s1.showDetails();
		Student s2=new Student();
		s2.getDetails();
		s2.showDetails();*/
		Student s[];
		s=new Student[2];
		for(int i=0;i<2;i++)
		{
			s[i]=new Student();		//it is first calling the constructor and then making memory
			s[i].getDetails();
		}
		for(int i=0;i<2;i++)
		{
			s[i].showDetails();
		}
	}
}
