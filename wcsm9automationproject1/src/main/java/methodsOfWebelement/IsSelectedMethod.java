package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
   
	// verify check box on login page
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-toca723/login.do");
		Thread.sleep(2000);
		WebElement checkBoxElement = driver.findElement(By.id("keepLoggedInLabel"));
		//check the checkbox is selected or not
				boolean status = checkBoxElement.isSelected();
				System.out.println(status);
				
				//select the check box verify the status 
				checkBoxElement.click();
				
				boolean status1 = checkBoxElement.isSelected();
				System.out.println(status1);
	
	
	}
}
