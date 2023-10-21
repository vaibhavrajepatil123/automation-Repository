package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
       // launch the chrome browser
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		// launch the web application
		driver.get("https://www.youtube.com/");
		
		// provide the delay
		Thread.sleep(2000);
		
		//close the browser
		driver.close();
		
	}

}
