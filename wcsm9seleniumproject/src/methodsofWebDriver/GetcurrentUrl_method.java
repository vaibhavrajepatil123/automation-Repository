package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetcurrentUrl_method {

	public static void main(String[] args) throws InterruptedException {
         
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/home.php");
		
		Thread.sleep(2000);
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		
		driver.quit();
	}

}
