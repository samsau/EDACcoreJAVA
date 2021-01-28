package sort_bubble;
public class BubbleSort001 
{
	void bubbleSort001()
	{
		int[] arr = {10,5,8,3,9,15,7};
		int n = arr.length;
		for(int i = 0; i<n-1; i++)
		{
			for(int j = 0; j<n-i-1; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			for(int k = 0; k<n; k++)
			{
				System.out.print(" "+arr[k]);
			}
			System.out.println();
		}
	}
	void bubbleSort002()
	{
		int[] arr = {10,5,8,3,9,15,7};
		int n = arr.length;
		boolean swap=false;
		for(int i = 0; i<n-1;i++)
		{	for(int j = 0; j<n-i-1; j++)
			{
				swap = false; 
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if (swap == false) 
	            break;
			for(int k=0;k<n;k++)
				System.out.print(" "+arr[k]);
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		
		BubbleSort001 bs = new BubbleSort001();
		System.out.println("bubbleSort001 SIMPLE IMPLEMENTATION");
		bs.bubbleSort001();
		System.out.println("bubbleSort002 LATEST IMPLEMENTATION");
		bs.bubbleSort002();
	}
}

/*
 * GOAL : LARGER ELEMENT AT THE LAST
 * ----------------------------------
 * 
 * INPUT : 75, 25, 45, 90, 15, 12, 11
 * 
 * PASS 1 : (25 45 75 15 12 11 ) 90			0-6 comparison
 * 
 * PASS 2 : (25 45 15 12 11 ) 75 90			0-5 comparison
 * 
 * PASS 3 : (25 15 12 11 ) 45 75 90			0-4 comparison
 * 
 * PASS 4 : (15 12 11 ) 25 45 75 90			0-3 comparison
 * 
 * PASS 5 : (12 11 ) 15 25 45 75 90			0-2 comparison
 * 
 * PASS 6 : (11 ) 12 15 25 45 75 90			0-1 comparison
 */

/*
 * While performing bubble sort any pass no of swap = 0, then swap the algo. 
 * 
 *  therefore, array is already sorted. with this modification bubble sort 
 *  
 *  time complexity is => O(n)
 *  
 *  EXAMPLE : 
 *  
 *  INPUT = 50 10 20 30 40
 *  SWAP = 0;
 *  
 *  PASS 1 : (10 20 30 40 ) 50
 *  SWAP = 4;
 *  
 *  PASS 2 : (10 20 30 ) 40 50
 *  SWAP = 0;
 *  
 *  STOP THE ALGORITHM AS ALREADY SORTED
 *  
 *  BEST CASE = O(n)
 *  AVERAGE CASE = O(n^2)
 *  WORST CASE = O(n^2)
 */

/*
 * Bubble sort with 'n' elements requires 'n-1' passes.
 * 
 * total comparison = (n-1)+(n-2)+(n-3)+...+1 = (n(n-1))/2 = O(n^2) [Every case]
 * 
 * total swaps 	= minimum = 0
 * 				= maximum = (n(n-1))/2 = O(n^2)
 * 
 * Time complexity  = total comparisons + total swaps
 * 					= O(n^2) + O(n^2)
 * 					= O(n^2) [every case]
 */


