package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
            public static void main(String[] args) throws InterruptedException {
				 
            	ChromeDriver driver = new ChromeDriver();
            	driver.manage().window().maximize();
            	Thread.sleep(2000);
            	driver.navigate().to("https://www.instagram.com/accounts/login/");
            	
            	driver.findElement(By.tagName("input")).sendKeys("admin");
            	Thread.sleep(2000);
            	driver.findElement(By.tagName("input")).sendKeys("manager");
            	Thread.sleep(2000);

			}
}
