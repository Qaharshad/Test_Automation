package Constructor;

public class Student_2 {
 String result;
	public static void main(String[] args)
	{
		Student_2 obj1= new Student_2("Harshad");
		obj1.finalresult();
	
		
	}
	
	public void finalresult ()
	{
		System.out.println("Hey my name is  "+result);
	}
	
	public Student_2(String name)
	{
		result = name;
	}
}
