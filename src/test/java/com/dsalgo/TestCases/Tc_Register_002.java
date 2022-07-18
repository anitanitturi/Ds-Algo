package com.dsalgo.TestCases;

import org.testng.annotations.Test;

import com.dsalgo.PageObjects.GetStartedPage;
import com.dsalgo.PageObjects.Registerpage;

public class Tc_Register_002 extends BaseClass{
	@Test
	public void register() {
		GetStartedPage	gs=new GetStartedPage(driver);
		gs.getstart();
		Registerpage rp= new Registerpage(driver);
		rp.register();
		rp.UserName(username);
		rp.Password(password);
		rp.password2(password);
		rp.register1();
			
		
		
	}

}
