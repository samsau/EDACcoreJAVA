package assignment_Class_interface_abstract01;
import java.util.Scanner;
public class Bank implements Interface01
{
	Scanner sc=new Scanner(System.in);
	String name;
	long mobile_no;
	int account_no;
	double account_bal;
	
	public void getDetails()
	{
		
		System.out.println("Enter Details");
		System.out.println("Enter NAME : ");
		name=sc.nextLine();
		System.out.println("Enter MOBILE NO : ");
		mobile_no=sc.nextLong();
		System.out.println("Enter ACCOUNT NO : ");
		account_no=sc.nextInt();
		System.out.println("Enter BALANCE : ");
		account_bal=sc.nextDouble();
		System.out.println("THANK U SIR/MAM");
	}
	public void showDetails()
	{
		//Scanner sc=new Scanner(System.in);
		System.out.println("SHOWING Details");
		System.out.println("NAME "+name);
		//name=sc.nextLine();
		System.out.println("Enter MOBILE NO "+mobile_no);
		//mobile_no=sc.nextLong();
		System.out.println("Enter ACCOUNT NO "+account_no);
		//account_no=sc.nextInt();
		System.out.println("Enter BALANCE "+account_bal);
		//account_bal=sc.nextDouble();
		System.out.println("THANK U SIR/MAM");
	}
}
