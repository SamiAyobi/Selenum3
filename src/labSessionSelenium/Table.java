package labSessionSelenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Table {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver" , ".\\\\drivers\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement CreateAcount=driver.findElement(By.linkText("Create new account"));
		CreateAcount.click();
		
		String monthText="May";
		String dayText="13";
		String yearText="2022";
		
		WebElement months=driver.findElement(By.id("month"));
		Select selectM=new Select(months);
		selectM.selectByVisibleText(monthText);
		
		WebElement day=driver.findElement(By.id("day"));
		Select selectD=new Select(day);
		selectD.selectByVisibleText(dayText);
		
		WebElement year=driver.findElement(By.id("year"));
		Select selectY=new Select(year);
		selectY.selectByVisibleText(yearText);
		   
		     
try {
	Thread.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.close();

	
		
 		
}
}
