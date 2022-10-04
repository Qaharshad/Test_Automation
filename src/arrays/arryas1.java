package arrays;

public class arryas1 {

	/*public static void main(String[] args) {
		
		int student_id [] = new int [4];
		
		student_id[0] = 89;
		student_id[1] = 100;
		student_id[2] = 45;
		student_id[3] = 56;
		
		System.out.println("value of given index is "+student_id[3]);
		int a = student_id.length; 
		System.out.println(""+a);
		
		
	}*/
	
	
	
	public static void main(String[] args) {
		int student_id [] [] = new int [2][2];
		student_id[0][0] = 89;
		System.out.print(student_id[0][0]);
		student_id[0][1] = 100;
		System.out.println(" "+student_id[0][1]);
		student_id[1][0] = 45;
		System.out.print(student_id[1][0]);
		student_id[1][1] = 56;
		
		int a = student_id.length; 
		System.out.println(""+a);
		 
		for (int r []:  student_id )
		{
			for(int i: r) {
				System.out.println(i);
			}
				
			
		}
		
		
		
		
		
		
	}}



