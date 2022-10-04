package String_class;

public class reverse_string {

	public static void main (String[] args) {
		String str = " Harshad Automation";
		String rstr = " ";
		char ch;
		
		for (int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			rstr = ch+rstr;
			
		}
		
		System.out.println("Reversed String : "+rstr);
	}
	
	
	
}
