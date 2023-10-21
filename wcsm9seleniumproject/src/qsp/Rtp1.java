package qsp;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rtp1 {

	public static void main(String[] args) throws InterruptedException {
         
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the browser value!!!");
		 String v = sc.next();
		 
		 if (v.equalsIgnoreCase("chrome"))
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		 else if (v.equalsIgnoreCase("firefox"))
	    {
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		} 
		 else if (v.equalsIgnoreCase("edge"))
		 {
			WebDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.close();
		}
		 else {
			System.out.println("select the valid browser value");
		}
	}

}
