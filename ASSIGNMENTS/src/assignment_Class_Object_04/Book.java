package assignment_Class_Object_04;
import java.util.*;
public class Book 
{
	Scanner sc=new Scanner(System.in);
	int id;
	String name;
	Double price;
	void accept()
	{
		System.out.println("Enter book id :");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name : ");
		name=sc.nextLine();
		System.out.println("Enter price :");
		price=sc.nextDouble();
	}
	void display()
	{
		System.out.println("Book id is :"+id);
		System.out.println("Name is : "+name);
		System.out.println("price is :"+price);
		System.out.println();
	}
	/*
	void displayAll(double arr)
	{
		System.out.println("Book id is :"+id);
		System.out.println("Name is : "+name);
		System.out.println("price is :"+price);
		System.out.println();
	}
	*/
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Book B[]=new Book[5];
		double[] arr=new double[5];
		for(int i=0;i<5;i++)
		{
			B[i]=new Book();
			B[i].accept();
			arr[i]=B[i].price;
		}
		Arrays.sort(arr);
		for(int i=0;i<5;i++)
		{
			B[i].display();
		}
		//System.out.println("the maximum price book is: "+arr[arr.length-1]);
		System.out.println("the sequence of printing the array is : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		//double z=arr.length-1;
	}
}
