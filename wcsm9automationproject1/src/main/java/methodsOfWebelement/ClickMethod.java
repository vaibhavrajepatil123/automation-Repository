package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) throws InterruptedException
	{
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.get("http://desktop-toca723/login.do");
		  Thread.sleep(2000);
		  WebElement usntb = driver.findElement(By.name("username"));
		  usntb.sendKeys("admin");
		  Thread.sleep(2000);
		  WebElement pwt = driver.findElement(By.name("pwd"));
		  pwt.sendKeys("manager");
		  Thread.sleep(2000);
		  //to perform click action on check box
		 WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		 checkbox.click();
		 Thread.sleep(2000);
		 //to perform click action on login button
		 WebElement Loginbutton = driver.findElement(By.xpath("//a[text()='Login']"));
		 Loginbutton.click();
		 Thread.sleep(2000);
	}

}
