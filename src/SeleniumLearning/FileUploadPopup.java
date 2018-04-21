package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("C:\\Users\\rajeevkumar.gupta\\Downloads\\Broadband bill.pdf");
	}

}
