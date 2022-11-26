package actionClassInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop{

	public static void main(String[] args) throws Throwable {
		

	
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement myFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	driver.switchTo().frame(myFrame);
	WebElement sourceElement = driver.findElement(By.id("draggable"));
	WebElement targetElement = driver.findElement(By.id("droppable"));
	Actions action = new Actions(driver);
	action.dragAndDrop(sourceElement, targetElement).perform();
	// Utility.dragAndDrop(sourceElement, targetElement);
	//
	//Utility.hardWait(6000);
	Thread.sleep(2000);
	driver.close();	
		
}

}
