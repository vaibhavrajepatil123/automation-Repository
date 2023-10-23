package methodsofwebDriver1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) 
	{
             WebDriver driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
             
             driver.get("http://desktop-toca723/login.do");
             driver.findElement(By.name("username")).sendKeys("admin");
	}

}
