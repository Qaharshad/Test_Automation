package khairnar;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keys_program {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		Actions x = new Actions(driver);
		
		x.keyDown(Keys.SHIFT);
		x.sendKeys(username, "harshad.");
		x.build().perform();
		Thread.sleep(2000);
		
		x.keyUp(Keys.SHIFT);
	
		x.sendKeys(password, "Token@4535");
		x.build().perform();
		Thread.sleep(3000);
		
		
		}

}
