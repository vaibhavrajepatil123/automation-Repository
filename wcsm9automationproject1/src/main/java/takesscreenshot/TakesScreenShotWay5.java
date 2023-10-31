package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenShotWay5 {

	public static void main(String[] args) throws IOException
	{
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       driver.get("https://omayo.blogspot.com/");
       TakesScreenshot ss = (TakesScreenshot)driver;
       File src = ss.getScreenshotAs(OutputType.FILE);
       
       File des = new File("./Screenshots/seleniumss.jpg");
       Files.copy(src, des);
         
	}

}
