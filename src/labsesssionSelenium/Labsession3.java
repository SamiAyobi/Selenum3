package labsesssionSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Labsession3   {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		WebElement userName=driver.findElement(By.cssSelector("email"));
		
//		WebElement createNA=driver.findElement(By.cssSelector("//a[text()='Create new account']"));
		Thread.sleep(2000);
		WebElement createNA = driver.findElement(By.xpath("//a[text()='Create new account']"));
	
		

	}

}
