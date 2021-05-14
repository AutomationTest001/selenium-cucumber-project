package com.selenium.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Calculator extends TestBase {

	@FindBy(css = "input[ng-model='first']")
	public WebElement txtFirstNumber;

	@FindBy(css = "input[ng-model='second']")
	public WebElement txtSecondNumber;

	@FindBy(css = "select[ng-model='operator']")
	public WebElement dropDownOperator;

	@FindBy(id = "gobutton")
	public WebElement btnGO;
	
	@FindBy(xpath="/html/body/div/div/form/h2")
	public WebElement öutputValue;


	public void exportPageObjectElement_Calculator() {

		PageFactory.initElements(w, this);
	}

}
