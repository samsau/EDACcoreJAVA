package assignment_Class_interface_abstract02;

public class Employee 
{
	String Ename;
	int Eage;
	double Esal;
	
	public static void main(String[] args) 
	{
		Worker[] in01 = new Worker[2];
		for(int i=0;i<2;i++)
		{
			in01[i]=new Worker();
			in01[i].getDetails();
		}
		
		System.out.println("VALUE OF LETSDO IS : "+Manager.letsdo);
		for(int i=0;i<2;i++)
			in01[i].showDetails();
		Manager[] in02 = new Manager[2];
		for(int i=0;i<2;i++)
		{
			in02[i]=new Manager();
			in02[i].getDetails();
		}
		
		for(int i=0;i<2;i++)
			in02[i].showDetails();
		MyInterface02[] in03 = new Manager[2];
		for(int i=0;i<2;i++)
		{
			in03[i]=new Manager();
			in03[i].getDetails();
		}
		
		for(int i=0;i<2;i++)
			in03[i].showDetails();
		MyInterface02[] in04 = new Worker[2];
		for(int i=0;i<2;i++)
		{
			in04[i]=new Worker();
			in04[i].getDetails();
		}
		for(int i=0;i<2;i++)
			in04[i].showDetails();
		
		MyInterface02 in05=new Manager();
		System.out.println(in05.pi);
		
		MyInterface02 in06=new Worker();
		System.out.println(in06.pi);
	
	}
	
}
