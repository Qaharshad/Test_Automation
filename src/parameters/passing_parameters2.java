package parameters;

public class passing_parameters2 {

	public static void main(String[] args) 
	{
		Dynamiccal obj1= new Dynamiccal();
		Dynamiccal.fullname("Harshad", "Khairnar");
		
		int sum = obj1.add(89, 78);
		System.out.println("addition result is "+sum);
		double sub = obj1.sub(8997.56, 9988.56);
		System.out.println("Substraction result is "+sub);

	}
	
		
	}


