package methodsofWebDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/home.php");
		Thread.sleep(2000);
		
		//get the address of current browser or window
		String PH = driver.getWindowHandle();
		System.out.println(PH);
		
		Set<String> PH1 = driver.getWindowHandles();
		System.out.println(PH1);
		
	      driver.close();
	      
	}
}
