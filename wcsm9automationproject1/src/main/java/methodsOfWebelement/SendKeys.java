package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	
	
	   public static void main(String[] args) throws InterruptedException
	{
	   
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get("http://desktop-toca723/login.do");
		  
		   WebElement usntb = driver.findElement(By.name("username"));
		   usntb.sendKeys("admin");
		   Thread.sleep(2000);
		   
		    WebElement pswtb = driver.findElement(By.name("pwd"));
		    pswtb.sendKeys("manager");
		    Thread.sleep(2000);
		   
		   
		   
	}

}
