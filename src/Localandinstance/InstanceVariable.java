package Localandinstance;

public class InstanceVariable {
int roll = 56 ; 
int marks= 80 ; 
	
	
	public static void main(String[] args) {
		InstanceVariable obj1 = new InstanceVariable();
		obj1.student();
		InstanceVariable obj2 = new InstanceVariable();
		obj2.student();
		InstanceVariable obj3 = new InstanceVariable();
		obj3.student();
		
	}
	
 public void student()
 {
	 System.out.println("Roll is "+roll+""+" and marks are "+marks);
 }
	
}
