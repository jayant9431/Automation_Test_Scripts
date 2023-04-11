/*
 * WAS to understand the concept of priority, dependsOnMethods, 
 * invocationCount, enable and Assert.fail() */
package com.actitime.generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule2 {
	
	@Test(priority=1)
	public void createCustomer() { //1st
		Reporter.log("createCustomer",true);
	}
	
	@Test(priority=2,dependsOnMethods="createCustomer")
	public void modifyCustomer() { //2nd
		Reporter.log("modifyCustomer",true);
	}
	
	@Test(priority=3,dependsOnMethods="modifyCustomer")
	public void deleteCustomer() { //3rd
		Reporter.log("deleteCustomer",true);		
	}
	
	@Test(priority=4,invocationCount=2)
	public void selectCustomer() { //5th 6th
		Reporter.log("selectCustomer",true);
	}
	
	@Test(priority=4)
	public void rememberCustomer() { //4th
		Reporter.log("rememberCustomer", true);
	}
	
	@Test(priority=5,enabled=false)
	public void forgetCustomer() { // it will not execute bcz enabled=false
		Reporter.log("forgetCustomer",true);
	}
	
	@Test(priority=6)
	public void regularCustome() {
		Reporter.log("regularCustomer",true);
		Assert.fail(); // here i am intentionally failing the test script 
	} 
}