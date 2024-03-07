package com.locators;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basefunctions.BaseClass;

public class FacebookLocators {
	
	
public FacebookLocators() {
	PageFactory.initElements(BaseClass.driver,this);
}
	
	
	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement ele;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobilenumber;
	
	@FindBy(xpath="//input[@id='password_step_input']")
	private WebElement password;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement day;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement yr;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement gender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement singleclick;

	public WebElement getEle() {
		return ele;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getMobilenumber() {
		return mobilenumber;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYr() {
		return yr;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getSingleclick() {
		return singleclick;
	}

	
	
}


