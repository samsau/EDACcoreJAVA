package sort_selection;

public class SelectionSort 
{
	static void selectionSort(int arr[])
	{
		int n = arr.length;
		for(int i = 0; i < n-1; i++)
		{
			int min = i;
			for(int j = i+1; j < n; j++)
			{	if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
			for(int k = 0; k < arr.length; k++)
				System.out.print(arr[k]+" ");
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		int[] a = {7,4,10,8,3,1};
		selectionSort(a);
		System.out.println("SELECTION SORT IS ");
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}