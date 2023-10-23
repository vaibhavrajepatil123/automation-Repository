package methodsofwebDriver1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException 
	{
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          
          driver.get("https://www.selenium.dev/");
          Thread.sleep(2000);
          String title = driver.getTitle();
          System.out.println(title);
          driver.close();
	}

}
