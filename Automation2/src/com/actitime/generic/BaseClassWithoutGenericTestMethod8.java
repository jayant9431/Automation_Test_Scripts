package com.actitime.generic;

/*WAS for BaseClassWithoutGenric(class) by taking test data 
 * from Property file without using generic library */
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseClassWithoutGenericTestMethod8 extends BaseClassWithoutGenric7{

	@Test(priority=1)
	public void loginInActitime() {
		Reporter.log("Login Happening",true);
	}
	@Test(priority=2)
	public void logoutFromActitime() {
		Reporter.log("Logout Happening",true);
	}
	
}
