package assignmentARRAY_03;
import java.util.*;
public class Ques_01_Merge_Array 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of first array");
		int len1=sc.nextInt();
		System.out.println("Enter number of second array");
		int len2=sc.nextInt();
		int[] first=new int[len1];
		int[] second=new int[len2];
		int tot=len1+len2;
		int[] third=new int[tot];
		System.out.println("enter First array elements, no of elements : "+len1);
		for(int i=0;i<len1;i++)
		{
			first[i]=sc.nextInt();
		}
		System.out.println("enter second array elements, no of elements : "+len2);
		for(int j=0;j<len2;j++)
		{
			second[j]=sc.nextInt();
		}
		System.out.println("merging both arrays");
		int count=0;int num=0;
		
		while(num <tot)
		{					
			if(count<len1)
			{
				third[num]=first[count];
				num++;
			}
			if(count<len2)
			{
				third[num]=second[count];
				num++;
			}
			count++;
		}
		
		System.out.println("Combine array is");
		for(int i=0;i<tot;i++)
		{
			System.out.print(third[i]);
		}
		sc.close();
	}
}
