package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenShotWay1 {
 // directly create the obj of browser specific classes
	public static void main(String[] args) throws InterruptedException, IOException
	{
          ChromeDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          
          driver.get("https://demoapps.qspiders.com/");
          Thread.sleep(2000);
          File src = driver.getScreenshotAs(OutputType.FILE);
         File des = new File("./Screenshots/seleniumss.jpg");
         Files.copy(src, des);
         
       
		
	}

	
}
