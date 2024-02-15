package org.stepdefinition;

import org.basepojo.AmazonPojo;
import org.basepojo.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazon extends BaseClass{
	

	@Given("To launch the chrome browser")
	public void toLaunchTheChromeBrowser() {
		
//		chromeBrowser();
		launchurl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813113%26hvpone%3D%26hvptwo%3D%26hvadid%3D678802104197%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D9286928958663675111%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9061916%26hvtargid%3Dkwd-26688406979%26hydadcr%3D14450_2371567&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		maximize();
		getcurrenturl();
	    
	}

	@When("To enter valid username in email field")
	public void toEnterValidUsernameInEmailField() {
		Assert.assertTrue(false);
		AmazonPojo ap= new AmazonPojo();
		WebElement txtemail=ap.getTxtemail();
		filltextbox(txtemail,"marudhu@gmail.com");
	  
	}

	@When("To click the continue button")
	public void toClickTheContinueButton() {
		AmazonPojo ap= new AmazonPojo();
		WebElement cont=ap.getCont();
		btnclick(cont);
	}

	@When("To enter invalid password in password field")
	public void toEnterInvalidPasswordInPasswordField() {
		
		AmazonPojo ap= new AmazonPojo();
		WebElement pass=ap.getPass();
		filltextbox(pass,"7896525");
	   
	}

	@When("To click the the sign in button")
	public void toClickTheTheSignInButton() {
		
		AmazonPojo ap=new AmazonPojo();
		WebElement signin=ap.getSignin();
		btnclick(signin);
	}

	@Then("To close the  browser")
	public void toCloseTheBrowser() {
		
//		closebrowser();
	   
	}



	



}
