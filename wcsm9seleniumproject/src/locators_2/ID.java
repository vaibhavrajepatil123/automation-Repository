package locators_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      driver.get("https://www.facebook.com/");
	      Thread.sleep(2000);
	      driver.findElement(By.id("email")).sendKeys("9028791332");
	      Thread.sleep(2000);
	      driver.findElement(By.id("pass")).sendKeys("patilpv");
	      Thread.sleep(2000);
	      driver.findElement(By.name("login")).click();
	}

}
