package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

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
		// //*[@id='vContactsForm']/table/tbody/tr[4]/td[2]
		
		String before_path = "//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpth = "]/td[2]";
		
		// Method 1 -  using for loop
		/*for(int i=4; i<=6 ; i++) {
			String name = driver.findElement(By.xpath(before_path + i + after_xpth  )).getText();
			System.out.println(name);
			
			if(name.contains("Rakesh Gupta")) {
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr[" + i+ "]/td[1]")).click();
			}
			
		}*/
		
		//Method2 - without for loop by using customise xpath
		
	driver.findElement(By.xpath("//a[contains(text(),'Rakesh Gupta')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();		
			
	driver.findElement(By.xpath("//a[contains(text(),'Manish Gupta')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();	

	}

}
