package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_firefox {

	public static void main(String[] args) throws InterruptedException {
        
		WebDriver driver=new FirefoxDriver();//launch the chrome browser
//		driver.manage().window().maximize();//maximize the browser
		Thread.sleep(2000);//provided delay for excution
		driver.close();// close the window
	}

}
