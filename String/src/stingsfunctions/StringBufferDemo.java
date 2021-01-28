package stingsfunctions;
public class StringBufferDemo 
{	
	public static void main(String args[])
	{
		StringBuffer s=new StringBuffer("Saurabh");
		s=s.append(" Salunkhe");
		System.out.println(s);//Saurabh Salunkhe
		int a=90;
		s=s.append(" "+a);
		System.out.println(s);//Saurabh Salunkhe 90
		s.insert(8,"dada ");
		System.out.println(s);//Saurabh dada Salunkhe 90
		s.replace(8,13,"Bhaiya ");
		System.out.println(s);//Saurabh Bhaiya Salunkhe 90
		s.reverse();
		System.out.println(s);//09 ehknulaS ayiahB hbaruaS
		s.reverse();
		s.delete(8,15);
		System.out.println(s);//Saurabh Salunkhe 90
		System.out.println(s.capacity());//48
	}
}