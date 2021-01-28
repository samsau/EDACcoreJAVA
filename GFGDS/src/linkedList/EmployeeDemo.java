package linkedList;
import java.util.*;
public class EmployeeDemo 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setName("SAURABH");
		e1.setRoll_no(123);
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setName("SAURABH kumar");
		e2.setRoll_no(124);
		
		Employee e3 = new Employee();
		e3.setId(103);
		e3.setName("SAU");
		e3.setRoll_no(125);
		
		Employee e4 = new Employee();
		e4.setId(104);
		e4.setName("SAURABH KUM");
		e4.setRoll_no(126);
		
		LinkedList<Employee> ll = new LinkedList<>();
		ll.add(e1);
		ll.add(e2);
		
		System.out.println("1st LinkedList");
		
		Iterator<Employee> itr = ll.iterator();
		while(itr.hasNext())
		{
			Employee ee = itr.next();
			System.out.println(ee);
		}
		
		
		LinkedList<Employee> ll1 = new LinkedList<>();
		ll1.add(e3);
		ll1.add(e4);
		
		System.out.println("2nd LinkedList");
		
		Iterator<Employee> itr1 = ll1.iterator();
		while(itr1.hasNext())
		{
			Employee eee = itr1.next();
			System.out.println(eee);
		}
		
		
		ll1.addAll(ll);
		
		System.out.println("combine ll in ll1 LinkedList");
		Iterator<Employee> itr2 = ll1.iterator();
		while(itr2.hasNext())
		{
			Employee e = itr2.next();
			System.out.println(e);
		}
		
		ll.addAll(ll1);
		
		System.out.println("combine ll1 in ll LinkedList");
		Iterator<Employee> itr3 = ll.iterator();
		while(itr3.hasNext())
		{
			Employee eeee = itr3.next();
			System.out.println(eeee);
		}
		
	}
}
