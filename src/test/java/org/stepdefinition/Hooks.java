package org.stepdefinition;


import org.basepojo.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	
	@Before
	  
	public void bef() {
		chromeBrowser();
	
		

	}
	
	@After
	
	public void aftr() {
		closebrowser();
	}

}
