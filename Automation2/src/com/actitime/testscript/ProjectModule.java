package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {

	@Test(groups="smokeTest")
	public void createProject() {
		Reporter.log("Create Project",true);
	}
	@Test(groups="regressionTest")
	public void deleteProject() {
		Reporter.log("Delete Project",true);
	}
}
