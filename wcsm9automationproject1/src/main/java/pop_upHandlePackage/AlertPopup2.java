package pop_upHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup2 {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          
          driver.get("https://omayo.blogspot.com/");
          Thread.sleep(2000);
          driver.findElement(By.id("alert1")).click();
          Alert alert = driver.switchTo().alert();
          //get the text of popup
          String text = alert.getText();
          Thread.sleep(2000);
          //accept the popup
          alert.accept();

	}

}
