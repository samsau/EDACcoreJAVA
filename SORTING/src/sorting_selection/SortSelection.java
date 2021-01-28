package sorting_selection;

public class SortSelection 
{
	static void SelectionSort(int a[], int len)
	{
		for(int i = 0; i < len - 1; i++)			// i = 0 to len-1
		{
			int min = i;
			for(int j = i+1; j < len; j++)			// j = i+1 to len
			{
				if(a[j] < a[min])
				{
					min = j;
				}
			}
			int temp = a[min];						// sorting at last.
			a[min] = a[i];
			a[i] = temp;
			for(int k = 0; k < len; k++)
				System.out.print(a[k]+" ");
			System.out.println();
		}
	}
	static void printFun(int a[], int len)
	{
		for(int i = 0; i < len; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int[] a = {60, 30, 40, 20, 10, 90, 50};
		int len = a.length;
		printFun(a, len);
		System.out.println();
		SelectionSort(a, len);
		System.out.println();
		printFun(a, len);
	}
}
