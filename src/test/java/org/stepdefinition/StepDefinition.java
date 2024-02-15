package org.stepdefinition;

import org.basepojo.BaseClass;
import org.basepojo.PojoSimple;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition  extends BaseClass{
	
	@Given("To launch the ChromeBrowser and launch the URL")
	public void to_launch_the_ChromeBrowser_and_launch_the_URL() {
//		chromeBrowser();
		launchurl("https://www.facebook.com/");
		pagetitle();
		getcurrenturl();
		
	}

	@When("To validate the valid username in email field")
	public void to_validate_the_valid_username_in_email_field() {
		
		PojoSimple pojo = new PojoSimple();
		WebElement textemail = pojo.getTextemail();
		filltextbox(textemail, "marudhupandiyansekar@gmail.com");
	    
	   
	}

	@When("To validate the invalid password in password field")
	public void to_validate_the_invalid_password_in_password_field() {
	    
		PojoSimple pojo = new PojoSimple();
		WebElement password = pojo.getPassword();
		filltextbox(password, "2345678");
	}

	@When("To click the Login button")
	public void to_click_the_Login_button() {
		
		PojoSimple pojo = new PojoSimple();
		WebElement login = pojo.getLogin();
		btnclick(login);
	}

	@Then("To Close the Browser")
	public void to_Close_the_Browser() {
	    
//	   closebrowser();
	}




}
