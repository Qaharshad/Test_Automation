package Polymorphism_overriding;

public class ICICI extends RBI implements Loan{

	public static void main(String[] args) {
		// child class ref and child class
		ICICI obj1 = new ICICI ();
		obj1.Carloan();
		obj1.Homeloan();
		// parent class and child class 
		RBI obj2 = new ICICI();
		obj2.Carloan();
		obj2.Homeloan();
		// parent class and parent class  //
		RBI obj3= new RBI ();
		obj3.Carloan();
		obj3.Homeloan();
		
		Loan obj4 = new ICICI ();
		obj4.carloan();
		

	}
	
	public void Homeloan()
	{
		System.out.println("ICICI giving Home loan at 8%");
	}
	
	public void Carloan()
	{
		System.out.println("ICICI giving car loan at 7.5%");
	}


	public void carloan() {
		System.out.println("Hey loan giving at 8.6%");
		
	}


	public void bikeloan() {
		
		
	}

}
