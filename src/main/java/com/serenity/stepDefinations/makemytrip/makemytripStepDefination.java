package com.serenity.stepDefinations.makemytrip;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import com.serenity.pages.makemytrippage;
import com.serenity.steps.flightbookingStep.FlightsearchSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class makemytripStepDefination {
	@Steps
	FlightsearchSteps mmtpage;
	
		
	@Given("I am on Make my trip")
	public void i_am_on_make_my_trip() {
		mmtpage.geturl();                        
	}
	
	@When ("I perform one way trip search")
	public void I_perform_one_way_trip(io.cucumber.datatable.DataTable dataTable) 
	{
		Map<String, String> TripDetails=dataTable.asMap(String.class, String.class);
		String FromCity=TripDetails.get("From");
		String ToCity =TripDetails.get("To");
		System.out.println("Details:"+ FromCity+"      "+ToCity);
		
		mmtpage.searchOneWay(FromCity,ToCity);
		
	}
	
	@Then ("Search results should display for one way trip")
	public void Search_results_should_display_one_way(io.cucumber.datatable.DataTable dataTable)
	{
		Map<String, String> TripDetails=dataTable.asMap(String.class, String.class);
		String FromCity=TripDetails.get("From");
		String ToCity =TripDetails.get("To");
		System.out.println("Details:"+ FromCity+"      "+ToCity);
		boolean oneWaySearch = mmtpage.onewaysearchresult(FromCity,ToCity);
		assertEquals(oneWaySearch,true);
	}
	
	@When("I perform round way trip search")
	public void i_perform_round_way_trip_search(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> TripDetails=dataTable.asMap(String.class, String.class);
		String FromCity=TripDetails.get("From");
		String ToCity =TripDetails.get("To");
		System.out.println("Details:"+ FromCity+"      "+ToCity);
		
		 mmtpage.searchRoundTrip(FromCity,ToCity);  
	}
	
	@Then ("Search results should display for round trip")
	public void Search_results_should_display_round(io.cucumber.datatable.DataTable dataTable)
	{
		Map<String, String> TripDetails=dataTable.asMap(String.class, String.class);
		String FromCity=TripDetails.get("From");
		String ToCity =TripDetails.get("To");
		System.out.println("Details:"+ FromCity+"      "+ToCity);
		
		boolean roundSearch = mmtpage.roundtripsearchresult(FromCity,ToCity);
		assertEquals(roundSearch,true);	
	}

}
