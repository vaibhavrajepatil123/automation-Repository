package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitleMethod {

	public static void main(String[] args) throws InterruptedException
	{
      //launch edge browser
	   WebDriver driver=new EdgeDriver();
	   
	   //maximize the browser
	   driver.manage().window().maximize();
	   
	 
	   //launch the web application
	   driver.get("https://www.youtube.com/");
	   
	   //provide the delay 
	   Thread.sleep(5000);
	   
	   //get the title of web appln
	    String loginpagetitle = driver.getTitle();
	    System.out.println(loginpagetitle);
	   
	   //close the browser
	   driver.close();
	   
		
	}

}
