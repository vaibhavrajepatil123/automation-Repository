package qsp1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ManageMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// set size of the browser
		Dimension targetsize = new Dimension(750,450);
		Thread.sleep(2000);
        driver.manage().window().setSize(targetsize);	
        
        //set the position of browser
        Point targetposition = new Point(350, 450);
          driver.manage().window().setPosition(targetposition);
	}

}
