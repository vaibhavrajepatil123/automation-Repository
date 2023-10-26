package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath4 {

	public static void main(String[] args) throws InterruptedException
	{     // to identify single webelement by using and operator
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("http://desktop-toca723/login.do");
           Thread.sleep(2000);
           
           driver.findElement(By.xpath("//input[@type='text' and (@name='username')]")).sendKeys("admin");
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@type='password'and(@name='pwd')]")).sendKeys("manager");
           Thread.sleep(2000);
	       driver.findElement(By.xpath("//a[@id='loginButton'and(@class='initial')]")).click();
	
	
	}

}
