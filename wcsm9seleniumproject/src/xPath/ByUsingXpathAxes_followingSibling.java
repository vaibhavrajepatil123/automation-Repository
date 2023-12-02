package xPath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingXpathAxes_followingSibling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://www.instagram.com/accounts/login/");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("https://www.instagram.com/accounts/login/")).sendKeys("admin");
		 driver.findElement(By.xpath("//span[@class='_aa4a']/following-sibling::input[@name='password']")).sendKeys("manager");
		 driver.findElement(By.xpath("//div[contains(@class,'x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1x')][1]")).click();
		 Thread.sleep(2000);
		 driver.close();
	}

}
