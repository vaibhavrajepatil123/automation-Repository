package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.get("https://demoapps.qspiders.com/");
		  Thread.sleep(2000);
		  WebElement tbn = driver.findElement(By.id("name"));
		  tbn.sendKeys("vaibhav");
		  Thread.sleep(2000);
		  WebElement mailtb = driver.findElement(By.id("email"));
	      mailtb.sendKeys("vaibhav0403@gmail.com");
	      Thread.sleep(2000);
	      WebElement passtb = driver.findElement(By.id("password"));
	      passtb.sendKeys("patil");
	      Thread.sleep(2000);
	      // To perform clear action on the text box
	      tbn.clear();
	      Thread.sleep(2000);
	      passtb.clear();
	
	}
	

}
