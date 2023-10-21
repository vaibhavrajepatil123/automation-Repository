package methodsofWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_method {

	public static void main(String[] args) throws InterruptedException
	{
          WebDriver driver=new ChromeDriver();
          
          // 1. maximize the browser 
          driver.manage().window().maximize();
          
          // 2. minimize the browser
      //    driver.manage().window().minimize();
          
          driver.get("https://www.youtube.com/");
          Thread.sleep(2000);
          
          // 3.set the size of the browser
          Dimension targetsize = new Dimension(560,450);
          driver.manage().window().setSize(targetsize);
          Thread.sleep(2000);
          
          // 4.set the position of the browser
           Point targetposition = new Point(450,350);
          driver.manage().window().setPosition(targetposition);
          Thread.sleep(2000);
          
          
         
	}

}
