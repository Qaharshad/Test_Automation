package program_practice;

public class output {

	public static void main(String[] args) {
		
		int a[]={1,2,3,4};
		int []b = new int[a.length];
		for (int i = 0 ; i< a.length;i++) {
		int mul = 1;
		for (int j = 0 ; j< a.length;j++) {
		if (i!=j)
		{
		mul = mul*a[j];
		}
	}
		b[i] = mul;
		}
		for (int i = 0 ; i< b.length;i++) {
		System.out.println(b[i]);
		}
		}
		
	}



