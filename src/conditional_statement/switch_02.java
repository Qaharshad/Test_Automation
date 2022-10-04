package conditional_statement;

import java.util.Scanner;

public class switch_02 {

	public static void main(String[] args) {
		
		int day;
		Scanner console = new Scanner(System.in);
		System.out.println("Enter no. between 1 to 4");
		
		 day = console.nextInt();
		
		switch (day)
		{
		case 1 :
		{
			System.out.println("performance is poor");
		}
		break; 
		
		case 2 :
		{
			System.out.println("performance is average");
		}
		break; 
		
		case 3 :
		{
			System.out.println("performance is good");
		}
		break;
		
		case 4 :
		{
			System.out.println("performance is very good");
		}
		break;
		
		default :
      	  System.out.println("Please provide number between 1 to 4 ");
  	  
		
		
		}
		
		
		
	}

}
