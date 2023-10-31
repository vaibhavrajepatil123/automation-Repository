package javascriptexcutorpackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp_1 {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          
          driver.get("https://omayo.blogspot.com/");
          Thread.sleep(2000);
          //To perform scroll down operation
          JavascriptExecutor jse = (JavascriptExecutor)driver;
          jse.executeScript("window.scrollBy(0,500)");
          Thread.sleep(2000);
          //to perform scroll up operation
          jse.executeScript("window.scrollBy(0,-500)");
          

	}

}
