package methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityCLassSelenium {

public static void hardWait(int timeunit) {
	
	try {
		Thread.sleep(timeunit);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
}
}
public static void launchUrl(String url) {
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.get(url);
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}
}
