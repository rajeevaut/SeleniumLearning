package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		Thread.sleep(2000);
		
		// descendant used to select appropriate div where our text exist , to find div we are suing class here 
		List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbqs_c']"));
		
		System.out.println("Total number of suggestion "+list.size());
		
		for(int i=0; i<=list.size();i++) {
			//print all text available in google search
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("java tutorial")) {
				list.get(i).click();
				break;
			}
			
			
		}
		
	}

}
