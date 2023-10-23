package methodsofwebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitMethod {
 
	// it is used to close the parent as well as child browser
	
	public static void main(String[] args) throws InterruptedException 
	{
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          
          driver.get("http://omayo.blogspot.com/");
          Thread.sleep(2000);
          driver.findElement(By.partialLinkText("Open a popup window")).click();
          Thread.sleep(2000);
          driver.quit();
          
	}

}
