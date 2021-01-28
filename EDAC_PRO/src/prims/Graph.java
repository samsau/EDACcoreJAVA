package prims;

// change the first node.

import java.util.*;
public class Graph
{
	
	private int overallCost;	// this is for calculating the cover all cost which is to be printed.
	
	private static int infi = 9999999;	// this is made as infi. 
	
	int[][]  LinkCost;	// graph matrix.
						// this graph is same as connection graph.
	
	int num_of_nodes; 	// number of nodes.
	
	// constructor takes in a matrix as its input 
	Graph(int[][] mat)	// this constructor is made for calculate number of nodes and LinkCost matrix.
	{
		
	    num_of_nodes = mat.length;		//length of matrix mat[5][5] = 5
	  
	    LinkCost = new int[num_of_nodes][num_of_nodes];
	
	    // copying the weights to LinkCost matrix
	    for (int i=0; i < num_of_nodes; i++)
	    {
	    	for (int j=0; j < num_of_nodes; j++)
	    	{
	    		LinkCost[i][j] = mat[i][j];
	
	    		if ( LinkCost[i][j] == 0 )
	    			LinkCost[i][j] = infi;
	        }
	    }
	}
	
	  //function to get the nodes that are unreached
	public int unReached(boolean[] r)
	{
		boolean done = true;
	
		for ( int i = 0; i < r.length; i++ )
			if ( r[i] == false )
				return i;
	
		return -1;
	}
	public void Prim( )
	{
		int i, j, x, y;
			
		boolean[] Visited = new boolean[num_of_nodes]; 	// array to keep track of the Visited nodes 
														// with true and false.
		
		int[] predNode = new int[num_of_nodes];        	// array to maintain min cost edge
	
		//starting vertex
		Visited[0] = true;
		//setting other vertices as unreached
		for (int k = 1; k < num_of_nodes; k++ )
		{
			Visited[k] = false;
		}
	
		predNode[0] = 0;      // No edge for node 0
	
		printCoveredNodes( Visited );					// PCN
	
		//we iterate for n-1 nodes that haven't been Visited yet
		for (int k = 1; k < num_of_nodes; k++)
		{
			x = y = 0;	//x = y = 0;
			for ( i = 0; i < num_of_nodes; i++ )
				for ( j = 0; j < num_of_nodes; j++ )
				{
	        	  //update the MST with the minimum cost Link
					if ( Visited[i] && !Visited[j] && LinkCost[i][j] < LinkCost[x][y] )
					{
						x = i;
						y = j;
					}
				}
			
			System.out.println("Next selected edge: (" + (x+1) + "," + (y+1) + ")" + " cost = " + LinkCost[x][y]);
			overallCost	= overallCost + LinkCost[x][y];
	
			predNode[y] = x;          // add the min cost link to predNode
			Visited[y] = true;
			
			printCoveredNodes( Visited );
			System.out.println();
		}
	
		printMinCostEdges( predNode );
	}
	  // function to print the edges of spanning tree
	void printMinCostEdges( int[] a )
	{
		System.out.println("Edges in MST: ");
		for ( int i = 0; i < num_of_nodes; i++ )
			System.out.println( (a[i] + 1) + " --> " + (i + 1) );
	}
	
	
	void printCoveredNodes(boolean[] Visited )
	{
		System.out.print("Covered Nodes = ");
		for (int i = 0; i < Visited.length; i++ )
			if ( Visited[i] )
				System.out.print( (i+1) + " ");
	  	System.out.println();
	  	System.out.println("OVERALL COST IS : " + overallCost + " meter");
	}
}