package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsEnabledMethod {
          
	public static void main(String[] args) throws InterruptedException {
		
	  WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		// to perform is enabled operation
		WebElement button = driver.findElement(By.xpath("//button[text()='Button2']"));
		boolean status = button.isEnabled();
		System.out.println(status);
		
		WebElement button2 = driver.findElement(By.id("but1"));
		boolean status2 = button2.isEnabled();
		System.out.println(status2);
		
	}
}
