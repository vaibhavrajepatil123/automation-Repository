package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakesScreenShot_3 {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         driver.get("https://www.youtube.com/");
         Thread.sleep(2000);
         RemoteWebDriver rwc = (RemoteWebDriver)driver;
         File src = rwc.getScreenshotAs(OutputType.FILE);
          File des = new File("./Screenshots/youtubess.jpg");
          Files.copy(src, des);
	}

}
