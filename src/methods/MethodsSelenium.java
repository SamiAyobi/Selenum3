package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsSelenium {
public static void main(String[] args) throws Throwable {

System.setProperty("webdriver.chrome.driver" , ".\\\\drivers\\\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://tek-school.com/retail/");
driver.manage().window().maximize();
WebElement element=driver.findElement(By.xpath("//*[@id=\"nav-signin-tooltip\"]/a/span"));		
element.click();
WebElement element1=driver.findElement(By.id("ap_email"));		
element1.click();
element1.sendKeys("sami.prt@gmail.com");
		
WebElement element2=driver.findElement(By.id("continue"));			
element2.click();

WebElement element3=driver.findElement(By.id("ap_password"));
element3.click();
element3.sendKeys("Deerjan1");

WebElement element4=driver.findElement(By.id("signInSubmit"));
element4.click();

WebElement element5=driver.findElement(By.id("\"nav-search-submit-button;"));

element5.click();
	
		
//		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
//		WebDriver driver1 =new ChromeDriver();
//		driver1.manage().window().maximize();
//		driver1.get("https://www.facebook.com/");
//		driver1.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
//		driver1.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS); 
		//		//getCurrent URL will get the url of the website at the consul
//		System.out.println(driver1.getCurrentUrl());
//		//this method will get us the title of the page
//		System.out.println(driver1.getTitle());
//		//getPageSource()
//        //system.out.println(driver1.getPageSource());
//		//driver1.navigate().to("https://www.google.com");
//		//driver1.navigate().to ("https://www.google.com/");
//		Thread.sleep(2000);
//		driver1.navigate().back();
//		driver1.navigate().forward();
//		driver1.navigate().refresh();
//		Thread.sleep(2000);
      //driver1.close();
	///driver1.quit(); quit all the windows by selenium
		
}

}
