package assignment_02;

public class QUES02 
{
	public static void main(String[] args)
	{
		int space=20;
		int i,j,k;
		for(i=1;i<=9;i++)
		{
			for(k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			space--;
			for(j=1;j<=i;j++)
			{
				System.out.print(j+" " );
			}
			System.out.println();
		}
	}
}

/*
OUTPUT

				1 
			   1 2 
			  1 2 3 
			 1 2 3 4 
			1 2 3 4 5 
		   1 2 3 4 5 6 
		  1 2 3 4 5 6 7 
		 1 2 3 4 5 6 7 8 
		1 2 3 4 5 6 7 8 9 

*/