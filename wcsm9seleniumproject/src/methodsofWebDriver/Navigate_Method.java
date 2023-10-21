package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) throws InterruptedException
	{
                WebDriver driver=new ChromeDriver();
                
                driver.manage().window().maximize();
              
                // 1. to launch the web application by using to() 
                driver.navigate().to("https://www.youtube.com/");
                Thread.sleep(2000);
               
                // 2.to perform back operation
                driver.navigate().back();
                Thread.sleep(2000);
                
                // 3. to perform forward operation
                driver.navigate().forward();
                Thread.sleep(2000);
                
                
                // 4.to perform refersh operation
                driver.navigate().refresh();
	}

}
