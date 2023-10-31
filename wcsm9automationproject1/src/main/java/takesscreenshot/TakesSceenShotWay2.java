package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakesSceenShotWay2 {
 // Takes screen shot by way no :2
	public static void main(String[] args) throws IOException, InterruptedException {

        RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.naukri.com/mnjuser/homepage");
	Thread.sleep(2000);
	File src = driver.getScreenshotAs(OutputType.FILE);
	File des = new File("./Screenshots/naukriss.jpg");
	Files.copy(src, des);
	
	
	}

}
