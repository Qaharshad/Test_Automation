package Class_object_methods;

public class class_ {
	
	int x= 56;
	int y = 60;

	public static void main(String[] args) {
		System.out.println("Start kara bhau program");
		class_ obj1= new class_();
		obj1.sum();
	
		System.out.println("Value of x is   "+obj1.x);
		System.out.println("Value of y is   "+obj1.y);
		System.out.println("End kara bhau program");
		
		
		class_ obj2 = new class_();
		obj2.sum();
		System.out.println("object value x is "+obj2.x);
		System.out.println("object value x is "+obj2.y);
	}
	
	public  void sum()
	{
      int a =50;
	  int b =89;
	  int c = a+b;
	  System.out.println("sum of two no.is "+c);
	}

}
