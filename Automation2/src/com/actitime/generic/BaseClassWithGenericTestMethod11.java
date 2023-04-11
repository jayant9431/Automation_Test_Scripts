package com.actitime.generic;
/*WAS for BaseClassWithGeneric(Base class) by taking the 
 *test data from property file with using generic library*/
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseClassWithGenericTestMethod11 extends BaseClassWithGeneric10 {

	@Test(priority=1)
	public void loginInActitiome() {
		Reporter.log("Login successfully",true);
	}
	
	@Test(priority=2)
	public void logoutFromActitime() {
		Reporter.log("Logout successfully",true);
	}
}
