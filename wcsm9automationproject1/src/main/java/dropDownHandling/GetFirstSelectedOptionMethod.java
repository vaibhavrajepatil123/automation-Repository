package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {

	public static void main(String[] args) throws InterruptedException {
		
	  WebDriver	driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("file:///C:/Users/hp/Desktop/wcsm8seleniumWebelement/singleselectdropdown1.html");
	  // single select dropdown
	 WebElement dropdown1 = driver.findElement(By.id("vaibhav"));
	  //handle the dropdown
	 Select sel = new Select(dropdown1);
	  //select the option from dropdown
	 Thread.sleep(2000);
	  
	}

}
