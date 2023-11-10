package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMaps {

	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         driver.get("https://www.google.com");
         Thread.sleep(2000);
     
         // click on google map link
        driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
         driver.switchTo().frame("backgroundImage");
         
         //click on google map
         driver.findElement(By.xpath("//span[text()='Maps']")).click();
	}

}
