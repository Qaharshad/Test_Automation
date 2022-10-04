package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class swaglabs {

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
		
		WebElement tshirt = driver.findElement(By.linkText("Sauce Labs Backpack"));
		
		tshirt.click();
		Thread.sleep(2000);
		
		WebElement Add = driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-backpack']"));
	    Add.click();
		
		Thread.sleep(2000);
		
		
		WebElement check = driver.findElement(By.className("shopping_cart_link"));
				check.click();
				Thread.sleep(2000);
				
				WebElement checkout = driver.findElement(By.xpath("//button [@id='checkout' and @class ='btn btn_action btn_medium checkout_button']"));
				checkout.click();
				Thread.sleep(2000);
				
				driver.close();
				
		
	}

}
