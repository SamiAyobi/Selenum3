package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegate {

	public static void main(String[] args) throws Throwable {
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");	
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
///page wait load time
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//page wait elements of the browser
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//tagename
WebElement element1 =driver.findElement(By.tagName("h2"));
//System.out.println(element1.getText());
//link Text
//WebElement element2= driver.findElement(By.tagName("button"));
//element2.click();
//WebElement element3= driver.findElement(By.linkText("Creat new account"));
//element3.click();
//pritn all the links
List<WebElement> allLinks= driver.findElements(By.xpath("//a"));
for (int i=0; i<allLinks.size(); i++) {
	System.out.println(allLinks.get(i).getText());
}

Thread.sleep(2000);
driver.close();

}

}
