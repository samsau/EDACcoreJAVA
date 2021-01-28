package factorial;

public class Factorial 
{
	static int factorial(int n)		//1 milli
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	static int  fact(int n)			//7 milli
	{
		if(n == 1 || n == 0)
		{
			return 1;
		}
		else
		{
			return n * fact(n-1);
		}
	}
	public static void main(String[] args) 
	{
		int n = 20;
		long startWR = System.currentTimeMillis();
		int res = fact(n);
		System.out.println(res);
		long endWR = System.currentTimeMillis();
		long ansWR = endWR - startWR;
		System.out.println(ansWR);
		System.out.println(startWR);
		System.out.println(endWR);
		long startWR1 = System.currentTimeMillis();
		res = factorial(n);
		System.out.println(res);
		long endWR1 = System.currentTimeMillis();
		long ansWR1 = endWR1 - startWR1;
		System.out.println(ansWR1);
		System.out.println(startWR1);
		System.out.println(endWR1);
	}
}
