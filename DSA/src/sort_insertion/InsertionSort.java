package sort_insertion;

public class InsertionSort 
{
	void InsertionSort001(int arr[], int len)
	{
		for(int i = 1; i < len; i++)
		{
			int temp = arr[i];
			int j = i-1;
			
			while(j >= 0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
			
			for(int k = 0; k < len ; k++)
				System.out.print(arr[k] + "  ");
			System.out.print(" temp is " +temp);
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int[] arr = {5,4,10,1,6,2};
		int len = arr.length;
		long start = System.currentTimeMillis();
		InsertionSort in = new InsertionSort();
		in.InsertionSort001(arr, len);
		long end = System.currentTimeMillis();
		System.out.println("time taken " +(end - start));
	}
}