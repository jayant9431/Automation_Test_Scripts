/*WAS to understand the concept of Annotations*/
package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation5 {

	@BeforeMethod
	public void login() { //1st 4th
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() { //3rd 6th
		Reporter.log("logout",true);
	}
	
	@Test
	public void createCustomer() { //2nd
		Reporter.log("createCustomer",true);
	}
	
	@Test
	public void modifyCustomer() { //5th
		Reporter.log("modifyCustomer",true);
	}
}
