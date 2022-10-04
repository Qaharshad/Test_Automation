package khairnar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement parentpage = driver.findElement(By.xpath("//div[text() = 'Sample Iframe page There are 2 Iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame, which is this window, and the two frames below']"));
		
		System.out.println("PARENT PAGE IS DISPLAYED ==> "+parentpage.isDisplayed());
		
		
		//finding frame by web element 
		//WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		//driver.switchTo().frame(frame);
		
		// finding frame by id 
		driver.switchTo().frame("frame1");
		
		List<WebElement> frameheading = driver.findElements(By.xpath("//h1[@id='sampleHeading']"));
		WebElement first = frameheading.get(0);
		System.out.println(""+first.getText());
		System.out.println("FIRST heading displayed ==> "+first.isDisplayed());
		
		driver.close();
		

	}

}
