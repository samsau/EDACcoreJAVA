package practice;

public class Swastic 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int  n = 11;
		for(int i = 1 ; i <=  n ;i++)
		{
			for(int j = 1; j <=  n; j++)
			{
				if(i == 1)
				{
					if(j==n || j<= n/2+1 )
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}	
	  			}
				else if(i <=  n/2)
				{
					if(j==n || j== n/2+1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					} 
				}
				else if(i ==  n/2+1)
				{
					System.out.print("*");
	 			}
				else if(i <  n)
				{
					if(j == 1 || j==n/2+1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if(j==1 || j>= n/2+1 )
					{
						System.out.print("*");
		  			}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
