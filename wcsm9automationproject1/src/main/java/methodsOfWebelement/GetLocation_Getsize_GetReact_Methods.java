package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation_Getsize_GetReact_Methods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demoapps.qspiders.com/");
		Thread.sleep(2000);
		// identify email text box
		WebElement emailTextBox = driver.findElement(By.id("email"));
		// get the location of email text box
	    Point loc = emailTextBox.getLocation();
          	int xaxis = loc.getX();
          	int yaxis = loc.getY();
          	System.out.println("location of email text box"+xaxis);
          	 
          	 
          	 
          	
	}

}
