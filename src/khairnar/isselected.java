package khairnar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		
		List <WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(checkbox);
		
		WebElement check1 = checkbox.get(0);
		WebElement check2 = checkbox.get(1);
		WebElement check3 = checkbox.get(2);
		
		check1.click();
		check3.click();
		
		System.out.println(" check1 selected ==>> "+check1.isSelected());
		System.out.println(" check2 selected ==>> "+check2.isSelected());
		System.out.println(" check3 selected ==>> "+check3.isSelected());
		
		
		
		
		
		
	
		
		
		
	}

}
