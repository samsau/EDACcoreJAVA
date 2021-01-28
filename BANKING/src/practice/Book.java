package practice;

class Notebook
{
	Notebook()
	{
		System.out.println("notebook constructor ");
	}
	void Fun00()
	{
		System.out.println("INTO F00 NOTEBOOK");
	}
	void Fun01()
	{
		System.out.println("INTO F01 NOTEBOOK");
	}
}
class Book extends Notebook
{	
	Book()
	{
		System.out.println("Book constructor ");
	}
	void Fun00()
	{
		System.out.println("INTO F00 BOOK");
	}
	void Fun02()
	{
		System.out.println("INTO F02 BOOK");
	}
	public static void main(String[] args)
	{
		Notebook b=new Book();
		b.Fun00();
		b.Fun01();
		//b.Fun02();
	}
}