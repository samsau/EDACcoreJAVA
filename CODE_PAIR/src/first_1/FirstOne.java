package first_1;
import java.util.Scanner;
public class FirstOne 
{
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int N= sc.nextInt();
			int[] arr = new int[N];
			for(int i=0;i<N;i++)
			{
				arr[i]= sc.nextInt();
			}
			int sub=arr[0];
			int max=0;		//arr[0];
			int moremax=0;	//arr[0];
			for(int i=1;i<arr.length;i++)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(arr[i]>arr[j])
					{
						sub=arr[i]-arr[j];
						if(sub>moremax)
							moremax=sub;
					}
				}
				if(max<moremax)
					max=moremax;
			}
			System.out.println(max);
			sc.close();
		}
}
