package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;


public class TakesScreenShot_4 {

// takes a screen shot by way no:4
	public static void main(String[] args) throws IOException {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.get("https://www.facebook.com/login/");
       EventFiringWebDriver efw = new EventFiringWebDriver(driver);
      File src = efw.getScreenshotAs(OutputType.FILE);
        File des = new File("./Screenshots/facebookss.jpg");
        Files.copy(src, des);
         
	}

}
