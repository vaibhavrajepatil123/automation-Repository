package pop_upHandlePackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//https://demoapps.qspiders.com/
		driver.get("https://demoapps.qspiders.com/auth");
		Thread.sleep(2000);
		//generate authentication pop up
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Authentication']")).click();
		Thread.sleep(2000);
		//address of authentication page window
		String authpagewindowhandle = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		// get the address of all present windows
		Set<String> allwindowHandles = driver.getWindowHandles();
		//shift controls to authentication pop up window page
		for (String wh : allwindowHandles)
		{
			if (!authpagewindowhandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
		}
		//handle authentication popup
		handle_authenticationpopup();
	}
       
		
	
	public static void handle_authenticationpopup() throws AWTException
       {
    	 Robot robot=new Robot();
    	 robot.keyPress(KeyEvent.VK_A);
    	 robot.keyPress(KeyEvent.VK_D);
    	 robot.keyPress(KeyEvent.VK_M);
    	 robot.keyPress(KeyEvent.VK_I);
    	 robot.keyPress(KeyEvent.VK_N);
    	 
    	 robot.keyPress(KeyEvent.VK_TAB);
    	 robot.keyRelease(KeyEvent.VK_TAB);
    	 
    	 robot.keyPress(KeyEvent.VK_A);
    	 robot.keyPress(KeyEvent.VK_D);
    	 robot.keyPress(KeyEvent.VK_M);
    	 robot.keyPress(KeyEvent.VK_I);
    	 robot.keyPress(KeyEvent.VK_N);
    	 
    	 robot.keyPress(KeyEvent.VK_TAB);
    	 robot.keyRelease(KeyEvent.VK_TAB);
    	 
    	 
    	 robot.keyPress(KeyEvent.VK_ENTER);
    	 robot.keyRelease(KeyEvent.VK_ENTER);
    	 
    	 
    	 
       }
	

	
	   
}
