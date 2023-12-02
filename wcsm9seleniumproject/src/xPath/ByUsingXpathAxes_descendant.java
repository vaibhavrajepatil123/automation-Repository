package xPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingXpathAxes_descendant {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();

		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("http://desktop-toca723/login.do");
		 Thread.sleep(2000);
        driver.findElement(By.xpath("//table[@class='textFieldsTable']/descendant::input[@type='text']")).sendKeys("admin")	;
		driver.findElement(By.xpath("//table[@class='textFieldsTable']/descendant::input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//td[@class='keepLoggedIn']/descendant::a[@id='loginButton']")).click();
	
	}

}
