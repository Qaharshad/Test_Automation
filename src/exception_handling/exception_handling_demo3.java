package exception_handling;

import java.util.InputMismatchException;

public class exception_handling_demo3 {
	
	public static void main(String []args)
	{
		try {
			int c = 10/0;
			System.out.println(c);
		}
		
		
		catch(ArithmeticException h)
		{
			System.out.println("hey you made arithmetic mistake "+h.getMessage());
		}
		
		catch(InputMismatchException h)
		{
			System.out.println("Hey you made input mistake "+h.getMessage());
		}
		
	}

}
