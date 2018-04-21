package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMomentConcepts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		//create Actions object for mouser moment 
		// mosue moment always done by actions class
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();

		Thread.sleep(3000);
		driver.findElement(By.linkText("Hot Meals")).click(); // working fine 
		
		
		//Assignment - multilevel hirerachy  
		
	}

}
