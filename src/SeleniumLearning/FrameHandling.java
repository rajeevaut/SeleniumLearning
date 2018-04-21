package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://freecrm.com/index.html");
		//maximize window
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("rajeev363");
		driver.findElement(By.name("password")).sendKeys("rajeev123");
		driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		Thread.sleep(5000);
		// Switch to Frame mainpanel
		driver.switchTo().frame("mainpanel"); /// frame method accepts integer and string values 
		
		Thread.sleep(3000);
		//customise xpath
		//driver.findElement(By.xpath("//*[@id='navmenu']/ul/li[4]/a"));
	driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
	}

}
