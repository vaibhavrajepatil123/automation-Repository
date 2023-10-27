package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod2 {

	public static void main(String[] args)
	{
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          
          driver.get("https://demo.guru99.com/test/drag_drop.html");
          WebElement src2 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
          WebElement src4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
          WebElement src1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
          WebElement src3 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
          
          WebElement tar1 = driver.findElement(By.xpath("//ol[@id='bank']"));
          WebElement tar2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
          WebElement tar3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
          WebElement tar4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
          
	        
          
	}

}
