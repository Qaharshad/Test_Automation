package Super_keyword;

public class child_class2 extends base_class{
 int x = 10;
	public static void main(String[] args) {
		
		child_class2 obj = new child_class2 (50);		
	}
	
	public child_class2 ()
	{
		System.out.println("hey im in constructor child_class2 of string args");
	}
	
	public child_class2 (int a )
	{
		super (a);
		System.out.println("hey im in constructor child_class2 of int args");
	}

}
