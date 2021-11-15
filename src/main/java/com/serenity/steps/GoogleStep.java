package com.serenity.steps;

import com.serenity.pages.GooglePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class GoogleStep extends ScenarioSteps {

	GooglePage goolePage;

	@Step
	public void search_on_google() {
		goolePage.openUrl("https://www.google.com/");
		goolePage.txt_search.typeAndEnter("India");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
