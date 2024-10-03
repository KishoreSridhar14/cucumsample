package com.pageexecution;

import java.io.IOException;

import com.basepackage.BaseClass;
import com.pagefactory.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
	@Given("Launch the browser and load amazon url")
	public void launch_the_browser_and_load_amazon_url() throws InterruptedException, IOException {
	    BaseClass.driverLaunch("Chrome");
	    BaseClass.urlLaunch(BaseClass.fileProperty("AmazonUrl"));
	}

	@When("Search with mobile option in homepage")
	public void search_with_mobile_option_in_homepage() throws InterruptedException {
		HomePage hp=new HomePage();
		hp.searchBox.sendKeys("mobile");
		hp.searchBtn.click();
		Thread.sleep(3000);
	}

	@Then("Validate if mobile lists opened sucessfully and close the browser")
	public void validate_if_mobile_lists_opened_sucessfully_and_close_the_browser() {
		BaseClass.closeBrowser();
	    
	}

	@When("Search with smartwatches option in homepage")
	public void search_with_smartwatches_option_in_homepage() throws InterruptedException {
	   HomePage hp=new HomePage();
	   hp.searchBox.sendKeys("Smartwatches");
	   hp.searchBtn.click();
		   
	}

	@When("Search with speakers option in homepage")
	public void search_with_speakers_option_in_homepage() throws InterruptedException {
	    HomePage hp=new HomePage();
	    hp.searchBox.sendKeys("speakers");
	    hp.searchBtn.click();
	    Thread.sleep(3000);
	}


}
