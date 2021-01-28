package stingsfunctions;

public class String01 
{
	public static void main(String[] args) 
	{
		String s = new String("SAURABH KUMAR IS HERE");
		
		String s1 = "saurABH";
		String s2 = "SAURabh";
		//********charAt();
		//char charAt(index);
		System.out.println("CHAR AT : "+s.charAt(0));//CHAR AT : S
		
		System.out.println("GET CHARS : ");
		
		char ch[] = new char[10];
		s.getChars(0,5,ch,2);
		
		System.out.println(ch);
		
		byte c[] = s.getBytes();
		System.out.println("TO GET BYTES : ");
		for(byte x : c)
			System.out.println(x);
		
		char sh[] = s.toCharArray();
		System.out.println("TO CHAR ARRAY : ");
		for(char x : sh)
			System.out.println(x);
		System.out.println("STARTS WITH : "+s.startsWith("SAURABH"));
		System.out.println("ENDS WITH : "+s.endsWith("HERE"));
		
		System.out.println("COMPARE TO : "+s1.compareTo(s2));//A-a = 32
		
		String d = s.substring(2);
		
		System.out.println("SUBSTRING : "+d);
		
		String e = s.substring(2,10);
		
		System.out.println("SUBSTRING 2 PERIMETERS : "+e);
		
		String f = s.concat(" and always smile in his face").concat(" and loves group no 11");
		
		System.out.println("AFTER CONCAT : "+f);
		
		String g = "EEEEEE";
		
		System.out.println("REPLACE : "+g.replace("E", "D"));
		
		String h= "HELLO WORLD HELLO INDIA";
		
		System.out.println("REPLACE FIRST : "+h.replaceFirst("HELLO", "BYE"));
		
		System.out.println("REPLACE ALL : "+h.replaceAll("HELLO", "BYE"));
		
		System.out.println("INDEX OF (H) : "+h.indexOf('H'));
		
		System.out.println("INDEX OF (H) AFTER 3 INDEX : "+h.indexOf('H',3)); 	//which to find and from where to start.
		
		System.out.println("INDEX OF (HELLO) AFTER 3 INDEX : "+h.indexOf("Hello",3));
		
		System.out.println("CONTAINS : "+h.contains("hello"));
		
		System.out.println("IS EMPTY : "+h.isEmpty());
		
		String i = String.join("*","THIS","IS","A","STRING");
		
		System.out.println("STRING JOIN : "+i);
		
		String str = new String("30/08/2020");
		
		String array1[] = str.split("/");
		System.out.println("SPLIT : ");
		for(int k = 0;k<array1.length;k++)
		{
			System.out.println(array1[k]);
		}
		System.out.println("SPLIT 2 PERIMETERS : ");
		String array2[] = str.split("/",2);
		
		for(int k = 0;k<array2.length;k++)
		{
			System.out.println(array2[k]);
		}
		
	}
}



