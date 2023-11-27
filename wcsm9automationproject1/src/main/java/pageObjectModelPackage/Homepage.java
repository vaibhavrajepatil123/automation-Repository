package pageObjectModelPackage;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public static void main(String[] args) {
           
		// store all the modules of homepage
		@FindBy (xpath="//div[text()='Time-Track']/follwoing-sibling::div/img") private WebElement Time_Track;
	    @Findby (xpath="//div[text()='Tasks']/follwoing-sibling::div/img") private WebElement Tasks;
	    @Findby (xpath=("//div[text()='Reports']/follwoing-sibling::div/img")) private WebElement  Reports;
	    @FindBy ()
	
	
	
	   
	      // intilization
	    public Homepage(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    //operational methods
	    public void click_on_Time_Track_Module()
	    {
	    	Time_Track_moduile.click();
	    }
	    public void clcik_on_Tasks_Module()
	    {
	    	tasks module.click();
	    }
	    public void clcik_on_Reports_Module()
	    {
	    	reports_module.click();
	    }
	    public void click_on 
	}

}
