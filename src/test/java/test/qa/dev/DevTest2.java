package test.qa.dev;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class DevTest2 {
	
  @Test( dataProvider = "dp2", groups = { "devtest", "smoketest" } )
  public void f1(Integer n, String s) {
	  System.out.println( n + s );
  }

  @DataProvider( name = "dp2" )
  public Object[][] returnData() {
    return new Object[][] {
      new Object[] { 7, "g" },
      new Object[] { 8, "h" },
    };
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before dev test 2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After dev test 2");
  }

}
