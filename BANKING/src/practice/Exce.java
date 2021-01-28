package practice;
//unwanted event that disturbs the normal flow of the program. 
public class Exce 
{
	public static void main(String[] args) 
	{
		try
		{				
			int[] arr= {1,2,3};
			System.out.println("pin");
			//System.out.println(10/0);
			System.out.println(arr[2]);
			System.out.println(10/0);
			System.out.println();
		}
		catch(ArithmeticException c)
		{	
			//exception 
			
		}
		catch(ArrayIndexOutOfBoundsException c)
		{	
			//exception 
			
		}
		catch(NullPointerException c)
		{	
			//exception 
			
		}
		finally
		{
			System.out.println("hello in FINALLY");
		}
	}
}