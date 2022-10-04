package TestNG_poject;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_basics {
	WebDriver driver;
	@BeforeMethod (groups = "login 3")
	public void setup ()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.saucedemo.com/");
		
	}
	
	
	@Test (priority =2 , groups = "login 2")
	public void getTitle()
	{
		String Title = driver.getTitle();
	System.out.println(Title);
	
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@Test (priority = 3 , groups = "login 3")
	public void login_2()
	{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("problem_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	@Test (priority = 1 , groups = "login 3")
	public void login_3()
	{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("performance_glitch_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	
	@AfterMethod (groups = "login 3")
	public void quitbrowser()
	{
		driver.quit();
	}
	
		
	

}
