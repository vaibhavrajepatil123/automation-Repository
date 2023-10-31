package takesscreenshot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScreenShotOfWebelement2 {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException 
	{
           WebDriver  driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           
           driver.get("https://www.bluestone.com/");
           Thread.sleep(2000);
           driver.findElement(By.id("confirmBtn")).click();
           Thread.sleep(2000);
           Robot rbt = new Robot();
           rbt.keyPress(KeyEvent.VK_PAGE_DOWN);
           rbt.keyRelease(KeyEvent.VK_PAGE_DOWN);
           Thread.sleep(2000);
           WebElement gifts = driver.findElement(By.xpath("//span[text()='Gifts ']"));
           Actions act = new Actions(driver);
           act.moveToElement(gifts).perform();
           
           WebElement hergift = driver.findElement(By.xpath("//span[text()='For HER ']"));
           act.doubleClick(hergift).perform();
           WebElement chain = driver.findElement(By.xpath("(//img[@class='hc img-responsive center-block'])[1]"));
         File src = chain.getScreenshotAs(OutputType.FILE);
         File des = new File("./Screenshots/giftss.jpg");
         Files.copy(src, des);
	}

}
