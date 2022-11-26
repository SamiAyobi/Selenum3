package practiceShabozSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeSeleniumShaboz {

	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver" , ".\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
	    WebElement dropdown=driver.findElement(By.xpath("//button[text()='Dropdown']"));
	    dropdown.click();
	    
	    WebElement dropdownfacebook=driver.findElement(By.xpath("//a[text()='Facebook']"));
	    dropdownfacebook.click();
	    
	    WebDriverWait wait=new WebDriverWait(driver,10);
	    
	    wait.until(ExpectedConditions.visibilityOf(dropdownfacebook));
	    Thread.sleep(1000);
	    dropdownfacebook.click();

//		
//	    wait.until(ExpectedConditions.visibilityOf(text));
//			System.out.println(text.getText());
//        Thread.sleep(1000);
driver.close();
//	

		
}
}
