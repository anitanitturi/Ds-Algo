package com.dsalgo.TestCases;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.dsalgo.PageObjects.GetStartedPage;
import com.dsalgo.PageObjects.SigninPage;
import com.dsalgo.Utilities.XLUtils;

public class TC_signinDDT_003 extends BaseClass {

	@Test(dataProvider="LoginData")
	public void signinddt(String username, String password) throws InterruptedException, IOException {
		driver.get(signurl);
		
		
		SigninPage sp = new SigninPage(driver);
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
			captureScreen(driver,"signinddt");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		sp.Logout();
		
		
	}

	
	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/dsalgo/TestData/LoginData.xlsx";

		int rownum = XLUtils.getRowCount(path, "Sheet1");
		int colcount = XLUtils.getCellCount(path, "Sheet1", 1);

		String signindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				signindata[i - 1][j] = XLUtils.getCellData(path, "Sheet1", i, j);// 1 0
			}

		}
		return signindata;

	}
}
