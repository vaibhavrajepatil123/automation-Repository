package javascriptexcutorpackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HandleDisableWebElement2 {

	public static void main(String[] args) throws InterruptedException, IOException {
     
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		//to perform action on text box
		jse.executeScript("document.getElementById(\"tb2\").value=\"vaibhav\"");
		Thread.sleep(2000);
	  // Takes a screen shot of webelement
		WebElement ss = driver.findElement(By.id("tb2"));
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/webss.jpg");
		Files.copy(src, dest);
	
	}

}

