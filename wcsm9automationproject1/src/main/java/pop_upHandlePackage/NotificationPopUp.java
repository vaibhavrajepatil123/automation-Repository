package pop_upHandlePackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter browservalue!!");
		 String browservalue = sc.next();
		 if (browservalue.equalsIgnoreCase("chrome"))
		 {
          ChromeOptions co = new ChromeOptions();
          co.addArguments("--disable-notification");
          WebDriver driver=new ChromeDriver(co);
			 
		} 
		 else if (browservalue.equalsIgnoreCase("firefox"))
		{ 
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notification");
			WebDriver driver=new FirefoxDriver();
			 
		}
		 else if (browservalue.equalsIgnoreCase("edge"))
		 {
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--disable-notification");
			WebDriver driver=new EdgeDriver();
		}
		 else {
			System.out.println("Enter valid browser value");
		}
		 
	}

}
