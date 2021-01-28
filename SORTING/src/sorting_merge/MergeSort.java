package sorting_merge;

public class MergeSort 
{
	static void merge(int a[], int p, int mid, int q)
	{
		int l = mid - p + 1;
		int r = q - mid ;
		
		int[] left = new int[l];
		int[] right = new int [r];
		
		for(int i = 0; i < l ; i++)
			left[i] = a[p+i];
		
		for(int j = 0 ; j < r; j++)
			right[j] = a[mid+1+j];
		
		int i = 0, j = 0, k = p;
		
		while(i < l && j < r)
		{
			if(left[i] <= right[j])
			{
				a[k] = left[i];				
				i++;
			}		
			else
			{
				a[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i < l)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		
		while(j < r)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	static void mergeSort(int a[], int p, int q)
	{
		if(p == q)
			return;
		int mid = (p+q)/2;
		mergeSort(a, p, mid);
		mergeSort(a, mid+1, q);
		merge(a, p, mid, q);
	}
	static void printFun(int a[], int q)
	{
		for(int i = 0; i <= q; i++)
			System.out.print(a[i]+ " ");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int[] a = {60, 30, 40, 20, 10, 90, 50};
		int p = 0;
		int q = a.length-1;
		mergeSort(a, p, q);
		printFun(a, q);
	}
}
