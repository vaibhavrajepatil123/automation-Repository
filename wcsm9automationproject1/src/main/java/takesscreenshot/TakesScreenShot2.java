package takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class TakesScreenShot2 {
   public static void main(String[] args) throws InterruptedException, IOException {
	 RemoteWebDriver rwd=new ChromeDriver();
	 rwd.manage().window().maximize();
	 rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 
	 rwd.get("https://www.selenium.dev/");
	 Thread.sleep(2000);
	 File src = rwd.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./Screenshots/selenuimdevss.jpg");
	 Files.copy(src, dest);
	 Thread.sleep(2000);
	 rwd.quit();
	 
	 
}
}
