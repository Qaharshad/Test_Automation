package Inheritance;

public class child_child_class1 extends child_class2 {

	public void name ()
	{
		System.out.println("hey my name is harshad");
	}
	
	public void friendsname()
	{
		System.out.println("hey my friendsname is rohit,swati,deepali,shubham");
	}


public static void main (String[] args)
  {
	child_child_class1 obj = new child_child_class1 ();
	
	obj.div();
	obj.friendsname();
  }


}

