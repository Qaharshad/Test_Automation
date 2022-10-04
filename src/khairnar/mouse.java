package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class mouse {
	@Test
	public void mouse1() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\selenium jars\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		
		WebElement Draggable = driver.findElement(By.id("draggable"));
		WebElement Droppable = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions (driver);
		
		action.dragAndDrop(Draggable, Droppable);
		action.build().perform();
		
		
		Thread.sleep(2000);
		driver.close();
		
		
				
		

		
	}

}
