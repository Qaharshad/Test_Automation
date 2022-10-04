package arrays;

public class single_dimensional2 {

	public static void main(String[] args) {
		int employee_id[]=new int [5];
		employee_id[0]= 56;
		employee_id[1]= 57;
		employee_id[2]= 58;
		employee_id[3]= 59;
		employee_id[4]= 60;
		
		
		int sizeofarray= employee_id.length;
		
		System.out.println("size of array "+sizeofarray);
		
		for (int i= 0; i<sizeofarray;i++) {
			System.out.println("arrays are "+employee_id[i]);
			
		}
	}

}
