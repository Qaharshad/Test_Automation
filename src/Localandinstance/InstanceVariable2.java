package Localandinstance;

public class InstanceVariable2 {
int roll;
double marks;

public InstanceVariable2(int roll, double marks) {
	this.roll= roll;
	this.marks=marks;
	
}
	public static void main(String[] args) {
		InstanceVariable2 obj1= new InstanceVariable2(56,89.5);
		obj1.student();
		

	}
	
	public void student() {

		
		System.out.println("Roll no. is  "+roll+" and marks are "+marks);
	}

}
