package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction2 {

	public static void main(String[] args) {
         
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("http://desktop-toca723/login.do");
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		 driver.findElement(By.linkText("Login")).click();
		 
		 driver.findElement(By.xpath("(//img[@class='sizer'])[5]")).click();
		 driver.findElement(By.linkText("Logo & Color Scheme")).click();
		 driver.findElement(By.id("uploadNewReportLogoOption")).click();
		 
		 WebElement doubleclick = driver.findElement(By.xpath("//input[@name='formCustomReportLogo.logo']"));
		 Actions act = new Actions(driver);
		 act.doubleClick(doubleclick).perform();
	}

}
