package methodsofWE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSvalue {

	public static void main(String[] args) throws InterruptedException {
		// IT is used to get the properties of webelement
		//properties are nothing  but height,width,colour
		
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	
    	driver.get("http://desktop-toca723/login.do");
    	Thread.sleep(2000);
    	WebElement element = driver.findElement(By.id("loginButton"));
    	 String value = element.getCssValue("height");
    	 System.out.println(value);

	}

}
