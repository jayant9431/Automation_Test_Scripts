/*WAS for login into actitime using POM class*/
package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLogin22 {

//	from line 12 to 19 Declaration
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtn;
	
//	Initialization
	public PomLogin22(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//	utilization
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}
}