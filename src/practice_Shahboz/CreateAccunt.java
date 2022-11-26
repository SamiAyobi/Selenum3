package practice_Shahboz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccunt {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


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
		
		System.out.println("This website is "+ driver.getTitle());
	
		WebElement SinginButton= driver.findElement(By.xpath("//span[@class='css-1gqkvvw e65zztl0' ]"));
		SinginButton.click();
		SinginButton.click();
		System.out.println("Singing "+ SinginButton.getText());
		
		WebElement createAcc = driver.findElement(By.xpath("//button[@data-at='create_account_button']"));
		createAcc.click();
		
		WebElement Fname=driver.findElement(By.xpath("//input[@autocomplete='given-name']"));
		Fname.sendKeys("Sami");
		System.out.println("First Name is "+Fname.getText() );
		
		WebElement lName=driver.findElement(By.xpath("//input[@autocomplete='family-name']"));
	    lName.sendKeys("Ayobi");
	    System.out.println("Last Name"+ lName.getText());
		    
		WebElement email = driver.findElement(By.xpath("//input[@type='email' and @name='username']"));
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Email");
		String emailInput = input.nextLine();
		email.sendKeys(emailInput);
		System.out.println("Email: " + emailInput);
		
		WebElement pass=driver.findElement(By.xpath("//input[@autocomplete ='new-password']"));
		pass.sendKeys("sami123");
		System.out.println("Password is"+ pass.getText());
		
		
		WebElement Phone=driver.findElement(By.xpath("//input[@autocomplete='tel']"));
		Phone.sendKeys("858-568-1635");
		System.out.println("Phone number is"+ Phone.getText());
				
		WebElement zipcode= driver.findElement(By.xpath("//input[@autocomplete='postal-code']"));
		zipcode.sendKeys("92123");
		System.out.println("Zipcode is"+ zipcode.getText());
		WebElement checkbox= driver.findElement(By.xpath("//div [@class='css-lbyitw Checkbox-box']"));
		checkbox.click();
		System.out.println("Checkbox Selected? T/F: " + checkbox.isEnabled());
		
		WebElement monthDrop = driver.findElement(By.xpath("//select[@autocomplete='bday-month']"));
		Select selectMonth = new Select(monthDrop);	
		selectMonth.selectByVisibleText("August");
		WebElement selectedMonth = selectMonth.getFirstSelectedOption();
		System.out.println("Selected Month: " + selectedMonth.getText());
		WebElement dayDrop = driver.findElement(By.xpath("//select[@autocomplete='bday-day' ]"));
		Select selectDay = new Select(dayDrop);
		selectDay.selectByValue("8");
		WebElement selectedDay = selectDay.getFirstSelectedOption();
		System.out.println("Selected day: "+ selectedDay.getText());
		WebElement JoinNow = driver.findElement(By.xpath("//button[@type ='submit' and @ data-at= 'join_now']"));
		JoinNow.click();
		
		
		
		
		
		
		
		
		//Select.
		
		
		Thread.sleep(2000);
	    driver.close();
		
		
		
}

}
