package Com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
  @BeforeMethod
  public void setup() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
	  driver  = new ChromeDriver();
	 
	  //maximize window
	  driver.manage().window().maximize();
	  driver.get("https://www.google.co.in");
  }
  
  @Test(priority=1,groups="Title")
  public void googleTitleTest() {
	  	String title = driver.getTitle();
	  	System.out.println(title);
	  	
  }
  
  @Test(priority=2,groups="LinksTest")
  public void mailLinkTest() {
	  boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	  System.out.println(b);
  }
  
  @Test(priority=3,groups="Test")
  public void test1()
  {
	  System.out.println("test1");
	  
  }
  
  @Test(priority=4,groups="Test")
  public void test2()
  {
	  System.out.println("test2");
	  
  }
  
  @Test(priority=5,groups="Test")
  public void test3()
  {
	  System.out.println("test3");
	  
  }
  
  @AfterMethod
  public void quitdriver() {
	  driver.quit();
  }
}

