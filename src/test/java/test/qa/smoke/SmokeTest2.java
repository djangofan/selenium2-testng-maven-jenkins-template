package test.qa.smoke;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SmokeTest2 {
	
  @Test( dataProvider = "dp2", groups = { "devtest", "smoketest" } )
  public void f2(Integer n, String s) {
	  System.out.println( n + s );
  }

  @DataProvider( name = "dp2" )
  public Object[][] returnData() {
    return new Object[][] {
      new Object[] { 3, "c" },
      new Object[] { 4, "d" },
    };
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before smoke test 2");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After smoke test 2");
  }

}
