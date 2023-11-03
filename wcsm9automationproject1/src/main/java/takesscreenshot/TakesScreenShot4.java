package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class TakesScreenShot4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// performing way no 4
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://demoapps.qspiders.com/");
	  Thread.sleep(2000);
	  EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	  File src = efw.getScreenshotAs(OutputType.FILE);
	  File dest = new File("./Screenshots/demoss.jpg");
	  Files.copy(src, dest);

	}

}
