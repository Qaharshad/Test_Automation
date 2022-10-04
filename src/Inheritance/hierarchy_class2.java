package Inheritance;

public class hierarchy_class2 extends child_class2 {
 public void greetings ()
 {
	 System.out.println("simple congratulations shubham ");
 }
	public static void main(String[] args) {
		hierarchy_class2 obj = new hierarchy_class2 ();
		
		obj.div();
		obj.mul();
		obj.greetings();
	}

}
