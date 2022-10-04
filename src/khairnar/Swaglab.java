package khairnar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Swaglab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input [@name = 'user-name']"));
		username.sendKeys("standard_user");
		
		Thread.sleep(2000);
		driver.getTitle();
		
		WebElement password = driver.findElement(By.xpath("//input [@name = 'password']"));
		password.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//input [@name = 'login-button']"));
		login.click();
		Thread.sleep(2000);
		
	
		
		WebElement element = driver.findElement(By.xpath("//select [@class='product_sort_container']"));
		
		Select dropdown = new Select (element);
		
		dropdown.selectByVisibleText("Price (low to high)");
		
		System.out.println("dropdown selected");
		
		Thread.sleep(2000);
		
		
		
	
		
		driver.findElement(By.linkText("Sauce Labs Onesie")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='text' and @id='first-name']")).sendKeys("Harshad");
		Thread.sleep(2000);
		
		driver.findElement(By.id("last-name")).sendKeys("K");
		Thread.sleep(2000);
		
		driver.findElement(By.id("postal-code")).sendKeys("45545");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='continue']")).click();
		Thread.sleep(2000);
		
		driver.getTitle();
		System.out.println(""+driver.getTitle());
		
		
		driver.close();
		
		
		
		
	}

}
