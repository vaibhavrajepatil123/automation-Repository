package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge {
         public static void main(String[] args) throws InterruptedException {
			
        	WebDriver driver=new EdgeDriver();//launch edge browser
        	driver.manage().window().maximize();//launch maximize browser
        	Thread.sleep(2000);
        	driver.close();
		}
}
