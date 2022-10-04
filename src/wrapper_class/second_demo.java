package wrapper_class;

public class second_demo {

	public static void main(String[] args) {
		 
		int x = 89;  
		Integer y = Integer.valueOf(x); // boxing 
		System.out.println("value of y: "+y);
		
		
		int a = 78;
		Integer b = a ; //AutoBoxing
		System.out.println("value of b by autoboxing: "+b);
		
		
		Integer m = 67;
		int n  = m.intValue();
		System.out.println("value of n by unbixing: "+n);
		
		Integer k = 56;
		int h =k; 
		System.out.println("value of h by autounboxing: "+h);
		
		
		
		
		
		
	}

}
