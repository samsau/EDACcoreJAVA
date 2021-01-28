package two_sorted_array;

public class Ques03 
{
	static void merge(int[] a1, int[]a2)
	{
		int a1len = a1.length;
		int a2len = a2.length;
		
		for(int i = 0 ; i < a1.length ; i++)
		{
			for(int j = 0 ; j < a2.length+1 ; j++)
			{
				if(i < a1len && j < a2len)
				{
					if(a1[i] > a2[j])
					{
						int temp = a1[i];
						a1[i] = a2[j];
						a2[j] = temp;
					}
				}
			}
		}
		System.out.println("First array is : ");
		for(int i = 0 ; i < a1.length ; i++)
		{
			System.out.print(a1[i] + " ");
		}
		for(int i = 0 ; i < a2.length; i++)
		{
			for (int j = 1; j < a2.length; j++) 
			{
				if(a2[i] > a2[j])
				{
					int temp = a2[i];
					a2[i] = a2[j];
					a2[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Second array is : ");
		for(int j = 0 ; j < a2.length ; j++)
		{
			System.out.print(a2[j] + " ");
		}
	}
	public static void main(String[] args) 
	{
		int[] a1 = {1,5,9,10,15,20};
		int[] a2 = {2,3,8,13};
		
		merge(a1,a2);
		
	}
}
