package sorting_selection;
/*
The selection sort algorithm sorts an array by repeatedly 
finding the minimum element (considering ascending order) 
from unsorted part and putting it at the beginning. The 
algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.

In every iteration of selection sort, the minimum element 
(considering ascending order) from the unsorted subarray 
is picked and moved to the sorted subarray.

in every iteration it find the first minimum from the array.

best for : to the minimum in a single iteration.

complexity : best, average, worst ==== n^2
comparison : n^2 
swap : n
example : 

Selection sort is the in-place sorting technique and thus it does 
not require additional storage to store intermediate elements.

It works efficiently on smaller data structures as well as the data 
sets that are almost sorted.

The major disadvantage of the selection sort technique is that it 
performs very poorly as the size of the data structure increases. 
It not only becomes slower but also decreases efficiency.


Q #1) How does Selection sort work?

Answer: Selection sort works by maintaining two sub-arrays. The minimum 
element from the unsorted subarray is placed in its proper position in 
a sorted sub-array. Then the second-lowest element is placed in its proper 
position. This way, the entire array is sorted by selecting a minimum element 
during each iteration.

Q #2) What is the complexity of the Selection sort?

Answer: The overall complexity of selection sort is O (n2), thereby making it the 
algorithm that is inefficient on larger data sets. Other sorting techniques are 
more efficient.

Q #3) What are the Advantages and Disadvantages of Selection sort?

Answer: Selection sort is the in-place sorting technique and thus it does not 
require additional storage to store intermediate elements.

It works efficiently on smaller data structures as well as the data sets that are 
almost sorted.

The major disadvantage of the selection sort technique is that it performs very 
poorly as the size of the data structure increases. It not only becomes slower 
but also decreases efficiency.

Q #4) How many swaps are there in the Selection sort?

Answer: The selection sort technique takes the minimum number of swaps. For the best 
case, when the array is sorted, the number of swaps in the selection sort is 0.

Q #5) Is selection sort faster than Insertion sort?

Answer: Insertion sort is faster and more efficient as well as stable. Selection 
sort is faster only for smaller data sets and partially sorted structures.

 */
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

/*

60 30 40 20 10 90 50 

10 \\30 40 20 60 90 50 
10 20 \\40 30 60 90 50 
10 20 30 \\40 60 90 50 
10 20 30 40 \\60 90 50 
10 20 30 40 50 \\90 60 
10 20 30 40 50 60 \\90 

10 20 30 40 50 60 90 

*/