package khairnar;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhanlder2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Downloads\\\\selenium jars\\\\Driver\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		String parent = driver.getWindowHandle();
		
		System.out.println(parent);
		
		WebElement btn1 = driver.findElement(By.id("windowButton"));
		WebElement btn2 = driver.findElement(By.id("messageWindowButton"));
		btn1.click(); btn2.click();
		
		Set <String> allwindows = driver.getWindowHandles();
		
		System.out.println("Hey size of windows are "+allwindows.size());
		
		ArrayList <String> window = new ArrayList<>(allwindows);
		
		driver.switchTo().window(window.get(1));
		
		Thread.sleep(2000);
		driver.close();
	
		
		driver.switchTo().window(window.get(2));
		
		Thread.sleep(2000);
		driver.close();
		
		
		driver.switchTo().window(window.get(0));
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		

	}

}
