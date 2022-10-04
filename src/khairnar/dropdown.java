package khairnar;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		 Select element = new Select (dropdown);
		 
		element.selectByIndex(1); //dropdown selected by index 
		
		 WebElement performace_test = element.getFirstSelectedOption();
		 
		 System.out.println(performace_test.getText());
		 
		 driver.close();
		 
		 

		 
		 
		 
		 
		
		 
		 
		 
		 
		
	
		
		
	
		
		
		
		
		
		

	}

}
