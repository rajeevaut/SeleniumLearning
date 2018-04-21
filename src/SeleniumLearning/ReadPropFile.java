package SeleniumLearning;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		
		
		//object of properties file 
		Properties prop = new Properties();
		// object of file input stream
		FileInputStream ip = new FileInputStream("E:\\Selenium\\SeleniumLearning\\src\\SeleniumLearning\\config.properties");
		
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		
		String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browsername = prop.getProperty("Browser");
		System.out.println(browsername);
		
		if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
			WebDriver driver  = new ChromeDriver();
driver.get(url);	
driver.findElement(By.xpath(prop.getProperty("username_xpath"))).sendKeys(prop.getProperty("firstname"));

		}else if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
			WebDriver driver  = new FirefoxDriver();
			
		} else if(browsername.equals("IE")){
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
			WebDriver driver  = new InternetExplorerDriver();
		
		}

		
		
	}

}
