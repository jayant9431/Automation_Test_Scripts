package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {

	@Test(groups="smokeTest")
	public void createCustomer() {
		Reporter.log("Create Customer",true);
	}
	@Test(groups="regressionTest")
	public void deleteCustomer() {
		Reporter.log("Delete Customer",true);
	}
}
