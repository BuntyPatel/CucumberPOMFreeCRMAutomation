package com.qa.util;

public class TestUtil extends TestBase {
	
	static int PAGE_LOAD_TIMEOUT = 20;
	static int IMPLICIT_WAIT = 30;
	
	public void SwitchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

}
