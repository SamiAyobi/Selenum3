package windowHandlingSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingSelenium {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Actions action = new Actions(driver);
		String currentWindow=driver.getWindowHandle();
		
		WebElement textBox=driver.findElement(By.cssSelector("input[id=twotabsearchtextbox"));
		textBox.sendKeys("books");
		
		action.keyDown(Keys.CONTROL).perform();
		
		WebElement searchBttn=driver.findElement(By.cssSelector("input[id='nav-search-submit-button']"));
		searchBttn.click();
		
		action.keyUp(Keys.CONTROL).perform();
		
		//So far it was window handling, from one window to another
		
		Set<String> allWindows=driver.getWindowHandles();
		Iterator<String> i= allWindows.iterator();
		String child1="";
		while(i.hasNext()) {
			child1=i.next();
			if(!currentWindow.equals(child1)) {
				driver.switchTo().window(child1);
				
				
					
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.close();
			}
		}
		

		
		
}
}
