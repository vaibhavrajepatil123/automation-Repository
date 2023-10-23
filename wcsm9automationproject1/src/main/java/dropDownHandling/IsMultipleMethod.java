package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class IsMultipleMethod {
            public static void main(String[] args) {
				  ChromeDriver driver = new ChromeDriver();
				  driver.manage().window().maximize();
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				  
			}
}
