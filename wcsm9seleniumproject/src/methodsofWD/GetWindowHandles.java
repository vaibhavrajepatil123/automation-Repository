package methodsofWD;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		
		// get the address of parent as well as child window
		Set<String> allHandles = driver.getWindowHandles();
		for(String wh:allHandles)
		{
		 	
		}
	}

}
