package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	Thread.sleep(2000);
    	driver.get("http://desktop-toca723/login.do");
    	driver.findElement(By.name("username")).sendKeys("admin");
    	Thread.sleep(2000);
        driver.findElement(By.name("pwd")).sendKeys("manager");
        Thread.sleep(2000);
        driver.findElement(By.id("loginButton")).click();
	}

}
