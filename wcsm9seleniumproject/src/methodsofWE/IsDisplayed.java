package methodsofWE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	
    	driver.get("https://omayo.blogspot.com/");
    	Thread.sleep(2000);
    	
    	WebElement element = driver.findElement(By.xpath("//input[@class='gsc-search-button']"));
         boolean button = element.isDisplayed();
         System.out.println(button);
         
         WebElement element1 = driver.findElement(By.xpath("//h2[text()='Hidden Button']"));
	     boolean button1 = element1.isDisplayed();
	     System.out.println(button1);
	
	}

}
