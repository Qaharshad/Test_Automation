package conditional_statement;

import java.util.Scanner;

public class switch_program_with_scanner {

	public static void main(String[] args) {
      int day;
      
      Scanner console= new Scanner(System.in);
      
      System.out.println("Enter no. between 1 to 7");
      day = console.nextInt();
      
      switch (day)
      {
      case 1 :
    	  System.out.println("Its a monday");
    	  break;
      case 2 :
    	  System.out.println("Its a Tuesday");
    	  break;
      case 3 :
    	  System.out.println("Its a Wednesday");
    	  break;
      case 4:
    	  System.out.println("Its a Thursday");
    	  break;
      case 5 :
    	  System.out.println("Its a Friday");
    	  break;
      case 6 :
    	  System.out.println("Its a Saturday");
    	  break;
      case 7 :
    	  System.out.println("Its a Sunday");
    	  break;
    	  
    	  default :
        	  System.out.println("Please provide number between 1 to 7 ");
    	  
       
      }
	}

}
