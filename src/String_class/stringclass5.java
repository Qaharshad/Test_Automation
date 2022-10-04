package String_class;

public class stringclass5 {

	public static void main(String[] args) {
		String fullname = "Harshad-Milind-Khairnar";
		String []toolname = fullname.split("-");
		
		for (int i=0; i<toolname.length;i++)
		{
			System.out.println("value for "+i+" is  "+toolname[i]);
			if (toolname[i].equalsIgnoreCase("harshad"))
			{
				
				System.out.println("Test is passed ");
				break;
			}
		
		
		}
		
		
	}

}
