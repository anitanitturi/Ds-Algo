package com.dsalgo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	WebDriver ldriver;
	public Registerpage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//ul/a[2]")
	WebElement register;
	
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password1")
	WebElement pword1;
	
	@FindBy(name="password2")
	WebElement pword2;
	
	@FindBy(xpath="//input[@value='Register']")
	WebElement register1;
	

 	public void register() {
 		register.click();
 	}
 	public void UserName(String usrname) {
 		uname.sendKeys(usrname);
 	}
 	public void Password(String pasword) {
 		pword1.sendKeys(pasword);
 	}
 	public void password2(String pasword1) {
 		pword2.sendKeys(pasword1);
 	}
 	public void register1() {
 		register1.click();
 	}
 	
 	}