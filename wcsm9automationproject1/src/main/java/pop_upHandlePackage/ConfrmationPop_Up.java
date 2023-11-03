package pop_upHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfrmationPop_Up {

	public static void main(String[] args) throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://demoapps.qspiders.com/auth");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//section[text()='Javascript']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Confirm']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	Thread.sleep(2000);
	
	Alert confirmation = driver.switchTo().alert();
	// get the text of the confirmation pop up
	String text = confirmation.getText();
	System.out.println(text);
	//accept the confirmation popup
//	confirmation.accept();
	//dismiss the popup
	confirmation.dismiss();
		
		
		
		
	}

}
