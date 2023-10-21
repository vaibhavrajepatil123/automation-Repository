package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException {
     
		//to launch edge browser we need to create object of EdgeDriver(c);
		
		WebDriver driver=new EdgeDriver();	
		System.out.println("open the edge browser");
		
		// maximize the browser
		driver.manage().window().maximize();
		
		//provide the delay for script....Thread is java class and sleep is method
		Thread.sleep(2000);
		
		//closed the edge browser
		driver.close();
	}

}
