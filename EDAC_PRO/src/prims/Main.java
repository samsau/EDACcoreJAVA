package prims;

import java.util.Scanner;

public class Main 
{ 
	public static void main(String[] args) 
	{
		System.out.println("WELCOME TO LAN CABLE MANAGEMNET SYSTEM USING PRIMS ALGORITHM ");
//		int[][] conn = {{0, 4, 0, 0, 5},
//						{4, 0, 3, 6, 1},
//						{0, 3, 0, 6, 2},
//						{0, 6, 6, 0, 7},
//						{5, 1, 2, 7, 0},
//      				};
		
		int[][] conn = {{0, 2, 5, 4, 0, 0, 0, 0},
						{2, 0, 0, 3, 0, 0, 0, 0},
						{5, 0, 0, 4, 2, 2, 0, 0},
						{4, 3, 4, 0, 5, 0, 0, 1},
						{0, 0, 2, 5, 0, 4, 6, 5},
						{0, 0, 2, 0, 4, 0, 5, 9},
						{0, 0, 0, 0, 6, 5, 0, 2},
						{0, 0, 0, 1, 5, 9, 2, 0}};
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the number of PERSONAL SYSTEMS");
//		int nodes =sc.nextInt();
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
//					System.out.println("ENTER CABLE USED FOR SYSTEM "+(j+1)+ " to SYSTEM " +(i+1)+ " is ");
//					conn[i][j] = conn[j][i] = sc.nextInt();
//				}
//			}
//		}
//		
//		System.out.println("FULL MATRIX");
//		
//		for(int i = 0; i < nodes ; i++)
//		{
//			for(int j = 0; j < nodes; j++)
//			{
//				System.out.print(conn[i][j] + " ");
//			}
//			System.out.println();
//		}
//		sc.close();
		
		Graph G = new Graph(conn);

		G.Prim();
	}
}