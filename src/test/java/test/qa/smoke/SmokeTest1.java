package test.qa.smoke;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SmokeTest1 {
	
  @Test( dataProvider = "dp1", groups = { "regressiontest" } )
  public void f1(Integer n, String s) {
	  System.out.println( n + s );
  }

  @DataProvider( name = "dp1" )
  public Object[][] returnData() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before smoke test 1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After smoke test 1");
  }

}
