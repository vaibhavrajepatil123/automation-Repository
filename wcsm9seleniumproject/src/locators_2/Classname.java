package locators_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      driver.get("https://www.instagram.com/accounts/login/");
	      Thread.sleep(2000);
	      driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("admin");
	      Thread.sleep(2000);
	      driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("manager");
	      Thread.sleep(2000);
	      driver.findElement(By.className("x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1")).click();
	      
	}

}
