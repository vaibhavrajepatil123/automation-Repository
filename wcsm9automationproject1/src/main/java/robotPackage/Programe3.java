package robotPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Programe3 {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         driver.get("https://www.bluestone.com/");
         Thread.sleep(2000);
         driver.findElement(By.id("confirmBtn")).click();
         WebElement abc = driver.findElement(By.partialLinkText("Watch Jewellery "));
         Actions act = new Actions(driver);
         act.moveToElement(abc).perform();
         
	}

}
