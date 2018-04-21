package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		// Implicit wait means dynamic wait , other wait is static wait 
		// we can use this when page is taking time to load 
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		// wait for max 40 sec to load page , if pages loaded in 2 sec then 38 will be released
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		// this is for all the elements button ,image etc
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}

}
