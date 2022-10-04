package Polymorphism_overriding;

public class child_class extends parents_class {

	public static void main(String[] args) {
		
		parents_class obj = new parents_class ();
		
		obj.add(100, 50);

	}
	
	public void add(int a, double b)
	{
		System.out.println("hey im from child_class of add method");
	}
	public void sub(int x, double y)
	{
		System.out.println("Hey im from child_class of sub method");
	}
	

}
