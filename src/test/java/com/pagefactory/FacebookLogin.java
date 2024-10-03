package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BaseClass;

public class FacebookLogin extends BaseClass{
	public FacebookLogin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@rel='nofollow']")
	public WebElement signUPbtn;
	@FindBy(name="firstname")
	public WebElement firstName;
	@FindBy(name="lastname")
	public WebElement lastName;
	@FindBy(xpath ="//input[@aria-label='Mobile number or email address']")
	public WebElement phoneNum;
	@FindBy(xpath="//input[@name='reg_passwd__']")
	public WebElement passWord;
	@FindBy(name="birthday_day")
	public WebElement day;
	@FindBy(name="birthday_month")
	public WebElement month;
	@FindBy(name="birthday_year")
	public WebElement year;
	@FindBy(xpath="//input[@value=\"2\"]")
	public WebElement gender;
	
}
