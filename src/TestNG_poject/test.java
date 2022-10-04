package TestNG_poject;

import org.testng.annotations.Test;

public class test {
	@Test (priority = 1 ,groups = "valid_login")
	
	public void valid_login ()
	{
		System.out.println("In a valid login");
	}
	
	@Test (priority = 1 ,groups = "login 2")
	
	public void invalid_login ()
	{
		System.out.println("In a invalid login");
	}
	
	
	@Test (priority = 2 ,groups = "valid_login")
	public void signin()
	{
		System.out.println("hey i am in signin test");
	}

}
