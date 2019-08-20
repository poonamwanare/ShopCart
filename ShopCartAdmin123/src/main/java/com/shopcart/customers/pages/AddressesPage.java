package com.shopcart.customers.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shopcart.base.TestBase;

public class AddressesPage extends TestBase{

	public AddressesPage() throws FileNotFoundException {
		super();
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(className="page-title")
	WebElement addressespagelabel;
	
	public String getAddressesPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getAddressesPageLabel()
	{
		return addressespagelabel.getText();
	}
}
