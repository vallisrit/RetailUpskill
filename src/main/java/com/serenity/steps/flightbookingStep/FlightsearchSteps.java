package com.serenity.steps.flightbookingStep;

import com.serenity.pages.HomePage;
import com.serenity.pages.makemytrippage;
import com.serenity.steps.CommonStep;

import net.thucydides.core.annotations.Step;

public class FlightsearchSteps  extends CommonStep
{

	makemytrippage mmturl;
	
	@Step
	public void geturl() {
		mmturl.getDriver().get("http://www.makemytrip.com");
	}
	
	@Step
	public void searchOneWay(String fromCity, String toCity) {
		System.out.println("insearchoneway");
		mmturl.onewayTrip.click();
		System.out.println("after one way click");
		mmturl.fromCity.sendKeys(fromCity);
		System.out.println("after from");
		mmturl.toCity.sendKeys(toCity);
		System.out.println("after to");
		mmturl.Search.click();
		System.out.println("after clcik search");
	}
	
	@Step
	public void searchRoundTrip(String fromCity, String toCity) {
		System.out.println("insearchround");
		mmturl.roundTrip.click();
		System.out.println("after round click");
		mmturl.fromCity.sendKeys(fromCity);
		System.out.println("after from");
		mmturl.toCity.sendKeys(toCity);
		System.out.println("after to");
		mmturl.Search.click();
		System.out.println("after clcik search");
		
	}
	
	@Step
	public boolean onewaysearchresult(String fromCity, String toCity) {
		String onewaySearchResult=mmturl.onewaySearch.getText();
		if(onewaySearchResult.contains(fromCity)&&onewaySearchResult.contains(toCity))
			return true;
		else
			return false;
	}

	@Step
	public boolean roundtripsearchresult(String fromCity, String toCity) {
		String onewaySearchResult=mmturl.onewaySearch.getText();
		if(onewaySearchResult.contains(fromCity)&&onewaySearchResult.contains(toCity))
			return true;
		else
			return false;
		
	}


}
