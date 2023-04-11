package com.actitime.generic;

/*WAS for Manipulating class for actitime using encapsulation*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EncapLoginPage17 {

	private WebElement untbx;	// Declaring
	private WebElement pwtbx;
	private WebElement lgbtn;
	
	public EncapLoginPage17(WebDriver driver) {
		untbx=driver.findElement(By.id("username")); // Initialization
		pwtbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	
	public  void setUserName(String un) {
		untbx.sendKeys(un);	// Utilization
	}
	
	public void setPassword(String pwd) {
		pwtbx.sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		lgbtn.click();
	}
}
