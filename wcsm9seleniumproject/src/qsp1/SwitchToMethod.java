package qsp1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
                WebDriver driver=new ChromeDriver(); 
                driver.manage().window().maximize();
                driver.get("https://omayo.blogspot.com/");
                Thread.sleep(2000);
                driver.findElement(By.id("alert1")).click();
                Thread.sleep(2000);
                 Alert alert= driver.switchTo().alert();
                System.out.println(alert.getText());
                driver.quit();
	}

}
