package sort_heap;
/*
 * 		MIN HEAP
 */
public class Heap_Sort_001 
{
	int[] acbt ;
	int counter;
	public Heap_Sort_001(int N) 
	{
		acbt = new int[N+1];
		counter = 0;
	}
	public int get_left(int ind)
	{
		return 2*ind;
	}
	public int get_right(int ind)
	{
		return 2*ind+1;
	}
	public int get_parent(int ind)
	{
		return ind/2;
	}
	public void insert(int x)
	{
			acbt[++counter] = x;
			int par = get_parent(counter);
			int cur = counter;
			for(;par > 0;)
			{				
				if(acbt[par] > x)
				{
					int t = acbt[cur];
					acbt[cur] = acbt[par];
					acbt[par] = t;
					cur = par;
					par = get_parent(par);
				}
				else break;
			}
	}
	public void print_acbt()
	{
		for(int i = 1; i<= counter;i++)
			System.out.println(" "+acbt[i]);
	}
	
	public static void main(String[] args) 
	{
		int[] list = {10,3,56,67,23,2,9};
		Heap_Sort_001 h = new Heap_Sort_001(list.length);
		for(int i = 0; i< list.length; i++)
		{
			h.insert(list[i]);
			System.out.println("inserted"+ list[i]);
			h.print_acbt();
		}
	}
}