package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "It Is use to perform Logon",enabled = true)
  public void method1() {
 
  Reporter.log("method1 For Login Page", true);
  }
  
  @Test(description = "It Is use to perform Users",enabled = true)
  public void method2()
  {
	  Reporter.log("method2 For Users Page", true);
  }
  
  @Test(description = "It Is use to perform Logout",enabled = false)
  public void method3()
  {
	  Reporter.log("method3 For Logout Page", true);
  }
}
