package assertion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_CLass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver" , ".\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement electronics =driver.findElement(By.linkText("Electronics"));
		
		Actions action=new Actions(driver);
		
		action.moveToElement(electronics).perform();
		//if the action is more than one only perform is going to be used. but if it is more than one
		//it is going to be build and perform.
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		driver.close();
		

		
		
		
//		WebElement textBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
//		textBox.sendKeys("books");
//		action.keyDown(Keys.CONTROL).perform();
//		WebElement searchBttn = driver.findElement(By.cssSelector("input[id='nav-search-submit-button']"));
//		searchBttn.click();
//		action.keyUp(Keys.CONTROL).perform();
//		Set<String> allWindows = driver.getWindowHandles();
//		Iterator<String> i = allWindows.iterator();
//		String child1 = "";
//		while(i.hasNext()) {
//		child1 = i.next();
//		if(!currentWindow.equals(child1)) {
//		driver.switchTo().window(child1);
//		}
//		}
//		Thread.sleep(3000);
//		WebElement textBox2 = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
//		textBox2.sendKeys("pens");
//		action.keyDown(Keys.CONTROL).perform();
//		WebElement searchBttn2 = driver.findElement(By.cssSelector("input[id='nav-search-submit-button']"));
//		searchBttn2.click();
//		action.keyUp(Keys.CONTROL).perform();
//		Set<String> allWindows2 = driver.getWindowHandles();
//		Iterator<String> i2 = allWindows2.iterator();
//		String child2 = "";
//		while(i2.hasNext()) {
//		child2 = i2.next();
//		if(!child1.equals(child2) && !currentWindow.equals(child1)) {
//	    driver.switchTo().window(child2);
//}
//
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//driver.quit();
//		
		
		
		
}}

}
