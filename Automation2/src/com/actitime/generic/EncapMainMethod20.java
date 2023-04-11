package com.actitime.generic;

/*WAS for Executing class for actitime using encapsulation*/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EncapMainMethod20 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		EncapLoginPage19 ep=new EncapLoginPage19(driver);
		ep.setLogin("admin", "manager");
				
		driver.close();
	}

}
