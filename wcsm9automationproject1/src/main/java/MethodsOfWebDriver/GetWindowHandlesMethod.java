package MethodsOfWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	  
        		
        	public static void main(String[] args) throws InterruptedException {
        		WebDriver driver=new ChromeDriver();
        		driver.manage().window().maximize();
        		driver.get("https://omayo.blogspot.com/");
        		Thread.sleep(2000);
        		
        		//store the parent window handle address
        		String Parentwindow = driver.getWindowHandle();
        		
        		driver.findElement(By.partialLinkText("Open a popup window")).click();
        		Thread.sleep(2000);
        		
        		// get all window Handles
        		Set<String> allHandles = driver.getWindowHandles();
        		// Iterate through the handles and print them
               for (String handle : allHandles)
               {
            	   if (!handle.equals(Parentwindow))
            	  {
					System.out.println("address of child window:"+handle);
				}
            	   else {
				    System.out.println("address of parent window"+handle);	
				}
				
			}
        		
        	}     		
}	
			
