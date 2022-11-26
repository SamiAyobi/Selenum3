import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumShahboz1 {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver1 =new ChromeDriver();
		driver1.manage().window().maximize();
		Thread.sleep(2000);// get method is to get you to the web page
		driver1.get("https://www.softwaretestingmaterial.com/");
//		//driver1.get("https://www.apple.com/");
//		driver1.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);///
//		driver1.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		
//		WebElement text= driver1.findElement(By.xpath ("//*[@id=\"menu-item-4335\"]/a"));
//		System.out.println(text.getText());
//		text.click();
//		Thread.sleep(5000);
//		driver1.close();
//		System.out.println("The robot works fine");
//
//		
		

}

}
