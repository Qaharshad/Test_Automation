package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpandKeysDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		Actions action = new Actions (driver);
		
		action.keyDown(Keys.SHIFT);
		action.sendKeys(username, "harshad.k_qua");
		
		Thread.sleep(2000);
		
		action.keyUp(Keys.SHIFT);
		action.build().perform();
		
		action.keyDown(Keys.SHIFT);
		action.sendKeys(password, "84123");
		
		Thread.sleep(2000);
		action.keyUp(Keys.SHIFT);
		action.build().perform();
		
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

}
