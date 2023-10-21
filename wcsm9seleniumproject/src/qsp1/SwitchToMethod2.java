package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod2 {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver(); 
         driver.manage().window().maximize();
         driver.get("https://omayo.blogspot.com/");
         Thread.sleep(2000);
         driver.switchTo().frame("iframe2");
	}

}
