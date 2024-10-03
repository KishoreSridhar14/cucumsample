package com.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basepackage.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "user-name")
	public WebElement userName;
	@FindBy(id = "password")
	public WebElement passWord;
	@FindBy(xpath = "//input[@value='Login']")
	public WebElement loginBtn;
	@FindBy(id="react-burger-menu-btn")
	public WebElement menuBtn;
	

}
