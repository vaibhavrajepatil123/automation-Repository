package testNGpackage;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Somo {
  @Test
  public void method1() {

	//  System.out.println("method3 from Somo Class");
	  Reporter.log("method1 from Sumo class!", true);
  }
  
  
  @Test
  public void method2()
  {
	  Reporter.log("method2 from sumo class!!", true);
  }
}
