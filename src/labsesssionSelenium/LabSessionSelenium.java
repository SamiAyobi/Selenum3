package labsesssionSelenium;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import methods.UtilityCLassSelenium;


public class LabSessionSelenium extends UtilityCLassSelenium  {

	public static void main(String[] args) {

//the first line in our selenium class should be 
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
////we use interface reference for create object of ChromeDriver
WebDriver driver1=new ChromeDriver();
driver1.manage().window().maximize();
driver1.get("https://www.facebook.com/");
driver1.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
///launchUrl("https://www.facebook.com/");
hardWait(1000);
		
driver1.close();
		


	

}

}
