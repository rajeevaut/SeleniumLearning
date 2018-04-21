package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://freecrm.com/index.html");
		
		driver.findElement(By.name("username")).sendKeys("rajeev363");
		driver.findElement(By.name("password")).sendKeys("rajeev123");
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		
		// Execute Script -  To execute javascript code 
		WebElement loginbutton = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		loginbutton.click();
		
		driver.switchTo().frame("mainpanel"); /// frame method accepts integer and string values 
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Manish Gupta']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		
		driver.findElement(By.xpath("//a[text()='Rakesh Gupta']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		

	}

}
