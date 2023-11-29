package testNGExecutionpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectTest {
 
	static WebDriver driver;
	
	@Parameters({"Browser","Url","Username","Password"})
	@Test
  public void selectTestMethod(String browservalue, String Url,String usr,String pass ) throws InterruptedException {

   if(browservalue.equalsIgnoreCase("chrome"))
   {
	   driver=new ChromeDriver();
   }
   else if (browservalue.equalsIgnoreCase("firefox")) {
	  driver=new FirefoxDriver();
  }
   else if (browservalue.equalsIgnoreCase("edge")) {
	   driver=new EdgeDriver();
}
   else {
	Reporter.log("Enter valid Browser Value", true);
}
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
   Thread.sleep(2000);
   driver.get(Url);
   driver.findElement(By.name("username")).sendKeys(usr);
   Thread.sleep(2000);
   driver.findElement(By.name("pwd")).sendKeys(pass);
   Thread.sleep(2000);
   driver.findElement(By.id("loginButton")).click();
   Thread.sleep(2000);
   driver.quit();
   
  }
}
