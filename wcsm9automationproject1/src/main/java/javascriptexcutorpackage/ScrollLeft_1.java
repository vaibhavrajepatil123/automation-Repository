package javascriptexcutorpackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeft_1 {

	public static void main(String[] args) throws InterruptedException {
         WebDriver  driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
         
         driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
         Thread.sleep(2000);
         JavascriptExecutor jse = (JavascriptExecutor)driver;
       //to perform scroll down operation
         jse.executeScript("window.scrollBy(0,500)");
         Thread.sleep(2000);
         //To perform end of left click operation
        jse.executeScript("window.scrollBy(-10000,0)");
	}

}
