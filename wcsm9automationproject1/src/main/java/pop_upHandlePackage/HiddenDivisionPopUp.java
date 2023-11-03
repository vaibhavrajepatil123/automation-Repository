package pop_upHandlePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivisionPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement hiddendivisionpopup = driver.findElement(By.xpath("//span[text()='✕']"));
		hiddendivisionpopup.click();
		
		
		
		
	}

}
