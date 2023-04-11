/*WAS to understand the concept of Annotations*/
package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation6 {

	@BeforeClass
	public void openBrowser() {	// 1st
		Reporter.log("openBrowser",true);
	}
	
	@AfterClass
	public void closeBrowser() { // 14th
		Reporter.log("closeBrowser",true);
	}
	
	@BeforeMethod
	public void login() {	//2nd 5th 8th //11th
		Reporter.log("login",true);
	}
	
	@AfterMethod
	public void logout() {	//4th 7th 10th 13th
		Reporter.log("logout",true);
	}
	
	@Test(priority=1,invocationCount=2)
	public void editCustomer() {	//9th 12th
		Reporter.log("editCustomer",true);
	}
	@Test
	public void registerCustomer() {	//6th
		Reporter.log("registerCustomer",true);
	}
	
	@Test
	public void deleteCustomer() {	//3rd
		Reporter.log("deleteCustomer",true);
	}
}


