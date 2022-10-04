package program_practice;

public class string_practise {

	public static void main(String[] args) {
		//scenario 1 
		String a = "Mission_Automation";
		System.out.println(a.charAt(3));
		
		//scenario 2 
		String b = "Mission_Automation_";
		
		System.out.println(b.contains(a));
		
		//scenario 3 
		String c = "Mission_AutOmation";
		System.out.println(c.equals(a));
		
		//scenario 4 
		System.out.println(c.equalsIgnoreCase(a));
		
		//scenario 5 
		String d ="     ";
		System.out.println(d.isEmpty());
		
		//scenario 6 
		System.out.println(d.isBlank());
		
		//scenario 7 
		String e = "Mission_Automation_paisa";
		System.out.println(e.length());
		System.out.println(e.charAt(4));
		
		
		//scenario 8
		String f = "Mission_Automation_15lpa";
		System.out.println(f.replaceAll("1", "2"));
		
		//scenario 9 
		System.out.println(f.replace("5", "9"));
		
		//scenario 10 
		String h = "Mission_Automation_20lpa";
		char m [] = h.toCharArray();
		System.out.println(m);
		System.out.println(m[2]);
		System.out.println(m.length);
		
		
		//scenario 11  (substring)
		String j = "ROHIT IS BEST";
		//System.out.println(j.substring(1, 4));
		
		//Scenario 12
		
		/*String k []= j.split(" ");
		for (int i = 0;i<j.length();i++)
		{
			System.out.println("==== "+k[i]);
		}*/
	
		//scenario 13 upper & lower case 
		
		System.out.println(j.toLowerCase());
		
		System.out.println(a.toUpperCase());
		
		//scenario 14 is digit
		char ch = 'r';
		System.out.println(Character.isDigit(ch));
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isLowerCase(ch));
		System.out.println(Character.isUpperCase(ch));
		}
	

	
	
	
	

}










