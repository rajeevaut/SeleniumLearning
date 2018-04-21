package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		
		//1. Launch FF
		// gecodriver
		
		//System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//2.Launch Chrome Browser
		// download chrome exe fine and pass the path
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);
		
		
		//Validate title is google 
		if(pagetitle.equals("Google")) {
			System.out.println("Correct title");
			
		}else {
			System.out.println("Incorrect title");
		}
		driver.quit();
	}

}
