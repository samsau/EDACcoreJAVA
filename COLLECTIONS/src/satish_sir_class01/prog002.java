package satish_sir_class01;

import java.util.ArrayList;

public class prog002 
{
	public static void main(String[] args) 
	{	
		ArrayList list = new ArrayList<>();
		
		
//		ArrayList<Object> list2 = new ArrayList<>();
		
		list.add("One");
		list.add(1001);
		list.add(false);
		list.add(3.14);
		list.add(new Student(122, "kumar"));
		
		Object s = list.get(4);
		
		System.out.println("4 is : " + s);
		
		System.out.println("HOMOGENEOUS LIST IS : "+ list);
		
		/*
		 * 4 is : Student [id=122, name=kumar]
		 * HOMOGENEOUS LIST IS : [One, 1001, false, 3.14, Student [id=122, name=kumar]]
		 */
		
		
		int index = 3;
		if(list.get(index) instanceof String)
		{
			String s1 = (String)list.get(index);
			System.out.println("String : "+ index);
		}
		else if(list.get(index) instanceof Integer)
		{
			Integer s1 = (Integer)list.get(index);
			System.out.println("Integer : "+ index);
		}
		else if(list.get(index) instanceof Student)
		{
			Student s1 = (Student)list.get(index);
			System.out.println("Student : "+ index);
		}
		else if(list.get(index) instanceof Double)
		{
			Double s1 = (Double)list.get(index);
			System.out.println("Double : "+ index);
		}
		else if(list.get(index) instanceof Boolean)
		{
			Boolean s1 = (Boolean)list.get(index);
			System.out.println("Boolean : "+ index);
		}
		
	}
}
