package methodsofWD;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args)
	{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://omayo.blogspot.com/");
        
        driver.findElement(By.id("confirm")).click();
       WebElement ele = driver.switchTo().activeElement();
       ele.click();
       
        
	}

}
