/*WAS for Base class.
 * we should define all the method which we have to reuse*/ 
package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassWithGeneric10 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser(){
		Reporter.log("CloseBrowser",true);
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("Login",true);
		driver.get("https://demo.actitime.com/");
		BaseClassGenericLibrary9 bcgl=new BaseClassGenericLibrary9();
		driver.findElement(By.id("username")).sendKeys(bcgl.getPropertyData("username"));
		driver.findElement(By.name("pwd")).sendKeys(bcgl.getPropertyData("password"));
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
}
