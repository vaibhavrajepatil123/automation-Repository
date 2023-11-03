package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakesScreenShot3 {
  // Performing way no 3
	public static void main(String[] args) throws InterruptedException, IOException {
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.get("http://desktop-toca723/login.do");
		  Thread.sleep(2000);
		  RemoteWebDriver rwd = (RemoteWebDriver)driver;
		  File src = rwd.getScreenshotAs(OutputType.FILE);
		
		  File dest = new File("./Screenshots/actetimess.png");
		 
		  Files.copy(src, dest);
		  Thread.sleep(2000);
		 
		  rwd.close();
		  
		  
	}

}
