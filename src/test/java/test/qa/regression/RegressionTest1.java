package test.qa.regression;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RegressionTest1 {
	
  @Test( dataProvider = "dp1", groups = { "regressiontest" } )
  public void f1(Integer n, String s) {
	  System.out.println( n + s );
  }

  @DataProvider( name = "dp1" )
  public Object[][] returnData() {
    return new Object[][] {
      new Object[] { 9, "i" },
      new Object[] { 10, "j" },
    };
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before regression test 1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After regression test 1");
  }

}
