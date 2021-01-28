package fibbinoci_series;

//ALGORITHM : it is combination of sequence of finite steps to solve a problem.

public class Fibbinoci 
{
	static int fibb(int n)
	{
		int fib=0;
		int a=0;
		int b=1;
		for(int i = 0;i<n;i++)
		{
			fib = a+b;
			a=b;
			b=fib;
		}
		return fib;
	}
	static int fib(int n)
	{
		if(n==0||n==1)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) 
	{
		int n = 5;
		int fibno=fib(n);
		System.out.println(fibno);
		fibno = fibb(n);
		System.out.println(fibno);
	}
}
