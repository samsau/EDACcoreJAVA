package car;

class HondaCity extends Car
{
	int mileage;
	public HondaCity()
	{
		isSedan = true;
		seats = "4";
	}
	public HondaCity(int mileage)
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
		
		return "A HondaCity is "+ status +" Sedan, is 4-seater, and has a mileage of "
				+ "around " + mileage + " kmpl.";
	}
}
