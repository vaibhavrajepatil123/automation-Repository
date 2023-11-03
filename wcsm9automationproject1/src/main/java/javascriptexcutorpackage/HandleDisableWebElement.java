package javascriptexcutorpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisableWebElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='Disabled Mode']")).click();
		//explicit type casting into javascript executor
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//handle disable name text box
		jse.executeScript("document.getElementById(\"name\").value=\"vaibhav\"");
		Thread.sleep(2000);
		//handle disable email text box
		jse.executeScript("document.getElementById(\"email\").value=\"vaibhav@1234.gmail.com\"");
		Thread.sleep(2000);
		// handle disable password text box
		jse.executeScript("document.getElementById(\"password\").value=\"patil\"");
		Thread.sleep(2000);
		
		// click on disble register button
		WebElement registorbutton= driver.findElement(By.xpath("//p[text()='Disabled Mode']"));
		if (registorbutton.isDisplayed()) 
		{
			Thread.sleep(2000);
			jse.executeScript("argument[0].click()",registorbutton);
			System.out.println("click");
			
		}
		else {
           System.out.println("not click");
		}
		
		
	}

}
