package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
          
	public static void main(String[] args) {
		// verify login button on instagram
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		
		//identify login button
		driver.findElement(By.xpath("//input[contains(@name,'u')]"));
		
		
		
	}
}
