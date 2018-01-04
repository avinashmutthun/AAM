package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class parameterswithdataprovider {



   @DataProvider(name = "test1")
   public static Object[][] data() 
   {	   
      return new Object[][] {{2, true}, {6, false}, {19, true}, {22, false}, {23, true}};
   }


   @Test(dataProvider = "test1")
   public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) 
   {
      System.out.println(inputNumber + " " + expectedResult);
   }
}

