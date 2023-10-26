package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
      public static void main(String[] args) throws InterruptedException {
    	  WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          
          driver.get("https://demoapps.qspiders.com/");
          driver.findElement(By.linkText("Button")).click();
          driver.findElement(By.linkText("Double Click")).click();
          WebElement doubleclick1 = driver.findElement(By.xpath("(//button[text()='Yes'])[1]"));
          WebElement doubleclick2 = driver.findElement(By.xpath("(//button[text()='Yes'])[2]"));
          WebElement doubleclick3 = driver.findElement(By.xpath("//button[text()='3']"));
          
          Actions act = new Actions(driver);
          act.doubleClick(doubleclick1).perform();
          Thread.sleep(2000);
          act.doubleClick(doubleclick2).perform();
          Thread.sleep(2000);
          act.doubleClick(doubleclick3).perform();
          
          
	}
}
