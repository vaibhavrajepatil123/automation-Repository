package qsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittleMethod {

	public static void main(String[] args) throws InterruptedException
	{
              WebDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              driver.get("https://www.netflix.com/in/");
              Thread.sleep(2000);
              String title = driver.getTitle();
              System.out.println(title);
              driver.close();
	}

}
