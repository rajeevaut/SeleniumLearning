package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		
		// Html unit driver is not a part of Selenium 3.x version
		// HTMLUnit driver -- to use this concept, we have to download htmlunitdriver JAR file // 2.29 version with dependencies jar file
		
			
		WebDriver driver  = new ChromeDriver();
		
		//Advantage -
		//1.Testing is happening behind the scene - no browser open
		//2. Very Fast -m execution of test script is very fast
		// 3. not suitable for Action class - user action -mosue moment , double click, drag and drop etc.
		//4. its also called as Ghost Driver or Headless browser
			// HtmlUnitDriver - Java
			//Phantom Js - Javascript
		
		
		
		//WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.get("http://freecrm.com/index.html");
		//maximize window
		
		//driver.manage()
		System.out.println("Before Login"+driver.getTitle());
		driver.findElement(By.name("username")).sendKeys("rajeev363");
		driver.findElement(By.name("password")).sendKeys("rajeev123");
		//driver.findElement(By.xpath("//*[@id='loginForm']/div/div/input")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		System.out.println("After Login"+driver.getTitle());

	}

}
