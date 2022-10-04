package this_keyword;

public class this_method {
	
	public this_method()
	{
		System.out.println("hey im in zero parameter const.");
	}
	
	public this_method(int a)
	{  
		this();
		System.out.println("hey im in of int parameter const. "+a);
	}
	
	public this_method(String browser)
	{
		this(10);
		
		System.out.println("hey im in string parameter const. "+browser);
	}
		
	public static void main (String []args)
	{
		this_method obj = new this_method("Chrome browser");
		
	}

}
