package alert;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWIthOK {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		WebElement iframe1= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe1);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text() ='Try it']")).click();
		
		Alert alert1= driver.switchTo().alert();
		
	///alert1.accept();
		alert1.dismiss();
		Thread.sleep(2000);
	//bellow line of code will bring you back to the main web page
	driver.switchTo().defaultContent();
	
	driver.findElement(By.id("runbtn")).click();
		
		
		
		//Thread.sleep(2000);
		
		
}

}
