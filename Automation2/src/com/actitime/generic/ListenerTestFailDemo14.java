package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ListenerTestFailDemo14 extends ListenerImplementation13 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
	@Test
	public void createCustomer() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Reporter.log("customer created.",true);
		Assert.fail();
	}

	@Test
	public void editCustomer() {
		Reporter.log("customer edited.",true);
		//Assert.fail();
	}

}

