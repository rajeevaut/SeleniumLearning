package SeleniumLearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlwWindowPopups {
	
	//1. Alerts - javascript popup // Alert API (accept, Dismiss)
	// 2. fileupload - Browse button // (type- file , sendkeys)
	// 3. Browser Window Popup or advertisement popup // Windowhandler API - getWindowHandles

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		// create set object , its like array but not stroing value in based of address
		// to get window id we have to use method - getWindowHandles
		Set <String> handler = driver.getWindowHandles();
		
		// Create iterator to read set object 
		
		Iterator<String> It = handler.iterator();
		
		// parent window id 
		String ParentWindowId = It.next();
		System.out.println("Parent Window Id"+ParentWindowId);
		
		// child window id
		String ChildWindowId = It.next();
		System.out.println("Child Window Id"+ChildWindowId);
		
		driver.switchTo().window(ChildWindowId);
		Thread.sleep(2000);
		System.out.println("Child window popup title"+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(ParentWindowId);
		Thread.sleep(2000);
		System.out.println("Child window popup title"+driver.getTitle());
		driver.close();
		
		
		
	}

}
