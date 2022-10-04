package Polymorphism_overriding;

public class AXIS extends RBI implements Loan {

	public static void main(String[] args) {
		//child ref child class 
		AXIS obj1= new AXIS ();
		obj1.Carloan();
		obj1.Homeloan();
		
		// parent ref child class 
		RBI obj2 = new AXIS();
		obj2.Carloan();
		obj2.Homeloan();
		
		//parent ref and parent class 
		RBI obj3 = new RBI();
		obj3.Carloan();
		obj3.Homeloan();
		
		Loan obj4 =new AXIS();
		obj4.bikeloan();
		obj4.carloan();
		

	}
	
	public void Homeloan()
	{
		System.out.println("Axis is giving home loan at 9.5%");
	}

	public void Carloan()
	{
		System.out.println("Axis is giving car loan at 9.8%");
	}


	public void carloan() {
		System.out.println("Hey our finance giving car loan at 6%");
		
	}


	public void bikeloan() {
		System.out.println("Hey our finance giving bike loan at 7%");		
	}
}
