package TekSchooltestinvironmentxpath;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TekSchoolTestInvironment {

	public static void main(String[] args) {
		

		// Create prefs map to store all preferences
		Map<String, Object> prefs = new HashMap<String, Object>();
		// add key and value to map as follows to switch off browser notifications
		// Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);
		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();
		// set ExperimentalOption - prefs
		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		System.out.println("pagetitle:"+ driver.getTitle());	
		//Home page xpaths
		WebElement currency = driver.findElement(By.xpath("//span[@class='hidden-xs hidden-sm hidden-md'][text()='Currency']"));
		WebElement phone =driver.findElement(By.xpath("//span [ text() ='123456789']"));
		WebElement myAccount = driver.findElement(By.xpath("//span[@class ='hidden-xs hidden-sm hidden-md ' or text () ='My Account']"));
		WebElement wishList = driver.findElement(By.xpath("//span[@class = 'hidden-xs hidden-sm hidden-md' and text () = 'Wish List (0)']"));
		WebElement shopingCart = driver.findElement(By.xpath("//span[@ class = 'hidden-xs hidden-sm hidden-md' and text() = 'Shopping Cart']"));
		WebElement checkOut = driver.findElement(By.xpath("//span[text() = 'Checkout']"));
		WebElement topbanner= driver.findElement(By.id("//nav[@id='top']"));
		WebElement testEnvironment = driver.findElement(By.xpath("//a[@href='http://tek-school.com/retail/index.php?route=common/home' or text()='TEST ENVIRONMENT']"));
		WebElement search = driver.findElement(By.xpath("//input [@name='search' and @type='text']"));
		WebElement serachMagnifier = driver.findElement(By.xpath("//button[@class = 'btn btn-default btn-lg']"));
		
	
		
		
}

}
