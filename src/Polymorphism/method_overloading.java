package Polymorphism;

public class method_overloading {

	public static void main(String[] args) {
		method_overloading obj1 = new method_overloading();
		obj1.add(45, 45);
		obj1.add(45, 45, 45);
		obj1.add(45, 45.56);
		obj1.add(45.69, 5689.5);
		
		

	}
	
	public void add (int a,int b) 
	{
		int c = a+b;
		System.out.println("Addition is "+c);
	}
	
	public void add (int a,int b,int d) 
	{
		int c = a+b+d;
		System.out.println("Addition is "+c);
	}
	public void add (double a,double b) 
	{
		double c = a+b;
		System.out.println("Addition is "+c);
	}
	public void add (int a,double b) 
	{
		double c = a+b;
		System.out.println("Addition is "+c);
	}
	public void add (double a,int b) 
	{
		double c = a+b;
		System.out.println("Addition is "+c);
	}

}
