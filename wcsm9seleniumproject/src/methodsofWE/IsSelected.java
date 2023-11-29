package methodsofWE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// it is used to get check box ,radio button is selected or not 
		
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	
    	driver.get("http://desktop-toca723/login.do");
    	Thread.sleep(2000);
    	WebElement link = driver.findElement(By.id("keepLoggedInLabel"));
    	boolean value = link.isSelected();
    	System.out.println(value);

	}

}
