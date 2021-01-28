package sort_merge;

public class Merge_Sort_001 
{
	void merge(int a[], int p, int mid, int q)
	{
		int l = mid - p + 1;
		int r = q - mid;
		
		int[] leftarr = new int[l];
		int[] rightarr = new int[r];
		
		for(int i = 0; i < l; i++)
			leftarr[i] = a[p+i];
		
		for(int j = 0; j < r; j++)
			rightarr[j] = a[mid+1+j];
		
		int i = 0, j = 0;
		int k = p;
		
		while(i < l && j < r)
		{
			if(leftarr[i] <= rightarr[j])
			{
				a[k] = leftarr[i];
				i++;
			}
			else
			{
				a[k] = rightarr[j];
				j++;
			}
			k++;
		}
		while(i<l)
		{
			a[k] = leftarr[i];
			i++;
			k++;
		}
		while(j<r)
		{
			a[k] = rightarr[j];
			j++;
			k++;
		}
	}
	void mergeSort(int a[], int p, int q)
	{
		if(p == q)
			return;
		else
		{
			int mid = (p+q)/2;
			
			mergeSort(a,p,mid);
			
            mergeSort(a,mid+1,q);
			
            merge(a,p,mid,q);
			
		}
	}
	void printArr(int a[], int q)
	{
		System.out.println();
		System.out.println("ARRAY AFTER MERGE SORT IS ");
		System.out.println();
		for(int i = 0; i<a.length; i++)
		{
			System.out.print(" "+a[i]);
		}
	}
	public static void main(String[] args) 
	{
		Merge_Sort_001 ms = new Merge_Sort_001();
		int[] a = {50,40,90,80,20,10,30,40};//{10,40,30,20}; //
		int p = 0;
		int q = a.length-1;
		ms.mergeSort(a, p, q);
		ms.printArr(a,q);
	}
}