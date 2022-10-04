package program_practice;

public class even_count {

	public static void main(String[] args) {
		int a[]={3,10,3,4,5,8,9};
		int even_count = 0;
		int odd_count = 0;
		for (int i = 0;i<a.length;i++)
		{
			if (i%2==0)
			{
				even_count = even_count+1;
				
			}
			
			else {
				odd_count = odd_count+1;
			}
		}
		System.out.println(even_count);
		System.out.println(odd_count);
	}

}
