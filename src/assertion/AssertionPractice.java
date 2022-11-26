package assertion;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionPractice {

		public static void main(String[] args ) {
	
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement number = driver.findElement(By.xpath("//option[@value='13']"));
		String temp =number.getText();
		
		int actualNumber= Integer.parseInt(temp);
		
		int expectedNumber=13;
		
		Assert.assertEquals(actualNumber, expectedNumber);
		
		ArrayList<Integer>list1=new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
			
		ArrayList<Integer>list2=new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		Assert.assertEquals(list1, list2);
		
	    System.out.println("the list are not printing");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();
		
		
		
}
}
