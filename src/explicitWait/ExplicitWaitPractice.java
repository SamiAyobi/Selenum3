package explicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {

	public static void main(String[] args) throws Throwable {
	
		System.setProperty("webdriver.chrome.driver" , ".\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://shop.demoqa.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement text=driver.findElement(By.xpath("//div[@id='slide-6-layer-4']"));
	    System.out.println(text.getText());
		wait.until(ExpectedConditions.visibilityOf(text));
		
		    
        Thread.sleep(2000); 
		driver.close();
	
}

}
