package practice;

public class Rough001 
{
	public static void main(String[] args) 
	{
		int l = 2;
		int r = 2;
		
		int[] leftarr = {10,40};
		int[] rightarr = {30,20};
		
//		for(int i = 0; i < l; i++)
//			leftarr[i] = a[p+i];
//		
//		for(int j = 0; j < r; j++)
//			rightarr[j] = a[mid+1+j];
//		int[] a = {10,40,30,20};	//10,30,20,40
		int[] a = {10,30,20,40};	//10,30,20,40
		int i = 0, j = 0;
		int k = 0;
		
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
		
		
		System.out.println("NOW ARRAY IS : ");
		for (int m = 0; m < a.length; m++) 
		{
			System.out.println(a[m]);
		}
		
	}
}
