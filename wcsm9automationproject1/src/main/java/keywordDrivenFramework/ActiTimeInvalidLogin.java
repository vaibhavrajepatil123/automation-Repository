package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
            
		// to launch browser and close the browser
		BaseTest bt = new BaseTest();
		 bt.openBrowser();
		
		// read data frome excel file
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH, INVALIDCREDS_SHEET);
		
		for(int i=1; i<=rc; i++)
		{
	    String invalidUsn = flib.readDataFromExcel(EXCEL_PATH, INVALIDCREDS_SHEET, i, 0);
	  String invalidPass = flib.readDataFromExcel(EXCEL_PATH, INVALIDCREDS_SHEET, i, 1);
	  
	    // identify username textbox
	   WebElement usnTb = driver.findElement(By.name("username"));
	   usnTb.sendKeys(invalidUsn);
	  // identify password textbox
	 WebElement passTb = driver.findElement(By.name("pwd"));
	 passTb.sendKeys(invalidPass);
	 //identify login button and click
	 driver.findElement(By.id("loginButton")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("username")).clear();
		}
	   bt.closeBrowser();
	}

}
