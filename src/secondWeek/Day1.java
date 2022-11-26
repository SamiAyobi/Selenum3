package secondWeek;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) throws Throwable {
	
			
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement signUpButton = driver.findElement(By.xpath("//span[text()='Sign up with phone or email']"));
		signUpButton.click();
		WebElement firstNameField = driver.findElement(By.xpath("//input[@autocomplete='name']"));
		firstNameField.sendKeys("Tek School");
		WebElement phoneField = driver.findElement(By.xpath("//input[@name='phone_number']"));
		phoneField.sendKeys("4045536624");
		WebElement monthDropdown = driver.findElement(By.xpath("//*[@id=\"SELECTOR_1\"]/option[4]"));
		monthDropdown.click();
		WebElement dayDropdown = driver.findElement(By.xpath("//*[@id='SELECTOR_2']/option[25]"));
		dayDropdown.click();
		WebElement yearDropdown = driver.findElement(By.xpath("//*[@id='SELECTOR_3']/option[24]"));
		yearDropdown.click();
		Thread.sleep(1000);
		WebElement nextButton = driver.findElement(By.xpath("//span[text()='Next']"));
		nextButton.click();
		Thread.sleep(1000);
		WebElement nextButton2 = driver.findElement(By.xpath("//span[text()='Next']"));
		nextButton2.click();
		WebElement signUpButton2 = driver.findElement(By.xpath("//span[text()='Sign up']"));
		signUpButton2.click();
		WebElement okButton = driver.findElement(By.xpath("//span[text()='OK']"));
		okButton.click();
		Thread.sleep(2000);
		WebElement verificationCodeField = driver.findElement(By.xpath("//input[@name='verfication_code']"));
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Verification Code.");
		String scanResponse;
		scanResponse = scan.nextLine();
		verificationCodeField.sendKeys(scanResponse);
		Thread.sleep(1000);
		
		WebElement nextButton3 = driver.findElement(By.xpath("//span[text()='Next']"));
		nextButton3.click();
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Selenium_123$");
		WebElement nextButton4 = driver.findElement(By.xpath("//span[text()='Next']"));
		Thread.sleep(1000);
		nextButton4.click();

	
		
	
		
	}

}
