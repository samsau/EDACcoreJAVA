package sorting_quick;

public class SortQuick 
{
	static int partition(int a[], int p, int q)
	{
		int pivot = a[q];
		int i = p - 1;
		for(int j = p; j < q; j++)
		{
			if(a[j] < pivot)
			{
				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[q];
		a[q] = temp;
		return i+1;
	}
	static void quickSort(int a[], int p, int q)
	{
		int mid;
		if(p < q)
		{
			mid = partition(a, p, q);
			quickSort(a, p, mid-1);
			quickSort(a, mid+1, q);
		}
	}
	static void printFun(int a[], int q)
	{
		for(int i = 0; i <= q; i++)
			System.out.print(a[i]+" ");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int[] a = {60, 30, 40, 20, 10, 90, 50};
		int p = 0;
		int q = a.length-1;
		printFun(a, q);
		quickSort(a, p, q);
		printFun(a, q);
	}
}
