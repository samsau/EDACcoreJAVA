package practice;
import java.util.*;

public class Factorial 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER VALUE OF I");
		int n=sc.nextInt();
		int fact=1;
		
		// TODO Auto-generated method stub
		if(n==0)
		{
			System.out.println("1");
		}
		else
		{
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		}
		
		sc.close();
	}

}
