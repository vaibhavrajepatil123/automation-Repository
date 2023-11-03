package takesscreenshot;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakesScreenShot1 {
	//  Performing way no 1
   public static void main(String[] args) throws InterruptedException, IOException {
	   ChromeDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	   driver.get("https://www.youtube.com/");
	   Thread.sleep(2000);
	   
       File src = driver.getScreenshotAs(OutputType.FILE);
       File dest = new File("./Screenshots/youtubesss.jpg");
       Files.copy(src, dest);
       Thread.sleep(2000);
	

      
}
}
