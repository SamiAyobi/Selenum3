package lauchBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws Throwable {
		

//Initialize ChromeDriver		
System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
///Open Chrome  //create object of Webdriver class using constructor
WebDriver driver1 =new ChromeDriver();
//driver=new EdgeDriver();
//driver=new FirefoxDriver();
//full screen / maximize window
driver1.manage().window().maximize();
//Go to Apple.com
driver1.get("https://www.apple.com/");
//DOM; Dom stands for Document Object Model
//String name="Sami Ayobi";
//name.subSequence(4,8);
//System.out.println(name);
//web element is 
Thread.sleep(2000);
WebElement text= driver1.findElement(By.xpath ("//a[@id='ac-gn-link-search']"));
System.out.println(text.getText());
text.click();
Thread.sleep(5000);




System.out.println("robot works fine");






}

}
