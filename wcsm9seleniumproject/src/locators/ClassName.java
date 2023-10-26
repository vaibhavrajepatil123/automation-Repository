package locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	Thread.sleep(2000); 
	}

}
