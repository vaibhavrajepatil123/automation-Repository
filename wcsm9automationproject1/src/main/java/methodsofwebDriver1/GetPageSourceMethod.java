package methodsofwebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourceMethod {
    // it is used to get the source code of current webpage
	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver=new ChromeDriver();
         Thread.sleep(2000);
         driver.manage().window().maximize();
         driver.get("https://www.facebook.com/");
         Thread.sleep(2000);
         
         String source = driver.getPageSource();
         System.out.println(source);
         driver.close();
	}

}
