package SeleniumLearning;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotConcept {

	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		//driver.get VS driver.navigate.to method
		driver.get("https://www.google.com");

		//take screenshot
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\Selenium\\SeleniumLearning\\src\\SeleniumLearning\\error.png"));
		
	}

}
