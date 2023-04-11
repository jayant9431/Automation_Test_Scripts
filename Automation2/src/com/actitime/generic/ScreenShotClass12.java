package com.actitime.generic;
/*WAS to take screenshot */
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShotClass12 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	@Test
	public void screenShot() throws IOException {
		WebDriver driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
	//	Typecasting from WebDriver to TakesScreenshot
		TakesScreenshot t= (TakesScreenshot) driver;
		
	//	Pressing the print screen button
		File source=t.getScreenshotAs(OutputType.FILE);
		
	//	create an empty file in the below path		
		File destination=new File("./ScreenShot/ss.png");
		
	//	copy and paste the screenshot from source to destination
		FileUtils.copyFile(source, destination);
		
		driver.close();
	}
}