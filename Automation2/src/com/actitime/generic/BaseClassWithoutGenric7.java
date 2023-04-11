package com.actitime.generic;

/*This below is base class for login into actitime without generic library */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassWithoutGenric7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("OpenBrowser",true);
		driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser(){
		Reporter.log("CloseBrowser",true);
		driver.close();
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException {
		Reporter.log("Login",true);
		FileInputStream fis=new FileInputStream("./data/PropertiFile.txt");
		Properties p=new Properties();
		p.load(fis);
		String URL = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		
		driver.get(URL);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout",true);
		driver.findElement(By.id("logoutLink")).click();
	}
}