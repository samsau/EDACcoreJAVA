package oct_19_2020;
import java.util.*;
public class Count_Duplicate_Elements 
{
	static void countDuplicate(int arr[],int size)
    {
		int i,j,count=0,dupl=0;
        int flag=0;
        for(i=0;i<size-1;i++)
        { 
        	for(j=i+1;j<size;j++)
        	{
        		if(count==arr[i])
        		{
        			break;
        		}
        		else if(arr[i]== arr[j])
        		{
        			flag=1;
        			count=arr[j];        		
        		}
            }
        	if(flag==1)
        	{
        		dupl++;
        	}
        	flag=0;
        } 
        System.out.println(dupl);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        int size=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
            size++;
        }
        //Count_Duplicate_Elements =new Count_Duplicate_Elements();
        countDuplicate(arr,size);
        sc.close();
	}
}


/*
test case 1:
8         
1         
3
1
4
5
6
3
2 
*/

/*
test case 2:
6         
1         
1
2
2
2
3
*/