package khairnar;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\selenium jars\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement btn = driver.findElement(By.xpath("//a[@href='#Textbox']"));		
		btn.click();
		
		WebElement promt_btn = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));	
		promt_btn.click();	
		
		Alert alert = driver.switchTo().alert();		
		Thread.sleep(2000);
		
		alert.sendKeys("Harshad");
		alert.accept();
		
		WebElement result = driver.findElement(By.id("demo1"));
		System.out.println(result.getText());
		
		Thread.sleep(2000);
		driver.close();
	
		
		
	}

}
