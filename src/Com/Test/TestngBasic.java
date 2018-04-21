package Com.Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.AfterSuite;

public class TestngBasic {
	
	/*
	@BeforeSuite --Setup  -- I
	@BeforeTest --LaunchBrowser -- II
	@BeforeClass --login -- III
	
	@BeforeMethod --enterURL
	@Test --googleTitleTest
	@AfterMethod --Logout
	
	@BeforeMethod --enterURL
	@Test --Register
	@AfterMethod --Logout
	
	@BeforeMethod --enterURL
	@Test --search
	@AfterMethod --Logout
	
	@AfterClass --CloseBrowser
	@afterTest --Test


*/

	//1 st preference
	  @BeforeSuite
	  public void setup() {
		  System.out.println("@BeforeSuite --Setup");
	  }
	  
	//2nd preference
	  @BeforeTest
	  public void LaunchBrowser()
	  {
		  System.out.println("@BeforeTest --LaunchBrowser");
	  }

	  //**3rd preference
	  @BeforeClass
	  public void login() {
		  System.out.println("@BeforeClass --login");
	  }

	//**4th preference
	  @BeforeMethod
	  public void enterURL() {
		  System.out.println("@BeforeMethod --enterURL");
	  }
  
  @Test
  public void search() {
	  System.out.println("@Test --search");
  }
  @Test
  public void register() {
	  System.out.println("@Test --Register");
  }
  
  @Test
  public void googleTitleTest() {
	  System.out.println("@Test --googleTitleTest");
  }
  

  @AfterMethod
  public void Logout() {
	  System.out.println("@AfterMethod --Logout");
  }

  @AfterClass
  public void closebrowser() {
	  System.out.println("@AfterClass --CloseBrowser");
  }
  
  @AfterTest
  public void afterTest() {
	  System.out.println("@afterTest --Test");
  }

  

}
