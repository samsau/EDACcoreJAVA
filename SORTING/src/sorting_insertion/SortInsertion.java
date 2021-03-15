package sorting_insertion;

/*

Insertion sort takes linear time when input array is sorted or almost sorted 
(maximum 1 or 2 elements are misplaced).


The Insertion Sort Algorithm technique is similar to Bubble sort but, is slightly more efficient. 
Insertion sort is more feasible and effective when a small number of elements is involved. When 
the data set is larger, it will take more time to sort the data.

Insertion sort is especially useful in sorting linked list data structures. As you know, Linked lists 
have pointers pointing to its next element (singly linked list) and previous element (double linked list). 
This makes it easier to keep track of the previous and next elements.

Q #1) What is Insertion Sort in Java?

Answer: Insertion sort is a simple sorting technique in Java that is efficient for a smaller data set 
and in place. It is assumed that the first element is always sorted and then each subsequent element 
is compared to all its previous elements and placed in its proper position.

Q #2) Why is Insertion Sort better?

Answer: Insertion sort is faster for smaller data sets when the other techniques like quick sort add 
overhead through recursive calls. Insertion sort is comparatively more stable than the other sorting 
algorithms and requires less memory. Insertion sort also works more efficiently when the array 
is almost sorted.

Q #3) What is the Insertion Sort used for?

Answer: Insertion sort is mostly used in computer applications that build complex programs like file 
searching, path-finding, and data compression.

Q #4) What is the efficiency of Insertion Sort?

Answer: The best case for insertion sort is when the array is already sorted and it is O (n). 
Insertion sort has an Average case performance of O (n^2). 
Worst-case performance for insertion sort is again O (n^2).



 */
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
