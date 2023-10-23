package MethodsOfWebDriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException 
	{
              WebDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              driver.get("https://omayo.blogspot.com/");
              Thread.sleep(2000);
              driver.findElement(By.linkText("Open a popup window")).click();
              Set<String> windowsIds = driver.getWindowHandles();
              Iterator<String> itr = windowsIds.iterator();
              String defultwindowId = itr.next();
              String childwindowId = itr.next();
              
              driver.switchTo().window(childwindowId);
               System.out.println(childwindowId);
            //  driver.switchTo().window(defultwindowId);
              Thread.sleep(2000);
            //  System.out.println(defultwindowId);
              
              
	}

}
