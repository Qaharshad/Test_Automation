package Inheritance;

public class child_ extends parent_Class {

	public static void main(String[] args) {
		
		child_ obj1= new child_();
		obj1.sub();
		parent_Class.add();
		
	}
	
	public static void sub ()
	{
		System.out.println("im from child class ");
	}
	
	

}
