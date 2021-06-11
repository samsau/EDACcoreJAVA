package finezza.code;

public class FibbinonacciTriangle {
	
	
	
	public static void main(String[] args) {
		int a=0, b=1;
		int i, j, row = 5;
		for (i = 0; i < row; i++) {
			for (j = row - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print(a+ " ");
				int c = a+b;
				a = b;
				b = c;
			}
			System.out.println();
		}
	}
}
