package synchronizationPackge;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SopperStack {

	public static void main(String[] args) 
	{
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         
         // applay implicit wait
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
         
         driver.get("https://www.shoppersstack.com/");
         // search for samsung prouct
         driver.findElement(By.xpath(""));
         		

	}

}
