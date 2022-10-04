package program_practice;
////to print series 1 12 123 1234 ……. n terms 
public class series_prog {

	public static void main(String[] args) {
		int num = 0;
		
		for (int i = 1 ; i<=10;i++ )
		{
			num = num*10+i;
			System.out.print(num+" ,");
		}
		
	}

}
