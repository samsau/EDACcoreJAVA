package durgaNotes;

public class Excep 
{

	public static void myFun()
	{
		System.out.println("Opening database connection");
		System.out.println("Division by zero");
        div();
		System.out.println("Accessing array element");
		printArrayElement();
	}

	public static void div()
	{
		int a = 5;
		int b = 0;
		System.out.println(a/b);
	}

	public static void printArrayElement()
	{
		int arr[] = {10,20,30,40,50};
		System.out.println(arr[6]);
	}

    public static void main(String args[])
    {
               
     try
     {
    	 myFun();		
     }
	 catch(Exception ae)
     {
		 System.out.println("Exception generated and caught here");
		 ae.printStackTrace();		
     }
	 finally
	 {
		 System.out.println("Inside finally block");
		 System.out.println("Closing database connection");				
	 }
	 System.out.println("Our program executed successfully.");
	 }
}
