package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// to launch FirefoxBrowser we need to create object of FirefoxDriver(c);
		
		WebDriver driver=new FirefoxDriver();
		
		System.out.println("open the firefox browser");
		
		//maximize the browser
		driver.manage().window().maximize();		
		//provide the delay for 2 sec
		Thread.sleep(2000);
		
		//closed the browser
		driver.close();
	}
}