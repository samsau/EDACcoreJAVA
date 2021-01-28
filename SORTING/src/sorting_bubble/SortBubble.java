package sorting_bubble;

public class SortBubble 
{
	static void bubbleSort(int arr[], int len)
	{
		for(int i = 0; i < len-1 ; i++)					// i=0 to n-1
		{
			for( int j = 0; j < len - i -1; j++)		// j=0 to n-1
			{
				if(arr[j] > arr[j+1])					// check next element
				{
					int temp = arr[j];					//swap
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			for(int k = 0; k<len; k++)
				System.out.print(arr[k] + " ");
			System.out.println();
		}
	}
	static void printfun(int arr[], int len)
	{
		for(int i = 0; i < len ; i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String[] args)
	{
		int[] a = {60, 30, 40, 20, 10, 90, 50};
		int len = a.length;
		printfun(a, len);
		System.out.println();
		bubbleSort(a, len);
		System.out.println();
		printfun(a, len);
	}
}
