package findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

public static void main(String[] args) throws Throwable {
//intstintiate our web driver 
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
///create an object of ChromDrive which is a class here
WebDriver driver=new ChromeDriver();
//call the get method to open our URL with driver.get
driver.get("https://www.facebook.com/");
// the page basically is min but we call the (Manage) menthod to maximize it.
driver.manage().window().maximize();
//wait time for the page to load
driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
//wait time for the elements to load
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//System.out.println(driver.getCurrentUrl());
//System.out.println(driver.getTitle());
//Selenium thinks that the driver is inoccent and created the method of wait which allows the web page 
WebElement element =driver.findElement(By.name("login"));
System.out.println(element.getAttribute("name"));
WebElement element1=driver.findElement(By.linkText("Create new account"));

System.out.println(element1.getAttribute("role"));
System.out.println(element1.getCssValue("background-color"));
System.out.println(element1.getCssValue ("width"));
System.out.println(element1.getLocation());
System.out.println(element1.getRect());

///Rectangle
Rectangle rect= element1.getRect();
System.out.println("Heght:="+ rect.getHeight());
System.out.println("width:="+ rect.getWidth());
System.out.println("X: =" + rect.getX());
System.out.println("Y:=" + rect.getY());

Thread.sleep(2000);
driver.close();
	


	
	

		
}
}
