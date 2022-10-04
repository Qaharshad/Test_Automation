package Super_keyword;

public class child_class1 extends parent_class1 {

	public static void main(String[] args) {
		
		child_class1 obj1= new child_class1 ("Harshad");

	}
	
	public child_class1()
	{
		System.out.println("hey my company name is ");
	}
	
	
	public child_class1(String name)
	{
		super(name);
		System.out.println("hey my company name is "+name);
	}

}
