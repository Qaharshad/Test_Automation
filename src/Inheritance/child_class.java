package Inheritance;

public class child_class extends Baseclass{

	public static void main(String[] args) {
		child_class obj1=new child_class();
		
		obj1.sub();
		obj1.multiplication();
		obj1.add();
		obj1.divide();

	}
	
	public void multiplication ()
	{
		System.out.println("Hey multiplication of child class is 500");
	}
	
	public void divide() 
	{
		System.out.println("Hey dividation of child class is 50");
	}

}
