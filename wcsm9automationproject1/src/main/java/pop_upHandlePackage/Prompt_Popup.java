package pop_upHandlePackage;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_Popup {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapps.qspiders.com/auth");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Prompt']")).click();
		Thread.sleep(2000);
		//generate prompt pop up
		driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
		Thread.sleep(2000);
		//handle prompt pop up
		Alert prompt = driver.switchTo().alert();
		// To perform send keys
		prompt.sendKeys("yes");
		Thread.sleep(2000);
		//to perform gettext
		String text = prompt.getText();
		System.out.println(text);
		Thread.sleep(2000);
		//to perform accept
		prompt.accept();
	}

}
