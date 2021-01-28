package sorting_insertion;

public class SortInsertion 
{
	static void insertionSort(int a[], int len)
	{
		for(int i = 1; i < len; i++)				// assuming first element to be sorted. i = 1 to len
		{
			int temp = a[i];						// first line for swap.
			int j = i-1;
			while(j >= 0 && a[j] > temp)			// remember condition
			{
				a[j+1] = a[j];						// second line for swap
				j--;
			}
			a[j+1] = temp;							// last line for swap
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
		insertionSort(a, len);
		System.out.println();
		printFun(a, len);
	}
}
