package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
	public class DemoTest {
		@Test(groups="rt")
		public void de() {
			Reporter.log("mc",true);
		}
		}
}
