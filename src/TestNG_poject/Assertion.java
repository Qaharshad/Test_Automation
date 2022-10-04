package TestNG_poject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test 
	public void asserion () 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.linkedin.com/login");
		
		
		
		WebElement signinheading = driver.findElement(By.xpath("//h1[text ()='Sign in']"));
		WebElement subheading = driver.findElement(By.xpath("//p[text ()='Stay updated on your professional world']"));
		WebElement logo = driver.findElement(By.id("linkedin-logo"));
		

		String actualheading = signinheading.getText();
	
		String actualsubheading = subheading.getText();
		
		System.out.println("actual_heading is ===> "+actualheading);
		System.out.println("actual_sub_heading is ===> "+actualsubheading);

		

		assertEquals(actualheading, "Sign in");
		assertEquals(actualsubheading, "Stay updated on your professional world");
		assertTrue(logo.isDisplayed());
		
		driver.close();


	}

}
