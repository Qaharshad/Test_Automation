package conditional_statement;

public class Nested_if_or_if_else_if {

	public static void main(String[] args) {
		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("IE"))
		{
			System.out.println("TC executed on IE");
		}
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("TC executed on Firefox ");

		}
		else if (browser.equalsIgnoreCase("Mukesh"))
		{
			System.out.println("TC executed on Chrome");
		}
		
		else 
		{
			System.out.println("Please provide valid browser");

		}
		
		System.out.println("Testing complete");
	}

}
