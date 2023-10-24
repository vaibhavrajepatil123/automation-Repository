package actionsMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {

	public static void main(String[] args) {
                    WebDriver driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                    
                    driver.get("https://www.bluestone.com/");
                   Actions act = new Actions(driver);
                   act.moveToElement(null).perform();
	}

}
