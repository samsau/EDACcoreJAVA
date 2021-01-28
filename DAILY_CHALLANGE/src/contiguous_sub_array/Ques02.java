package contiguous_sub_array;

public class Ques02 
{
	static int subArraySum(int[] a)
	{
		int overallSum = 0;
		int currentSum = 0;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(currentSum > 0)
				currentSum += a[i];
			else
				currentSum = a[i];
			
			if(currentSum > overallSum)
				overallSum = currentSum;
		}
		return overallSum;
	}
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,-9,5};
		System.out.println(subArraySum(a));
	}
}