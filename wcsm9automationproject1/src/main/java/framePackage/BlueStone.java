package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         driver.get("https://www.bluestone.com/");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//span[text()='Not now']")).click();
         Thread.sleep(2000);
        
         // to switch the control to frame by using id value
        driver.switchTo().frame("fc_widget");
        Thread.sleep(2000);
        // click on chat box
         driver.findElement(By.id("chat-icon")).click();
        
         //all the text box are present inside main webpage so switch back to main webpage
         // then once again switch control to default containts
         Thread.sleep(2000);
         driver.switchTo().defaultContent();
        
         driver.findElement(By.id("chat-fc-name")).sendKeys("vaibhav");
         driver.findElement(By.id("chat-fc-email")).sendKeys("vaibhav@gmail.com");
         driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
         driver.findElement(By.partialLinkText("Start Chat")).click();
         
	}

}
