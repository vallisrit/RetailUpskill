package com.serenity.steps;

import com.serenity.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class CommonStep {
	
	
	HomePage home;
	
	@Step
	public void i_am_on_travel_page() {
		home.getDriver().get("http://demo.guru99.com/test/newtours/index.php");
	}
	

}
