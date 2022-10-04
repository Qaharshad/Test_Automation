package parameters;

public class passing_parameters {

	public static void main(String[] args) 
	{
		passing_parameters obj1= new passing_parameters();
		
		//obj1.add(89, 78);
		obj1.sub(8997.56, 9988.56);

	}
	public void add (int a,int b) 
	{
		
		int c = a+b;
	System.out.println("Hey look result is "+c);	
		
	}
	
	public void sub (double a,double b) {
		
		double c = b-a;
		System.out.println("Hey look sub result is "+c);
		
		
	}

}
