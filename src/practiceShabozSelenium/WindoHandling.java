package practiceShabozSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindoHandling {

	public static void main(String[] args) {
		


		System.setProperty("webdriver.chrome.driver", ".\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement textBox = driver.findElement(By.id("twotabsearchtextbox"));

		// One action, sendKeys(reference to the webElement)
//		Actions action=new Actions(driver);
//		action.sendKeys(textBox, "books").perform();

		// composite actions,sendKeys capital letter

		Actions action2 = new Actions(driver);

		action2.moveToElement(textBox)
		.keyDown(textBox, Keys.SHIFT)
		.sendKeys(textBox, "books")
		.keyUp(textBox, Keys.SHIFT)
		.build().perform();

//		Actions action3 = new Actions(driver);
//
//		action3.moveToElement(textBox)
//		.keyDown(textBox, Keys.SHIFT)
		//.sendKeys(textBox, "books")
//		.keyUp(textBox, Keys.SHIFT).build().perform();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			// driver.close();
		
		
		}		
}
}
