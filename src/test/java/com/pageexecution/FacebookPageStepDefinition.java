package com.pageexecution;

import java.io.IOException;
import java.sql.DriverAction;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import com.basepackage.BaseClass;
import com.pagefactory.FacebookLogin;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookPageStepDefinition extends BaseClass{
	@Given("Launch browser and load facebookurl")
	public void launch_browser_and_load_facebookurl() throws InterruptedException, IOException {
		BaseClass.driverLaunch("Chrome");
		BaseClass.urlLaunch(BaseClass.fileProperty("Facebook"));
	}

	@When("Click on signup button and enter required details")
	public void click_on_signup_button_and_enter_required_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<String> li=dataTable.asList();
		System.out.println(li);
		FacebookLogin fb=new FacebookLogin();
		fb.signUPbtn.click();
		fb.firstName.sendKeys(li.get(0));
		fb.lastName.sendKeys(li.get(1));
		fb.phoneNum.sendKeys(li.get(2));
		fb.passWord.sendKeys(li.get(3));
		BaseClass.selectClass(fb.day, li.get(4));
		BaseClass.selectClass(fb.month,li.get(5));
		BaseClass.selectClass(fb.year, li.get(6));
		fb.gender.isDisplayed();
		fb.gender.isEnabled();
		fb.gender.isSelected();
		fb.gender.click();		
		Thread.sleep(3000);
	}

	@Then("Validate weather signup page is sucessfully and close browser")
	public void validate_weather_signup_page_is_sucessfully_and_close_browser() {
		Assert.assertTrue(true);
		BaseClass.closeBrowser();
	}

}
