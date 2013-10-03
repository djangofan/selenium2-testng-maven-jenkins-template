package test.qa.dev;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DevTest1 {
	
  @Test( dataProvider = "dp1", groups = { "regressiontest" } )
  public void f1(Integer n, String s) {
	  System.out.println( n + s );
  }

  @DataProvider( name = "dp1" )
  public Object[][] returnData() {
    return new Object[][] {
      new Object[] { 5, "e" },
      new Object[] { 6, "f" },
    };
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before dev test 1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After dev test 1");
  }

}
