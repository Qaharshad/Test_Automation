package program_practice;

public class factorial_array_element {

	public static void main(String[] args) {
		int a []= {1,2,3,4};
		 
		
		for (int i = 0 ; i<a.length;i++)
			
		
		{
			int fact = 1;
			
			for (int j = a[i];j>1;j--)
			{
				
				fact = fact*j;
			}
			
     System.out.println(fact);
		}
		
		

	}

}
