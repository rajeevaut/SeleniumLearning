package SeleniumLearning;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarClassTest {

	public static void main(String[] args) throws InterruptedException {
		
		/*Steps to handle calendar in Selenium Webdriver:
			 1- Click on calendar
			 2- Get all td of tables using findElements method
			 3- using for loop get text of all elements
			 4- using if else condition we will check specific date
			 5- If date is matched then click and break the loop. 
			 6- Handle NoSuchElementException in case of (31st day)
			 */
		
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
		
		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel"); /// frame method accepts integer and string values 
		
		String date = "1-October-2017";
		String dateArr[] = date.split("-");
		
		String day  = dateArr[0];
		String month  = dateArr[1];
		String year  = dateArr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		Thread.sleep(2000);
		
		Select select2 = new Select(driver.findElement(By.xpath("//*[@id='crmcalendar']/table/tbody/tr[1]/td/select[1]")));
		
		select2.selectByVisibleText(month);
		
		Select select3 = new Select(driver.findElement(By.xpath("//*[@id='crmcalendar']/table/tbody/tr[1]/td/select[2]")));
		
		select3.selectByVisibleText(year);
		
		//.//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[5]
		//.//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[3]/td[5]
		
	
		String beforexpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterxpath = "]/td[";
		
		final int totalWeekDays  = 7;
		boolean flag = false;
		String dayVal =null;
		
		dayVal = driver.findElement(By.xpath("/*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]")).getText();
		System.out.println(dayVal);
		
		for(int rowNum=2;rowNum<=7;rowNum++) {
			
			for(int colNum=1;colNum<=totalWeekDays;colNum++) {
				try {
					dayVal = driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).getText();
					System.out.println(dayVal);
				}catch(NoSuchElementException e) {
					System.out.println("Please enter a corrcet date value");
					flag = false;
					break;
				}
				
				System.out.println(dayVal);
				if(dayVal.equals(day)) {
					driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).click();
					break;
				}
			}
			
		// out of 1st loop	
		if(flag) {
			break;
		}
		}
		
		

	}

}
