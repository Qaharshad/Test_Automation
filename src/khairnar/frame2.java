package khairnar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame2 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement parentframe = driver.findElement(By.xpath("//div [text()= 'Sample Iframe page There are 2 Iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame, which is this window, and the two frames below']"));
	         System.out.println(" "+parentframe.getText());

	        WebElement frame = driver.findElement(By.id("frame1"));
	     
	        driver.switchTo().frame(frame);
	        
	        List<WebElement> frameheading = driver.findElements(By.xpath("//h1 [@id='sampleHeading']"));
	         
	        WebElement first = frameheading.get(0);
	        System.out.println(""+first.getText());
	        
	        driver.close();
	}

}
