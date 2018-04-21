package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\drivers\\chromedriver.exe"); // launch chrome
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		// see page source , only 1 frame is there , in that case we can mention 0 in switch to method
		
		driver.switchTo().frame(0);
		Actions action = new Actions(driver);
		// first click and hold source image , then  release in target
		//Note:-- always use build.perform in action class at end of the code 
		action.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']"))).
		moveToElement(driver.findElement(By.xpath("//*[@id='droppable']/p"))).
		release().
		build().
		perform();

	}

}
