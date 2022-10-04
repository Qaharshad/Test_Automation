package Interface;

public class advancedcalc implements Calc {

	public static void main(String[] args) {
		
		advancedcalc obj1 = new advancedcalc();
		obj1.add(50, 60);
		obj1.sub(100, 50);
		obj1.div();
		obj1.mul();
		
	
	}

	
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("result of c "+c);
		
		
	}

	
	public void sub(int x, int y) {
		int z = x - y;
		System.out.println("result of z "+z);
		
	}
	
	public void div () 
	{
		System.out.println("Hey we can do dividation");
	}
	
	public void mul () 
	{
		System.out.println("Hey we can do multiplication");
	}
	

}
