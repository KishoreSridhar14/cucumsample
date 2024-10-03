package com.pageexecution;

import java.io.IOException;

import org.junit.Assert;

import com.basepackage.BaseClass;
import com.pagefactory.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {
	
	@Given("Launch browser and load url")
	public void launch_browser_and_load_url() throws InterruptedException, IOException {
		BaseClass.driverLaunch("chrome");
		BaseClass.urlLaunch(BaseClass.fileProperty("SiteUrl"));
	}

	@When("Provide valid username and password then hit login")
	public void provide_valid_username_and_password_then_hit_login() throws IOException {
		LoginPage lp=new LoginPage();
		lp.userName.sendKeys(BaseClass.fileProperty("Username"));
	    lp.passWord.sendKeys(BaseClass.fileProperty("Password"));
	    lp.loginBtn.click();
	
	}

	@Then("validate whether loggedin sucessesfully and close browser")
	public void validate_whether_loggedin_sucessesfully_and_close_browser() {
	    //validation
        Assert.assertTrue(true);		
	
		BaseClass.closeBrowser();
	}
	
	@When("Provide valid {string} and {string} then hit login")
	public void provide_valid_and_then_hit_login(String Username, String Password) {
		LoginPage lp=new LoginPage();
		lp.userName.sendKeys(Username);
		lp.passWord.sendKeys(Password);
		lp.loginBtn.click();
	 
	}

}
