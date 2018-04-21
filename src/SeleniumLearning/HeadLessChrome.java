package SeleniumLearning;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {

	
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		
		ChromeOptions options = new ChromeOptions();

		options.addExtensions(new File("E:\\Selenium\\45to75_v0.0.3.crx"));


		WebDriver driver = new ChromeDriver(options);
		
	//	ChromeOptions options = new ChromeOptions();
	 // size is compulsury with same input , code may work without size as well , but this will happen only if website is compatibale with mobile else object will not get identified
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		
		//WebDriver driver  = new ChromeDriver(options); // launch chrom
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://freecrm.com/index.html");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("rajeev363");
		driver.findElement(By.name("password")).sendKeys("rajeev123");
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		// Execute Script -  To execute javascript code 
		WebElement loginbutton = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		loginbutton.click();

	}

}
