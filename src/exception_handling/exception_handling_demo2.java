package exception_handling;

public class exception_handling_demo2 {
	
	public static void main(String []args)
	{
		System.out.println("abc");
		
		try 
		{
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}
		
		System.out.println("xyz");
		
	}

}
