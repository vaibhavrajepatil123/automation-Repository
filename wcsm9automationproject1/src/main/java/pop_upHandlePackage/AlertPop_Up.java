package pop_upHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPop_Up {

	public static void main(String[] args) throws InterruptedException
	{
                  WebDriver driver=new ChromeDriver();
                  driver.manage().window().maximize();
                  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                  
                  driver.get("https://demoapps.qspiders.com/");
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//section[text()='Popups']")).click();
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//section[text()='Javascript']")).click();
                  //generate alert pop up
                  Thread.sleep(2000);
                  driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
                  Thread.sleep(2000);
                  // handle alert pop up
                 Alert alert = driver.switchTo().alert();
                 // accept alert popup
                 Thread.sleep(2000);
       //          alert.accept();
                 // get the text of popup
                 String alerttext= alert.getText();
                 System.out.println(alerttext);
                 
                 // dismiss alert popup
                 alert.dismiss();
                  
	}

}
