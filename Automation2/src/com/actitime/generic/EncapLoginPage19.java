package com.actitime.generic;

/*WAS for Manipulating class for actitime using encapsulation and make only one method for arguments */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EncapLoginPage19 {
	
	private WebElement untbx;
	private WebElement pwtbx;
	private WebElement lgbtn;
	
	public EncapLoginPage19(WebDriver driver) {
		untbx=driver.findElement(By.id("username"));
		pwtbx=driver.findElement(By.name("pwd"));
		lgbtn=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
}
