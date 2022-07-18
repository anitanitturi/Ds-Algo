package com.dsalgo.TestCases;


import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.dsalgo.PageObjects.GetStartedPage;
import com.dsalgo.PageObjects.SigninPage;

public class Tc_Signin_003 extends BaseClass {
	@Test
	public void signin() throws IOException {
		GetStartedPage	gs=new GetStartedPage(driver);
		gs.getstart();
		logger.info("url is opened");
		SigninPage sp=new SigninPage(driver);
		sp.Signin();
		sp.EnterUserName(username);
		logger.info("entered username");
		sp.EnterPassword(password);
		logger.info("entered password");
		sp.Login();
		if(driver.getTitle().equals("NumpyNinja")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}else {
			
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
		
	}

}
