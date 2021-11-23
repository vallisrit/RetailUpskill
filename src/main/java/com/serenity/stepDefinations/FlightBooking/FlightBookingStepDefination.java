package com.serenity.stepDefinations.FlightBooking;

import java.util.Map;

import com.serenity.steps.flightbookingStep.FlightBookingSteps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class FlightBookingStepDefination {
	
	@Steps
	FlightBookingSteps fb;
	
	@When("I am searching flight")
	public void i_am_searching_flight(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> userDetails=dataTable.asMap(String.class, String.class);
		fb.booking_one_way_flight(userDetails);
	    
	}

	@Then("I should be successfully booked flight")
	public void i_should_be_successfully_booked_flight() {
	    
	}

}
