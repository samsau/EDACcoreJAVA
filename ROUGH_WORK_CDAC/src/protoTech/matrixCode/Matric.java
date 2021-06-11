package protoTech.matrixCode;

import java.util.Scanner;

public class Matric {
	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int a[][] = new int[3][5];
		Scanner sc = new Scanner(System.in);
//		matrix input
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
//		printing matrix
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
//		adding arr(0to3) in a
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = arr[i][j];
			}
		}
//		adding arr(0to2) in 
		a[0][3] = arr[0][0];
		a[0][4] = arr[0][1];
		a[1][3] = arr[1][0];
		a[1][4] = arr[1][1];
		a[2][3] = arr[2][0];
		a[2][4] = arr[2][1];
//		printing new matrix
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		int one = ((a[0][0] * a[1][1] * a[2][2]) + (a[0][1] * a[1][2] * a[2][3]) + (a[0][2] * a[1][3] * a[2][4]));
		int two = (-(a[2][0] * a[1][1] * a[0][2]) - (a[2][1] * a[1][2] * a[0][3]) - (a[2][2] * a[1][3] * a[0][4]));
		
		System.out.println("determinant is " + (one + two));
	}
}

//String s = "ProGramMingIsGrEat";
//StringBuffer sb = new StringBuffer(s);

/*
 * 
 * 1 2 3 4 5 6 7 8 9
0 1 2 1 2 3 3 1 1
 * 
 */
