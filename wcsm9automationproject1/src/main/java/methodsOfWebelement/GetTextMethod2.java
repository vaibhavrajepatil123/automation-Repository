package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod2 {
   public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		String str = driver.findElement(By.xpath("//p[text()='PracticeAutomationHere']")).getText();
		System.out.println(str);
		
}
}
