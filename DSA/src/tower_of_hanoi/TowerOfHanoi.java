package tower_of_hanoi;
import java.util.*;
public class TowerOfHanoi 
{
	static int count = 0;
	static void tOH(int n, char Left, char Middle, char Right)
	{
		if(n==0)
		{
			return;
		}
		else
		{
			count++;
			tOH(n-1,Left,Right,Middle);
			System.out.println(n + "[" + Left + "->" + Right + "]");
			tOH(n-1,Middle,Left,Right);
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		char tower1=sc.nextLine().charAt(0);
		char tower2=sc.nextLine().charAt(0);
		char tower3=sc.nextLine().charAt(0);
		
		tOH(n, tower1, tower2, tower3);
		System.out.println("number of exceution "+count);
		sc.close();
	}
}