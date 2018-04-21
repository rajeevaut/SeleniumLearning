package SeleniumLearning;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://pages.ebay.in/help/policies/privacy-policy.html");
		
		// import List from java.util
		// import weblement from selenium
		// total number of link
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		
		
		// get the text of each link
		for(int i=0;i<linklist.size();i++) {
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
			
		}
		
	}

}
