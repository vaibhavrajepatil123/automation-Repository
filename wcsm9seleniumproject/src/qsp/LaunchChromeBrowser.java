package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
    public static void main(String[] args) throws InterruptedException {
		
    	
    	//to launch chrome browser we need to create object of ChromeDriver(c);
    	
    	
    	WebDriver driver=new ChromeDriver();
    	System.out.println("chrome browser is open");
    	
    	//maximize the browser
    	driver.manage().window().maximize();
    	
    	Thread.sleep(4000); //provide the delay for 4 sec
    	
    	// close the chromebrowser
    	driver.close();
    	
    }
}