package Com.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
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
		  	Assert.assertEquals(title, "Google12", "Title is not matched");
		  	
		  	
	  }
	  
	  @AfterMethod
	  public void quitdriver() {
		  driver.quit();
	  }
}
