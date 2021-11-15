package com.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class GooglePage extends PageObject{
	
	
	@FindBy(xpath = "//input[@title='Search']")
	public WebElementFacade txt_search;

}
