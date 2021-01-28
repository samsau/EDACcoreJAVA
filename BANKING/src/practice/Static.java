package practice;
public class Static 
{
	static 
	{
		Static ob = new Static();
		ob.main(null);
	}
	public void main(String[] args)
	{
		System.out.println("hello");
	}
}