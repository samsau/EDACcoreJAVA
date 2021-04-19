package practice;

public class StringCheck {
	public static void main(String[] args) {
		String str= " ";
		str.trim();
		System.out.println(str.equals("")+" "+str.isEmpty());
		str = str.trim();
		System.out.println(str.equals("")+" "+str.isEmpty());
	}
}
