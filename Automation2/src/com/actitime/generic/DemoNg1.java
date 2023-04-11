/*Write a basic script to understand the terminology of TestNG */
package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoNg1 {
	@Test
	public void demo() {
		Reporter.log("welcome",true);
	}
}
