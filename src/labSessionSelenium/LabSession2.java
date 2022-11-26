package labSessionSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabSession2 {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver" , ".\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		List<WebElement> country=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td[3]"));
		for (int i=0; i<country.size(); i++) {
	if (country.get(i).getTagName().equals("Canada")) {
		System.out.println(country.get(i).getTagName());
//			}
//		}else {
//			
//		}
		

	}	
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();
	
	
	}		
}
}
