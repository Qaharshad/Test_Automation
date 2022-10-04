package khairnar;

public class palidrome {

	public static void main(String[] args) {
		
		int num = 454;
		int rev = 0;
		int temp=num;
		
		
		while(num>0)
		{
			int d = num/10;
			rev = rev*10+d;
			num = num/10;
			
		}
		
		if(temp==rev)
		{
			System.out.println(temp+"is palindrome");
		}

}
}
