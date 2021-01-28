package car;

import java.util.Scanner;

abstract class Car
{
	protected boolean isSedan;
	protected String seats;

	public Car()
	{
		
	}
	public Car(boolean isSedan, String seats)
	{
		
	}
	public boolean getIsSedan()
	{
		return true;
	}
	public String getSeats()
	{
		return "true"; 
	}
//	public String getMileage()
//	{
//		return "true";
//	}
}
public class Ques001 
{
	/*
	 * type of car is 
	 * 1. wagonR
	 * 2. HondaCity
	 * 3. Innova
	 */
	
	/*
	 *  milage is 5 to 30.
	 */
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int type_of_car = sc.nextInt();
		int Mileage = sc.nextInt();
		String res;
		switch(type_of_car)
		{
			case 0 :
			{
				WagonR wag = new WagonR(Mileage);
				res = wag.getMileage();
				System.out.println(res);
			}
			break;
			case 1 :
			{
				HondaCity hc = new HondaCity(Mileage);
				res = hc.getMileage();
				System.out.println(res);
			}
			break;
			case 2 :
			{
				InnovaCrysta ic = new InnovaCrysta(Mileage);
				res = ic.getMileage();
				System.out.println(res);
			}
			break;
		}
		sc.close();
	}
}














