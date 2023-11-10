package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) throws InterruptedException
	{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
       WebElement img = driver.findElement(By.xpath("(//img[@class='w-100 shadow-1-strong rounded selenium-backer-logo'])[1]"));
       Point point = img.getLocation();
       System.out.println("location of x axis:"+point.x);
       System.out.println("location of y axis:"+point.y);
       driver.quit();
	
	}

}
