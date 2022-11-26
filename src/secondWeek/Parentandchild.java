package secondWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentandchild {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver" , ".\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://tek-school.com/retail/index.php?route=account/register");
	    driver.manage().window().maximize();
	    WebElement CheckBox= driver.findElement(By.xpath("//input[@name='agree']"));
	   
	    
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
}
}
