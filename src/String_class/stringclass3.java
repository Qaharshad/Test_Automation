package String_class;

import java.util.Scanner;

public class stringclass3 {

	public static void main(String[] args) {
		
		
		String expected  = "Primary CTA should be 30 words";
		
		
		System.out.println("provide sentence");
		
		Scanner actual = new Scanner(System.in);
		String sentence = actual.nextLine();
		
		boolean status = expected.contains(sentence);
		System.out.println("Status is "+status);
		
		 
	
	}

}
