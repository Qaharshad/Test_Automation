package Super_keyword;

public class Child_class extends Parent_class {
int int_rate = 10 ;

	public static void main(String[] args) {
		
		Child_class obj1 = new Child_class();
		obj1.showmeInt();

	}
	
	public void showmepvtbnkInt()
	{
		super.showmeInt();
		System.out.println("hey pvt. bnk int rate is "+int_rate);
	}
	
	public void showmeInt ()
	{
		
		System.out.println("Hey pvt. bnk1 int rate is "+int_rate);
	}

}
