package khairnar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_selenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		driver.switchTo().frame(0);// 1st frame 
		
		WebElement framelink = driver.findElement(By.linkText("org.openqa.selenium"));
		
		System.out.println(framelink.isDisplayed());
		
		framelink.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent(); //main browser parent page
		
		driver.switchTo().frame(1); //frame 1
		WebElement framelink2 = driver.findElement(By.linkText("Alert"));
		
		framelink2.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent(); //main browser parent page
		
		driver.switchTo().frame(2); //frame 2
		
		WebElement help = driver.findElement(By.linkText("HELP"));
		
		help.click();
		
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//h2[text()=\"Annotation Type\"]"));
		
		System.out.println("hey we found the mentioned object "+text.getText());
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
