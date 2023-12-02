package testNGAnnotations_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "This perform login operation")
  public void method() {
 
	  Reporter.log("method 1 from Flag1", true);
  }
}
