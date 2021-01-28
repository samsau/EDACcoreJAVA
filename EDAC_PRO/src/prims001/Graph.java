package prims001;

public class Graph implements MyInterface
{

	int overallCost;
	private static int infi = 9999999;
	
	int[][] LkCt; // graph's matrix;
	int N_Nodes; // number of nodes
	
	Graph(int[][] matrix)// constructor takes matrix in as a input
	{
		int i, j;
	
		N_Nodes = matrix.length; // giving the length of nodes in matrix.
	
		LkCt = new int[N_Nodes][N_Nodes];
	
		// copying the weights to LinkCost matrix
		for (i = 0; i < N_Nodes; i++) 
		{
			for (j = 0; j < N_Nodes; j++) 
			{
				LkCt[i][j] = matrix[i][j];
	
				if (LkCt[i][j] == 0)
					LkCt[i][j] = infi;//if length is zero the node is unreachable so change the value to infinity 
			}
		}
	}
	
	public int unReached(boolean[] r) // function to get the nodes that are unreacted.
	{
	//	boolean done = true;
	
		for (int i = 0; i < r.length; i++)
			if (r[i] == false)
				return i;
	
		return -1;
	}
	
	public void Prim() 
	{
		int i, j, k, x, y;
	
		boolean[] Reached = new boolean[N_Nodes]; // array to keep track of the reached nodes
		int[] predNode = new int[N_Nodes]; // array to maintain minimum  cost edge
		// starting vertex
		Reached[0] = true;
		// setting other vertices as unreached
		for (k = 1; k < N_Nodes; k++) {
			Reached[k] = false;
		}
	
		predNode[0] = 0; // No edge for node 0
	
		printCoveredNodes(Reached);//recursive call no 1
		// we iterate for n-1 nodes that haven't been reached yet.
		for (k = 1; k < N_Nodes; k++) {
			x = y = 0;
			for (i = 0; i < N_Nodes; i++)
				for (j = 0; j < N_Nodes; j++) {
					// update the MST with the minimum cost Link
	
					if (Reached[i] && !Reached[j] && LkCt[i][j] < LkCt[x][y]) {
						x = i;
						y = j;
					}
				}
	
			overallCost = overallCost + LkCt[x][y];
			System.out.println();
			System.out.println("Next selected edge: (" + (x + 1) + "," + (y + 1) + ")" + " cost ==> " + LkCt[x][y] + " meter");
	
			predNode[y] = x; // add the minimum cost link to predNode
			Reached[y] = true;
	
			printCoveredNodes(Reached);//recursive call no 2
			System.out.println();
			
						
			
		}
	
		printMinCostEdges(predNode);
	}
	
	public void printMinCostEdges(int[] a) // function to print the Edges of Spanning Tree.
	{
	
		System.out.println();
		System.out.println();
		System.out.println("EDGES OF MINIMUM SPANNING TREE : ");
		for (int i = 0; i < N_Nodes; i++)
			System.out.println((a[i] + 1) + " --> " + (i + 1));
		System.out.println();
//		System.out.println();
//		System.out.println(
//				"-------------------------------------------------------------------------------------------------------------------------");
//		System.out.println();
//		System.out.println(
//				"                               THIS PROJECT  IS                                                                                              ");
//		System.out.println(
//				"                                                MADE BY : SAURABH KUMAR & UDBHAV GARG                                                                         ");
//		System.out.println();
//		System.out.println();
//		System.out.println(
//				"==========================================================================================================================");
	
	}
	
	public void printCoveredNodes(boolean[] Reached) {
		System.out.print("Covered Nodes = ");
		for (int i = 0; i < Reached.length; i++)
			if (Reached[i])
				System.out.print((i + 1) + "  ");
		System.out.println();
		System.out.println("OVERALL COST IS : " + overallCost + " meter");// To print the overall cost i.e. how much
																			// wire is needed
	}
}
