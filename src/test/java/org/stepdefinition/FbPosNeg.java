package org.stepdefinition;

import org.basepojo.BaseClass;
import org.basepojo.PojoSimple;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbPosNeg extends BaseClass  {
	
	@Given("To start chrome browser and hit the url")
	public void toStartChromeBrowserAndHitTheUrl() {
//		chromeBrowser();
		launchurl("https://www.facebook.com/");
		maximize();    
	}

	@When("To verify invalid username {string} in email box")
	public void toVerifyInvalidUsernameInEmailBox(String email) {
		PojoSimple po=new PojoSimple();
	    WebElement textemail= po.getTextemail();
	    filltextbox(textemail, email);	    
	}

	@When("To verify invalid password in {string} password box")
	public void toVerifyInvalidPasswordInPasswordBox(String pass) {
		Assert.assertTrue(false);
		PojoSimple po=new PojoSimple();
	    WebElement password= po.getPassword();
	    filltextbox(password, pass);
		    
	}

	@When("To press login button")
	public void toPressLoginButton() {
		
		PojoSimple po= new PojoSimple();
		WebElement login = po.getLogin();
		btnclick(login);
		    
	}

	@Then("To close the chrome browser")
	public void toCloseTheChromeBrowser() {
		
//		closebrowser();
	 
	}


}
