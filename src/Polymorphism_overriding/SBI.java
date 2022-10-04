package Polymorphism_overriding;

public class SBI extends RBI{

	public static void main(String[] args) {
		
		//child class ref and child class 
		SBI obj1 = new SBI ();
		obj1.Homeloan();
		
		// parent class ref and child class
		RBI obj2 = new SBI ();
		obj2.Carloan();
		
		// parent class ref and parent class
		RBI obj3 = new RBI();
		obj3.Homeloan();
		
		obj3.Carloan();
		

	}
	
	public void Homeloan()
	{
		System.out.println("SBI giving Home loan at 9%");
	}
	
	public void Carloan()
	{
		System.out.println("SBI giving Car loan at 8.5%");
	}

}
