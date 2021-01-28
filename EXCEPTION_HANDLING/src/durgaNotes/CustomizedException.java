package durgaNotes;
import java.util.*;
class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);
	}
}
class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);
	}
}
public class CustomizedException 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER AGE : ");
		int age= sc.nextInt();
		if(age>60)
		{
			throw new TooOldException("Your age is already crossed marriage age, no match");
		}
		else if(age<18) 
		{
			throw new TooYoungException("Please wait some time you will get best match");
		}
		else
		{
			System.out.println("you will get the best match");
		}
		sc.close();
	}
}