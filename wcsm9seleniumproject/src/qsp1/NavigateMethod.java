package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.navigate().to("https://www.flipkart.com/");
		    Thread.sleep(2000);
		    driver.navigate().back();
		    Thread.sleep(2000);
		    driver.navigate().forward();
		    Thread.sleep(2000);
		    driver.navigate().refresh();
		    Thread.sleep(2000);
		    
	}

}
