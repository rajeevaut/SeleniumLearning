package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		// difference between isSelected vs isEnabled vs isDispalyed
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.freecrm.com/register/");
		
		// 1. isDisplayed Method
		boolean b1= driver.findElement(By.id("submitButton")).isDisplayed();
		
		System.out.println(b1); // true
		
		//2. isEnabled method
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2); // false
		
		// select i agree term 
		
		driver.findElement(By.name("agreeTerms")).click(); // submit button is enabled now
		
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println("button enabled now "+b3); // True
		
		//3. isSelected method is only applicable for checkbox, dropdown and radio button
		
		boolean b4 = driver.findElement(By.name("agreeTerms")).isSelected(); // true
		System.out.println("checkbox is now selected ..??"+b4);
		
		driver.findElement(By.name("agreeTerms")).click(); 
		boolean b5 = driver.findElement(By.name("agreeTerms")).isSelected(); // false
		System.out.println("checkbox is now selected ..??"+b5);
		
		
	}

}
