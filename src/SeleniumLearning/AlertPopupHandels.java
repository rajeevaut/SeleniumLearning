package SeleniumLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupHandels {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//maximize window
		driver.manage().window().maximize();
driver.findElement(By.name("proceed")).click();

Thread.sleep(5000);

Alert alert = driver.switchTo().alert();
System.out.println(alert.getText());
alert.accept();
//alert.dismiss(); 
	}

}
