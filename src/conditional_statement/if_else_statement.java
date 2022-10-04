package conditional_statement;

public class if_else_statement {

	public static void main(String[] args) {
		String Name = "rohit";	
		
		if (Name.equalsIgnoreCase("swati"))
		{
			System.out.println("Hey name is matching exactly");
		}
		
		
		
		else if (Name == "rohit")
		{
			System.out.println("hey we are in else if block");
		}
		
		else {
			System.out.println("Hey not matching please provide correct Name");
		}

	}

}
