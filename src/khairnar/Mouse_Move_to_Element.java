package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Move_to_Element {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/menu/#");
		
		Thread.sleep(2000);
		
		WebElement menu = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
	
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).perform();
		
		Thread.sleep(2000);
		
		
		WebElement submenu1 = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		
		
		action.moveToElement(submenu1).perform();
		Thread.sleep(2000);
		
		
		driver.close();
		
		
		
		
		
		
	}

}
