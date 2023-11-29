package methodsofWE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetReact {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	
    	driver.get("http://desktop-toca723/login.do");
    	Thread.sleep(2000);
    	WebElement UsnTb = driver.findElement(By.name("username"));
    	Rectangle value = UsnTb.getRect();
    	value.getX();
    	value.getY();
    	value.getHeight();
    	value.getWidth();
    	System.out.println(	value.getX()+value.getY()+value.getHeight()+value.getWidth());

	}

}
