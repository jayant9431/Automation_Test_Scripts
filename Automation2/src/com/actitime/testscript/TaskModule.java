package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TaskModule {

	@Test(groups="smokeTest")
	public void createTask() {
		Reporter.log("Create Task",true);
	}
	
	@Test(groups="regressionTest")
	public void deleteTask() {
		Reporter.log("Delete task",true);
	}
}
