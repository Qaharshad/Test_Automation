package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class simple_code {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement Username = driver.findElement(By.id("user-name"));
		Username.sendKeys("standard_user");
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		Thread.sleep(3000);
	
		
		WebElement btn = driver.findElement(By.className("submit-button"));
		btn.click();
		Thread.sleep(3000);
		
		driver.quit();

	}

}
