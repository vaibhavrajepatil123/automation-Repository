package methodsofwebDriver1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
    // it is used to set the size,position,maximize,mizimize,full screen operation
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	//	driver.manage().window().minimize();
		
	//	driver.manage().window().fullscreen();
		
		Dimension targetsize = new Dimension(450,450);
		driver.manage().window().setSize(targetsize);
		Thread.sleep(2000);
		
		Point targetPoint = new Point(250,50);
		driver.manage().window().setPosition(targetPoint);
		Thread.sleep(2000);
		
		driver.quit();
	}
}

