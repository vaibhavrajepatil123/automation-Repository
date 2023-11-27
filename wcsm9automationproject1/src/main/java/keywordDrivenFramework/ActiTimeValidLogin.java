package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest {
  
	public static void main(String[] args) throws IOException, InterruptedException {
	
		// launch the browser
		BaseTest bt = new BaseTest();
		
		// to read the data from property file
		Flib flib = new Flib();
		bt.openBrowser();
		driver.findElement(By.name("username")).sendKeys(flib.readDataFromProperty(PROP_PATH, "Username"));
		driver.findElement(By.name("pwd")).sendKeys(flib.readDataFromProperty(PROP_PATH, "Password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
	}
}
