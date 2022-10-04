package program_practice;
//WAP to print sum of square of all elements in array.
public class summation_of_arrays {

	public static void main(String[] args) {
		double sum = 0 ;
		int a []= {5,10,7,8};
		for (int i =0; i<a.length;i++)
		{
			sum = sum +Math.pow(a[i], 2);
		}
		
		System.out.println(sum);
		

	}

}
