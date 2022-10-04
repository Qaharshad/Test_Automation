package khairnar;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handler {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("parent window handle is "+parent);
		
		WebElement btn = driver.findElement(By.id("windowButton"));
		
		btn.click();
		Thread.sleep(3000);
		Set<String> allwindowhandle = driver.getWindowHandles();
		
		for (String i : allwindowhandle)
		{
			if(!parent.equalsIgnoreCase(i))
			{
				driver.switchTo().window(i);
				System.out.println(driver.findElement(By.id("sampleHeading")).getText());
				driver.close();
				
			}
		}
		Thread.sleep(3000);
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		driver.quit(); 
		
		
		
		
		
		
		
		
	}

}
