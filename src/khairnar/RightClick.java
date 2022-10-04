package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement RightClick = driver.findElement(By.xpath("//button [@id='rightClickBtn']"));
	
		
		Actions action = new Actions (driver);
		action.contextClick(RightClick);
		action.build().perform();
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
