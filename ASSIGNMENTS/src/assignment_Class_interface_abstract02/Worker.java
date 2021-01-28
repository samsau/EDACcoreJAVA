package assignment_Class_interface_abstract02;
import java.util.*;
public class Worker implements MyInterface02 
{
	String Wname;
	long Wmobile;
	int Wage;
	double Wsal;
	Scanner sc=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter Details");
		System.out.println();
		System.out.println("Enter Worker NAME : ");
		Wname=sc.nextLine();
		System.out.println("Enter Worker MOBILE NO : ");
		Wmobile=sc.nextLong();
		System.out.println("Enter Worker AGE : ");
		Wage=sc.nextInt();
		System.out.println("Enter Worker SALARY : ");
		Wsal=sc.nextDouble();
		System.out.println("THANK U SIR/MAM");
	}
	public void showDetails()
	{
		System.out.println("SHOWING Details");
		System.out.println("Worker NAME "+Wname);
		System.out.println("Worker MOBILE NO "+Wmobile);
		System.out.println("Worker AGE "+Wage);
		System.out.println("Worker SALARY "+Wsal);
		System.out.println("THANK U SIR/MAM");
	}
}