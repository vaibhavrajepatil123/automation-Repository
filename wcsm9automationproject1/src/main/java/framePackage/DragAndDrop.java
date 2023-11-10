package framePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException
	{
		  WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          
          driver.get("https://jqueryui.com/");
          driver.findElement(By.partialLinkText("Droppable")).click();
          
          
          //dragable and dropable elements are designed under frame
          //handle frame by switches controls to frame
          WebElement webelement = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
          driver.switchTo().frame(webelement);
//          driver.switchTo().frame(0);//by using index value
          Thread.sleep(2000);
          
          //perform drag and drop action
          WebElement src = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
          WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
          Actions act = new Actions(driver);
          Thread.sleep(2000);
          act.dragAndDrop(src, dest).perform();
         
          
	}

}
