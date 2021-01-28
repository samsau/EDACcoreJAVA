package assignment_03_BANKING;
import java.util.*;
public class Banking02
{
	int no_of_customer;
	String customer_name;
	int mobile;
	int account_no;
	int balance;
	//int customer_id[]=new int[no_of_customer];
	int amount=0;
	int counter=0;
	Scanner sc=new Scanner(System.in);
	public void createAccount()
	{
		System.out.println("DETAILS:");
		System.out.println("\n*minimum balance in account while opening is 500");
		System.out.println("DO YOU WANNA CONTINUE ----->"
			+ "\n\n1. YES  OR  2. NO");
		int input=sc.nextInt();
		if(input==1)
		{
			System.out.println("PLEASE ENTER YOUR FULL NAME MAM/ SIR ----->");
			customer_name=sc.next();
			System.out.println("PLEASE ENTER YOU MOBILE NUMBER ----->");
			mobile=sc.nextInt();
			Random rand = new Random();
			account_no = rand.nextInt(40);
			System.out.println("\nYOUR ACCOUNT NO IS -----> "+account_no);
			System.out.println("\nENTER AMOUNT TO BE DEPOSIT ----->");
			amount=sc.nextInt();
			if(amount>=500)
			{
				balance+=amount;
			}
			else
			{
				balance+=500;
			}
			System.out.println("BALANCE -----> "+balance);
		}
		else if(input!=1)
		{
			System.out.println("BYE-BYE");
			System.exit(0);
		}
	}
	public void checkAmount()
	{
		System.out.println("PLEASE ENTER LAST 4 DIGITS OF YOUR ACCOUNT NO ----->");
		int account=sc.nextInt();
		System.out.println("PLEASE ENTER 10 DIGITS OF YOUR MOBILE NO ----->");
		int mobile_no=sc.nextInt();
		if(account==account_no && mobile_no==mobile)
		{
			System.out.println("NAME IS -----> "+customer_name);
			System.out.println("MOBILE NO IS -----> "+mobile);
			System.out.println("YOUR BALANCE IS -----> "+balance);	
		}	
		else
		{
			System.exit(0);
		}
	}
	public void depositAmount()
	{
		checkAmount();
		System.out.println("\n ENTER THE AMOUNT YOU WANNA ADD ----->");
		amount=sc.nextInt();
		balance+=amount;
		System.out.println("YOUR BALANCE IS -----> "+balance);
	}
	public void withdrawlAmount()
	{
		checkAmount();
		System.out.println("ENTER AMOUNT TO BE WITHDRAWL ----->");
		amount=sc.nextInt();
		if(amount==balance)
		{
			System.out.println("YOUR BALANCE CANNOT BE NULL");
		}
		else if(amount>balance)
		{
			System.out.println("NOT SUFFICIENT BALANCE");
		}
		else if(amount<balance)
		{
			balance-=amount;
			System.out.println("NEW BALANCE IS -----> "+balance);
		}
		else
		{
			System.out.println("COME AND TRY AGAIN");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Banking02 B=new Banking02();
		char ch;
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("\n\n\t\t\tWELCOME to HOUSE BANK");
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("\n1. CREATE ACCOUNT");
			System.out.println("2. CHECK AMOUNT");
			System.out.println("3. DEPOSIT AMOUNT");
			System.out.println("4. WITHDRAWL AMOUNT");
			
			int w_choice=sc.nextInt();
			switch(w_choice)
			{
				case 1: 
					{
						if(B.counter==0)
						{
							B.createAccount();
							B.counter++;
						}
						else if(B.counter>0)
						{
							System.out.println("TRYING TO MAKE MULTIPLE ACCOUNTS");
							System.out.println("SORRY NOT POSSIBLE");
							break;
						}
					}
					break;
				
				case 2:
					{
						B.checkAmount();
					}
					break;
				
				case 3:
					{
						B.depositAmount();
					}
					break;
				
				case 4:
					{
						B.withdrawlAmount();
					}
					break;
				default:
					System.out.println("\nSORRY...!!! YOU ENTERERD A WRONG CHOICE");
			}	
			System.out.println("\ndo you want of to continue");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		System.out.println("\n\nTHANKYOU FOR VISITING US");
		sc.close();
	}
}
