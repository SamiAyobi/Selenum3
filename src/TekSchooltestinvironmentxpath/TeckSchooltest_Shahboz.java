package TekSchooltestinvironmentxpath;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

public class TeckSchooltest_Shahboz {

	public static void main(String[] args) {
		

		// Create prefs map to store all preferences
		Map<String, Object> prefs = new HashMap<String, Object>();
		// add key and value to map as follows to switch off browser notifications
		// Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);
		// Create an instance of ChromeOptions
		ChromeOptions options = new ChromeOptions();
		// set ExperimentalOption - prefs
		options.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("Page Title: " + driver.getTitle());
		
		/////////////////////////////////////////////////////////////////////////////////////////////////
		
		//currency selector
		WebElement currency = driver.findElement(By.xpath("//span[text()='Currency']"));
		WebElement phone = driver.findElement(By.xpath("//span[text()='123456789']"));
		WebElement myAcc = driver.findElement(By.xpath("//span[text()='My Account']"));
		WebElement wishList = driver.findElement(By.xpath("//span[text()='Wish List (0)']"));
		WebElement shopingCart = driver.findElement(By.xpath("//span[text()='Shopping Cart']"));
		WebElement checkOut = driver.findElement(By.xpath("//span[text()='Checkout']"));
		WebElement centerBanner = driver.findElement(By.xpath("//div[@class='swiper-slide text-center swiper-slide-duplicate swiper-slide-active']"));
		WebElement aboutUs = driver.findElement(By.xpath("//a[text()='About Us']"));
		WebElement dlvInfo = driver.findElement(By.xpath("//a[text()='Delivery Information']"));
		WebElement prvcyPol = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		WebElement trmsCond = driver.findElement(By.xpath("//a[text()='Terms & Conditions']"));
		WebElement contactUs = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		WebElement returns = driver.findElement(By.xpath("//a[text()='Returns']"));
		WebElement siteMap = driver.findElement(By.xpath("//a[text()='Site Map']"));
		WebElement brands = driver.findElement(By.xpath("//a[text()='Site Map']"));
		WebElement giftCert = driver.findElement(By.xpath("//a[text()='Site Map']"));
		WebElement affiliate = driver.findElement(By.xpath("//a[text()='Site Map']"));
		WebElement specials = driver.findElement(By.xpath("//a[text()='Specials']"));
		WebElement poweredBy = driver.findElement(By.xpath("//a[@href='http://www.opencart.com']"));

		
		//////////////////////////////////////////////////////////////////////////////////////////////////

		//Shahboz
		
		WebElement testEnvironmentText = driver.findElement(By.xpath("//a[text()='TEST ENVIRONMENT']"));
		WebElement searchBar = driver.findElement(By.xpath("//input[@name='search']"));
		WebElement submitSearch = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		WebElement cart = driver.findElement(By.xpath("//button[@data-loading-text='Loading...']"));
		//Blue Navigation Bar
		//Desktops dropdown
		WebElement deskDrop = driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement pc = driver.findElement(By.xpath("//a[text()='PC (0)']"));
		WebElement mac = driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		WebElement showAll = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
		//Laptops & Notebooks dropdown
		WebElement laptopNotebookDrop = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		WebElement macs = driver.findElement(By.xpath("//a[text()='Macs (0)']"));
		WebElement windows = driver.findElement(By.xpath("//a[text()='Windows (0)']"));
		WebElement allLaptopNotebook = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
		//Components dropdown
		WebElement componentsDrop = driver.findElement(By.xpath("//a[text()='Components']"));
		WebElement miceTrackballs = driver.findElement(By.xpath("//a[text()='Mice and Trackballs (0)']"));
		WebElement monitors = driver.findElement(By.xpath("//a[text()='Monitors (2)']"));
		WebElement printers = driver.findElement(By.xpath("//a[text()='Printers (0)']"));
		WebElement scanners = driver.findElement(By.xpath("//a[text()='Scanners (0)']"));
		WebElement webCameras = driver.findElement(By.xpath("//a[text()='Web Cameras (0)']"));
		WebElement allComponents = driver.findElement(By.xpath("//a[text()='Show All Components']"));
		//button that takes you to tablets page
		WebElement tabletsPage = driver.findElement(By.xpath("//a[text()='Tablets']"));
		//button that takes you to software page
		WebElement software = driver.findElement(By.xpath("//a[text()='Software']"));
		//button that takes you to Phones and PDAs page
		WebElement phonePDAs = driver.findElement(By.xpath("//a[text()='Phones & PDAs']"));
		//cameras dropdown
		WebElement cameras = driver.findElement(By.xpath("//a[text()='Cameras']"));
		WebElement cannon = driver.findElement(By.xpath("//a[text()='Canon (1)']"));
		WebElement nikon = driver.findElement(By.xpath("//a[text()='Nikon (1)']"));
		WebElement allcameras = driver.findElement(By.xpath("//a[text()='Show All Cameras']"));
		//MP3 Players dropdown
		WebElement mp3PlayersDrop = driver.findElement(By.xpath("//a[text()='MP3 Players']"));
		WebElement test11 = driver.findElement(By.xpath("//a[text()='test 11 (0)']"));
		WebElement test12 = driver.findElement(By.xpath("//a[text()='test 12 (0)']"));
		WebElement test15 = driver.findElement(By.xpath("//a[text()='test 15 (0)']"));
		WebElement test16 = driver.findElement(By.xpath("//a[text()='test 16 (0)']"));
		WebElement test17 = driver.findElement(By.xpath("//a[text()='test 17 (0)']"));
		WebElement test18 = driver.findElement(By.xpath("//a[text()='test 18 (0)']"));
		WebElement test19 = driver.findElement(By.xpath("//a[text()='test 19 (0)']"));
		WebElement test20 = driver.findElement(By.xpath("//a[text()='test 20 (0)']"));
		WebElement test21 = driver.findElement(By.xpath("//a[text()='test 21 (0)']"));
		WebElement test22 = driver.findElement(By.xpath("//a[text()='test 22 (0)']"));
		WebElement test23 = driver.findElement(By.xpath("//a[text()='test 23 (0)']"));
		WebElement test24 = driver.findElement(By.xpath("//a[text()='test 24 (0)']"));
		WebElement test4 = driver.findElement(By.xpath("//a[text()='test 4 (0)']"));
		WebElement test5 = driver.findElement(By.xpath("//a[text()='test 5 (0)']"));
		WebElement test6 = driver.findElement(By.xpath("//a[text()='test 6 (0)']"));
		WebElement test7 = driver.findElement(By.xpath("//a[text()='test 7 (0)']"));
		WebElement test8 = driver.findElement(By.xpath("//a[text()='test 8 (0)']"));
		WebElement test9 = driver.findElement(By.xpath("//a[text()='test 9 (0)']"));
		WebElement showAllp3Players = driver.findElement(By.xpath("//a[text()='Show All MP3 Players']"));
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		
		///sami
		
		//Featured items
		WebElement macBook = driver.findElement(By.xpath("//a[text ()='MacBook']"));
		WebElement iphone = driver.findElement(By.xpath("//a[text () = 'iPhone']"));
		WebElement appleCinema = driver.findElement(By.xpath("//img[@alt='Apple Cinema 30\"']"));
		WebElement canonCamera = driver.findElement(By.xpath("a[text () = 'Canon EOS 5D Camera]"));
		//bottom of page links
		WebElement myAccount = driver.findElement(By.xpath("//h5 [text () ='My Account']"));
		WebElement orderHistory = driver.findElement(By.xpath("//a [text () ='Order History']"));
		WebElement wishLst = driver.findElement(By.xpath("//a [text () ='Wish List']"));
		WebElement newsletter = driver.findElement(By.xpath(" //a[text() ='Newsletter']"));
		//Slider Images
		WebElement redbull = driver.findElement(By.id("//*[@id='carousel0']/div/div[7]/img"));
		WebElement starbucks = driver.findElement(By.id("//*[@id='carousel0']/div/div[15]/img"));
		WebElement bugerKing = driver.findElement(By.id("//*[@id='carousel0']/div/div[10]/img "));
		WebElement harleyDavidson = driver.findElement(By.id("//*[@id='carousel0']/div/div[12]/img "));
		WebElement disney = driver.findElement(By.id("//*[@id='carousel0']/div/div[14]/img "));
		WebElement dell = driver.findElement(By.id(" //*[@id='carousel0']/div/div[13]/img"));
		WebElement nintendo = driver.findElement(By.id("//*[@id='carousel0']/div/div[16]/img "));
		WebElement nfl = driver.findElement(By.id("//*[@id='carousel0']/div/div[17]/img "));
		WebElement canon = driver.findElement(By.id("//*[@id='carousel0']/div/div[11]/img"));
		
		
}
}
