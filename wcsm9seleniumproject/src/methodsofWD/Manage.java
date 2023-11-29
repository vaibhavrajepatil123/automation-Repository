package methodsofWD;


import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-toca723/login.do");
		Thread.sleep(2000);
		Dimension size = new Dimension(450, 350);
		driver.manage().window().setSize(size);
		Thread.sleep(2000);
		Point targetpoint = new Point(350, 450);
		driver.manage().window().setPosition(targetpoint);

	}

}
