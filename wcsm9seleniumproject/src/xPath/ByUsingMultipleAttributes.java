package xPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingMultipleAttributes {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-toca723/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text' and(@name='username')]")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@type='password' and (@class='textField')]")).sendKeys("manager");
	    driver.findElement(By.xpath("//a[@id='loginButton' and (@class='initial')]")).click();
	    Thread.sleep(2000);
	    driver.close();
	
	}

}
