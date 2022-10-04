package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(5000);
		 
		 WebElement username = driver.findElement(By.xpath("//input [@id='user-name']"));
		 
		 username.sendKeys("standard_user");
		 Thread.sleep(5000);
		 
		 
		 WebElement password = driver.findElement(By.xpath("//input [@id='password']"));
		 password.sendKeys("secret_sauce");
		 Thread.sleep(2000);
		 
		 WebElement loginbtn = driver.findElement(By.xpath("//input [@name='login-button']"));
		 loginbtn.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.linkedin.com/signup");
		
		Thread.sleep(2000);
		
		System.out.println(""+driver.getTitle());

	}

}
