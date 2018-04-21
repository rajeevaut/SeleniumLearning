package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterConcept {

	public static void main(String[] args) throws InterruptedException {
		
		// Java script Executer we need to use to highlight any element , in qtp its valiable as highlight method but in selenium to highlight we have to use javascript 
		// in selenium no direct method for highlight we have to use javascript for this 
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
		flash(loginbutton,driver);
		
	}

	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	String bgcolor = element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++) {
			System.out.println("flash method");
			ChangeColor("rgb(0,200,0)",element, driver);
			ChangeColor(bgcolor,element,driver);
		}
	
	}


	public static void ChangeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundcolor'"+color+"'", element);
		try {
					Thread.sleep(2000);
			
		}catch (InterruptedException e){
						
		}
		
	}
	
}
	
	