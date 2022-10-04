package this_keyword;

public class this_variable_demo {
	
	int x;
	int y; 
	
	public this_variable_demo(int x, int y)
	{
		this.x= x;
		this.y= y;
	}
	
	public void add()
	{
		int sum = x+y;
		System.out.println("sum is "+sum);
	}
	
	
	public static void main (String[]args)
	{
		this_variable_demo obj = new this_variable_demo(10,20);
		obj.add();
		
		
	}
	
	

}


