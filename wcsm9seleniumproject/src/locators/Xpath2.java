package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
    // X path by using Text function
	
	public static void main(String[] args) {
		WebDriver	driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
}
