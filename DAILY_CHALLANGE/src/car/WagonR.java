package car;

class WagonR extends Car
{
	int mileage;
	public WagonR()
	{
		isSedan = false;
		seats = "4";
	}
	public WagonR(int mileage)
	{
		this.mileage = mileage;
	}
	public String getMileage()
	{
		String status;
		if(isSedan == true)
			status = "";
		else
			status = "not";
		
		return "A WagonR is "+ status +" Sedan, is 4-seater, and has a mileage of "
				+ "around " + mileage + " kmpl.";
	}
}