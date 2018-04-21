package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXPath {

	public static void main(String[] args) {
		
				// ABSOLUTE path not recommended  
					// 1. performance issue
					// 2. not relaible
					// 3. can be change any time in future 	
		
				System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
				WebDriver driver  = new ChromeDriver();
				
				
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.get("https://pages.ebay.in/help/policies/privacy-policy.html");
				
				// We have to use customise xpath when id/name not avaialble and absoulte xpath coming in the form of
				// "//table/tbody/td/tr" in this case if position of element will get change then script will stop working 
				// we should use absoulte xpath if this is not getting generated in the form of hirerachy else we have to follow
				// custom xpath
				
				driver.findElement(By.xpath("//input[@title='Search the Help pages']")).sendKeys("watch");
				driver.findElement(By.xpath("//input[@value='Search Help Pages']")).click();
				
				//cutom path using Contains -- more powerfull
				
				//driver.findElement(By.xpath("//input[contains(@value,'Search Help Pages')]")).click();
				
				//****Dynamic ID very important  , change every time****
				// id = test_123
				// id = test_456
				// id = test_test_7890_test
				//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("watch");
				//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("watch");
				
				// id = 1234_test_t
				// id = 3678_test_t
				
				//driver.findElement(By.xpath("//input[ends-with(@id,'test_t')]")).sendKeys("watch");
				
				//**** links ***
				
				//driver.findElement(By.xpath("//a[contains(text(),'Help')]")).Click();
				
				
	}

}
