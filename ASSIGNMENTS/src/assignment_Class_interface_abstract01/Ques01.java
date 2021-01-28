package assignment_Class_interface_abstract01;
public class Ques01 extends Bank
{
	public static void main(String[] args) 
	{
		Interface01[] in01=new Bank[5];
		for(int i=0;i<2;i++)
		{
			in01[i]=new Bank();
			in01[i].getDetails();
		}
		for(int i=0;i<2;i++)
		{
			in01[i].showDetails();
		}
	}
}