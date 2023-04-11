/*WAS to understand the concept of SoftAssert class*/
package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion4 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		String eTitle="Soogle";
		String aTitle=driver.getTitle();
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(aTitle, eTitle);
		
		driver.close();
		
	//	when we use SoftAssert class then we have to use this below statement
		s.assertAll();
	}
}
