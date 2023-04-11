/*WAS for Executing class for actitime using encapsulation*/
package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EncapMainMethod18 {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		EncapLoginPage17 elp=new EncapLoginPage17(driver);
		Thread.sleep(2000);
		elp.setUserName("admin");
		Thread.sleep(2000);
		elp.setPassword("manager");
		Thread.sleep(2000);
		elp.clickOnLogin();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));
		driver.close();
		
	}
}
