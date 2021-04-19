package sorting_bubble;

/*
 * bubble sort :
 * 
 * 
	Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
	
	Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
	
	Auxiliary Space: O(1)
	
	Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
	
	best : 		O(n)	 
	average :	O(n^2)	
	worst :		O(n^2)
	
	
	Sorting In Place: Yes
	
	Stable: Yes
	
Q #1) What are the Sorting Algorithms in Java?

Answer: The sorting algorithm can be defined as an algorithm or procedure 
using which the elements in a collection can be ordered or arranged in a 
desired fashion.

Given below are some of the sorting algorithms supported in Java:

Bubble Sort
Insertion sort
Selection sort
Merge sort
Quicksort
Radix sort
Heapsort

Q #2) What is the best Sorting Algorithm in Java?

Answer: Merge Sort is supposed to be the fastest sorting algorithm in Java. 
In fact, Java 7 has internally used merge sort to implement the Collections.sort () 
method. Quick Sort is also another best sorting algorithm.

Q #3) What is Bubble sort in Java?

Answer: Bubble sort is the simplest algorithm in Java. Bubble sort always compares 
two adjacent elements in the list and swaps them if they are not in the desired order. 
Thus, at the end of every iteration or pass, the heaviest 
element is bubbled up to its proper place.

Q #4) Why is Bubble sort N2?

Answer: For implementing bubble sort, we use two for loops.

The total work done is measured by:

Amount of work done by inner loop * total number of times the outer loop runs.

For a list of n elements, the inner loop works for O(n) for each iteration. 
The outer loop runs for O (n) iteration. Hence the total work 
done is O(n) *O(n) = O(n2)

Q #15) What are the Advantages of Bubble sort?

Answer: Advantages of Bubble Sort are as follows:

Easy to code and understand.
Few lines of code are required to implement the algorithm.
The sorting is done in-place i.e. additional memory is not required and thus no memory overhead.
The sorted data is immediately available for processing.
	
//	max element goes to the last.
 *	
 */

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
		int[] a = {60, 30, 40, 90, 20, 10, 50};
		int len = a.length;
		printfun(a, len);
		System.out.println();
		bubbleSort(a, len);
		System.out.println();
		printfun(a, len);
	}
}

/*

60 30 40 90 20 10 50 

30 40 60 20 10 50// 90 
30 40 20 10 50// 60 90 
30 20 10 40// 50 60 90 
20 10 30// 40 50 60 90 
10 20// 30 40 50 60 90 
10// 20 30 40 50 60 90 

10 20 30 40 50 60 90 


*/