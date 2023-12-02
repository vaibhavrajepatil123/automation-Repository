package xPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingContains_Function {
 
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("http://desktop-toca723/login.do");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("admin");
	driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("manager");
	driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
	Thread.sleep(2000);
	
	driver.close();
	
	
}
}
