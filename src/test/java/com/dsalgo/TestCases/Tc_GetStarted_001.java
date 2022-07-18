package com.dsalgo.TestCases;



import org.testng.annotations.Test;

import com.dsalgo.PageObjects.GetStartedPage;



public class Tc_GetStarted_001 extends BaseClass {
	@Test
	public void getstarted() {
		
		logger.info("url is opened");
		GetStartedPage	gs=new GetStartedPage(driver);
		gs.getstart();
	}
}
