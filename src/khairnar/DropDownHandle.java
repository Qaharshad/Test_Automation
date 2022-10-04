package khairnar;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 driver.manage().window().maximize();
		 
		 WebElement dropdown = driver.findElement(By.xpath("//select[@class= 'dropdown-menu-lists']"));
		 
		 
		 Select element = new Select (dropdown);
	element.selectByVisibleText("Python");
		 
		System.out.println(" python selected ");
		
		Thread.sleep(2000);
		
		driver.close();
		 
		 
	}

}
