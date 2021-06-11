package cdac.rough;

public class XY_Athena_Health {
	
	static public int gcd(int i, int j) {
		if(i == j) {
			return i;
		}
		if(i > j)
			return gcd(i-j, j);
		return gcd(i, j-i);
	}
	
	static String isPossible(int x1, int y1, int x2, int y2) {
		x1 = Math.abs(x1);
		y1 = Math.abs(y1);
		x2 = Math.abs(x2);
		y2 = Math.abs(y2);
		
		if(gcd(x1, y1) == gcd(x2, y2))
			return "Yes";
		else
			return "No";
	}
	
	public static void main(String[] args) {
		int x1 = 35, y1 = 15;
		int x2 = 20, y2 = 25;
		System.out.println(isPossible(x1, y1, x2, y2));
	}

}
