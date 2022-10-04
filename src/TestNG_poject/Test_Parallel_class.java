package TestNG_poject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Parallel_class {
	 
	@Test
	
	public void linkedin ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/login");
		WebElement signinheading = driver.findElement(By.xpath("//h1[text()= 'Sign in']"));
		WebElement subheading = driver.findElement(By.xpath("//p[text()= 'Stay updated on your professional world']"));
		
		String actualheading = signinheading.getText();
		String actual_subheading = subheading.getText();
		
		System.out.println("actual heading is ==>  "+actualheading);
		System.out.println("actual sub heading is ==>  "+actual_subheading);
		
		SoftAssert softassertion = new SoftAssert();
		softassertion.assertEquals(actualheading, "Sign in");
		softassertion.assertEquals(actual_subheading, "Stay updated on your professional world");
		softassertion.assertAll();
		
		driver.close();
		
		
	}
	
	@Test 
	
	public void googlesearch ()
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.xpath("//input[@name='q']"));
		
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(searchbox.isDisplayed());
		driver.close();
		
		
	}

}
