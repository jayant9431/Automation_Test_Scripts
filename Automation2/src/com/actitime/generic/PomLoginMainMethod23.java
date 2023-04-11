/*WAS to pass different un and pwd for login into actitime through
 * POM class so that we can remove StaleElementReference Exception*/
package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PomLoginMainMethod23 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@Test
	public void validLogin() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/");
		PomLogin22 plg=new PomLogin22(driver);
	//	tring to login by entering wrong username and password
		plg.setLogin("admin1", "manager1");
		Thread.sleep(2000);
	//	tring to login by entering right username and password
		plg.setLogin("admin", "manager");
		Thread.sleep(6000);
		
		driver.close();
	}
	
}
