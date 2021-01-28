package practice;
import java.util.*;

public class Diagonal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[][] a=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
					System.out.print(a[i][j]);
			}
		}
		sc.close();
	}

}
