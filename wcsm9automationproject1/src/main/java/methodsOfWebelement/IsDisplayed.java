package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args)
	{
              WebDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
              
              driver.get("https://demoapps.qspiders.com/");
              
              WebElement link1 = driver.findElement(By.partialLinkText("Already have an account ? Login Now hidden"));
              boolean status1= link1.isDisplayed();
              System.out.println(status1);
	}

}
