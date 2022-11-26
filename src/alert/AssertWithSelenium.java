package alert;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AssertWithSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
		
		WebElement uiText= driver.findElement(By.tagName("h2"));
		String actualText=uiText.getText();
		///System.out.println(actualText);
	String expectedText="Connect with friends and the world around you on Facebook.";		
	Assert.assertEquals(expectedText, actualText);
		
		System.out.println("Next step after the assertion");
		
		driver.findElement (By.linkText("Create new account")).click();
		
	if (actualText.equals(expectedText)) {		
		System.out.println("They are equal");
		
	}else {
		System.out.println("They are not equal");
	}
}

}
