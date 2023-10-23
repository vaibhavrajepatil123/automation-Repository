package synchronizationPackge;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogspoySynchronize {

	public static void main(String[] args)
	{
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         
         // applay implicit wait
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
         
         driver.get("https://omayo.blogspot.com/");
         
	}

}
