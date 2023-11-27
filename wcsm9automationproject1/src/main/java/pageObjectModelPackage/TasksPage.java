package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksPage {
  
	// store all the webelements of tasks page
	@FindBy(partialLinkText = "Projects & Customers")
	private WebElement Project_Customers_Sub_Module;
	
	public TasksPage(WebDriver driver)
	{
		
	}

	
	// operational methods
	public void createcustomer_createproject_method(String cust_name)throws InteruptedException
	{
		
	}
	
}
