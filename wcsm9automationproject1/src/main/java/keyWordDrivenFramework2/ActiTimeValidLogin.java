package keyWordDrivenFramework2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
       
		// to launch the browser
		BaseTest bt = new BaseTest();
		
		// read the data from property file
		Flib flib = new Flib();
		bt.openBrowser();	
		WebElement usnTb = driver.findElement(By.name("username"));
		usnTb.sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties", "Username"));
		WebElement passTb = driver.findElement(By.name("pwd"));
		passTb.sendKeys(flib.readDataFromProperty("./src/main/resources/config.properties", "Password"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
	}

}
