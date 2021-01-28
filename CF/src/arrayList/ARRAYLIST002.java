package arrayList;
/*
 * How to find duplicates from ArrayList in Java
 */
import java.util.*;

public class ARRAYLIST002 
{
	static void findDuplicates(List<Integer> ll)
	{
		int ctr=0;
		int flag = 0;
		for(int i = 0; i<ll.size()-1;i++)
		{
			Integer temp = ll.get(i);
			Integer temp1 = temp;
			for(int j = 1+i; j<ll.size();j++)
//			for(int j = 0; j<ll.size() && j != i ; j++)
			{
				ctr++;
				if(temp == ll.get(j))
				{
					if(temp == temp1 && flag == 1)
						break;
					System.out.println("duplicate found named "+temp);
					flag++;
					break;
				}
			}
		}
		System.out.println("CTR IS : "+ctr);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<Integer> ll = new ArrayList<Integer>();
		for(int i = 0; i < 5; i++)
			ll.add(sc.nextInt());
		
		findDuplicates(ll);
		sc.close();
	}
}
