package khairnar;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().window().maximize();	
		Thread.sleep(2000);		
		String parentwindow = driver.getWindowHandle();
		System.out.println(""+parentwindow);		
		WebElement btn = driver.findElement(By.id("windowButton"));
		btn.click();
		Thread.sleep(2000);		
		Set<String> allwindows = driver.getWindowHandles();	
		System.out.println(""+allwindows.size());
		
		Iterator<String> itr = allwindows.iterator();
		while (itr.hasNext())
		{
			String window = itr.next();
			if (!window.equals(parentwindow))
			{
				System.out.println(""+window);
				driver.switchTo().window(window);
			}
		}		
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		System.out.println(""+heading.getText());
		
		
		driver.quit();

	}

}
