package secondWeek;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import methods.UtilityCLassSelenium;

public class Method_Practice extends UtilityCLassSelenium{

	public static void main(String[] args) throws Throwable {

//instantiation
System.setProperty("webdriver.chrome.driver" , ".\\\\drivers\\\\chromedriver.exe");
////constructore of copy or object of the class
WebDriver driver=new ChromeDriver();
driver.get ("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
WebElement element1=driver.findElement(By.id("pass"));
//String passwordPart1="123411111111111";
//String passowrdPart2="Samiaaaaaaaaaaaaaa";
String []password= {"12345678", "SamiAyobi"};
element1.sendKeys(password);

WebElement element2=driver.findElement(By.name("login"));
System.out.println(element1.getAttribute("name"));
WebElement element3=driver.findElement(By.linkText("Create new account"));
System.out.println(element3.getAttribute("role"));


//element1.clear();

String currentUrl=driver.getCurrentUrl();
System.out.println(currentUrl);
//System.out.println(driver.getTitle());
//driver.navigate().to("https://www.google.com");
//driver.navigate().back();
//driver.navigate().refresh();
//driver.navigate().forward();
Thread.sleep(2000);

System.out.println("Life is beautifull");
driver.close();



}
}
