package methodsofwebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod
{
    // It is use to close the current browser
	
	public static void main(String[] args) throws InterruptedException
	{
          WebDriver driver=new ChromeDriver();
          Thread.sleep(2000);
          
          driver.manage().window().maximize();
          Thread.sleep(2000);
          
          driver.close();
	}

}
