package manoj;

public class MissingCharacter {

	public static void missing_char(String s,int index){
		char sarr[] = s.toCharArray();
		for(int i=0;i<sarr.length;i++) {
			if(i == index) {
				continue;
			}
			else {
				System.out.println(sarr[i]);				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "kitten";
		int index = 1;
		missing_char(s, index);
	}

}
