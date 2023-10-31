package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {
   public static void main(String[] args) throws AWTException, InterruptedException {
	   WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       driver.get("https://www.selenium.dev/");
       WebElement getting_started = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
       Actions act = new Actions(driver);
       act.contextClick(getting_started).build().perform();
       Thread.sleep(2000);
        
       Robot rbt = new Robot();
       for(int i=1;i<=11;i++)
       {
       rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
       rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
       Thread.sleep(2000);
       }
       rbt.keyPress(KeyEvent.VK_ENTER);
       rbt.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(2000);
       driver.quit();
}
}
