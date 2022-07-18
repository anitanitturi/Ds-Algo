package com.dsalgo.TestCases;

import org.junit.Assert;
import org.testng.annotations.Test;
import com.dsalgo.PageObjects.ArrayPage;
import com.dsalgo.PageObjects.GetStartedPage;
import com.dsalgo.PageObjects.SigninPage;

public class Tc_Arrays_004 extends BaseClass {
	@Test
	public void Arrays() throws InterruptedException {
		GetStartedPage	gs=new GetStartedPage(driver);
		gs.getstart();
		logger.info("url is opened");
		SigninPage sp=new SigninPage(driver);
		sp.Signin();
		sp.EnterUserName(username);
		logger.info("enter username");
		sp.EnterPassword(password);
		logger.info("enter password");
		sp.Login();
		logger.info("Login test passed");
		ArrayPage ap =new ArrayPage(driver);
		ap.Dropdown();
		ap.Dropdown1();
		if(driver.getTitle().equals("Array")) {
		Assert.assertTrue(true);
		logger.info("Array page opened");
		}else {
			Assert.assertTrue(false);
			logger.info("Array page not opened");
		}
		ap.ArraysinPython();
		ap.TryHere();
		ap.TextEditor(code);
		ap.RunBtn();
		ap.OutPut();
		Thread.sleep(2000);
		driver.navigate().back();
		ap.ArraysUsingList();
		ap.Tryhere1();
		ap.Text(code);
		ap.Run();
		ap.output1();
		Thread.sleep(2000);
		driver.navigate().back();
		ap.BasicOperations();
		ap.Tryhere();
		ap.TextEdit(code);
		ap.Button();
		ap.Output();
		System.out.println("Hello World");
		Thread.sleep(2000);
		driver.navigate().back();
		ap.Applications();
		ap.tryHere();
		ap.textEditor(code);
		ap.run();
		ap.outPut();
		driver.navigate().back();
		Thread.sleep(2000);
		//ap.Logout();
	}

}
