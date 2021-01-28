package satish_sir_class01;

public class Student 
{
	int id;
	String name;
	int marks;
	
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}



	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	
	
//	@Override
//	public int hashCode()
//	{
//		return Objects.hash(id, name);
//	}
//	
//	@Override
//	public boolean equals(Object obj)
//	{
//		//	this - current object
//		// 	this - object 1
//		// 	obj - object 2
//		
//		if(obj == null)
//			return false;
//		if(!(obj instanceof Student))
//			return false;
//		Student s2 = (Student) obj;
//		if(this.id == s2.id && this.name == s2.name)
//			return true;
//		return false;		
//	}
}
