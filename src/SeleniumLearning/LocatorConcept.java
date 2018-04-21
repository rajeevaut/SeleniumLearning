package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://reg.ebay.in/reg/PartialReg?siteid=203&UsingSSL=1&co_partnerId=2&errmsg=&src=&ru=https%3A%2F%2Fm.ebay.in%2F&signInUrl=https%3A%2F%2Fsignin.ebay.in%3A443%2Fws%2FeBayISAPI.dll%3FSignIn%26ru%3Dhttps%253A%252F%252Fm.ebay.in%252F%26pageId%3D2059705&rv4=1");
		//1. xpath
		// absoulute xpath should not be used --html/body
		// relatove xpath we have to use - //*[@id='firstname']
		//driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Rajeev");
		//driver.findElement(By.xpath(".//*[@id='lastname']")).sendKeys("Gupta");
		
		//2. By Id 
				driver.findElement(By.id("firstname")).sendKeys("Rajeev");
		driver.findElement(By.id("lastname")).sendKeys("Gupta");
		
		
		

		// 3. By Name
		//driver.findElement(By.name("")).sendKeys("");
		
		
		//4. Link Text
		driver.findElement(By.linkText("User Privacy Notice")).click();
		
		// 5. Partial Text -not usefull
		//river.findElement(By.partialLinkText("").click();
		
		//6. CSS Selector
		// if id is there -#{id}
		// if class is there --.{class}
		driver.findElement(By.cssSelector("#firstname")).sendKeys("Manish");
		// 7 . classname - not usefull 
		
	
	}

}
