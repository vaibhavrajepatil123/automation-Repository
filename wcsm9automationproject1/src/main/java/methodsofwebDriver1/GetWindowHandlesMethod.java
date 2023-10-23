package methodsofwebDriver1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
// it is used to get the address of parent window and current window or all the browsers
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Open a popup window")).click();
		Thread.sleep(2000);
		
		String ParentHandle = driver.getWindowHandle();
     	System.out.println("address of parent window"+ driver.getWindowHandle());
		
		Set<String> allHandles = driver.getWindowHandles();
		
		for (String wh : allHandles) 
		{
			if (ParentHandle.equals(wh))
			{
				System.out.println("address of parent window:"+wh);
			}
			else
			{
				System.out.println("address of child window:"+wh);
			}
		}
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
