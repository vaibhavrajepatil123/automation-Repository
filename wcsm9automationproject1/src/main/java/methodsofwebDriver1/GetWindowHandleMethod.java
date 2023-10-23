package methodsofwebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
           
	// it is used to get the address of current window or browser
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		String address = driver.getWindowHandle();
		System.out.println(address);
		
		driver.close();
	}
}
