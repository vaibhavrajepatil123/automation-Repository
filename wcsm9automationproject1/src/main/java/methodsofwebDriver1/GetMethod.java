package methodsofwebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod
{
    // it is used to launch the web application
	public static void main(String[] args) throws InterruptedException
	{
               WebDriver driver=new ChromeDriver();
               driver.manage().window().maximize();
               Thread.sleep(2000);
               
               driver.get("https://www.facebook.com/");
               Thread.sleep(2000);
               driver.close();
	}

}
