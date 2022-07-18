package com.dsalgo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPage {
	WebDriver ldriver;

	public ArrayPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
	WebElement dropdown;

	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[1]")
	WebElement dropdown1;

	@FindBy(xpath = "//a[text()='Arrays in Python']")
	WebElement arraysinpython;

	@FindBy(xpath = "//a[@class='btn btn-info']")
	WebElement tryHere;

	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement texteditor;

	@FindBy(xpath = "//button[@type='button']")
	WebElement runbtn;

	@FindBy(id = "output")
	WebElement outputMsg;

	@FindBy(xpath = "//a[text()='Arrays Using List']")
	WebElement arraysusinglist;
	@FindBy(css = "a.btn")
	WebElement Tryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement text;
	@FindBy(xpath = "//button[text()='Run']")
	WebElement run;
	@FindBy(xpath = "//pre[@id='output']")
	WebElement output;
	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	WebElement basicoperations;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement tryhere;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement editor;
	@FindBy(xpath = "//button")
	WebElement button;
	@FindBy(id = "output")
	WebElement outputmsg;
	@FindBy(xpath = "//a[text()='Applications of Array']")
	WebElement applications;
	@FindBy(xpath = "//a[@href='/tryEditor']")
	WebElement here;
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement tryEditor;
	@FindBy(xpath = "//button[text()='Run']")
	WebElement Runbtn;
	@FindBy(id = "output")
	WebElement outmsg;
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement signout;

	public void Dropdown() {
		dropdown.click();
	}

	public void Dropdown1() {
		dropdown1.click();
	}

	public void ArraysinPython() {
		arraysinpython.click();
	}

	public void TryHere() {
		tryHere.click();
	}

	public void TextEditor(String code) {
		texteditor.sendKeys(code);
	}

	public void RunBtn() {
		runbtn.click();
	}

	public String OutPut() {
		String msg = outputMsg.getText();
		return msg;
	}

	public void ArraysUsingList() {
		arraysusinglist.click();
	}

	public void Tryhere1() {
		Tryhere.click();
	}

	public void Text(String code) {
		text.sendKeys(code);
	}

	public void Run() {
		run.click();
	}

	public String output1() {
		String msg = output.getText();
		return msg;
	}

	public void BasicOperations() {
		basicoperations.click();
	}

	public void Tryhere() {
		tryhere.click();
	}

	public void TextEdit(String code) {
		editor.sendKeys(code);
	}

	public void Button() {
		button.click();
	}

	public String Output() {
		String Msg = outputmsg.getText();
		return Msg;

	}

	public void Applications() {
		applications.click();
	}

	public void tryHere() {
		here.click();
	}

	public void textEditor(String code) {
		tryEditor.sendKeys(code);
	}

	public void run() {
		Runbtn.click();
	}

	public String outPut() {
		String message = outmsg.getText();
		return message;
	}

	public void Logout() {
		signout.click();
	}

}
