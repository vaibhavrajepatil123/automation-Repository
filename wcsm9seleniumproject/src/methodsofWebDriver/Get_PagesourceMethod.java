package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_PagesourceMethod {

	public static void main(String[] args) throws InterruptedException 
	{        
		// launch the webBrowser
              WebDriver driver=new ChromeDriver();
         // maximize the browser     
              driver.manage().window().maximize();
           //launch the web application   
              driver.get("https://www.youtube.com/");
              Thread.sleep(2000);
             
              // get the source code of current web page
             String pagesourcecode = driver.getPageSource();
             System.out.println(pagesourcecode);
             
             // get the title of current web page
             String title = driver.getTitle();
             System.out.println(title);
           // close the all browser  
             driver.quit();
             
	}

}
