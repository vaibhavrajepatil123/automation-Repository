package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       driver.get("https://demoapps.qspiders.com/");
      Thread.sleep(2000);
      WebElement emailtextbox = driver.findElement(By.id("email"));
      

		// get the location of email text box
		 Point loc = emailtextbox.getLocation();
		
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		System.out.println("location of email text box :"+xaxis+" :"+yaxis);
		
      
      // Get the size of the webelement in form of height and width
      Dimension size = emailtextbox.getSize();
      int height = size.getHeight();
      int width = size.getWidth();
      System.out.println("size of email text box:"+height+width);
      
   // get the location of email text box  and get the size of email text box
      
     Rectangle react = emailtextbox.getRect();
   		System.out.println(react.getX()+":"+react.getY());
   		System.out.println(react.getHeight()+":"+react.getWidth());
   		
	
	
	
	}

}
