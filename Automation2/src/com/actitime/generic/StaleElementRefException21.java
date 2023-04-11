/*WAS to understand why StaleElementReferanceException occur.
 * ANS : because address of the element will be change after 
 * 		 refresh(if we enter wrong un and pwd) but ref. variable 
 * 		 will be holding the old address hence we get this exception*/
package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException21 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		driver.get("https://demo.actitime.com/");
		EncapLoginPage19 ep=new EncapLoginPage19(driver);
		ep.setLogin("admin1", "manager1");
		Thread.sleep(2000);
		ep.setLogin("admin", "manager");
		
	/* we can also see the example of this Exception like 
	 * below if we don't use the concept of encapsulation
	 * from line 25.
	 * 	WebElement untbx = driver.findElement(By.id("username"));
		driver.navigate().refresh();
		untbx.sendKeys("admin");*/
		
		driver.close();
	}

}









