package javascriptexcutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ScrollToWebElement {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
      ChromeDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      
      driver.get("https://www.selenium.dev/");
      Thread.sleep(2000);
      // to perform scroll down
      JavascriptExecutor jse = (JavascriptExecutor)driver;
      jse.executeScript("window.scrollBy(0,5000)");
      Thread.sleep(2000);
      //To perform screen shot on webelement
      WebElement ss = driver.findElement(By.xpath("//i[@class='fab fa-twitter']"));
       
         File src = ss.getScreenshotAs(OutputType.FILE);
       File des = new File("./Screenshots/twiterss.jpg");
       Files.copy(src, des);
         
       
	}
}

