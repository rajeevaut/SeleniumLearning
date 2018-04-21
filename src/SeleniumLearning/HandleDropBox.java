package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://pages.ebay.in/help/policies/privacy-policy.html");
		//maximize window
		driver.manage().window().maximize();
		//handle drop box
		Select select = new Select(driver.findElement(By.id("gh-cat")));
		select.selectByVisibleText("Charity");
	}

}
