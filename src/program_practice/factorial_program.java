package program_practice;

public class factorial_program {

	public static void main(String[] args) {
		int n = 6; 
		int fact = 1;
		for (int i=n;i>=1;i--) //i = 6 > 6>=1 > i--(5);  i = 5 > 5>=1 > i--(4);
		{
			fact = fact*i;    //6*5*4*3*2*1 = 720 
			
		}
		
		System.out.println(fact);

	}

}
