package String_class;

public class uppercase_lowercase {
	public static void main(String[] args) {	
		String x = "My ClasS";
		String y= "";
		for (int i=0;i<x.length();i++)
		{
			char c = x.charAt(i);			
			if(Character.isUpperCase(c)) {
				y=y+Character.toLowerCase(c);				
			}
			else if(Character.isLowerCase(c))
			{
				y=y+Character.toUpperCase(c);
			}		
			else {
				y=y+c;
			}
		}	
		System.out.println(y);
	}
}
