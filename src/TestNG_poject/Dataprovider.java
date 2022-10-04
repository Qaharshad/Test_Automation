package TestNG_poject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@DataProvider (name = "usercredentials")
	public Object [][] getData()
	{
		return new Object [][] {{"standard_user", "secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"}};
	}
	
	@Test (dataProvider = "usercredentials")
	public void DataProvider (String email , String passwordtext) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		username.sendKeys(email);
		Thread.sleep(2000);
		password.sendKeys(passwordtext);
		Thread.sleep(2000);
		login.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div [text() = 'Sauce Labs Backpack']")).click();
		
		Thread.sleep(2000);
		
		
		driver.close();
		
		
		
		
		
		
	}
	
	
	
	
	

}
