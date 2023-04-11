/*WAS to understand the concept of hard Assert (Assert is a class)*/
package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void verifyTitle() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String eTitle="Soogle";
		String aTitle=driver.getTitle();
		
		// if any statement after this statement then it will not execute
		// bcz it is hard Assert comparison
		Assert.assertEquals(aTitle, eTitle);
		
		driver.close();
	}
	
}
