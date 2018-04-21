package SeleniumLearning;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleFileUploadPopup {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file");
		//maximize window
		//driver.manage().window().maximize();
		
		// if type=file in html code then only it will work 
		
		driver.findElement(By.xpath("html/body/input")).sendKeys("E:\\Files\receipt.pdf");
	}
}
