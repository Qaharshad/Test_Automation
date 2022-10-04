package TestNG_poject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Addtokart {
	WebDriver driver;

	@BeforeMethod 
	
	public void getpage () throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button [@class = '_2KpZ6l _2doB4z']")).click();
	}
	

		
	@Test (dependsOnMethods = "mobilepage")
	public void selectmobile() throws InterruptedException
	{
		driver.findElement(By.cssSelector("div._331-kn._2tvxW div.InyRMC._3Il5oO div._37M3Pb div.eFQ30H:nth-child(3) a:nth-child(1) div._1mkliO div.CXW8mj > img._396cs4._3exPp9")).click();
            Thread.sleep(2000);
		driver.findElement(By.cssSelector("div._6t1WkM._3HqJxg div._1YokD2._2GoDe3 div._1YokD2._3Mn1Gg.col-10-12 div._1AtVbE.col-12-12:nth-child(10) div._3ChZRr._1rs5Pv div._1ve3GO a._2a3TMW div._1bEAQy._2iN8uD > img.kJjFO0")).click();
		
		Thread.sleep(2000);
	
	}
	@Test 
	public void mobilepage() throws InterruptedException
	{
		
		driver.findElement(By.cssSelector("div._331-kn._2tvxW div.InyRMC._3Il5oO div._37M3Pb div.eFQ30H:nth-child(3) a:nth-child(1) div._1mkliO div.CXW8mj > img._396cs4._3exPp9")).click();
		
		Thread.sleep(5000);
	}
	
	@AfterMethod 
	public void close ()
	{
		driver.quit();
	}
	}


