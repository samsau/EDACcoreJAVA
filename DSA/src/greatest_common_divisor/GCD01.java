package greatest_common_divisor;
import java.util.*;
public class GCD01 
{
	static int GCD(int m, int n)
	{
		if(m==0)
			return n;
		else if(n==0)
			return m;
		else 
			return GCD(n%m,m);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int res = GCD(m,n);
		System.out.println(res);
		sc.close();
	}
}
