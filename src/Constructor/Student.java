package Constructor;

 

public class Student {
	
	double result;

	public static void main(String[] args) {
		
		Student obj1 = new Student("DPS");
		
		
	

	}
	
	public Student () 
	{
		System.out.println("Hey look my marks  ");
	}
	
	public Student(String Schoolname)
	{
		System.out.println("Hey my school name is  "+Schoolname);
	}
	
	public Student(int rank)
	{
		System.out.println("Hey my school rank is  "+rank);
	}
	
	public Student(String Schoolname , int rank)
	{
		System.out.println("Hey my school name is "+Schoolname+ " and rank at "+ rank);
	}
	
	public Student(int rank , String Schoolname)
	{
		System.out.println("Hey my school rank is "+rank+ " and name is "+ Schoolname);
	}
	
	public Student(double marks)
	{
		result = marks;
	}
	
	public void finalresult() 
	{
		System.out.println("Result is  " +result);
	}
	
	
	

}
