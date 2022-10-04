package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("http://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//input[@value = 'option-1']"));
		 option.click();
		 Thread.sleep(2000);
		 
		 
		 System.out.println("after click "+option.isSelected());
		 
		 driver.close();
		 
	}

}
