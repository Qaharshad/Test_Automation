package Inheritance;

public class baseandchild extends Baseclass {

	public static void main(String[] args) {
		Baseclass obj1= new baseandchild();
		obj1.add(); // we have call non-static method by using object (i.e object need to create)
		
		Baseclass.mul(); // we can call static method by calling their class name 
		

	}
	
	
	public void divide()
	{
		System.out.println("im in base and child class");
	
	}

	public void multi()
	{
		System.out.println("im in multi method");
	}
	
	
}
