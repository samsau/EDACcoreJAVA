package prims001;

import java.util.Scanner;

public class Main 
{ 
	public static void main(String[] args) 
	{	System.out.println("========================================================================================================================================");
		System.out.println("                              WELCOME TO LAN MANAGEMENT SYSTEM  USING PRIMS ALGORITHM                                                   ");
		System.out.println("========================================================================================================================================");
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
//		System.out.println("ENTER THE NUMBER OF COMPUTERS YOU WANT TO CONNECT IN THE SYSTEM");
		Scanner sc = new Scanner(System.in);
		int nodes =sc.nextInt();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		int[][] conn = {{0, 77, 0, 0, 5},
//						{4, 0, 3, 6, 1},
//						{0, 3, 0, 6, 2},
//						{0, 6, 6, 0, 7},
//						{5, 1, 2, 7, 0},
//      				};
		
//		int[][] conn = {{0, 2, 5, 4},
//						{2, 0, 0, 3},
//						{5, 0, 0, 4},
//						{4, 3, 4, 0}};
		
		int[][] conn = {{0, 2, 5, 4, 0, 0, 0, 0},
						{2, 0, 0, 3, 0, 0, 0, 0},
						{5, 0, 0, 4, 2, 2, 0, 0},
						{4, 3, 4, 0, 5, 0, 0, 1},
						{0, 0, 2, 5, 0, 4, 6, 5},
						{0, 0, 2, 0, 4, 0, 5, 9},
						{0, 0, 0, 0, 6, 5, 0, 2},
						{0, 0, 0, 1, 5, 9, 2, 0}};

//		int[][] conn = new int[nodes][nodes];
//		
//		
//		for(int i = 0; i < nodes ; i++)
//		{
//			for(int j = 0; j <= i ; j++)
//			{
//				if(i == j)
//				{
//					conn[i][j] = 0;
//				}
//				else
//				{
//					System.out.println("ENTER DISTANCE BETWEEN SYSTEM "+(j+1)+ " TO SYSTEM " +(i+1));
//					conn[i][j] = conn[j][i] = sc.nextInt();
//				}
//			}
//		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("DISTANCE REPRESENTATION OF COMPUTER SYSTEMS IN  MATRIX FORM");
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < nodes ; i++)
		{
			for(int j = 0; j < nodes; j++)
			{
				System.out.print(conn[i][j]+"  ");
			}
			System.out.println();
		}
		sc.close();
		
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("                              LAYOUT THAT CAN BE FOLLOWED IN CONNECTING THE SYSTEMS TOGETHER                                                                                           ");
		System.out.println();
		System.out.println();
		System.out.println();
		
		Graph G = new Graph(conn);

		G.Prim();
	}
}