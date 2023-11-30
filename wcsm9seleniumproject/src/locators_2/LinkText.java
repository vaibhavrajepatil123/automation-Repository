package locators_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

public static void main(String[] args) throws InterruptedException {
  
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);

     driver.findElement(By.linkText("Forgotten password?")).click();
	
	
	
	
}

}
