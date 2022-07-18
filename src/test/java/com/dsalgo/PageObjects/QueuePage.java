package com.dsalgo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage {
	WebDriver ldriver;

	public QueuePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@href='queue']")
	WebElement queue;
	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	WebElement queueinPython;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement tryhere;
	@FindBy(xpath = "//div/div/form[@id='answer_form']/div/div/div/textarea")
	WebElement text;
	@FindBy(xpath="//button[text()='Run']")
	WebElement btn;
	@FindBy(id="output")
	WebElement outMsg;
	@FindBy(xpath="//a[text()='Implementation using collections.deque']")
	WebElement implementationusingcollecton;
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement tryhere1;
	@FindBy(xpath="//div/div/form[@id='answer_form']/div/div/div/textarea")
	WebElement text1;
	@FindBy(xpath="//button[text()='Run']")
	WebElement btn1;
	@FindBy(id="output")
	WebElement outMsg1;
	@FindBy(xpath="//a[text()='Implementation using array']")
	WebElement implementationUsingArray;
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement tryhere2;
	@FindBy(xpath="//div/div/form[@id='answer_form']/div/div/div/textarea")
	WebElement text2;
	@FindBy(xpath="//button[text()='Run']")
	WebElement btn2;
	@FindBy(id="output")
	WebElement outMsg2;
	@FindBy(xpath="//a[text()='Queue Operations']")
	WebElement queueoperations;
	@FindBy(xpath="//a[@href='/tryEditor']")
	WebElement tryhere3;
	@FindBy(xpath="//div/div/form[@id='answer_form']/div/div/div/textarea")
	WebElement text3;
	@FindBy(xpath="//button[text()='Run']")
	WebElement btn3;
	@FindBy(id="output")
	WebElement outMsg3;
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement signout;

	public void Queuepage() {
		queue.click();
	}

	public void implementation() {
		queueinPython.click();
	}

	public void Tryeditor() {
		tryhere.click();
	}

	public void writetext(String code1) {
		text.sendKeys(code1);
	}
	public void Btn() {
		btn.click();
	}
	public String OutPutMsg() {
		String outmsg= outMsg.getText();
		return outmsg;
		}
	public void Implementation() {
		implementationusingcollecton.click();
	}
	public void Tryeditor1() {
		tryhere1.click();
	}
	public void writetext1(String code1) {
		text1.sendKeys(code1);
	}
	public void Btn1() {
		btn1.click();
	}
	public String OutPutMsg1() {
		String outmsg1= outMsg1.getText();
		return outmsg1;
	}
	public void Implementation1() {
		implementationUsingArray.click();
		
	}
	public void Tryeditor2() {
		tryhere2.click();
	}
	public void writetext2(String code1) {
		text2.sendKeys(code1);
	}
	public void Btn2() {
		btn2.click();
	}
	public String OutPutMsg2() {
		String outmsg2= outMsg2.getText();
		return outmsg2;
	}
	public void Implementation2() {
		queueoperations.click();
		
	}
	public void Tryeditor3() {
		tryhere3.click();
	}
	public void writetext3(String code1) {
		text3.sendKeys(code1);
	}
	public void Btn3() {
		btn3.click();
	}
	public String OutPutMsg3() {
		String outmsg3= outMsg3.getText();
		return outmsg3;
	}
	public void Logout() {
		signout.click();
	}
	
	
}
