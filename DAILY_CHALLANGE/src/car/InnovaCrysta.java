package car;

class InnovaCrysta extends Car
{
	int mileage;
	public InnovaCrysta()
	{
		isSedan = false;
		seats = "6";
	}
	public InnovaCrysta(int mileage)
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
		
		return "A InnovaCrysta is "+ status +" Sedan, is 6-seater, and has a mileage of "
				+ "around " + mileage + " kmpl.";
	}
}