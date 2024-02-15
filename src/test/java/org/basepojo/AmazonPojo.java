package org.basepojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPojo extends BaseClass {

	
	public AmazonPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email")
	private WebElement txtemail;
	
	@FindBy(id="continue")
	private WebElement cont;
	
	@FindBy(id="ap_password")
	private WebElement pass;
	
	@FindBy(id="signInSubmit")
	private WebElement signin;

	public WebElement getTxtemail() {
		return txtemail;
	}

	public WebElement getCont() {
		return cont;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getSignin() {
		return signin;
	}
	
	
	
}