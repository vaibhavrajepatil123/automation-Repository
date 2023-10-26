package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) throws InterruptedException {
                    WebDriver driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                    
                    driver.get("https://www.bluestone.com/");
                    driver.findElement(By.xpath("//body[@class='page-front new-hp-ui with-white-header no-footer-top    p-auto-play   no-ticker']")).click();
                  
                    WebElement movetoelement = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
                    Actions act = new Actions(driver);
                    act.moveToElement(movetoelement).perform();
                    driver.findElement(By.xpath("Band")).click();
	}

}
