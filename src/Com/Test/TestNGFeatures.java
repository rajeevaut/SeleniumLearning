package Com.Test;

import org.testng.annotations.Test;

public class TestNGFeatures {
  @Test
  public void loginTest() {
	  System.out.println("Login");
	  int i=9/0;
  }
  @Test(dependsOnMethods="loginTest")
  public void homePageTest() {
	  System.out.println("HomePage");
  }
  
  @Test(dependsOnMethods="loginTest")
  public void regPageTest() {
	  System.out.println("RegPage");
  }
  
  @Test(dependsOnMethods="loginTest")
  public void searchPageTest() {
	  System.out.println("SearchPage");
  }
  
}
