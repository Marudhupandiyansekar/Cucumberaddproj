package org.basepojo;

import org.basepojo.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  PojoSimple extends BaseClass {
	    public PojoSimple() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="email")
	private WebElement textemail;
	
	@FindBy(id="pass")
	private WebElement password;
	
	
	@FindBy(name="login")
	private WebElement login;


	public WebElement getTextemail() {
		return textemail;
	}


	public WebElement getPassword() {
		return password;
	}


	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
