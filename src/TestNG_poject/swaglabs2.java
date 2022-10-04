package TestNG_poject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class swaglabs2 {
	@Test (priority=1)
	public void swaglab2() throws InterruptedException {

	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\selenium jars\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement username = driver.findElement(By.xpath("//input [@id = 'user-name']"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input [@placeholder = 'Password']"));
		
		password.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//input [@name=\"login-button\"]"));
		 login.click();
		 
		 Thread.sleep(5000);
		 
		 driver.close();
	}
	
		 @Test (priority=2)
		 public void swaglablogin2 () throws InterruptedException
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\selenium jars\\\\Driver\\\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				
				
				driver.get("https://www.saucedemo.com/");
				driver.manage().window().maximize();
				
				Thread.sleep(2000);
				
				WebElement username = driver.findElement(By.xpath("//input [@id = 'user-name']"));
				username.sendKeys("problem_user");
				Thread.sleep(2000);
				
				WebElement password = driver.findElement(By.xpath("//input [@placeholder = 'Password']"));
				
				password.sendKeys("secret_sauce");
				
				Thread.sleep(2000);
				
				WebElement login = driver.findElement(By.xpath("//input [@name=\"login-button\"]"));
				 login.click();
				 
				 Thread.sleep(5000);
				 
				 driver.close();
		 }
		 
		 
		
		
	}
	

		
		




