package secondWeek;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathXmlpractice {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://tek-school.com/retail/");
driver.manage().window().maximize();
driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
WebElement Myaccount= driver.findElement(By.xpath("//span[text() = 'My Account']"));		
Myaccount.click();	
//Thread.sleep(1000);
WebElement Register= driver.findElement(By.linkText("Register"));	
Register.click();
//Thread.sleep(1000);
WebElement FirstName= driver.findElement(By.xpath("//input[contains (@ id,'firstname')]"));	
FirstName.sendKeys("Sami");
//Thread.sleep(1000);
WebElement LastName= driver.findElement(By.xpath("//*[@type ='text' and @id='input-lastname']"));	
LastName.sendKeys("Ayobi");
//Thread.sleep(1000);
WebElement Email= driver.findElement(By.xpath("//input [@ name='email' or @class='from-control']"));	
Email.sendKeys("sami2.prt@gmail.com");
//Thread.sleep(1000);
WebElement Phone= driver.findElement(By.xpath("//*[@ name ='telephone' or @id ='input-telephone']"));	
Phone.sendKeys("858-5681635");
//Thread.sleep(1000);
WebElement Password= driver.findElement(By.xpath("//input[@id='input-password']"));	
Password.sendKeys("Deerjan1");
//Thread.sleep(1000);
WebElement Confirmpass= driver.findElement(By.xpath("//input[@class='form-control' and @id ='input-confirm']"));	
Confirmpass.sendKeys("Deerjan1");
//Thread.sleep(1000);
WebElement Newsletter= driver.findElement(By.xpath("//label[@class= 'radio-inline']//child::input[@value='1']"));	
Newsletter.click();
//Thread.sleep(1000);
WebElement PrivacyPolicy= driver.findElement(By.xpath("//input [@type='checkbox' and @name='agree']"));	
PrivacyPolicy.click();
//Thread.sleep(1000);
WebElement Continue= driver.findElement(By.xpath("//*[ @type='submit' or @class= 'btn btn-primary']"));	
Continue.click();



WebElement congMessage= driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']"));	


String successMessg="Congratulations! Your new account has been successfully created!";
if (successMessg.equals(congMessage.getText())){
System.out.println("Congratulations! Your new account has been successfully created!");
} 
else  {

	System.out.println("Sucess Message not displayed, Test Failed!");
}





}

}
