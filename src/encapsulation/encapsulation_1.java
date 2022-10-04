package encapsulation;

public class encapsulation_1 {
	
	private int geekage;
	private int geekroll;
	private String geekname;
	
	public int getage()
	{
		return geekage;
	}
	public int getroll()
	{
		return geekroll;
	}
	public String getname()
	{
		return geekname;
	}
	
	
	public void setage(int newAge)
	{
		 geekage = newAge;
	}
	public void setroll(int newRoll)
	{
		geekroll = newRoll;
	}
	public void setname(String newName)
	{
	     geekname = newName;
	}
	
	
	public static void main(String[] args) {
		
		encapsulation_1 obj = new encapsulation_1();
		obj.setage(24);
		obj.setname("Harshad");
		obj.setroll(2140);
		
		
		 System.out.println("Geek's name: " + obj.getname());
	        System.out.println("Geek's age: " + obj.getage());
	        System.out.println("Geek's roll: " + obj.getroll());
		

	}

}
