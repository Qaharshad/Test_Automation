package exception_handling;

import java.util.InputMismatchException;

public class exception_handling_demo1 {
	int c;
	public static void main(String []args)
	{
		try {
			int c = 10/2;
			System.out.println("hey div of c is  "+c);
		}
		
		catch(Exception h)
		{
			
			System.out.println("hey you made is mistake  "+h.getMessage());
		}		
		
		finally
		{
			System.out.println("finally block");
		}
	}
	
	 
	}  


