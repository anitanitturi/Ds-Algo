package com.dsalgo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage {
	WebDriver ldriver;
	public GetStartedPage(WebDriver rdriver){
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//button[text()='Get Started']")
	WebElement getstart;
	public void getstart() {
		getstart.click();
	}
}
