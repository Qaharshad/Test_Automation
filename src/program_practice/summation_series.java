package program_practice;

//WAP to print summation of the series:
//Sum = 2 - 4 + 6- 8 + 10- 12 + 14-16+18-20 = 10 

public class summation_series {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i =2 ;i<20;i= i+2) {
		if(i%4==0) {
			sum = sum-i;
		}
		else {
			sum = sum +i;
		}
		System.out.println(sum);
		}
	}
}



