package practice_Shahboz;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pref {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		// Create prefs map to store all preferences
		Map<String, Object> prefs = new HashMap<String, Object>();
		// add key and value to map as follows to switch off browser notification
		// Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);
		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();
		// set ExperimentalOption - prefs
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.sephora.com/");
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println("This Website Title is : " + driver.getTitle());
		Thread.sleep(2000);
		
		WebElement signInButton = driver.findElement(By.xpath("//span[@data-at='sign_in_header']"));
		signInButton.click();
		signInButton.click();
//		Actions act = new Actions(driver);
//		act.moveToElement(signInButton);
//		act.doubleClick(signInButton);
		Thread.sleep(2000);
		
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		WebElement createAcc = driver.findElement(By.xpath("//button[@data-at='create_account_button']"));
		createAcc.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@autocomplete='given-name']"));
		firstName.sendKeys("Sinoreh");
		WebElement lastName = driver.findElement(By.xpath("//input[@autocomplete='family-name' and @name='lastName']"));
		lastName.sendKeys("Daryadell");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email' and @name='username']"));
		email.sendKeys("sdaryadell@yahoo.com");
		WebElement password = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		password.sendKeys("hello1234");
		WebElement phoneNumber = driver.findElement(By.xpath("//input[@autocomplete='tel']"));
		phoneNumber.sendKeys("2408883156");
		WebElement zipCode = driver.findElement(By.xpath("//input[@autocomplete='postal-code']"));
		zipCode.sendKeys("69696");
		WebElement checkbox = driver.findElement(By.xpath("//div[@class='css-lbyitw Checkbox-box']"));
		checkbox.click();
		
		//Dropdown selections for month and day
		WebElement monthDrop = driver.findElement(By.xpath("//select[@autocomplete='bday-month']"));
		Select selectMonth = new Select(monthDrop);
		
		selectMonth.selectByVisibleText("March");
		
		WebElement dayDrop = driver.findElement(By.xpath("//select[@autocomplete='bday-day']"));
		Select selectDay = new Select(dayDrop);
		selectDay.selectByValue("29");
		
		WebElement joinButton = driver.findElement(By.xpath("//button[@type='submit' and @data-at='join_now']"));
		joinButton.click();
		Thread.sleep(2000);
		//driver.close();
	}

}
