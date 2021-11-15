package com.serenity.stepDefinations;

import com.serenity.steps.GoogleStep;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class GoogleStepDefination {
	
	@Steps
	GoogleStep gt;
	
	
	@Given("I am on google")
	public void i_am_on_google() {
		gt.search_on_google();
	}

}
