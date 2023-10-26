package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath5 {

	public static void main(String[] args) throws InterruptedException {
       // To identify multiple webelement on a webpage by using or operator
		 WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://desktop-toca723/login.do");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@type='text'or(@name='username')]")).sendKeys("admin");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@type='password'or(@name='pwd')]")).sendKeys("manager");
         Thread.sleep(2000);
       //  driver.findElement(By.linkText("Login")).click();
      //   driver.findElement(By.xpath("//a[text()='Login']")).click();
          driver.findElement(By.xpath("//a[@id='loginButton'or(@class='initial')]")).click();
         
	}

}
