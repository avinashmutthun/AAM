package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngparameters_1 {

	   @Test
	   @Parameters("strUN")
	   public void parameterTest(String strUN)
	   {
	      System.out.println("Parameterized value is : " + strUN);
	   }
}

