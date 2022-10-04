package program_practice;

public class summation_series_2 {
	public static void main(String []args) {
		int sum = 0;
		int count = 1;
		for (int i =2 ;i<20;i= i+2) {
		if(count%2==1) {
		sum = sum + i;
		}else {
		sum = sum - i;
		}
		count++;
		}
		System.out.println(sum);
		
	}

}
