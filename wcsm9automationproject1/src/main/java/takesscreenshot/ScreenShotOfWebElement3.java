package takesscreenshot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfWebElement3 {

	public static void main(String[] args)
	{
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
           
           driver.get("https://www.bluestone.com");
           driver.findElement(By.id("confirmBtn")).click();
           driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"))

	
	}

}
