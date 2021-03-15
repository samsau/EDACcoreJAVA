package sorting_merge;

/*

Merge sort technique uses a “Divide-and-Conquer” strategy. In this technique, the 
data set that is to be sorted is divided into smaller units to sort it.

Q #1) Can Merge sort be done without Recursion?

Answer: Yes. We can perform a non-recursive Merge sort called ‘iterative Merge sort’. 
This is a bottom-up approach that begins by merging sub-arrays with a single element 
into a sub-array of two elements.

Then these 2-element sub-arrays are merged into 4-element sub arrays and so on using 
iterative constructs. This process continues until we have a sorted array.

Q #2) Can Merge sort be done in place?

Answer: Merge sort generally is not in-place. But we can make it in-place by using some 
clever implementation. For example, by storing two elements value at one position. This 
can be extracted afterward using modulus and division.

Q #3) What is a 3 way Merge sort?

Answer: The technique we have seen above is a 2-way Merge sort wherein we split the array 
to be sorted into two parts. Then we sort and merge the array.

In a 3-way Merge sort, instead of splitting the array into 2 parts, we split it into 3 parts, 
then sort and finally merge it.

Q #4) What is the time complexity of Mergesort?

Answer: The overall time complexity of Merge sort in all cases is O (nlogn).

Q #5) Where is the Merge sort used?

Answer: It is mostly used in sorting the linked list in O (nlogn) time. It is also used in 
distributed scenarios wherein new data comes in the system before or post sorting. This is 
also used in various database scenarios.

 */

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
