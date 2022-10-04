package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions action = new Actions (driver);
		
		action.doubleClick(doubleclick);
		action.build().perform();
		Thread.sleep(2000);
		
		WebElement msg = driver.findElement(By.id("doubleClickMessage"));
		String msg1 = msg.getText();
		System.out.println(msg1);
		boolean check;
		System.out.println(check = msg1.equalsIgnoreCase("You have done a double click"));
		driver.quit();
		
		
			
		
	}

}
