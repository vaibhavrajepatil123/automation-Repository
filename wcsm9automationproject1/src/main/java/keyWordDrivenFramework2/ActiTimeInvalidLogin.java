package keyWordDrivenFramework2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException
	{
         BaseTest bt = new BaseTest();
         bt.openBrowser();
         
         Flib flib = new Flib();
         int rc = flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx", "invalidcreds");
         
         for(int i=1;i<=rc;i++)
         {
        	String invalidUsn = flib.readExcelData("./src/main/resources/ActiTimeTestData.xlsx", "invalidcreds", i,0);
        	String invalidPass = flib.readExcelData("./src/main/resources/ActiTimeTestData.xlsx", "invalidcreds", i, 1);
        	 //identify username textbox
          WebElement usnTb = driver.findElement(By.name("username"));
         usnTb.sendKeys(invalidUsn);
           //identify passwordtext box
            WebElement passTb = driver.findElement(By.name("pwd"));
        passTb.sendKeys(invalidPass);
         driver.findElement(By.id("loginButton")).click();
         Thread.sleep(2000);
         driver.findElement(By.name("username")).clear();
         }
        bt.closeBrowser();
    }

}
