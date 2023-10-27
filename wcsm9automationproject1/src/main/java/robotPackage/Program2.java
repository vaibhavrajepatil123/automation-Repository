package robotPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program2 {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         driver.get("https://www.selenium.dev/");
         Thread.sleep(2000);
         WebElement gettingStarted = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
         //perform right click on getting started
         Actions act = new Actions(driver);
         act.contextClick(gettingStarted).build().perform();
         Thread.sleep(2000);
         
         // Press page down go till to inspect
         Robot robot = new Robot();
        for (int i=0; i<10;i++)
        {
        	
             robot.keyPress(KeyEvent.VK_PAGE_DOWN);
             robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
         //press enter key
       
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
