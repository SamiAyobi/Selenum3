package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWIthText {

	public static void main(String[] args) throws Throwable  {
	
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
				
		WebElement iframe1= driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframe1);
	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() ='Try it']")).click();
	Thread.sleep(2000);
	    Alert alert=driver.switchTo().alert();
		alert.sendKeys("Tekschool");
		Thread.sleep(2000);
		alert.accept();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
		
}

}
