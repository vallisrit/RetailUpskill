package com.serenity.pages.flightbooking;

import java.util.Map;

import com.serenity.pages.HomePage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class FlightBookingPage extends HomePage{


@FindBy(xpath = "//input[@value='roundtrip']")
public WebElementFacade  rtn_roundtrip;

@FindBy(xpath = "//input[@value='oneway']")
public WebElementFacade  rtn_onetrip;

@FindBy(xpath = "//select[@name='fromPort']")
public WebElementFacade  ddl_fromPort;

@FindBy(xpath = "//select[contains(@name,'fromMonth')]")
public WebElementFacade  ddl_fromMonth;

@FindBy(xpath = "//select[contains(@name,'fromDay')]")
public WebElementFacade  ddl_fromDay;

@FindBy(xpath = "//select[contains(@name,'toPort')]")
public WebElementFacade  ddl_toPort;

@FindBy(xpath = "//select[contains(@name,'toMonth')]")
public WebElementFacade  ddl_toMonth;

@FindBy(xpath = "//select[contains(@name,'toDay')]")
public WebElementFacade  ddl_toDay;

@FindBy(xpath = "//input[contains(@value,'Coach')]")
public WebElementFacade  rbtn_coach_economic;

@FindBy(xpath = "//input[contains(@name,'findFlights')]")
public WebElementFacade  btn_findFlights;



public void one_way_booking_flight(Map<String, String> userDetails) {
	rtn_onetrip.click();
	booking_flight(userDetails);
	btn_findFlights.click();
	
}

public void  round_way_booking_flight(Map<String, String> userDetails) {
	rtn_roundtrip.click();
	booking_flight(userDetails);
	ddl_toPort.selectByVisibleText("To");
	
}

private void booking_flight(Map<String, String> userDetails) {
	ddl_fromPort.selectByVisibleText(userDetails.get("From"));
	String[] date=userDetails.get("Date").split("-");
	ddl_fromMonth.selectByVisibleText(date[0]);
	ddl_fromDay.selectByVisibleText(date[1]);
	//rbtn_coach_economic.click();
}



}