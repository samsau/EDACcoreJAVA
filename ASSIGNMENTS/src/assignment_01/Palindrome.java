package assignment_01;
import java.util.*;
public class Palindrome 
{
	public static void main(String args[])  
	   {  
	      String original, reverse = ""; // Objects of String class 
	      //System.out.println(reverse.length());
	      Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a string");  
	      original = in.nextLine();   
	      int length = original.length();  
	      //System.out.println(original.length());
	      for ( int i = length - 1; i >= 0; i-- )  
	      {   
	    	  //System.out.println("i value "+i);
	    	  reverse = reverse + original.charAt(i);
	    	  //System.out.println("reverse is"+reverse);
	      }
	      if (original.equals(reverse))  
	         System.out.println("palindrome.");  
	      else  
	         System.out.println("isn't a palindrome."); 
	      in.close();
	   }  
}
