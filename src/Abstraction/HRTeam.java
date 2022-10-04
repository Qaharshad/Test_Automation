package Abstraction;

public class HRTeam extends ITDept {

	public static void main(String[] args) {
		
		HRTeam HR= new HRTeam ();
		HR.goodies();
		HR.salary();
		HR.work();
		HR.bonus();

		ITDept It = new HRTeam();
		It.salary();
		It.goodies();
		It.work();
	
		
		
		
	}


	public void salary() {
		System.out.println("Hey salary is 14 LPA");
			
	}
	
	public void bonus () {
		System.out.println("Hey joining bonus is 2 LPA");
	}

}
