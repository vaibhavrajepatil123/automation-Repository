package qsp1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunTimePolymorphism {

	public static void main(String[] args) throws InterruptedException
	{
           Scanner sc = new Scanner(System.in);
           
           System.out.println("select the browser value which u want");
           
            String browservalue = sc.next();
            
            if (browservalue.equalsIgnoreCase("chrome"))
            {
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				Thread.sleep(2000);
			}
            else if (browservalue.equalsIgnoreCase("firefox"))
            {
				WebDriver driver=new FirefoxDriver();
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
			}
            else if (browservalue.equalsIgnoreCase("edge"))
            {
				WebDriver driver=new EdgeDriver();
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
			}
            else {
				System.out.println("select the valid browser value!!!");
			}
            
            
            
	}

}
