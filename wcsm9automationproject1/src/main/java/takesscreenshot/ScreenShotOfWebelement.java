package takesscreenshot;

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

public class ScreenShotOfWebelement {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          
          driver.get("https://www.bluestone.com/");
          driver.findElement(By.id("confirmBtn")).click();
          WebElement coins = driver.findElement(By.xpath("//a[text()='Coins ']"));
          Actions act = new Actions(driver);
          act.moveToElement(coins).perform();
          driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
          Thread.sleep(2000);
          WebElement coinelement= driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
         File src = coinelement.getScreenshotAs(OutputType.FILE);
         File dest = new File("./Screenshots/coinElement.png");
         
       Files.copy(src, dest);
       Thread.sleep(2000);
       driver.quit();
       
         
	}

}
