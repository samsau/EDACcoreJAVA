package practice;
import java.util.*;
public class Matrix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of PERSONAL SYSTEMS");
		int nodes =sc.nextInt();
		int[][] conn = new int[nodes][nodes];
		
		
		for(int i = 0; i < nodes ; i++)
		{
			for(int j = 0; j <= i ; j++)
			{
				if(i == j)
				{
					conn[i][j] = 0;
				}
				else
				{
					System.out.println("ENTER CABLE USED FOR SYSTEM "+j+ " to SYSTEM " +i+ " is ");
					conn[i][j] = conn[j][i] = sc.nextInt();
				}
			}
		}
		
		System.out.println("FULL MATRIX");
		
		for(int i = 0; i < nodes ; i++)
		{
			for(int j = 0; j < nodes; j++)
			{
				System.out.print(conn[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
