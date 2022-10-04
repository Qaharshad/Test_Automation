package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	
		WebElement fullname = driver.findElement(By.xpath("//input[@id='userName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		WebElement currentadd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement permanent = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		
		
		
		
		fullname.sendKeys("Harshad");
		email.sendKeys("harshad.k_qua@gmail.com");
		currentadd.sendKeys("Aturnagar,Undri");
		Thread.sleep(2000);
		
		
		Actions action = new Actions(driver);
		fullname.click();
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(2000);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(2000);
		
		
		permanent.click();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.build().perform();
		Thread.sleep(2000);
		
		 driver.findElement(By.xpath("//button[@id='submit']")).click();
		
		
		Thread.sleep(2000);
		
	
		
		driver.close();
		
		

	}

}
