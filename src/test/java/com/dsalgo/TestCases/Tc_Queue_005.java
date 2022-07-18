package com.dsalgo.TestCases;



import org.testng.annotations.Test;

import com.dsalgo.PageObjects.GetStartedPage;
import com.dsalgo.PageObjects.QueuePage;
import com.dsalgo.PageObjects.SigninPage;

public class Tc_Queue_005 extends BaseClass {
	@Test
	public void Queue() {
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
	}
	@Test
	public void Queue1() throws InterruptedException {
		driver.get(signurl);
		SigninPage sp=new SigninPage(driver);
		sp.EnterUserName(username);
		sp.EnterPassword(password);
		sp.Login();
		QueuePage qp= new QueuePage(driver);
		qp.Queuepage();
		qp.implementation();
		
		qp.Tryeditor();
		 qp.writetext(code1);
		qp.Btn();
		qp.OutPutMsg();
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	@Test
	public void Queue2() throws InterruptedException {
		QueuePage qp1= new QueuePage(driver);
		driver.get(signurl);
		SigninPage sp=new SigninPage(driver);
		sp.EnterUserName(username);
		sp.EnterPassword(password);
		sp.Login();
		driver.get(Qurl);
		qp1.Implementation();
		qp1.Tryeditor1();
		qp1.writetext1(code1);
		qp1.Btn1();
		qp1.OutPutMsg1();
		Thread.sleep(2000);
		driver.navigate().back();
				
	}
	@Test
	public void Queue3() throws InterruptedException {
		driver.get(signurl);
		SigninPage sp=new SigninPage(driver);
		sp.EnterUserName(username);
		sp.EnterPassword(password);
		sp.Login();
		driver.get(Qurl);
		QueuePage qp2= new QueuePage(driver);	
		qp2.Implementation1();
		qp2.Tryeditor2();
		qp2.writetext2(code1);
		qp2.Btn2();
		qp2.OutPutMsg2();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	@Test
	public void Queue4() throws InterruptedException {
		driver.get(signurl);
		SigninPage sp=new SigninPage(driver);
		sp.EnterUserName(username);
		sp.EnterPassword(password);
		sp.Login();
		driver.get(Qurl);
		QueuePage qp3=new QueuePage(driver);
		qp3.Implementation2();
		qp3.Tryeditor3();
		qp3.writetext2(code1);
		qp3.Btn3();
		qp3.OutPutMsg3();
		Thread.sleep(2000);
		driver.navigate().back();
		qp3.Logout();
		
	}
}
