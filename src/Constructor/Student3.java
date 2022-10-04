package Constructor;

public class Student3 {
String name ;
	public static void main(String[] args) {
		
		Student3 obj1 = new Student3("Harshad");
		obj1.details();
		

	}
	
	public void details()
	{
		System.out.println("Hey my name is  "+name);
	}
	
	public Student3 (String info)
	{
		name = info;
	}
}
