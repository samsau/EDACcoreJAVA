package assignment_Class_interface_abstract02;
import java.util.*;
public class Manager implements MyInterface02
{
	String Mname;
	long Mmobile;
	int Mage;
	double Msal;
	
	static int letsdo;
	static
	{
		letsdo=20000000;
	}
	
	Scanner sc=new Scanner(System.in);
	public void getDetails()
	{
		System.out.println("Enter Manager Details");
		System.out.println("Enter Manager NAME : ");
		Mname=sc.nextLine();
		System.out.println("Enter Manager MOBILE NO : ");
		Mmobile=sc.nextLong();
		System.out.println("Enter Manager AGE: ");
		Mage=sc.nextInt();
		System.out.println("Enter Manager SALARY : ");
		Msal=sc.nextDouble();
		System.out.println("VALUE OF LETSDO IS : "+letsdo);
		System.out.println("THANK U SIR/MAM");
	}
	public void showDetails()
	{
		System.out.println("SHOWING Details");
		System.out.println("Manager NAME "+Mname);
		System.out.println("Manager MOBILE NO "+Mmobile);
		System.out.println("Manager AGE "+Mage);
		System.out.println("Manager SALARY "+Msal);
		System.out.println("VALUE OF LETSDO IS : "+letsdo);
		System.out.println("THANK U SIR/MAM");
	}
	
}
