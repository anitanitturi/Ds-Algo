package com.dsalgo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SigninPage {
	WebDriver ldriver;
	public SigninPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//ul/a[3]")
	WebElement signin;
	
	@FindBy(id="id_username")
	WebElement txtusername;
	
	@FindBy(id="id_password")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement signout;
	
	public void Signin() {
		signin.click();
	}
	public void EnterUserName(String uname) {
		txtusername.sendKeys(uname);
	}
	public void EnterPassword(String pword) {
		txtpassword.sendKeys(pword);
	}
	public void Login() {
		loginbtn.click();
	}
	public void Logout() {
		signout.click();
	}
	
	
	
	
	
	
	
}
