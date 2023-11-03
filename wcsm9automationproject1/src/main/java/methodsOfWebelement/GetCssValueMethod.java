package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueMethod {

	public static void main(String[] args) throws InterruptedException 
	{
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            
            driver.get("https://omayo.blogspot.com/");
            Thread.sleep(2000);
            WebElement cssvalue = driver.findElement(By.id("home"));
            String str = cssvalue.getCssValue("color");
            System.out.println(str);
	}

}
