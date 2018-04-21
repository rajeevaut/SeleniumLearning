package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectCalendarByJS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		

		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/?gclid=EAIaIQobChMIlNGC3c382QIVgR0rCh0Q-QNuEAAYASAAEgJ63vD_BwE");
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']"));
		String dateval = "30-06-2018";
		selectDateByJS(driver,date,dateval);
		
		
		// should not do any speling mistake in javascript
		
		
	}

	public static void selectDateByJS(WebDriver driver,WebElement element,String dateval) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;  // cast driver in to javascriptexecuotr
		
		// should not do any speling mistake in javascript
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
		
	}
}
