package lauchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;


public class LaunchChromeBrowse1 {

	public static void main(String[] args) throws Throwable  {
//grab the robot		
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
///turned it on//creat object and instance of the method
WebDriver driver=new ChromeDriver();
//driver=new EdgeDriver();
//driver=new FirefoxDriver();
//ask the robot to go to the following website
driver.get("https://www.facebook.com/");
//full screent
driver.manage().window().maximize();
//DOM; Dom stands for Document Object Model
//web elecement is 
WebElement text= driver.findElement(By.xpath ( " //a[text()='Create new account']"));
System.out.println(text.getText());
Thread.sleep(3000);
text.click();
Thread.sleep(5000);
driver.close();
System.out.println("robot works fine");



		
}

}
